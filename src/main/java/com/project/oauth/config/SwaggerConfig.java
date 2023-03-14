package com.project.oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()) // apiInfo() 정보 매핑
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.project.oauth.controller"))
                .paths(PathSelectors.any()) // controller 패키지 모두 추출
                .build()
                .useDefaultResponseMessages(false); // ResponseMessages 디폴트값 적용 X
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("OAuth Project REST API Documentation")
                .description("OAuth Project REST API 설명 문서입니다.")
                .version("v1")
                .license("OAuth Project")
                .licenseUrl("localhost:8080")
                .build();
    }

}
