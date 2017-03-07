package com.lh.base.spring.web.spring;

import com.lh.base.spring.web.controller.Component;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lh on 17-3-6.
 *  web MVC configure
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = Component.class)
public class MyWebConfig extends WebMvcConfigurerAdapter {
}
