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
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {

	@Test
	public void testOpenStream() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("http://www.eteks.com/"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces%20and%20encoded%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces%20and%20encoded%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURLAndEncodedEntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.jar!/test%20with%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces%20and%20encoded%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
}

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
* It contains ten unit test cases for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
		
	@Test
	public void testOpenStream() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("http://www.eteks.com/"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.open