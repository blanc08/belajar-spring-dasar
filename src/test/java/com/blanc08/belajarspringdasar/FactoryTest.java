package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.client.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {

        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("http://example.com", paymentGatewayClient.getEndpoint());
        Assertions.assertEquals("PUBLIC", paymentGatewayClient.getPublicKey());
        Assertions.assertEquals("PRIVATE", paymentGatewayClient.getPrivateKey());
    }
}
