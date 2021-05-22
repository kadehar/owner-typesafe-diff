package com.github.kadehar.ownertypesafe.owner;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHelper {
    private final static ApiConfig api = ConfigFactory
            .create(ApiConfig.class, System.getProperties());
    private final static WebConfig web = ConfigFactory
            .create(WebConfig.class, System.getProperties());

    public static String url() {
        return api.host() + api.version();
    }

    public static String host() {
        return api.host();
    }

    public static String browserName() {
        return web.browserName();
    }

    public static String browserVersion() {
        return web.browserVersion();
    }
}
