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

	/**
	 * Test to check the readStream for null.
	 */
	@Test
	void testNull() {
		try {
			Content.openStream(null);
			fail("No exception (null) should be generated.");
		} catch (IllegalArgumentException e) {
			
		}
		
		try {
			Content.openStream("   ");
			fail("No exception (null) should be generated.");
		} catch (IllegalArgumentException e) {
			
		}
		
		try {
			Content.openStream("");
			fail("No exception (null) should be generated.");
		} catch (java.lang.NullPointerException e) {
			
		}
	}
	
	/**
	 * Test to read an InputStream into a string.
	 */
	@Test
	void testReadStream() throws MalformedURLException, IOException {
		try {
			Content.openStream("https://f.google.com");
			assertEquals("https://f.google.com", Content.readStream(
					new InputStream() {
						@Override
						public int read() throws IOException {
							return 0;
						}
					}).toString());
		} catch (RuntimeException e)
		{
			assertEquals(e.getMessage(), "The URL string is not correctly decoded.");
		}
	}
	
	/**
	 * Test to check the readStream to see if it is still a URL.
	 */
	@Test
	void testReadStreamURL() throws MalformedURLException, IOException {
		try {
			Content.openStream("https://www.google.com");
			assertEquals("https://www.google.com", Content.readStream(
					new InputStream() {}).toString());
		} catch (RuntimeException e)
		{
			assertEquals(e.getMessage(), "The URL string is not correctly decoded.");
		}
	}

	/**
	 * Test to check if the content starts with it's own path.
	 */
	@Test
	void testReadWithStartsWith() throws IOException {
		try {
			String content = "https://www.google.com/";
			InputStream f = Content.openStream(content.substring(0));
			f.close();
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "The URL string is not correctly decoded.");
		}
	}
	
	/**
	 * Test to check the path is the directory name.
	 */
	@Test
	void testReadDirectory() throws IOException {
		try {
			String content = "/";
			InputStream f = Content.openStream(content.substring(0));
			f.close();
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "The URL string is not correctly decoded.");
		}
	}
	
	/**
	 * Test to get the string representation of a content URL.
	 */
	@Test
	void testReadURL() throws IOException {
		String content = "https://f.google.com";
		String contentStr = Content.readURL(new URL(content));
		assertEquals(
				"https://f.google.com",
				contentStr
				);
	}

	/**
	 * Test to get an InputStream from another content URL.
	 */
	@Test
	void testReadURLFromOtherContent() throws IOException {
		String content = "https://google.com:5000/";
		String contentStr = Content.readURL(new URL(content));
		assertEquals(
				"https://google.com:5000/",
				contentStr
				);
	}
	
}
