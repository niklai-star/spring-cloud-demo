package com.test;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface DemoChannel {

    String INPUT = "demo_input";

    String OUTPUT = "demo_output";

    @Output(OUTPUT)
    MessageChannel sendMessage();

    @Input(INPUT)
    SubscribableChannel receiveMessage();
}
