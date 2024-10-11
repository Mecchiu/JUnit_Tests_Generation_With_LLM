// ClientPropertiesTest.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientPropertiesTest {

	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "server".
	 */
	@Test
	void testGetPropertyServer() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "localhost";
		String actual = clientProperties.getProperty("server");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "port".
	 */
	@Test
	void testGetPropertyPort() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "8080";
		String actual = clientProperties.getProperty("port");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "user".
	 */
	@Test
	void testGetPropertyUser() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "user";
		String actual = clientProperties.getProperty("user");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "password".
	 */
	@Test
	void testGetPropertyPassword() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "password";
		String actual = clientProperties.getProperty("password");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "database".
	 */
	@Test
	void testGetPropertyDatabase() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "database";
		String actual = clientProperties.getProperty("database");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "table".
	 */
	@Test
	void testGetPropertyTable() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "table";
		String actual = clientProperties.getProperty("table");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "column".
	 */
	@Test
	void testGetPropertyColumn() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "column";
		String actual = clientProperties.getProperty("column");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "file".
	 */
	@Test
	void testGetPropertyFile() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "file";
		String actual = clientProperties.getProperty("file");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "fileError".
	 */
	@Test
	void testGetPropertyFileError() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "false";
		String actual = clientProperties.getProperty("fileError");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "fileError".
	 */
	@Test
	void testGetPropertyFileError2() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "";
		String actual = clientProperties.getProperty("fileError");
		assertEquals(expected, actual);
	}
}

// ClientProperties.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;

/**
 * reads and writes properties to xml-file
 * properties file is saved to user directory
 *
 * @author christian
 */
public class ClientProperties {

    /**
     * get property value by element-name returns empty string if fileError is
     * true
     *
     * @param element -
     *            Name of element
     * @return String - value
     */
    public String getProperty(String element) {
        if (element.equals("fileError")) {
            if (fileError) {
                return "";
            }
        }
        return XmlFunctions.getElementValue(element, xmlFile);
    }
}

// ClientPropertiesTest.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientPropertiesTest {
		
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "server".
	 */
	@Test
	void testGetPropertyServer() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "localhost";
		String actual = clientProperties.getProperty("server");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "port".
	 */
	@Test
	void testGetPropertyPort() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "8080";
		String actual = clientProperties.getProperty("port");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "user".
	 */
	@Test
	void testGetPropertyUser() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "user";
		String actual = clientProperties.getProperty("user");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "password".
	 */
	@Test
	void testGetPropertyPassword() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "password";
		String actual = clientProperties.getProperty("password");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "database".
	 */
	@Test
	void testGetPropertyDatabase() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "database";
		String actual = clientProperties.getProperty("database");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "table".
	 */
	@Test
	void testGetPropertyTable() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "table";
		String actual = clientProperties.getProperty("table");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "column".
	 */
	@Test
	void testGetPropertyColumn() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "column";
		String actual = clientProperties.getProperty("column");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "file".
	 */
	@Test
	void testGetPropertyFile() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "file";
		String actual = clientProperties.getProperty("file");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "fileError".
	 */
	@Test
	void testGetPropertyFileError() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "false";
		String actual = clientProperties.getProperty("fileError");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "fileError".
	 */
	@Test
	void testGetPropertyFileError2() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "";
		String actual = clientProperties.getProperty("fileError");
		assertEquals(expected, actual);
	}
}

// ClientProperties.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;

/**
 * reads and writes properties to xml-file
 * properties file is saved to user directory
 *
 * @author christian
 */
public class ClientProperties {

    /**
     * get property value by element-name returns empty string if fileError is
     * true
     *
     * @param element -
     *            Name of element
     * @return String - value
     */
    public String getProperty(String element) {
        if (element.equals("fileError")) {
            if (fileError) {
                return "";
            }
        }
        return XmlFunctions.getElementValue(element, xmlFile);
    }
}

// ClientPropertiesTest.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientPropertiesTest {
		
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "server".
	 */
	@Test
	void testGetPropertyServer() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "localhost";
		String actual = clientProperties.getProperty("server");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "port".
	 */
	@Test
	void testGetPropertyPort() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "8080";
		String actual = clientProperties.getProperty("port");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "user".
	 */
	@Test
	void testGetPropertyUser() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "user";
		String actual = clientProperties.getProperty("user");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "password".
	 */
	@Test
	void testGetPropertyPassword() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "password";
		String actual = clientProperties.getProperty("password");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "database".
	 */
	@Test
	void testGetPropertyDatabase() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "database";
		String actual = clientProperties.getProperty("database");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "table".
	 */
	@Test
	void testGetPropertyTable() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "table";
		String actual = clientProperties.getProperty("table");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "column".
	 */
	@Test
	void testGetPropertyColumn() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "column";
		String actual = clientProperties.getProperty("column");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "file".
	 */
	@Test
	void testGetPropertyFile() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "file";
		String actual = clientProperties.getProperty("file");
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link ClientProperties#getProperty(String)} method.
	 * It tests if the method returns the correct value for the element "fileError".
	 */
	@Test
	void testGetPropertyFileError