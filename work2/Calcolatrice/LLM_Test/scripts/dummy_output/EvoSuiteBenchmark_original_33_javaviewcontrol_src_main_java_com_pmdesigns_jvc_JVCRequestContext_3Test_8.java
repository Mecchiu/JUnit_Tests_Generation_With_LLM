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
		
	
    @Test
    void testGetAttribute() {
        HttpServletRequest httpRequest = (HttpServletRequest)JVCRequestContext.this.getRequest();
		
		assertEquals(HttpServletResponse.SC_OK, httpRequest.getResponseCode());
        Map tempAttribute = new HashMap();
        tempAttribute.put(HttpServletRequest.REQUEST_METHOD, "POST");
        Object tempAttributeObj = tempAttribute;
        JVCRequestContext jvcRequestContext = new JVCRequestContext(tempAttributeObj, false, httpRequest);

		assertEquals("This should be JVCRequestContext", jvcRequestContext, new JVCRequestContext("This should be JVCRequestContext", true, httpRequest));
    }

    @Test
    void testGetAttributeWithNonStandardPrefixes( ) {
        HttpServletRequest httpRequest = (HttpServletRequest)JVCRequestContext.this.getRequest();
		
        assertEquals(HttpServletResponse.SC_OK, httpRequest.getResponseCode());
        Map tempAttribute = new HashMap();
        tempAttribute.put(HttpServletRequest.REQUEST_METHOD, "POST");
        Object tempAttributeObj = tempAttribute;
        
        Map nonStandardPrefixes = new HashMap(5);
        nonStandardPrefixes.put("./", "/");
        nonStandardPrefixes.put(".../", "/");
        nonStandardPrefixes.put("./../", "/");
        nonStandardPrefixes.put("./../../", "/");
        
        JVCRequestContext jvcRequestContext = new JVCRequestContext(tempAttributeObj, false, httpRequest);
        
        jvcRequestContext = jvcRequestContext.getJVCRequestContext(tempAttribute);
        
        assertEquals("This should be JVCRequestContext", jvcRequestContext, new JVCRequestContext(tempAttribute.get("./"), false, httpRequest));
    }

    @Test
    void testPostAttribute( ) {
        HttpServletRequest httpRequest = (HttpServletRequest)JVCRequestContext.this.getRequest();
		
		assertEquals(HttpServletResponse.SC_OK, httpRequest.getResponseCode());
        Map tempAttribute = new HashMap();
        tempAttribute.put(HttpServletRequest.REQUEST_METHOD, "POST");
        Object tempAttributeObj = tempAttribute;
        JVCRequestContext jvcRequestContext = new JVCRequestContext(tempAttributeObj, false, httpRequest);
		
        Map attribute = new HashMap();
        attribute.put("./", "This should be the following");
        attribute.put(".../", "This should be the following");
        attribute.put("./../", "This should be the following");
        attribute.put("./../../", "This should be the following");
        jvcRequestContext = jvcRequestContext.getJVCRequestContext(attribute);
        assertEquals("This should be the following", jvcRequestContext);
    }

    @Test
    void testPostAttributeWithNonStandardPrefixes( ) {
        HttpServletRequest httpRequest = (HttpServletRequest)JVCRequestContext.this.getRequest();
		
        assertEquals(HttpServletResponse.SC_OK, httpRequest.getResponseCode());
        Map tempAttribute = new HashMap();
        tempAttribute.put(HttpServletRequest.REQUEST_METHOD, "POST");
        Object tempAttributeObj = tempAttribute;
        JVCRequestContext jvcRequestContext = new JVCRequestContext(tempAttributeObj, false, httpRequest);
        Map attribute = new HashMap();
        attribute.put("./", "This should be the following");
        attribute.put("./../", "This should be the following");
        attribute.put("./../../", "This should be the following");
        attribute.put("./../../", "This should be the following");
        attribute.put("./../../../", "This should be the following");
        jvcRequestContext = jvcRequestContext.getJVCRequestContext(attribute);

		assertEquals(attribute, jvcRequestContext);
    }

    
}