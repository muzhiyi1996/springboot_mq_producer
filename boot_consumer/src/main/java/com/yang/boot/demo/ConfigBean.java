package com.yang.boot.demo;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.EnableJms;

@Component
@EnableJms
public class ConfigBean {

    @Value("${mytopic}")
    public String queueName;

    @Bean
    public ActiveMQTopic queue(){
        return new ActiveMQTopic(queueName);
    }
}
