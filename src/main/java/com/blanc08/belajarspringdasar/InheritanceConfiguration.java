package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.service.MerchantServiceImplementation;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        MerchantServiceImplementation.class
})
public class InheritanceConfiguration {
}
