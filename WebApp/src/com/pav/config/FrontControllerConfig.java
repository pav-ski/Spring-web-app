package com.pav.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class[] {WebMvcConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return null;
	}
	
	@Override
	protected String[] getServletMappings(){
		System.out.println("getServletMappings");
		return new String[] {"/"};
		
	}

}
