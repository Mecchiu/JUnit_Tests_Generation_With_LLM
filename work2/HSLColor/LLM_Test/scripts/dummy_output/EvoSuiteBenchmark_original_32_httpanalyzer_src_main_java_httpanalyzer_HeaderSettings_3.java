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
		// test get, set
			@Test
                @org.junit.jupiter.api.Test
                        protected void testGetSet() {
//                        new Test().testGetSet();
                        getHeaders().clear();
						getHeaders().addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)");
                        setHeaders();
//			
//						assertGetParams();
				}

//
//	     protected void assertGetParams() {
//					
//			assertEquals(userAgents.length, getHeaders().size());
//
//		}
			/**
             * {@inheritDoc}
             */
			@Override
				public void testGetSetHeaders() {
//					new Test().testGetSetHeaders();
				}
}