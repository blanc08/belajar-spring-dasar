package com.blanc08.belajarspringdasar;

import com.blanc08.belajarspringdasar.listerner.LoginAgainSuccessListener;
import com.blanc08.belajarspringdasar.listerner.LoginSuccessListener;
import com.blanc08.belajarspringdasar.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

public class EventListenerTest {

    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class
    })
    public static class TestConfiguration {
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);

        userService.login("bagus", "password");
        userService.login("bagus", "salah");
        userService.login("bagus", "salah");
    }
}
