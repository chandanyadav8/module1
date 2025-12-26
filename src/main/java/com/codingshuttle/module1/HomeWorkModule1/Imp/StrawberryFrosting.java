package com.codingshuttle.module1.HomeWorkModule1.Imp;

import com.codingshuttle.module1.HomeWorkModule1.Frosting;
import org.springframework.stereotype.Component;

@Component

public class StrawberryFrosting implements Frosting {
    public String getFrostingType() {
        return "Strawberry";
    }
}
