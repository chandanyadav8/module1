package com.codingshuttle.module1.HomeWorkModule1.Imp;

import com.codingshuttle.module1.HomeWorkModule1.Frosting;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class ChocolateFrosting implements Frosting {


    @Override
    public String getFrostingType() {
        return "Chocolate";
    }
}
