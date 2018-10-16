package com.pav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.pav.controller")
public class WebMvcConfig {

	
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/index");
	}
	
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		
		
		System.out.println("CREATING VIEW RESOLVER");
		
		return vr;
	}
	
	
}
