package com.codingshuttle.module1.HomeWorkModule1.Imp;

import com.codingshuttle.module1.HomeWorkModule1.Syrup;
import org.springframework.stereotype.Component;

@Component

public class StrawberrySyrup implements Syrup   {
    public String getSyrupType() {
        return "Strawberry";
    }
}
