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

    private URLContentTest() {
    }
		
	// Test case for the <code>openStream()</code> method.
	@Test
	public void testopenStream_1() throws MalformedURLException, IOException{
		URLContent content = new URLContent(new URL("http://www.eteks.ca/xmldoc/Content.java"));
		InputStream in = content.openStream();
		String contentString = new String (getBytes(in));

		assertNotNull(content);
		assertNotNull(content.url);
		assertNotNull(content.isJAREntry());
		assertEquals(getJAREntry(), content.url);
		assertArrayEquals(getJAREntryName(), new String(getJAREntryContent(content)));
		assertArrayEquals(content.getURL(), getJAREntryContent(content).getURL());
		assertArrayEquals(content.getURL(), content.getJAREntryURL().toExternalForm());
		assertArrayEquals(content.getURL(), getURL(content));
		assertObjectDoesNotEquals(new URL(content.getURL()));
		assertArrayEquals(content.getURL().toExternalForm(), getURL(content));
	}

	// Test case for <code>isJAREntry()</code> method.
	@Test
	public void testisJAREntry_1() throws MalformedURLException, IOException {
		URLContent content = new URLContent(new URL("http://www.eteks.ca/xmldoc/Content.java"));
		assertTrue(content.isJAREntry());
	}

    // Test case for the <code>getURL()</code> method.
    @Test
	public void testgetURL_1() throws MalformedURLException, IOException {
		URLContent content = new URLContent(new URL("http://www.eteks.ca/xmldoc/Content.java"));
		String contentString = new String (getBytes(content.openStream()));
		content.getURL();

		assertEquals(new URL("http://www.eteks.ca"), content.getURL());
		assertEquals(content, content.getURL());
		assertArrayEquals(content, new String(getBytes(content)));
		assertEquals(contentString, new String(getBytes("http://www.eteks.ca")));
	}

	// Test case for the <code>getURLFrom()</code> method.
	@Test
	public void testgetURLFrom_1() throws MalformedURLException {
		URLContent content = new URLContent(new URL("http://www.eteks.ca/"));
		assertEquals(content.getURL(), content.getURLFrom(new URL(content)));
	}

	// Test case for the <code>getURLFrom()</code> method.
	@Test
	public void testgetURLFrom_2() throws MalformedURLException {
		URLContent content = new URLContent(new URL("http://www.eteks.ca/xmldoc/Content.java"));
		assertEquals(content.getURL(), content.getURLFrom(new URL("http://www.eteks.ca/xmldoc/")));
	}

	@After
	public void cleanup() throws IOException {
		deleteFile("test.txt");
	}
	
}
