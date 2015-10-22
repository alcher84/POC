package com.poc.webservice;

import com.poc.hibernate.data.config.HibernateDataConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan("com.poc")
@EnableAutoConfiguration(exclude = { JmxAutoConfiguration.class })
@Import(HibernateDataConfig.class)
public class SpringWebserviceRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebserviceRestApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringWebserviceRestApplication.class);
    }

}
