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
         * @javap This class belongs to the {@link HeaderSettings}.
         *               It should be tested with all header related tests.
         *               Please note that this class is static since there is
         *               only one header settings instance.
         */
        @Test
        public void testSetHeaders() {
                assertTrue(setHeaders()!= null);
        }
}