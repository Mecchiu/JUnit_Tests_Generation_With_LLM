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
	* It tests if the method returns the correct value for the element "language".
	*/
	@Test
	void testGetPropertyLanguage() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "en";
		String actual = clientProperties.getProperty("language");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "country".
	*/
	@Test
	void testGetPropertyCountry() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "US";
		String actual = clientProperties.getProperty("country");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "lookAndFeel".
	*/
	@Test
	void testGetPropertyLookAndFeel() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		String actual = clientProperties.getProperty("lookAndFeel");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "logLevel".
	*/
	@Test
	void testGetPropertyLogLevel() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "INFO";
		String actual = clientProperties.getProperty("logLevel");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "logFile".
	*/
	@Test
	void testGetPropertyLogFile() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "log.txt";
		String actual = clientProperties.getProperty("logFile");
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
        if (!fileError) {
            String XmlPath = "//" + element;
            return xmlFunctions.getXmlValue(XmlPath);
        } else {
            return new String("");
        }
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
	* It tests if the method returns the correct value for the element "language".
	*/
	@Test
	void testGetPropertyLanguage() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "en";
		String actual = clientProperties.getProperty("language");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "country".
	*/
	@Test
	void testGetPropertyCountry() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "US";
		String actual = clientProperties.getProperty("country");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "lookAndFeel".
	*/
	@Test
	void testGetPropertyLookAndFeel() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		String actual = clientProperties.getProperty("lookAndFeel");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "logLevel".
	*/
	@Test
	void testGetPropertyLogLevel() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "INFO";
		String actual = clientProperties.getProperty("logLevel");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "logFile".
	*/
	@Test
	void testGetPropertyLogFile() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "log.txt";
		String actual = clientProperties.getProperty("logFile");
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
        if (!fileError) {
            String XmlPath = "//" + element;
            return xmlFunctions.getXmlValue(XmlPath);
        } else {
            return new String("");
        }
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
	* It tests if the method returns the correct value for the element "language".
	*/
	@Test
	void testGetPropertyLanguage() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "en";
		String actual = clientProperties.getProperty("language");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "country".
	*/
	@Test
	void testGetPropertyCountry() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "US";
		String actual = clientProperties.getProperty("country");
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link ClientProperties#getProperty(String)} method.
	* It tests if the method returns the correct value for the element "lookAndFeel".
	*/
	@Test
	void testGetPropertyLookAndFeel() {
		ClientProperties clientProperties = new ClientProperties();
		String expected = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		String actual = clientProperties.getProperty("look