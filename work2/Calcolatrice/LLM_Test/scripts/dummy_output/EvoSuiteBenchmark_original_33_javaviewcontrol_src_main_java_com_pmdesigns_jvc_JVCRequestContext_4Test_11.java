// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		
    /**
     * Test method for {@link JVCRequestContext#getSessionAttr(String)}.
     * Create a {@link Link} from attribute name and value, with a relative path in href, as given.
     * @param testName test name
     */
    @Test
    public void testGetAttributeInHref_relative()throws IOException, ServletException {
      Link link = new Link("test", "test");
      String testHref = "/test";
      String testName = "test";
      String testValue = "test";

      // test attribute name and value
      Object sessionAttr = JVCRequestContext.getSessionAttr("Test attribute");
      if(sessionAttr!= null) {
        assertEquals(testValue, sessionAttr.toString());
      }
      // test relative path
      Object sessionAttr2 = JVCRequestContext.getSessionAttr("Test relative");
      if(sessionAttr2!= null) {
        assertEquals(new Integer(Integer.valueOf(testValue)).intValue(), sessionAttr2.toString().intValue());
      }
      // test relative path with null value
      Object sessionAttrNoValue = JVCRequestContext.getSessionAttr("Test relative with null");
      assertNull(sessionAttrNoValue);

		
		
      // test attribute name
      //test "test" in href, no relative path
      link.getHref().add(testHref);
      Object sessionAttrWithRel = JVCRequestContext.getSessionAttr("Test attribute with value");
      if (sessionAttrWithRel!= null) {
        assertEquals(testValue, sessionAttrWithRel.toString());
        // link has been set
        link.setRel(testHref);
      }
      // test value
      sessionAttr = JVCRequestContext.getSessionAttr("Test attribute");
      if(sessionAttr!= null) {
        assertEquals(testValue, sessionAttr.toString());
      }
      // test with null value
      link.setRel(null);
      sessionAttr = JVCRequestContext.getSessionAttr("Test attribute with value");
      assertNull(sessionAttr);
      
      // test value without a "/"
      link.setRel(null);
      link.getHref().add("");
      sessionAttr = JVCRequestContext.getSessionAttr("Test attribute");
      assertNull(sessionAttr);
    }
}