package com.zhiyou100.config;

import com.zhiyou100.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author BianGe
 * @ClassName MyWebMvcConfig
 * @Description 配置拦截的url
 * @create 2019/3/27 20:38
 * @Version 1.0
 **/
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(loginInterceptor)
                // 设置需要拦截的请求
                .addPathPatterns("/**")
                // 设置不拦截的请求
                .excludePathPatterns("/login")
                .excludePathPatterns("/register")
                .excludePathPatterns("/swagger-resources/**", "/webjars/**", "/v2/**", "/swagger-ui.html/**");

    }
}