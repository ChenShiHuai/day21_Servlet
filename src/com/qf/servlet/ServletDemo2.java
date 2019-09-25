package com.qf.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo2 implements Servlet {

    private int age=21;
    /**
     * 初始化，这个是一开始执行的方法,但是只执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("这是servlet的init().......");
    }

    /**
     * 获取servlet的配置，不是生命周期相关的方法
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务的方法，请求多次，会多次执行
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("这是servlet的service()方法。。。。。");
    }

    /**
     * 获取一些servlet的信息，版本，作者这些信息，
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁Servlet的方法，销毁servlet实例之前，会调用destroy方法，而且只调用一次。
     */
    @Override
    public void destroy() {
        System.out.println("这是servlet的destroy()........");
    }
}
