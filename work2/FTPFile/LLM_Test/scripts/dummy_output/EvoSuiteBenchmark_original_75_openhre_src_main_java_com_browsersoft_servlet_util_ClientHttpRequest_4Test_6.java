// ClientHttpRequest_4Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(String[], Object[])} method.
*/
class ClientHttpRequest_4Test {
		private final static int THREADS_AMT = 10;

  @Test(expected = NullPointerException.class)
	public void notExistingClasses() throws Exception {
		new ClientHttpRequest();
	}

  @Test
	public void testPostFile_1() throws Exception {
		String path = "src/test/java/com/browsersoft/servelt.test/file/client.txt";
		final TestFile testfile = new TestFile();
		ClientHttpRequest r = new ClientHttpRequest(path, testfile);
		r.getResponse();
		Exception exception = null;
		try {
			r.post(new String[]{testfile.getName()}, null);
		} catch (IOException e) {
			exception = e;
		}
		assertNotNull(exception);
	}

  @Test
	public void testPostFile_2() throws Exception {
		String path = "src/test/java/com/browsersoft/servelt.test/file/client.txt";
		TestFile testfile = new TestFile("");
		ClientHttpRequest r = new ClientHttpRequest(path, testfile);
		r.getResponse();
		Exception exception = null;
		try {
			r.post(new String[]{testfile.getName()}, null);
		} catch (IOException e) {
			exception = e;
		}
		assertNotNull(exception);
	}


  @Test
	public void testPostFile_3() throws Exception {
		String path = "src/test/java/com/browsersoft/servelt.test/file/client.txt";
		final File file = new File("src/test/java/com/browsersoft/servelt.test/file/client.txt");
		ClientHttpRequest r = new ClientHttpRequest(path);
		r.getResponse();
		Exception exception = null;
		try {
			r.post(new String[]{file.getName()}, null);
		} catch (IOException e) {
			exception = e;
		}
		assertNotNull(exception);
	}

  @Test
	public void testPostFile_4() throws Exception {
		String path = "src/test/java/com/browsersoft/servelt.test/file/client.txt";
		final Map headers = new HashMap();
		final Iterator i = new Random(new Random()).nextInt(30) + 10;
		headers.put(HTTP.NAME, "test");
		headers.put(HTTP.CONNECTION, "close");
		headers.put(HTTP.CONTENT_TYPE, "application/x-www-form-urlencoded");
		ClientHttpRequest r = new ClientHttpRequest(path, "", "-X", "GET", headers);
		r.getResponse();
		Exception exception = null;
		try {
			r.post(new String[]{file.getName()}, null);
		} catch (IOException e) {
			exception = e;
		}
		assertNotNull(exception);
	}
}