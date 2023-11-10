package com.example.demo.controllers;

import com.example.demo.dtos.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.retry.support.RetryTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SomeController {

    @Autowired
    private StreamBridge sender;

    @PostMapping("send")
    public void someAction(@RequestBody Map<String,String> body){

        sender.send("processor-in",body.get("message"));
    }

    @PostMapping("person/register")
    public void register(@RequestBody Map<String,Object> potentialPerson){
        sender.send("person-processor-in",potentialPerson);
    }

    @GetMapping("ping-pong/start")
    public void startGame(){
        sender.send("ping-processor-in","pong");
    }

}
