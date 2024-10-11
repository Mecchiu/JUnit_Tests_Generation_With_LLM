// JVCRequestContext_3Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {
		/**
		* Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getAttribute(String)}.
		*
		* @throws Exception
		*/
	@Test
	public void testGetAttribute() throws Exception {
		// getAttribute
		assertEquals("",JVCRequestContext.getAttribute(""));
		assertEquals("",JVCRequestContext.getAttribute("fileupload"));
		assertEquals("",JVCRequestContext.getAttribute("temp"));
		assertEquals("",JVCRequestContext.getAttribute("redirect"));

		// getAttribute
        JVCRequestContext.put("myfield", "value");
		assertEquals("value",JVCRequestContext.getAttribute("myfield"));

		// getAttribute
		assertEquals(null,JVCRequestContext.getAttribute("myField"));
		assertEquals(null,JVCRequestContext.getAttribute("myFieldFile"));
		assertEquals(null,JVCRequestContext.getAttribute("tempparam"));
		assertNull(JVCRequestContext.getAttribute("otherfield"));

        JVCRequestContext.put("myfield", "value1");
		assertEquals("value1",JVCRequestContext.getAttribute("myfield"));
        assertNull(JVCRequestContext.getAttribute("myfieldFile"));
        assertNull(JVCRequestContext.getAttribute("tempparam"));

        JVCRequestContext.put("anotherparam", "anothervalue");
		assertEquals(null,JVCRequestContext.getAttribute("someothervalue"));
        assertEquals("anothervalue",JVCRequestContext.getAttribute("someothervalueFile"));

	}

	/**
	* Test method for {@link java.util.stream.Streams#readLines(java.io.Reader)}.
	*
	* @throws IOException
	* @throws UnsupportedEncodingException
	*/
	@Test
	public void testStreamReadLines() throws IOException, UnsupportedEncodingException {
		try (DataInputStream sess = new DataInputStream(new FileInputStream("src/test/resources/sess.bin"))) {
			// getStreamReadLines
			String sessString = sess.readLine();
			assertEquals("\n",sessString);
			assertNull(sessString);
			InputStream sessInputStream = sess;
			Reader sessReader = new InputStreamReader(sessInputStream, "UTF-8");
			assertEquals("",sessReader.readLine());
			assertEquals("",sessReader.readLine());
			sessInputStream.close();
			Reader fOut = new BufferedReader(new InputStreamReader(new FileInputStream("src/test/resources/fstr.bin"))) {
					@Override
                    public void close() throws IOException {
                        super.close();
                        String lineNum;
                        while ((lineNum = readLine())!= null) {
                            System.out.println(lineNum);
                        }
                        assertEquals("\n",lineNum);
                    }
			};
			DataOutputStream fOutOut = new DataOutputStream(new FileOutputStream("tmp/test1.bin"));
			ServletFileUpload.readBackslashSlash(fOutOut, 1024);
			fOutOut.flush();
			fOutOut.close();
		}
	}

}