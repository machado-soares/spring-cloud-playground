package com.example.demo.processors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class Processor implements Function<String, String> {
    Logger logger = LoggerFactory.getLogger(Processor.class);

    @Override
    public String apply(String s) {
        String result = s.toUpperCase();
        logger.info("Input message: {} | Output message: {}", s, result);
        return result;
    }
}
