// SimpleUserMgr_1Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {
		
	/**
	* Empty userMgr.
	*/
    public void test_emptyUserMgr(){
        SimpleUserMgr userMgr = new SimpleUserMgr();
        assertNull(userMgr.getNamesbyOrg(null));
    }

    /**
	* Test string parameter
	*/
    @Test
    public void test_getNamesbyOrg_string(){
        String org = "orgName";
        SimpleUserMgr userMgr = new SimpleUserMgr();

        HashSet<String> names = new HashSet<>();
        Vector<String> names_expected = new Vector<>();
        Vector<String> names_return = userMgr.getNamesbyOrg(org);

		
        assertEquals(names.size(), names_return.size());
        for(int i=0; i<names_expected.size(); i++) {
            assertEquals(names_expected.get(i), names_return.get(i));
        }

        try {
            names_return = userMgr.getNamesbyOrg(org);
        } catch(IllegalArgumentException e) {
            fail("IllegalArgumentException was expected.");
        }

        HashSet<String> names_unexpected = new HashSet<>(names.size() * 3);
        for(String name: names){
            names_unexpected.add(name.substring(0,org.length()) + ".".concat(name.substring(org.length())));
        }

        assertTrue(names_unexpected.size() > 0);
    }

    @Test
    public void test_getNamebyOrg(){

    }

    @Test
    public void test_getProperty() throws Exception{
        SimpleUserMgr userMgr = new SimpleUserMgr();

        Properties property = userMgr.getProperties();

	    assertNotNull(property.get("key"));
    }

    @Test
    public void test_loadDefault() throws Exception{
        SimpleUserMgr userMgr = new SimpleUserMgr();

        HashSet<String> names = new HashSet<>();
        StringReader reader = new StringReader();
        BufferedReader bufferedReader = new BufferedReader(reader);
        Vector<String> names_expected = new Vector<>();
        Vector<String> names_return = userMgr.loadDefault();

        assertEquals(names_return.size(), names_expected.size());
        for(int i=0; i<names_expected.size(); i++) {
            assertEquals(names_expected.get(i), names_return.get(i));
        }

        try {
            names_return = userMgr.loadDefault();
        } catch(IOException e) {
            fail("IOException was expected.");
        }

        names_expected.clear();
        names_expected.add("dummy");
        names_expected.add("dummy2");
        names_expected.add("dummy3");

	    assertNotNull(names);
        assertTrue(names.size() == 30);
    }

    @Test
    public void test_loadDefinitions() throws Exception{

        Properties property = new Properties();
        Vector<String> definitions = new Vector<>();
        Vector<String> expected = new Vector<>();

        property.setProperty("property-type", "dummy");
        property.setProperty("property1", "description");
        property.setProperty("property1.property-type", "dummy.description");
        property.setProperty("property3", "description");
        property.setProperty("property3.property-type", "dummy.description");
        property.setProperty("property3.property1", "description");

        property.setProperty("property1.property2", "description");
        property.setProperty("property1.property2.property-type", "dummy.description");
        property.setProperty("property1.property2.property3", "description");
        property.setProperty("property1.property2.property2.property-type", "dummy.description");

        property.setProperty("property3.property2", "description");
        property.setProperty("property3.property2-property3.property-type", "dummy.description");
        property.setProperty("property3.property3.property-type-2", "dummy.description");

        property.setProperty("property2", "description");
        property.setProperty("property2.property3", "description");
        property.setProperty("property3.property2-property3.property-type", "dummy.description");

        property.setProperty("property1.property2.property2-3", "description");
        property.setProperty("property2.property12-property3", "description");

        property.setProperty("property3.property2-property3-property3.property-type", "dummy.description");

        property.setProperty("property3.property3.property-2", "description");
        property.setProperty("property3.property3.property", "description");

        property.setProperty("property2.property3.property3.property-2", "description");
        property.setProperty("property2.property3.property2.property3.property-2", "description");

        property.setProperty("property3.property13-property3.property-2", "description");
        property.setProperty("property2.property3.property3.property-3.property-2", "description");
        property.setProperty("property2.property3.property3.property-4", "description");

        readPropertyFile(property);
        
        vectorOfDefinitions = new Vector();
        vectorOfDefinitions.addAll(property.propertyMap());

        properties.clear();
        properties.putAll(property);
	    assertNotNull(properties);
        assertNotNull(properties.getProperty("value"));
        assertEquals(2, properties.size());
    }

    private void readPropertyFile(Properties prop) throws IOException{
        InputStream fileInputStream = new InputStream() {
            public int read() throws IOException {
                return prop.getProperty("value", 0).charAt(0);
            }
        };
        StringReader reader = new StringReader(propFile);
        Vector<String> v = new Vector<>();
        BufferedReader bufferedReader = new BufferedReader(reader);
        String str;
}
}