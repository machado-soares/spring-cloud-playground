package com.example.demo.config;

import com.example.demo.listeners.Listener;
import com.example.demo.listeners.PersonListener;
import com.example.demo.processors.PersonProcessor;
import com.example.demo.processors.PingProcessor;
import com.example.demo.processors.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Listener log() {
        return new Listener();
    }

    @Bean
    public Processor processor() {
        return new Processor();
    }

    @Bean
    PersonProcessor personProcessor(){
        return new PersonProcessor();
    }

    @Bean
    public PersonListener personListener(){
        return new PersonListener();
    }

    @Bean
    public PingProcessor pingProcessor(){
        return new PingProcessor();
    }

}
