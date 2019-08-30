package com.micro.bhupi.gateway.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.micro.bhupi.gateway.filter.CustomLocationRewriteFilter;

@Configurable
@EnableZuulProxy
public class ZuulProxyConfiguration {
	
	
	 @Bean
	    public CustomLocationRewriteFilter locationRewriteFilter() {
	        return new CustomLocationRewriteFilter();
	    }

}
