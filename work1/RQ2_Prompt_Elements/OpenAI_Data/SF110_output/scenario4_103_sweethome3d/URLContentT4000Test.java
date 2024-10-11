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
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntry() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	public void testOpenStreamWithJAREntryWithEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURLAndEncodedJAREntryAndEncodedURL() throws MalformedURLException, IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/sweethome3d.jar!/com/eteks/sweethome3d/model/Home%20%26%20Furniture.class"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
}