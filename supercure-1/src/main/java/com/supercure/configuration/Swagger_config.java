//package com.supercure.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//
// class Swagger_config {
//	@Primary
//	@Bean
//	public Docket appinfo() {
//		return new Docket(DocumentationType.SWAGGER_2);
//				.groupName("super").select()
//				.paths(PathSelectors.any())
//				.build();
//	}
//
//}
