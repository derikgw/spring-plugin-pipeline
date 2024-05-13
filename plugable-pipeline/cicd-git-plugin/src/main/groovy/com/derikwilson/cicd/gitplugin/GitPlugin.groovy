package com.derikwilson.cicd.gitplugin

import com.derikwilson.cicd.gitplugin.config.GitPluginProperties
import com.derikwilson.cicd.plugin.Plugin
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class GitPlugin implements Plugin {

    @Autowired
    private GitPluginProperties properties

    @Override
    void start() {
        println("${properties.getName()} version ${properties.getVersion()} is starting.")
        // Add start logic
    }

    @Override
    void stop() {
        println("${properties.getName()} is stopping.")
        // Add stop logic
    }

    @Override
    String getName() {
        return properties.getName()
    }

    @Override
    String getVersion() {
        return properties.getVersion()
    }
}
