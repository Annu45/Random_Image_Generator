package com.example.demo.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI dogApi() {
        return new OpenAPI()
            .info(new Info()
                .title("Dog Image API")
                .description("API that fetches random dog images")
                .version("1.0.0"));
    }
}
