package com.pluralsight.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//Overriding spring boot configuration
@Configuration
public class PersistenceConfiguration {

   /* heroku deployment @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        System.out.println("nitesh code");
        return builder.build();
    }*/
}
