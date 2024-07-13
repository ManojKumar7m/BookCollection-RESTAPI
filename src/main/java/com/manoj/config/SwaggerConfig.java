package com.manoj.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public GroupedOpenApi apiDocs() {
	    return GroupedOpenApi.builder()
	            .group("public")
	            .packagesToScan("com.manoj.rest") // Specify the base package to scan
	            .pathsToMatch("/**") // Include all paths
	            .build();
	}
}
