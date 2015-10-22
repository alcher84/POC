package com.poc.hibernate.data;

import com.poc.hibernate.data.config.HibernateDataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by achernysh on 22.10.2015.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories(basePackages = "com.poc.hibernate.data.repositories")
@EntityScan(basePackages = "com.poc.hibernate.data.model")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
