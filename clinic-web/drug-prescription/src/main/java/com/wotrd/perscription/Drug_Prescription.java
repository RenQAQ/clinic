package com.wotrd.perscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableOAuth2Sso
@EnableSwagger2
public class Drug_Prescription {
    public static void main(String[] args) {
        SpringApplication.run(Drug_Prescription.class,args);
    }
}
