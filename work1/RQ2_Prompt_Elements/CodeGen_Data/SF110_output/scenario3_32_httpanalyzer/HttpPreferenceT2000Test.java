// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

    /**
     * Tests constructor of {@link HttpPreference} class with one argument.
     */
    @Test
    public void testConstructor() {
            HttpPreference httpPreference = new HttpPreference(null);
            assertNotNull("null name is expected", httpPreference.getName());
            
            Properties properties = new Properties();
            try {
                httpPreference.loadPreference(null, properties);
                fail("unable to convert null properties to proper object.");
            } catch (Exception exception) {
                assertEquals("property name 'name' is missing in properties", "name", exception.getMessage());
            }
        }
        
    /**
     * Tests value of property {@code user} of {@link HttpPreference} class and check that value correctly returns it
     * correctly.
     */
    @Test
    public void testGetProperty() {
            HttpPreference httpPreference = new HttpPreference(null, "user", "testUser");
            assertEquals("user property is wrong", "testUser", httpPreference.getProperty("user"));
    }
    
	/**
     * Tests empty string.
     */
    @Test
    public void testConstructorEmptyString() {
            HttpPreference httpPreference = new HttpPreference("", "property");
            assertNotNull("property name is not defined", httpPreference.getName());
    }

    /**
     * Tests toString() when name is not found.
     */
    @Test
    public void testGetNameWithNoProperty() {
        HttpPreference httpPreference = new HttpPreference("name", "property");
        assertNotNull(httpPreference.getName());
    }


	/**
     * Tests toString() when no property is found.
     */
    @Test
    public void testGetPropertyWithNoProperty() {
        HttpPreference httpPreference = new HttpPreference("user", "property");
        assertNotNull(httpPreference.getProperty("user"));
    }
}