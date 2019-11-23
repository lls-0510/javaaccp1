package com.accp.util;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class mvcConfig extends WebMvcConfigurationSupport {
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/static/").
		addResourceLocations("file:D:/staticSource/");   
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
} 
