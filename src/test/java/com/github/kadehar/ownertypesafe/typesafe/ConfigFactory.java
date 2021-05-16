package com.github.kadehar.ownertypesafe.typesafe;

public class ConfigFactory {
    public enum Type {
        WEB, API
    }

    public static AppConfig getConfig(final Type type) {
        switch (type) {
            case API:
                return new AppConfig("api.conf");
            case WEB:
            default:
                return new AppConfig("web.conf");
        }
    }
}
