package com.github.kadehar.ownertypesafe.owner;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:owner/api.properties"
})
public interface ApiConfig extends Config {
    @Key("host")
    String host();
    @Key("version")
    String version();
}
