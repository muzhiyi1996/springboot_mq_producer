package com.yang.topic.demo;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.TextMessage;
import javax.jms.Topic;
import java.util.UUID;

@Component
public class Producer {

    @Autowired
    private Topic topic;

    @Autowired
    private JmsMessagingTemplate template;

    @Scheduled(fixedDelay = 3000)
    public void send(){
        template.convertAndSend(topic, UUID.randomUUID().toString().substring(0,5));
    }
}
