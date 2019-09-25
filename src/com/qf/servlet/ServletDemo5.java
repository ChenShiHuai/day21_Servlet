package com.qf.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//@WebServlet({"/demo5","/dd5","/ddd5"})
//@WebServlet("/user/*")
//@WebServlet("*.do")

//@WebServlet("/*.do")
@WebServlet("*.do")
public class ServletDemo5 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是HttpServlet的get方法。。。");
        System.out.println("这是HttpServlet的get方法。。。");
        System.out.println("这是HttpServlet的get方法。。。");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("这是HttpServlet的post的方法。。。");
    }
}
