package com.lh.base.spring.web.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by lh on 17-3-6.
 * Implementations of this SPI will be detected automatically by  SpringServletContainerInitializer (在项目中随意放置)
 * 实现类 WebAppInitializer 效果等同于web.xml
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{MyWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
