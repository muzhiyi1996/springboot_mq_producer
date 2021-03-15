package com.yang.boot.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class Consumer {

    @JmsListener(destination = "${mytopic}")
    public void receice(TextMessage textMessage) throws JMSException {
        System.out.println(textMessage.getText());
    }

}
