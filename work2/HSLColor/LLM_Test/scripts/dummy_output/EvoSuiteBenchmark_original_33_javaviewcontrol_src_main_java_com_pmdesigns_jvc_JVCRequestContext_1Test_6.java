// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {
		
	private static final String HTML_STRING_XML = new String(new byte[] {
            (byte) 0x0A, (byte) 0x0A, (byte) 0x0A, (byte) 0x0A,
            (byte) 0x09, (byte) 0x65, (byte) 0x6E, (byte) 0x73,
            (byte) 0x74, (byte) 0x69, (byte) 0x63, (byte) 0x61,
            (byte) 0x63, (byte) 0x75, (byte) 0x72, (byte) 0x72, (byte) 0x61,
            (byte) 0x67, (byte) 0x65, (byte) 0x74, (byte) 0x0A }
            );
	
	/**
	 */
	public JVCRequestContext_1Test() {
	}
	
	@Test 
	public void testGetParamMap() {		
		Map<String,String> result = JVCRequestContext.getParamMap("foo");
		assertEquals("foo", result.get("name"));	
	}
	
	@Test 
	public void testGetParamNames() {			
    	List<String> res = JVCRequestContext.getParamNames();
    	assertEquals(2, res.size());
    	assertEquals("html", res.get(0));
    	assertEquals("x-request", res.get(1));
	}
	
	@Test 
	public void testGetParamValues() {			
		Map<String,String> result = JVCRequestContext.getParamValues();
		assertEquals("", result.get("key"));
    	assertEquals("value", result.get("value"));
    }
	
    @Test 
    public void testConvert() throws IOException, ParserConfigurationException, SAXException {
        ServletInputStream sis = new ServletInputStream(new java.io.ByteArrayInputStream(("<html></html>".getBytes())));
        ServletFileUpload uploader = new ServletFileUpload(new HttpPutRequestBuilderFactory());

        HashMap map = JVCRequestContext.convert(sis, uploader);
        assertEquals(HTML_STRING_XML, new String(Streams.toByteArray(map)));
    
    }
    
}