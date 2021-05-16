package com.github.kadehar.ownertypesafe.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:owner/web.properties"
})
public interface WebConfig extends Config {
    @Key("browser")
    String browserName();
    @Key("browser.version")
    String browserVersion();
}
