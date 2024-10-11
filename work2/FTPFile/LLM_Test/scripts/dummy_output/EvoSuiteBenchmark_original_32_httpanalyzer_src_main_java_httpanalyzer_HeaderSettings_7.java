// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains one unit test case for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
		/**
         * Test for {@link HeaderSettings#setHeaders()} method.
         */
        @Test
        public void testSetHeaders() {
                HeaderSettings instance = new HeaderSettings();
                    assertEquals("setHeaders()", HeaderSettings.SET, instance.setHeaders());
        }

        /**
         * Test for {@link HeaderSettings#add()}.
         */
        @Test
        public void testAdd() {
                HeaderSettings instance = new HeaderSettings();
                    assertEquals("add()", HeaderSettings.ADD, instance.add());
        }

}