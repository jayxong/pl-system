package com.yeanson.ddd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.yeanson.ddd.domain.*.repository")
public class SpringDDDApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDDDApplication.class);
    }
}
