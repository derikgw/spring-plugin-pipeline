package com.derikwilson.cicd.gitplugin.tests

import com.derikwilson.cicd.gitplugin.config.GitPluginProperties
import com.derikwilson.cicd.plugin.PluginConfiguration
import org.junit.jupiter.api.Test
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.test.context.ContextConfiguration

import static org.junit.jupiter.api.Assertions.assertAll
import static org.junit.jupiter.api.Assertions.assertEquals

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@ComponentScan(basePackages = "com.derikwilson.cicd.gitplugin")
@ConfigurationPropertiesScan("com.derikwilson.cicd.gitplugin.config")
@ContextConfiguration(classes = {PluginConfiguration, GitPluginTestConfig})
class GitPluginTest {

    private static final Logger log = LoggerFactory.getLogger(GitPluginTest.class)

    @Autowired
    private GitPluginProperties gitPluginProperties;

    @Test
    void testPropertiesLoadedCorrectly() {
        assertAll(
                () -> assertEquals("ExpectedName", gitPluginProperties.getName()),
                () -> assertEquals("ExpectedVersion", gitPluginProperties.getVersion())
        );
    }

}
