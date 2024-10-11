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
		
    @Test
    public void HeaderSettingsTest(){
       HeaderSettings.initialize(new HttpRequestBase());
       HeaderSettings.setHeaders();
       assertEquals(getHeaders(), setHeaders());
    }

    @Test
    public void setCookie(){
        HeaderSettings.initialize(new HttpRequestBase());
		setCookie("setCookie");
		assertEquals(getHeaders(), setHeaders());
    }
}