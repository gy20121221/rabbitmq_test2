package com.example.rabbitmq_test2.test;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 3398
 * 监听的队列名称 TestDirectQueue
 */
@Component
@RabbitListener(queues = "TestDirectQueue")
public class DirectReceiverNew {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("NEWDirectReceiver消费者收到消息  : " + testMessage.toString());
    }

}