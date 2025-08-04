package com.harsh.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.harsh.sbeans, com.harsh.factory"})
@PropertySource("com/harsh/commons/Info.properties")
public class AppConfig {

}
