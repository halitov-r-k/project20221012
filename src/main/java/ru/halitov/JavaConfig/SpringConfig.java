package ru.halitov.JavaConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.halitov.JavaConfig")
@PropertySource("classpath:app.properties")
public class SpringConfig {

}
