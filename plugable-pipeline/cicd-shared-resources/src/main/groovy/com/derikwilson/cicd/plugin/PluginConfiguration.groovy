package com.derikwilson.cicd.plugin

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="plugins")
class PluginConfiguration {
    private List<PluginInfo> plugins;

    static class PluginInfo {
        private String name;
        private String version;

        // Getters and setters
        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        String getVersion() {
            return version;
        }

        void setVersion(String version) {
            this.version = version;
        }
    }

    // Getters and setters
    List<PluginInfo> getPlugins() {
        return plugins;
    }

    void setPlugins(List<PluginInfo> plugins) {
        this.plugins = plugins;
    }
}
