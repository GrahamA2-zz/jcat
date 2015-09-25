package io.hypercat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.hypercat.cat.Hypercat;
import io.hypercat.cat.HypercatImpl;

@Configuration
public class AppConfig {

    @Bean
    public Hypercat hypercat() {
        return new HypercatImpl();
    }
}