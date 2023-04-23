package com.uclm.restcalculator;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "REST Calculator API", version = "2.0", description = "REST Calculator API"))
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}