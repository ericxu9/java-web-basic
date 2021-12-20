package org.xumiao.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.xumiao.domain.TaobaoOrder;
import org.xumiao.domain.TaobaoOrderExample;
import org.xumiao.mapper.TaobaoOrderDao;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private TaobaoOrderDao taobaoOrderDao;

    @RequestMapping("/index")
    @ResponseBody
    @CrossOrigin
    public String index(@RequestBody String jsonStr) {
        if (jsonStr != null && jsonStr.length() > 0) {
            JSONObject jsonObject = JSON.parseObject(jsonStr);
            JSONArray mainOrders = jsonObject.getJSONArray("mainOrders");
            for (int i = 0; i < mainOrders.size(); i++) {
                JSONObject mainOrderItem = mainOrders.getJSONObject(i);
                JSONObject orderInfo = mainOrderItem.getJSONObject("orderInfo");
                String orderId = orderInfo.getString("id");
                String createTime = orderInfo.getString("createTime");

                JSONObject payInfo = mainOrderItem.getJSONObject("payInfo");
                String actualFee = payInfo.getString("actualFee"); //实际支付价格

                //店铺名
                JSONObject seller = mainOrderItem.getJSONObject("seller");
                String shopName = seller.getString("shopName");

                JSONObject statusInfo = mainOrderItem.getJSONObject("statusInfo");
                JSONArray operations = statusInfo.getJSONArray("operations");
                String viewLogisticUrl = "";
                String viewDetailUrl = "";
                for (int x = 0; x < operations.size(); x++) {
                    JSONObject operationItem = operations.getJSONObject(x);
                    if (operationItem.containsKey("id")) {
                        String operationItemId = operationItem.getString("id");
                        if (operationItemId.equals("viewLogistic")) {
                            viewLogisticUrl = operationItem.getString("url");
                            if (viewLogisticUrl != null && viewLogisticUrl.length() > 5) {
                                viewLogisticUrl = viewLogisticUrl.substring(2);
                            }
                        }
                        if (operationItemId.equals("viewDetail")) {
                            viewDetailUrl = operationItem.getString("url");
                            if (viewDetailUrl != null && viewDetailUrl.length() > 5) {
                                viewDetailUrl = viewDetailUrl.substring(2);
                            }
                        }

                    }
                }

                System.out.println(shopName);
                //子订单
                JSONArray subOrders = mainOrderItem.getJSONArray("subOrders");
                for (int j = 0; j < subOrders.size(); j++) {
                    JSONObject subOrderItem = subOrders.getJSONObject(j);
                    if (!subOrderItem.containsKey("quantity")) {
                        continue;
                    }
                    //数量
                    int quantity = subOrderItem.getInteger("quantity");
                    //图片
                    JSONObject itemInfo = subOrderItem.getJSONObject("itemInfo");

                    //过滤价格为0的
                    String realTotal = subOrderItem.getJSONObject("priceInfo").getString("realTotal");
                    if (realTotal == null || realTotal.equals("0.00")) {
                        continue;
                    }

                    String pic = itemInfo.getString("pic");
                    if (pic != null && pic.length() > 5) {
                        pic = pic.substring(2).replace("80x80", "400x400");
                    }
                    TaobaoOrder taobaoOrder = new TaobaoOrder();
                    taobaoOrder.setActualfee(realTotal);
                    taobaoOrder.setOrderid(orderId);
                    taobaoOrder.setCreatetime(createTime);
                    taobaoOrder.setPic(pic);
                    taobaoOrder.setQuantity(quantity);
                    taobaoOrder.setShopname(shopName);
                    taobaoOrder.setViewlogisticurl(viewLogisticUrl);
                    taobaoOrder.setViewdetailurl(viewDetailUrl);
                    taobaoOrderDao.insertSelective(taobaoOrder);
                }
            }
        }
        return "测试";
    }

    @RequestMapping("/export")
    @ResponseBody
    public void export(HttpServletResponse response) throws IOException {
        List<TaobaoOrder> taobaoOrders = taobaoOrderDao.selectByExample(new TaobaoOrderExample());
        for (TaobaoOrder taobaoOrder : taobaoOrders) {
            if (taobaoOrder.getPic() != null && taobaoOrder.getPic().length() > 5)
                taobaoOrder.setPicUrl(new URL("https://" + taobaoOrder.getPic()));
            if (taobaoOrder.getViewdetailurl() != null)
                taobaoOrder.setViewdetailurl("https://" + taobaoOrder.getViewdetailurl());
            if (taobaoOrder.getViewlogisticurl() != null)
                taobaoOrder.setViewlogisticurl("https://" + taobaoOrder.getViewlogisticurl());
        }

        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        ServletOutputStream outputStream = response.getOutputStream();
        EasyExcel.write(outputStream, TaobaoOrder.class).sheet().doWrite(taobaoOrders);
    }
}
