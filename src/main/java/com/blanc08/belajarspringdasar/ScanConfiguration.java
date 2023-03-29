package com.blanc08.belajarspringdasar;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {
        "com.blanc08.belajarspringdasar.configuration"
})
@Configuration
public class ScanConfiguration {
}
