package com.derikwilson.cicd.host

import com.derikwilson.cicd.plugin.Plugin

public interface Host {
    void addPlugin(Plugin plugin);
    void removePlugin(Plugin plugin);
    void startAllPlugins();
    void stopAllPlugins();
}
