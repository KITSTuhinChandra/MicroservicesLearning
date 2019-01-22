package com.example.demo.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * This Class acts as the swagger global documentation configuration. Can be
 * accessible via link: {@link http://localhost:8080/swagger-ui.html}
 * 
 * @author kits
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * Constructs API documentations for the Controllers
	 * 
	 * @return Docket
	 * 
	 */
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.example.demo.controller")) // Generate document for only selected packages
				.build() 
				.apiInfo(metaData());				
	}
	
	private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("Spring Boot REST API")
                .description("\"Spring Boot REST API for Demo\"")
                .version("1.0.0")
                .build();
    }
   

}
