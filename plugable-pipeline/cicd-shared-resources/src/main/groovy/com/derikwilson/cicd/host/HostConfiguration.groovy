package com.derikwilson.cicd.host

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HostConfiguration {

    @Bean
    Host host() {
        return new HostImpl();
    }

}
