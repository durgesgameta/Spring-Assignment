package com.zemoso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return new ARM();
    }

    @Bean
    public Speaker getSpeaker(){
        return new JBL();
    }
}
