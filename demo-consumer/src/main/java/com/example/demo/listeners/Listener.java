package com.example.demo.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class Listener implements Consumer<String> {

    Logger logger = LoggerFactory.getLogger(Listener.class);

    @Override
    public void accept(String s) {
        logger.info("Received message from queue with value: {}", s);
    }

}
