package com.supercure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
class SwaggerConfig {

	@Bean
	public Docket appinfo() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("super")
				.select()
				.paths(PathSelectors.any())
				.build();
	}

}
