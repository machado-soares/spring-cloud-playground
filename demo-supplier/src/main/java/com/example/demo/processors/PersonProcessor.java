package com.example.demo.processors;

import com.example.demo.dtos.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;
import java.util.function.Function;

public class PersonProcessor implements Function<Map<String,Object>, Person> {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public Person apply(Map<String, Object> stringObjectMap) {
        return mapper.convertValue(stringObjectMap, Person.class);
    }
}
