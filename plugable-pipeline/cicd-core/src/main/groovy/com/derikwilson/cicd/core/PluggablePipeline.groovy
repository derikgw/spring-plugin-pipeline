package com.derikwilson.cicd.core;

import com.derikwilson.cicd.host.Host;
import com.derikwilson.cicd.plugin.Plugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = "com.derikwilson.cicd")  // Ensure this scans your plugins
class PluggablePipeline {

    //@Autowired
    private Host host;

    //@Autowired
    private List<Plugin> plugins;  // Autowired list of all Plugin implementations

    static void main(String[] args) {
        SpringApplication.run(PluggablePipeline.class, args);
    }

    //@Autowired
    void configurePlugins(Host host) {
        plugins.forEach(host::addPlugin);
        host.startAllPlugins();
        // Perform tasks...
        host.stopAllPlugins();
    }
}

