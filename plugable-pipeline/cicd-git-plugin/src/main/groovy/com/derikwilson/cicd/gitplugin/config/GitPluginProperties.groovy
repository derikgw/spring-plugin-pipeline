package com.derikwilson.cicd.gitplugin.config

import com.derikwilson.cicd.plugin.AbstractPluginProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.stereotype.Component

@ConfigurationProperties(prefix="plugins.git")
class GitPluginProperties extends AbstractPluginProperties {

    final String name
    final String version

    @ConstructorBinding
    GitPluginProperties(String name, String version) {
        this.name = name
        this.version = version
    }

    @Override
    String getName() {
        return name
    }

    @Override
    String getVersion() {
        return version
    }
}
