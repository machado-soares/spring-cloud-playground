package com.example.demo.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class PongProcessor implements Function<String,String> {

    private static final Integer MAX_PLAYS = 1;
    Logger logger = LoggerFactory.getLogger(PongProcessor.class);
    private Integer counter = 0;

    private static final String PONG = "pong";
    @Override
    public String apply(String s) {
        if(s.equalsIgnoreCase("ping") && counter <= MAX_PLAYS){
            logger.info(PONG);
            counter++;
            return PONG;
        }
        counter=0;
        throw new RuntimeException();
    }
}
