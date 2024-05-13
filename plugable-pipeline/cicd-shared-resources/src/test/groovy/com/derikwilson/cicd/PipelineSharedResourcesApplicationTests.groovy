package com.derikwilson.cicd

import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [SharedResourcesConfig])
class PipelineSharedResourcesApplicationTests {

    private static final Logger log = LoggerFactory.getLogger(PipelineSharedResourcesApplicationTests.class);

    @Test
    void contextLoads() {

        log.info("Running contextLoads in ${this.getClass().getName()}...")

    }

}
