package com.juaracoding.faspringbootrestapi.configuration;

import com.juaracoding.faspringbootrestapi.core.Crypto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;

/*
Created by IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author F_Ardhi a.k.a. Fadillah Ardhi
Java Developer
Created on 7/31/2023 9:19 PM
@Last Modified 7/31/2023 9:19 PM
Version 1.0
*/
@Configuration
public class MainConfiguration {
    @Autowired
    private Environment environment;
    @Primary
    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(environment.getProperty("spring.datasource.driverClassName"));
        dataSourceBuilder.url(environment.getProperty("spring.datasource.url"));
        dataSourceBuilder.username(environment.getProperty("spring.datasource.username"));//environment.getProperty("spring.datasource.user")
        dataSourceBuilder.password(Crypto.performDecrypt(environment.getProperty("spring.datasource.password")));//environment.getProperty("spring.datasource.password")
        return dataSourceBuilder.build();
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
