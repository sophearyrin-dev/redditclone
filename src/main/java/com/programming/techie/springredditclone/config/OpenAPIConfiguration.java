package com.programming.techie.springredditclone.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfiguration {


//    @Bean
//    public OpenAPI expenseAPI() {
//        return new OpenAPI()
//                .info(new Info().title("Reddit Clone API")
//                        .description("API for Reddit Clone Application")
//                        .version("v0.0.1")
//                        .license(new License().name("Apache License Version 2.0").url("http://programmingtechie.com")))
//                .externalDocs(new ExternalDocumentation()
//                        .description("Expense Tracker Wiki Documentation")
//                        .url("https://expensetracker.wiki/docs"));
//    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Your API Title")
                        .version("1.0")
                        .description("API Description"))
                .addSecurityItem(new SecurityRequirement().addList("bearer-jwt"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("bearer-jwt",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")));
    }
}
