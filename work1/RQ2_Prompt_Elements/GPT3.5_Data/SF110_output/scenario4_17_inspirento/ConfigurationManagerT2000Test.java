// Test class of ConfigurationManager
package com.allenstudio.ir.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConfigurationManagerTest {

    @Test
    void testGetProperty() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        assertEquals("800x600", configManager.getProperty("Inspirento.window.size"));
        assertEquals("100,100", configManager.getProperty("Inspirento.window.location"));
        assertEquals("Inspirento", configManager.getProperty("Inspirento.window.title"));
        assertEquals("icon.png", configManager.getProperty("Inspirento.window.icon"));

        assertNull(configManager.getProperty("Inspirento.window.notExist"));
        assertNull(configManager.getProperty("notExist"));
    }

    @Test
    void testGetPropertyWithDefault() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        assertEquals("800x600", configManager.getProperty("Inspirento.window.size", "1024x768"));
        assertEquals("100,100", configManager.getProperty("Inspirento.window.location", "0,0"));
        assertEquals("Inspirento", configManager.getProperty("Inspirento.window.title", "My App"));
        assertEquals("icon.png", configManager.getProperty("Inspirento.window.icon", "default.png"));

        assertEquals("1024x768", configManager.getProperty("Inspirento.window.notExist", "1024x768"));
        assertEquals("default.png", configManager.getProperty("Inspirento.window.icon.notExist", "default.png"));
    }

    @Test
    void testSetProperty() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        assertEquals("800x600", configManager.getProperty("Inspirento.window.size"));
        assertEquals("100,100", configManager.getProperty("Inspirento.window.location"));
        assertEquals("Inspirento", configManager.getProperty("Inspirento.window.title"));
        assertEquals("icon.png", configManager.getProperty("Inspirento.window.icon"));

        configManager.setProperty("Inspirento.window.size", "1024x768");
        configManager.setProperty("Inspirento.window.location", "200,200");
        configManager.setProperty("Inspirento.window.title", "My App");
        configManager.setProperty("Inspirento.window.icon", "default.png");

        assertEquals("1024x768", configManager.getProperty("Inspirento.window.size"));
        assertEquals("200,200", configManager.getProperty("Inspirento.window.location"));
        assertEquals("My App", configManager.getProperty("Inspirento.window.title"));
        assertEquals("default.png", configManager.getProperty("Inspirento.window.icon"));
    }

    @Test
    void testSetPropertyWithNull() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        assertEquals("800x600", configManager.getProperty("Inspirento.window.size"));
        assertEquals("100,100", configManager.getProperty("Inspirento.window.location"));
        assertEquals("Inspirento", configManager.getProperty("Inspirento.window.title"));
        assertEquals("icon.png", configManager.getProperty("Inspirento.window.icon"));

        configManager.setProperty("Inspirento.window.size", null);
        configManager.setProperty("Inspirento.window.location", null);
        configManager.setProperty("Inspirento.window.title", null);
        configManager.setProperty("Inspirento.window.icon", null);

        assertNull(configManager.getProperty("Inspirento.window.size"));
        assertNull(configManager.getProperty("Inspirento.window.location"));
        assertNull(configManager.getProperty("Inspirento.window.title"));
        assertNull(configManager.getProperty("Inspirento.window.icon"));
    }

    @Test
    void testReadIn() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        configManager.writeBack();

        configManager.setProperty("Inspirento.window.size", "1024x768");
        configManager.setProperty("Inspirento.window.location", "200,200");
        configManager.setProperty("Inspirento.window.title", "My App");
        configManager.setProperty("Inspirento.window.icon", "default.png");

        configManager.readIn();

        assertEquals("800x600", configManager.getProperty("Inspirento.window.size"));
        assertEquals("100,100", configManager.getProperty("Inspirento.window.location"));
        assertEquals("Inspirento", configManager.getProperty("Inspirento.window.title"));
        assertEquals("icon.png", configManager.getProperty("Inspirento.window.icon"));
    }

    @Test
    void testWriteBack() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        configManager.writeBack();

        configManager.setProperty("Inspirento.window.size", "1024x768");
        configManager.setProperty("Inspirento.window.location", "200,200");
        configManager.setProperty("Inspirento.window.title", "My App");
        configManager.setProperty("Inspirento.window.icon", "default.png");

        configManager.writeBack();

        ConfigurationManager newConfigManager = ConfigurationManager.getInstance();
        assertEquals("1024x768", newConfigManager.getProperty("Inspirento.window.size"));
        assertEquals("200,200", newConfigManager.getProperty("Inspirento.window.location"));
        assertEquals("My App", newConfigManager.getProperty("Inspirento.window.title"));
        assertEquals("default.png", newConfigManager.getProperty("Inspirento.window.icon"));
    }

    @Test
    void testWriteDefaultsToFile() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setProperty("Inspirento.window.size", "800x600");
        configManager.setProperty("Inspirento.window.location", "100,100");
        configManager.setProperty("Inspirento.window.title", "Inspirento");
        configManager.setProperty("Inspirento.window.icon", "icon.png");

        configManager.writeBack();

        File configFile = new File(ConfigurationManager.CONFIG_DIRECTORY, ConfigurationManager.CONFIG_FILE);
        configFile.delete();

        configManager.writeDefaultsToFile();

        ConfigurationManager newConfigManager = ConfigurationManager.getInstance();
        assertEquals("800x600", newConfigManager.getProperty("Inspirento.window.size"));
        assertEquals("100,100", newConfigManager.getProperty("Inspirento.window.location"));
        assertEquals("Inspirento", newConfigManager.getProperty("Inspirento.window.title"));
        assertEquals("icon.png", newConfigManager.getProperty("Inspirento.window.icon"));
    }

    @Test
    void testGetPath() {
        String[] path = ConfigurationManager.getPath("Inspirento.window.size");
        assertEquals("Inspirento.window", path[0]);
        assertEquals("size", path[1]);

        path = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", path[0]);
        assertEquals("location", path[1]);

        path = ConfigurationManager.getPath("Inspirento.window");
        assertEquals("Inspirento", path[0]);
        assertEquals("window", path[1]);
    }

    @Test
    void testGetInstance() {
        ConfigurationManager configManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configManager2 = ConfigurationManager.getInstance();
        assertSame(configManager1, configManager2);
    }
}