package com.qf.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


/**
 * 继承这个GenericServlet抽象类，我们需要实现的方法只有一个service
 */
@WebServlet("/demo4")
public class ServletDemo4 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("这是继承自GenericServlet这个类的service方法。。。。");
    }
}
