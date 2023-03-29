package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.data.Connection;
import com.blanc08.belajarspringdasar.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection() {
        return new Connection();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Server server() {
        return new Server();
    }
}
