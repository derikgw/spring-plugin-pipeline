package com.derikwilson.cicd.plugin

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties
abstract class AbstractPluginProperties {

    abstract String getName()
    abstract String getVersion()

}

