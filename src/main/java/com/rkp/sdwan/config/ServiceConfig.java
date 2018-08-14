package com.rkp.sdwan.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	
	 @Value("${sdwan.middleware.url}")
	private String sdwanMiddlewareUrl;

	public String getSdwanMiddlewareUrl() {
		return sdwanMiddlewareUrl;
	}

}
