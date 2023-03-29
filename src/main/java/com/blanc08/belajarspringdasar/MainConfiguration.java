package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.configuration.BarConfiguration;
import com.blanc08.belajarspringdasar.configuration.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
}
