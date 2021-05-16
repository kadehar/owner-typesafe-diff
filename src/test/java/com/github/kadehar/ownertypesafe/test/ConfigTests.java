package com.github.kadehar.ownertypesafe.test;

import com.github.kadehar.ownertypesafe.owner.ConfigHelper;
import com.github.kadehar.ownertypesafe.typesafe.AppConfig;
import com.github.kadehar.ownertypesafe.typesafe.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTests {
    private static AppConfig webConf, apiConf;

    @BeforeAll
    static void init() {
        webConf = ConfigFactory.getConfig(ConfigFactory.Type.WEB);
        apiConf = ConfigFactory.getConfig(ConfigFactory.Type.API);
    }

    @Test
    void configShouldHasUrl() {
        final String typesafeUrl = apiConf.getValue("api.url");
        final String ownerUrl = ConfigHelper.url();

        System.out.println("TYPESAFE URL: " + typesafeUrl);
        System.out.println("OWNER URL: " + ownerUrl);

        assertEquals(typesafeUrl, ownerUrl);
    }

    @Test
    void configShouldHasBrowserNameAndVersion() {
        final String typesafeBrowser = webConf.getValue("web.browser");
        final String typesafeVersion = webConf.getValue("web.version");
        final String ownerBrowser = ConfigHelper.browserName();
        final String ownerVersion = ConfigHelper.browserVersion();

        System.out.printf("Typesafe Browser: %s Version: %s%n",
                typesafeBrowser, typesafeVersion);
        System.out.printf("Owner Browser: %s Version: %s%n",
                ownerBrowser, ownerVersion);

        assertEquals(typesafeBrowser, ownerBrowser);
        assertEquals(typesafeVersion, ownerVersion);
    }
}
