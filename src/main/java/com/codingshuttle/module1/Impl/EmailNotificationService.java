package com.codingshuttle.module1.Impl;

import com.codingshuttle.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
//If i want to create bean of this class on any condition property present in
//application.properties then we use conditionalproperty.
//@ConditionalOnProperty(name="notification.type",havingValue = "email")
@Component
@Qualifier("emailconfig")

public class EmailNotificationService implements NotificationService {
    @Override
    public  void send(String message){
        System.out.println(message+" email");
    }
}
