package com.sda.spring.core.qualifier;

import org.springframework.stereotype.Component;

@Component
public class BarFormatter implements Formatter {
    @Override
    public String format(String someString) {
        System.out.println("bar formatting");
        return "bar formatting";
    }
}
