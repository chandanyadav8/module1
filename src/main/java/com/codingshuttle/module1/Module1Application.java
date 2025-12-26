package com.codingshuttle.module1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {
    @Autowired
    PaymentService paymentService;

//    Autowired shoud not be used in production
//    @Autowired
//    NotificationService notificationService;


//    will use constructor method DI
//        final NotificationService notificationService;
//        We have define the qualifier now we need to set the qualifier here alos
//    public Module1Application(@Qualifier("smsconfig") NotificationService notificationService){
//        this.notificationService=notificationService;
//    }

//if we are using conditionalon property we have remove  qualifeir
//    public Module1Application(NotificationService notificationService){
///       this.notificationService=notificationService;
//    }

//if i need to use all the implementation of notificaitonservice
// for this we have remove conditional on property
@Autowired
Map<String,NotificationService> Beans=new HashMap<>();

    //now with the help of constructor method of di we can not change the notificaiton service
//    ex: NotificationService=null;

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        paymentService.pay();
//        notificationService.send("sending");
        for(var nf: Beans.entrySet())
        {
            System.out.println(nf.getKey());
            nf.getValue().send("sending");
        }
    }
}
