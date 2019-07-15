package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@EnableBinding(DemoChannel.class)
@RestController
public class Application {

    @Resource(name = DemoChannel.OUTPUT)
    private MessageChannel channel;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/send")
    public String sendMessage(){
        channel.send(MessageBuilder.withPayload("Hello world!").build());
        return "ok";
    }

    @StreamListener(DemoChannel.INPUT)
    public void receive(Message<String> message){
        System.out.println(message);
    }
}
