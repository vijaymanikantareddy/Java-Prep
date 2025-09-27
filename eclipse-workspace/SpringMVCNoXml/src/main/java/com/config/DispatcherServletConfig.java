package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses = { Config.class };

		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {

		String[] mapping = { "/flm/*" };
		return mapping;

	}

}
