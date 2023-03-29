package com.blanc08.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({
        "com.blanc08.belajarspringdasar.service"
})
public class ComponentConfiguration {
}
