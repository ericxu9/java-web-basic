package org.xumiao.servlet;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class TestServlet extends HttpServlet {

    /**
     * GET请求
     * 跳转JSP页面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/main.jsp").forward(req,resp);
    }

    /**
     * POST请求
     * REST API: 返回JSON示例
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "请求成功");
        map.put("data", null);

        resp.setHeader("content-type","application/json;charset=utf-8");//中文乱码
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSONString(map));
        out.flush();
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
