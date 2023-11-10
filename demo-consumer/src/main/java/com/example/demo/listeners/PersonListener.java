package com.example.demo.listeners;

import com.example.demo.dtos.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Consumer;

public class PersonListener implements Consumer<Person> {

    Logger logger = LoggerFactory.getLogger(PersonListener.class);


    @Override
    public void accept(Person person) {
        logger.info("Registered person with values: {}", person.toString());
    }

}
