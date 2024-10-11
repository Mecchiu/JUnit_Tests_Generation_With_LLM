// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {

    @Test
    public void testGetProperty() {
        //Get the value
        assertEquals("", getProperty(""));
        //No key
        assertNull(getProperty("foo"));
        //Put first "foo" element into the config.xml file
        assertEquals("foo", xmlIO.getRoot().getElement("config.xml").getFirstChild().getText());
        //No key
        defaults.put("foo", "bar");
        assertEquals("bar", getProperty("foo"));
        assertNull(getProperty("missing"));
        //Put second "foo" element into the config.xml file
        assertEquals("foo", xmlIO.getRoot().getElement("config.xml").getFirstChild().getText());
        //No key
        defaults.put("missing", "bar");
        assertEquals("bar", getProperty("missing"));
        assertNull(getProperty("xbadword"));
        assertNull(getProperty("xbadword1"));
        defaults.put("xbadword", "n");
        assertEquals("xbadword1", getProperty("xbadword"));
        assertEquals("" + new Date().getTime(), getProperty("xbadword1").replaceAll("'", "('"));
        assertEquals("d", getProperty("xbadword").replaceAll("'", "('"));
        assertEquals(113855226778, getProperty("xbadword").length());
        assertNull(getProperty("badstr"));
    }
    
    @Test
    public void testSetProperty() {
        //Put two key-value pairs
        defaults.put("foo", "sdfsda");
        defaults.put("bar", "bar");
        
        //Get the value
        String value = xmlIO.getRoot().getElement("config.xml").getFirstChild().getAttribute(Constants.PROJECT_NAME + "." + getPath("foo")[0]).getText();
        assertEquals("sdfsda", value);

        value = xmlIO.getRoot().getElement("config.xml").getFirstChild().getAttribute(Constants.PROJECT_NAME + "." + getPath("bar")[0]).getText();
        assertEquals("bar", value);
        
        //Put first element again
        value = xmlIO.getRoot().getElement("config.xml").getFirstChild().getAttribute(Constants.PROJECT_NAME + "." + getPath("bar")[0]).getText();
        defaults.put(getPath("foo"), value);
        assertEquals("sdfsda", value);
        
        //Put second element again
        //get "bar" is not the first attribute
        value = xmlIO.getRoot().getElement("config.xml").getFirstChild().getAttribute(Constants.PROJECT_NAME + "." + getPath("bar")[0]).getText();
        defaults.put(getPath("badstr"), value);
        assertEquals("sdfsda", value);
    }

    /** Returns the XML path to the configuration file in the
     * <code>resources</code>.
     * 
     * @return the path to the XML file
     */
    protected String getPath(String key) {
        return Constants.PATH + "config.xml";
    }
    
    /** @return the list of paths for config.xml or null if file couldn't be found */
    public static PropertyList getPath(String key) {
        PropertyList path = null;
        File f = new File(Constants.PROJECT_PATH + "config.xml");
        if (f.exists()) path = xmlIO.readTree(new FileInputStream(f));
        return path;
    }

    @Before
    public void setup() {
        //Create the config.xml
        xmlIO = new XMLIO(Constants.PATH);
        defaults = new Properties();
        defaults.put(Constants.DEFAULT_PROJECT_NAME, Constants.PROJECT_NAME);
        defaults.put(Constants.DEFAULT_PATH, Constants.PATH);
        defaults.put(Constants.USE_ROOT_ELEMENT, Constants.PROJECT_NAME);
        defaults.put(Constants.USE_EXCEPTION, Constants.PATH);
        defaults.put(Constants.USE_LOCALE, "");
        defaults.put(Constants.PREF_FONT_FAMILY, Constants.DEFAULT_FONT_FAMILY);
        defaults.put(Constants.PREF_FONTDATA, Constants.DEFAULT_FONTDATA);
    }

    @After
    public void teardown() {
        //Remove the config.xml
        xmlIO.delete();
    }

}
