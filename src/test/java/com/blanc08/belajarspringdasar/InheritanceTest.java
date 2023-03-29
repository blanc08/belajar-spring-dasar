package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.service.MerchantService;
import com.blanc08.belajarspringdasar.service.MerchantServiceImplementation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImplementation merchantServiceImplementation = applicationContext.getBean(MerchantServiceImplementation.class);

        Assertions.assertSame(merchantService, merchantServiceImplementation);
    }
}
