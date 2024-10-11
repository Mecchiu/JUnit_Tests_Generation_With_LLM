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
	void testOpenStream() throws IOException {
		URLContent urlContent = new URLContent(new URL("http://www.eteks.com/"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntry() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test.jar!/test.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURL() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntry() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntry() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntry() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntry() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndDecodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndDecodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndEncodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndEncodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndDecodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndDecodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndEncodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndEncodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndDecodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndEncodedEntryAndDecodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndEncodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndEncodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndDecodedURLBaseAndEncodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithDecodedURLAndDecodedEntryAndDecodedURLBaseAndDecodedEntryName() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndEncodedEntryNameAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndEncodedEntryNameAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test%20with%20spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndDecodedEntryNameAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndEncodedEntryAndEncodedURLBaseAndDecodedEntryNameAndDecodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test with spaces.jar!/test with spaces.txt"));
		InputStream stream = urlContent.openStream();
		assertNotNull(stream);
		stream.close();
	}
	
	@Test
	void testOpenStreamWithJAREntryWithEncodedURLAndDecodedEntryAndEncodedURLBaseAndEncodedEntryNameAndEncodedURLBase() throws IOException {
		URLContent urlContent = new URLContent(new URL("jar:http://www.eteks.com/test%20with%20spaces