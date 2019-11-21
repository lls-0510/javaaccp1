package com.accp.util;

import java.util.List;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class mvcConfig extends WebMvcConfigurationSupport {
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
<<<<<<< HEAD
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file:D:\\images\\");
=======
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").addResourceLocations("file:D:\\images\\");  
>>>>>>> oxw
		super.addResourceHandlers(registry);
	}
} 
