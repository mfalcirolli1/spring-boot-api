package com.mfal.spring_app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    // Instancia classes externas com '@Bean' para serem utilizadas com injeção de dependência com '@Autowired'
    // Padrão Singleton

    @Bean
    public String exampleSdkAWS() {
        return new String();
    }
}
