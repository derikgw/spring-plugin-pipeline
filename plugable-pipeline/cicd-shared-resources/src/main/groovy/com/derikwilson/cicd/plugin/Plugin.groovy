package com.derikwilson.cicd.plugin

interface Plugin {
    void start()
    void stop()
    String getVersion()
    String getName()
}
