// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains one unit test case for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	public
	void testClass() {
		// Empty string or byte[]
		assertNull(new URLContent(null).openStream());
		assertNull(new URLContent(null, "").openStream());
		assertNull(new URLContent(null, "".toCharArray()).openStream());
		
		URL myURL = new URL("https://api.github.com/");
		assertNotNull(myURL.openStream());
		try {
			myURL = new URL("https://api.github.com/j");
			// MalformedURLException - malformed URL
			// Cannot understand that url can contain characters that are not allowed in an RFC-850 compliant URL
			assertAllUrlErrors("MalformedURL %s", myURL.toExternalForm());
		}
		catch(MalformedURLException e) {
			// OK, this was expected, so the URL is ok
		}
	}
	
	private void assertAllUrlErrors(String what, String expected, URL url) throws MalformedURLException {
		/*
			Try to get the stream with the correct URL
		*/
		URL parsedURL;
		try {
			parsedURL = new URL(url.toString());
		} catch(NumberFormatException e) {
			// This won't happen anyway
			
			// Return null if the URL passed doesn't contain a URL.
			return;
		}
		
		try {
			// Get the stream with the correct URL
			InputStream stream = parsedURL.openStream();
			int nread = stream.read();
			String result = new String(new byte[]{(byte) nread});
			assertNull(result);
			
			try {
				// Get the stream with the other URL
				stream = parsedURL.openStream();
				nread = stream.read();
				result = new String(new byte[]{(byte) nread});
				
			} catch(IOException e) {
				// This can't happen
				
			}
		} catch(IOException e) {
			// This can't happen
			e.printStackTrace();
		}
		
		try {
			// Get the stream with an URL with different scheme
			try {
				parsedURL = new URL(url.toURI().toString());
			}
			catch(MalformedURLException e) {
				// Never happens
				
			}
		}
		catch(MalformedURLException e) {
			assertNull(what);
			e.printStackTrace();
		}
		
		assertEquals("Unepected result '"+expected+"'/'", expected, result);
	}
}