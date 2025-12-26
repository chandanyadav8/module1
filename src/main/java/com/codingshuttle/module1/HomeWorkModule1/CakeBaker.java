package com.codingshuttle.module1.HomeWorkModule1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;
    public void BakeCake(){
        System.out.println("Baking cake with: ");
        System.out.println("frosting "+frosting.getFrostingType());
        System.out.println("syrup "+syrup.getSyrupType());

    }
}
