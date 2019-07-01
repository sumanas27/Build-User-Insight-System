package com.sumanasaha.UserInsightSystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.sumanasaha.UserInsightSystem"))
                .paths(PathSelectors.regex("/rest.*"))
                .build()
                .apiInfo(metaInfo());

    }
    Contact contact = new Contact("Sumana Saha", "https://www.linkedin.com/in/sumana-saha-30148664/",
            "sumanas27@gmail.com");
    List<VendorExtension> vendorExtensions = new ArrayList<>();
    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "User Insight System API",
                "Provides user preferences for Hotels and Amenities",
                "1.0",
                "Terms of Service",
                contact, "Apache License Version 2.0",
                             "https://www.apache.org/license.html", vendorExtensions);
        return apiInfo;
    }

}
