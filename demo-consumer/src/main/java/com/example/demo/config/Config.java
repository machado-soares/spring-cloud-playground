package com.example.demo.config;

import com.example.demo.listeners.Listener;
import com.example.demo.listeners.PersonListener;
import com.example.demo.processors.PongProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {


    @Bean
    public PersonListener personListener(){
        return new PersonListener();
    }
    @Bean
    public Listener log() {
        return new Listener();
    }
    @Bean
    public PongProcessor pongProcessor() {
        return new PongProcessor();
    }

}
