package com.github.bacazy.jete.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.github.bacazy.jete"})
@EnableJpaRepositories({"com.github.bacazy.jete.web.repository"})
@ServletComponentScan({"com.github.bacazy.jete.web.filter"})
public class JeteApplication {
    public static void main(String[] args) {
        SpringApplication.run(JeteApplication.class, args);
    }
}
