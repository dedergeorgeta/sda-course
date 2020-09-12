package com.sda.spring.core.qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.sda.spring.core.qualifier"})
@Configuration
public interface Formatter {
    String format(String someString);

}
