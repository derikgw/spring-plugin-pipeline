package com.derikwilson.cicd.core

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration

@SpringBootTest
@ContextConfiguration(classes = {GitPluginApplicationTestsConfig.class, PluginConfiguration.class})
class CoreApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(CoreApplicationTests.class);

    @Test
    void contextLoads() {

        log.info("Running contextLoads in ${this.getClass().getName()}...")

    }

}
