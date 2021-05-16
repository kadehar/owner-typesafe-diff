package com.github.kadehar.ownertypesafe.typesafe;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class AppConfig {
    private final Config config;

    public AppConfig(final String fileName) {
        config = ConfigFactory.systemProperties()
                .withFallback(ConfigFactory.systemEnvironment())
                .withFallback(ConfigFactory
                        .parseResources("typesafe/" + fileName))
                .resolve();
    }

    public String getValue(final String key) {
        return config.getString(key);
    }
}
