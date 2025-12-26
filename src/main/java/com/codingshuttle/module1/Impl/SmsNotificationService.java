package com.codingshuttle.module1.Impl;

import com.codingshuttle.module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//there are two beans present of same service  sm and email
//so the spring will be confused which on to use so we use primary annotation that this will be used

//@Primary


@ConditionalOnProperty(name="notification.type",havingValue = "sms")

@Component
//We can use qualifier, by this we can provide name to this service
@Qualifier("smsconfig")
public class SmsNotificationService implements NotificationService {
    @Override
    public  void send(String message)
        {
            System.out.println(message+ " sms");
        }
}
