package org.xumiao.domain;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
import com.alibaba.excel.converters.string.StringImageConverter;
import com.alibaba.excel.converters.url.UrlImageConverter;

import java.io.Serializable;
import java.net.URL;

/**
 * taobao_order
 * @author 
 */
@ContentRowHeight(200)
@HeadRowHeight(25)
@ColumnWidth(25)
public class TaobaoOrder implements Serializable {

    @ExcelIgnore
    private Integer id;

    @ExcelProperty(value = "订单号")
    private String orderid;

    @ExcelProperty(value = "购买时间")
    private String createtime;

    @ExcelProperty(value = "实际支付价格")
    private String actualfee;

    @ExcelProperty(value = "店铺名称")
    private String shopname;

    @ExcelProperty(value = "物流详情")
    private String viewlogisticurl;

    @ExcelProperty(value = "数量")
    private Integer quantity;

    @ExcelIgnore
    private String pic;

    @ExcelProperty(value = "商品图", converter = UrlImageConverter.class)
    private URL picUrl;

    @ExcelProperty(value = "订单详情")
    private String viewdetailurl;

    private static final long serialVersionUID = 1L;

    public URL getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(URL picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getActualfee() {
        return actualfee;
    }

    public void setActualfee(String actualfee) {
        this.actualfee = actualfee;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getViewlogisticurl() {
        return viewlogisticurl;
    }

    public void setViewlogisticurl(String viewlogisticurl) {
        this.viewlogisticurl = viewlogisticurl;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getViewdetailurl() {
        return viewdetailurl;
    }

    public void setViewdetailurl(String viewdetailurl) {
        this.viewdetailurl = viewdetailurl;
    }
}