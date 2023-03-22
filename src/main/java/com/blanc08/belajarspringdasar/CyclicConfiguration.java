package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.data.cyclic.CyclicA;
import com.blanc08.belajarspringdasar.data.cyclic.CyclicB;
import com.blanc08.belajarspringdasar.data.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
