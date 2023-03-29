package com.blanc08.belajarspringdasar.configuration;

import com.blanc08.belajarspringdasar.data.Bar;
import com.blanc08.belajarspringdasar.data.Foo;
import com.blanc08.belajarspringdasar.data.FooBar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar) {
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }

}
