package com.example.demo.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class PingProcessor implements Function<String,String> {

    private static final Integer MAX_PLAYS = 1;
    Logger logger = LoggerFactory.getLogger(PingProcessor.class);
    private Integer counter = 0;

    private static final String PING = "ping";
    @Override
    public String apply(String s) {
        if(s.equalsIgnoreCase("pong") && counter <= MAX_PLAYS){
            logger.info(PING);
            counter++;
            return PING;
        }
        counter= 0;
        throw new RuntimeException();
    }
}
