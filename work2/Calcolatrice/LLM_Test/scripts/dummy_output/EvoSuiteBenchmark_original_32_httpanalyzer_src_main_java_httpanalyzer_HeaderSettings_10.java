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
	void setHeaders() {
		// Arrange
		Header[] userAgentIn = null;
		String refererIn = null;
		Header[] userAgentOut = null;
		String refererOut = null;
		Header[] cookiesIn = null;
		String cookiesOut = null;
		
		// Act
		try {
			userAgentIn = new Header[8];
			userAgentIn[7] = new BasicHeader("Custom");
			userAgentIn[6] = new BasicHeader("User-Agent ");
			userAgentIn[5] = new BasicHeader("Content-Type");
			userAgentIn[4] = new BasicHeader("Referer");

			userAgentOut = new Header[8];
			userAgentOut[7] = new BasicHeader("SomeHeader" + 
					getDefaultCamelCase(userAgentIn[6].getValue()));
			userAgentOut[6] = new BasicHeader("User-Agent ");
			userAgentOut[5] = new BasicHeader("Content-Type");
			userAgentOut[4] = new BasicHeader("Referer");

			cookiesIn = new Header[12];
			cookiesIn[11] = new BasicHeader("Custom");
			cookiesIn[10] = new BasicHeader("User-Agent");
			cookiesIn[9] = new BasicHeader("Content-Type");
			cookiesIn[8] = new BasicHeader("Referer");

			cookiesOut = new Header[8];
			
			// Act
			Header[] headers = setHeaders();
			
			// Assert
			assertEquals(8, headers.length);
			assertTrue(userAgentIn[7] == userAgentOut[7]);
			assertFalse(userAgentIn[6].getElementsByName("SomeHeader").hasNext());			
			assertTrue(userAgentIn[5] == userAgentOut[5]);
			assertEquals("OtherUserAgent" + ":Custom".length(), cookiesIn[11].getLength());
			assertTrue(cookiesIn[10] == cookiesOut[10]);	
			assertFalse(cookiesIn[9].hasElements());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static String getDefaultCamelCase(String value) {
		String text = "";
		int i = 0;
		while(i < value.length()) {
			if(value.charAt(i) =='') {
				i++;
				continue;
			}
			char ri = value.charAt(i);
			if(Character.isUpperCase(ri)) {
				text = text + ri;
				i++;
			}
		}
		return text;
	}




}