package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.data.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({
        "com.blanc08.belajarspringdasar.service",
        "com.blanc08.belajarspringdasar.repository",
        "com.blanc08.belajarspringdasar.configuration"
})
@Import({MultiFoo.class})
public class ComponentConfiguration {
}
