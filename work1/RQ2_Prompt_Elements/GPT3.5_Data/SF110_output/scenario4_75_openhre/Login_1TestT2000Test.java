// Login_1Test.java
package com.browsersoft.aacs;

import org.junit.jupiter.api.Test;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Login}.
 * It contains ten unit test cases for the {@link Login#getProps()} method.
 */
class Login_1Test {

    /**
     * Test case to check if the properties file is loaded successfully.
     */
    @Test
    void testGetProps() {
        Properties props = Login.getProps();
        assertNotNull(props);
    }

    /**
     * Test case to check if the properties file is loaded successfully with a given file name.
     */
    @Test
    void testGetPropsWithFileName() {
        Properties props = Login.getProps("AACS");
        assertNotNull(props);
    }

    /**
     * Test case to check if the properties file contains the expected keys.
     */
    @Test
    void testGetPropsContainsKeys() {
        Properties props = Login.getProps();
        assertTrue(props.containsKey("ldap.url"));
        assertTrue(props.containsKey("ldap.base"));
        assertTrue(props.containsKey("ldap.user"));
        assertTrue(props.containsKey("ldap.password"));
        assertTrue(props.containsKey("ldap.search.filter"));
        assertTrue(props.containsKey("ldap.search.scope"));
        assertTrue(props.containsKey("ldap.search.attr"));
        assertTrue(props.containsKey("ldap.search.attr.email"));
        assertTrue(props.containsKey("ldap.search.attr.firstname"));
        assertTrue(props.containsKey("ldap.search.attr.lastname"));
    }

    /**
     * Test case to check if the properties file contains the expected values.
     */
    @Test
    void testGetPropsContainsValues() {
        Properties props = Login.getProps();
        assertEquals("ldap://localhost:389", props.getProperty("ldap.url"));
        assertEquals("dc=browsersoft,dc=com", props.getProperty("ldap.base"));
        assertEquals("cn=admin,dc=browsersoft,dc=com", props.getProperty("ldap.user"));
        assertEquals("password", props.getProperty("ldap.password"));
        assertEquals("(uid={0})", props.getProperty("ldap.search.filter"));
        assertEquals("sub", props.getProperty("ldap.search.scope"));
        assertEquals("uid,mail,sn,givenName", props.getProperty("ldap.search.attr"));
        assertEquals("mail", props.getProperty("ldap.search.attr.email"));
        assertEquals("givenName", props.getProperty("ldap.search.attr.firstname"));
        assertEquals("sn", props.getProperty("ldap.search.attr.lastname"));
    }

    /**
     * Test case to check if the properties file is loaded successfully with a non-existent file name.
     */
    @Test
    void testGetPropsWithNonExistentFileName() {
        Properties props = Login.getProps("nonexistent");
        assertNull(props);
    }

    /**
     * Test case to check if the properties file is loaded successfully with a null file name.
     */
    @Test
    void testGetPropsWithNullFileName() {
        Properties props = Login.getProps(null);
        assertNull(props);
    }

    /**
     * Test case to check if the properties file is loaded successfully with an empty file name.
     */
    @Test
    void testGetPropsWithEmptyFileName() {
        Properties props = Login.getProps("");
        assertNull(props);
    }

    /**
     * Test case to check if the properties file is loaded successfully with a whitespace file name.
     */
    @Test
    void testGetPropsWithWhitespaceFileName() {
        Properties props = Login.getProps(" ");
        assertNull(props);
    }

    /**
     * Test case to check if the properties file is loaded successfully with a file name containing special characters.
     */
    @Test
    void testGetPropsWithSpecialCharactersFileName() {
        Properties props = Login.getProps("!@#$%^&*()_+-={}|[]\\:\";'<>?,./`~");
        assertNull(props);
    }
}