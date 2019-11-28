package com.accp.config;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;



@Configuration
public class MvcConfig extends WebMvcConfigurationSupport {
	@Autowired
	MyInterceptor My;
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file:D:\\images\\");
		super.addResourceHandlers(registry);
	}
	
	@Override
	protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter string = new StringHttpMessageConverter(StandardCharsets.UTF_8);
		converters.add(string);
		converters.add(new MappingJackson2HttpMessageConverter());
		converters.add(new ByteArrayHttpMessageConverter());
		super.configureMessageConverters(converters);
	}
	
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 添加拦截的请求，并排除几个不拦截的请求
		
        registry.addInterceptor(new MyInterceptor()).addPathPatterns(
        "/storequeryAll","/uploadAjax","/updatestore","/deletestore",
        "/selectModelAll","/toinsertposition","/toupdateposition",
        "/staffqueryAll","/updateStaff","/insertStaff","/deleteStaff",
        "/queryAll","/addGoodType","/deleteGoodType","/doupdate",
        "/suppqueryAll","/insertsupplier","/sudoupdate","/deletesupplie",
        "/getpurs","/addpur","/updatepur","/delpur",
        "/Vipcount","/insertvip","/updatetvip","/deleteVip"
        
        )
        .excludePathPatterns("/js/**","/css/**","/images/**","/model/**");
        
    }

}
