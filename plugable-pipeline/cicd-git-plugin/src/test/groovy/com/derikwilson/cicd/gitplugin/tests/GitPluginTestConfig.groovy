package com.derikwilson.cicd.gitplugin.tests

import com.derikwilson.cicd.gitplugin.config.GitPluginProperties
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@TestConfiguration
@EnableConfigurationProperties(GitPluginProperties.class) // Make sure to enable configuration properties
public class GitPluginTestConfig {

    // If GitPluginProperties requires specific constructor parameters, provide them
    @Bean
    public GitPluginProperties gitPluginProperties() {
        return new GitPluginProperties("TestName", "TestVersion");
    }
}


