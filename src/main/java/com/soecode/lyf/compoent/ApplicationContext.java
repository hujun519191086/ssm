package com.soecode.lyf.compoent;

import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

@Component
public class ApplicationContext implements ServletContextAware {
    @Override
    public void setServletContext(ServletContext context) {
        String ctx = context.getContextPath();
        System.out.println("ctx=" + ctx);
        context.setAttribute("ctx", ctx);
    }
}
