package com.qf.servlet;

import javax.servlet.*;
import java.io.IOException;


/*
1. 创建JavaEE项目
2. 定义一个类，实现Servlet接口

- public class com.qf.servlet.ServletDemo1 implements Servlet

3. 实现接口中的抽象方法
4. 配置Servlet
在web.xml中配置：

 */

public class ServletDemo1 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    /**
     * 提供服务
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("这是我的第一个Servlet......");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
