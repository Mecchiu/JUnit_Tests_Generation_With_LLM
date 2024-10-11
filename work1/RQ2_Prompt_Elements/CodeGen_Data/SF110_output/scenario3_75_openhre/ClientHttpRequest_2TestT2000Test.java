// ClientHttpRequest_2Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(Object[])} method.
*/
class ClientHttpRequest_2Test {

	private static final Random rd = new Random();

	/**
	* Test of post method, of class com.browsersoft.servlet.util.ClientHttpRequest.
	*/
	@Test
	public void testPost() throws Exception {
		
		// System.out.println("=============================================");
		// System.out.println("Server POST for a file");
		// System.out.println("=============================================");
		
		try {
			Map<String, String> postParameters = new HashMap<String, String>();
			postParameters.put("filepath", new File(TestFile).getAbsolutePath());

			String[] uploadParts = {"thefile", "/file/a/b/c"};

			FileInputStream fis = new FileInputStream(TestFile);// for reading the file
			URLConnection connection = new URL("http://browsersoft.com/servlet/upload/")
		 		.openConnection();
			// for reading the connection object
			connection.connect();
			// add http server header to the connection object
            connection.setRequestProperty("Accept", "application/text");
			// add the form parameters in the request
			Iterator<Map.Entry<String, String>> i = postParameters.entrySet().iterator();
			while (i.hasNext()) {
				Map.Entry<String, String> e = i.next();
				if ( e.getKey().toLowerCase().equals("name"))
					postParameters.put(e.getKey().toLowerCase(), e.getValue().toLowerCase());
				else {
					inputStream = new URL(new URL("http://browsersoft.com")
											.openConnection()
											.setRequestProperty(e.getKey(), e.getValue()))
									.openInputStream();
					connection.setRequestProperty(e.getKey().toLowerCase(), 
												e.getValue().toLowerCase());
					byte data[] = new byte[1000];
					inputStream.read(data);
					fis.write(data);
				}
			}
			connection.connect();
			URLConnection c = new URL("http://browsersoft.com/servlet/"+File.separator
									+"upload"+File.separator
									+"/"+uploadParts[0]
									+File.separator
									+uploadParts[1]
									+File.separator
									+uploadParts[2]
									+File.separator
									+uploadParts[3]
									).openConnection();
			String result = inputStream.toString();
			InputStream is = new FileInputStream(TestFile);

			// this should open the file in the right position, read from the newline character in
			String lineBuffer = new String( result.getBytes() );
			assertEquals(lineBuffer, result);
			// if the connection is HTTP status 200, and we received the result we got
			if (c.getResponseCode() == 201 && c.getResponseMessage().toLowerCase().contains("ok")) {
				i = postParameters.entrySet().iterator();
				while ( c.getResponseCode() == 201 && i.hasNext() ) {
					Map.Entry<String, String> e = i.next();
					System.out.println("Name: "+e.getKey().toString().toLowerCase());
					String response = new String(
							c.getHeaderField("content-disposition").getBytes(),
							Charset.forName("UTF-8")
					);
					assertTrue(response.length() >0);
					System.out.println("Type: "+response.toLowerCase().contains("content"));
					String[] temp = response.split(":");
					assertEquals(String.valueOf(temp[1].charAt(0)), c.getHeaderField("content-type"));

					Byte content = c.getHeaderField("content-type").getBytes();
                    assertEquals(content.length, 200);
					byte contentBytes[]=new byte[content.length];
					System.arraycopy(content.getBytes(), content.length,contentBytes,0,contentBytes.length);
					c.getInputStream().write(contentBytes);
					c.getInputStream().close();
					// check if the contents matches
					assertTrue(c.getHeaderField("content-disposition").contains("file"));
					//System.out.println("Content: "+new String(response.getBytes()));
					System.out.println("URL: "+c.getURL());
				}
				c.setConnectTimeout(1000*60);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}