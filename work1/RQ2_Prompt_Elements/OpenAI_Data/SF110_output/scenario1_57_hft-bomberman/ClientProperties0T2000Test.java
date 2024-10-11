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
		* It tests if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty() {
				ClientProperties clientProperties = new ClientProperties();
				String element = "server";
				String expected = "localhost";
				String actual = clientProperties.getProperty(element);
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
		* It tests if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty() {
				ClientProperties clientProperties = new ClientProperties();
				String element = "server";
				String expected = "localhost";
				String actual = clientProperties.getProperty(element);
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
		* It tests if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty() {
				ClientProperties clientProperties = new ClientProperties();
				String element = "server";
				String expected = "localhost";
				String actual = clientProperties.getProperty(element);
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
		* It tests if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty() {
				ClientProperties clientProperties = new ClientProperties();
				String element = "server";
				String expected = "localhost";
				String actual = clientProperties.getProperty(element);
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
		* It tests if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty() {
				ClientPro