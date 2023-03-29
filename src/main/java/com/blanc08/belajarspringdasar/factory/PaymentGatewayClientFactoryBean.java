package com.blanc08.belajarspringdasar.factory;

import com.blanc08.belajarspringdasar.client.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndpoint("http://example.com");
        paymentGatewayClient.setPublicKey("PUBLIC");
        paymentGatewayClient.setPrivateKey("PRIVATE");
        return paymentGatewayClient;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
