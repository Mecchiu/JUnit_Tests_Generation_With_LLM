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
		//
		// TEST CODE
		//
    @Test
    public void testGetAttribute() throws Exception {
        final String attribute = "attribute" + Math.random() * 1000;
        final String value = "value" + Math.random() * 1000;
        request.setAttribute(attribute, value);
        final HttpServletRequest requestCopy = request.getRequest();
        assertNotNull(getAttribute(attribute));
        assertTrue(attribute.equals(getAttribute(attribute)));
        assertNotNull(requestCopy.getAttribute(attribute));
        if (request instanceof HttpServletRequest) {
            assertNotSame(requestCopy, requestCopy);
        }
        assertEquals(requestCopy.getAttribute(attribute), value);
    }

	@Test
	public void testGetAttributeAsCharArray() throws Exception {
		assertTrue(getAttribute("character-encoding") == null);
		final String encodingValue = "application-x-rtf-encoding";
		final String textValue = "test";
		request.setCharacterEncoding(encodingValue);
		final CharArrayBuffer buffer = new CharArrayBuffer();
		CharStreams.write("<text><![CDATA[" + textValue + "]]></text>",
                buffer);
		request.setCharacterEncoding(null);
		final String test = buffer.toString();
		assertTrue(getAttribute("character-encoding")!= null);
		assertNotSame(getAttribute(encodingValue),
                getAttribute(test));
		request.setCharacterEncoding(encodingValue);
		final CharArrayBuffer buffer2 = new CharArrayBuffer();
		CharStreams.write("<test><![CDATA[" + textValue + "]]></test>", buffer
                );
		assertSame(request.getCharacterEncoding(), request.getCharacterEncoding());
		assertEquals(buffer2.toString(), buffer.toString());
		request.setCharacterEncoding(null);
	}

	@Test
	public void testGetCharacterEncoding() throws Exception {
		String encoding ="application-x-rtf-encoding";
		request.setCharacterEncoding(encoding);
		assertEquals(encoding,
                request.getCharacterEncoding());
	}

	@Test
	public void testGetContentType() throws Exception {
		assertNotNull(request.getContentType());
		assertSame(request.getContentType(),
                request.getRequest().getContentType());
	}

	@Test
	public void testGetContentLength() throws Exception {
		assertEquals(
                request.getContentLength(),
                request.getRequest().getContentLength());
	}
	@Test
	public void testGetContentUploadedStream() throws Exception {
		request.setContentType("text/plain");
		request.setContentLength(1L);
		final HttpServletRequest copy =
                        new HttpServletRequestWrapper(request) {
                            public InputStream getInputStream() throws IOException {
                                return Thread.currentThread().getContextClassLoader()
                                       .getResourceAsStream("testdata1");
                            }
                            public String getHeader(String name) {
                                throw new UnsupportedOperationException();
                            }
                            public Enumeration<String> getHeaderNames() {
                                throw new UnsupportedOperationException();
                            }
                        };
		assertEquals(request.getContentLength(), copy.getContentLength());
		assertEquals(getContentType(),
                        request.getContentType());
		
		assertNotSame(request.getInputStream(),
                request.getRequest().getInputStream());
		
        final InputStream buffer = copy.getInputStream();
        assertNotNull(buffer);
        assertTrue(buffer.available()!= 0);
        final byte[] data = new byte[buffer.available()];
        buffer.read(data);
        copy.setContentLength(2L);
        assertNotSame(buffer, request.getRequest().getInputStream());
        assertEquals("testdata1", new String(data));
        request.setContentType("test/1");
		buffer.close();
		assertEquals("test/1",
                        request.getContentType());
		final HttpURLConnection connection = new HttpURLConnection(
                        new URL("test"));
		assertNull(request.getContentLength());
		assertTrue(((HttpURLConnection) connection).isCommitted());
    }


}