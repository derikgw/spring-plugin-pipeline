package com.derikwilson.cicd.host

import com.derikwilson.cicd.plugin.Plugin

class HostImpl implements Host {
    private List<Plugin> plugins = new ArrayList<>();

    @Override
    void addPlugin(Plugin plugin) {
        this.plugins.add(plugin);
        System.out.println("Added plugin: " + plugin.name());
    }

    @Override
    void removePlugin(Plugin plugin) {
        this.plugins.remove(plugin);
        System.out.println("Removed plugin: " + plugin.name());
    }

    @Override
    void startAllPlugins() {
        System.out.println("Starting all plugins...");
        for (Plugin plugin : plugins) {
            plugin.start();
        }
    }

    @Override
    void stopAllPlugins() {
        System.out.println("Stopping all plugins...");
        for (Plugin plugin : plugins) {
            plugin.stop();
        }
    }
}

