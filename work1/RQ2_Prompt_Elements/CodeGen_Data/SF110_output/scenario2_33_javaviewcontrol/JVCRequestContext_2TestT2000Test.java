// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {

    public final static String CONTENT_TYPE = "multipart/form-data";
    
    private final JVCRequestContext reqctx = new JVCRequestContext();
    private Map flash = new HashMap();

    @Test
    void test_getParamValues_one_Parameter() {
        reqctx.setParam(new String[] {"Parameter-1","Parameter-2"}, "1|2");
        assertArrayEquals(new String[] {"1","2"},
                reqctx.getParamValues(new String[] {"Parameter-1","Parameter-2"}));
    }
      
    @Test
    void test_getParamValues_multiple_Parameters() {
        reqctx.setParam(new String[] {"Parameter-1","Parameter-2"}, "1|2");
        reqctx.setParam(new String[] {"Parameter-3","Parameter-4"}, "3|4");
                
        assertArrayEquals(new String[] {"1","2"},
                reqctx.getParamValues(new String[] {"Parameter-1","Parameter-4"}));
   }  
      
    @Test
    void test_getParamMaps(){
        reqctx.setParam(new String[] {"Parameter-1","Parameter-2"}, "1|2");
        assertTrue(!flash.containsKey("param"));
        assertTrue(flash.containsKey(new Object()));
        
        flash.clear();
        assertTrue(!flash.containsKey("param"));
        assertTrue(flash.containsKey(new Object()));
    }
    
    @Test(expected = IllegalArgumentException.class)
    void test_reqctx_empty(){
        new JVCRequestContext().setParam(new String[0], "Param");
        new JVCRequestContext().getParamValues("");
    }
    
    @Test
    void test_reqctx_empty_null(){
        reqctx.setParam(null, "Param");
        reqctx.getParamValues("");
    }
      
    @Test
    void test_getParamMap_one_Parameter() {
        reqctx.setParam(new String[] {"Parameter-1", "Parameter-2"}, "1|2"); // This will succeed
        assertEquals(4, reqctx.getParamMap().size());  // 4 parameters
        assertEquals("1|2", reqctx.getParam().toString());
        assertFalse(reqctx.getParamMap().containsKey("Parameter-1"));
        assertFalse(reqctx.getParamMap().containsKey("Parameter-2"));
        assertTrue(reqctx.getParamMap().containsKey("Parameter-3"));
        assertEquals("3|4",reqctx.getParamMap().get("Parameter-3").toString());
        assertTrue(reqctx.getParamMap().containsKey("Parameter-4"));
        assertFalse(reqctx.getParamMap().containsKey("Parameter-5"));
        assertEquals("3|4",reqctx.getParamMap().get("Parameter-5").toString());
        assertTrue(reqctx.getParamMap().containsKey("Parameter-6"));
        assertEquals("2",reqctx.getParamMap().get("Parameter-6").toString());
    }
      
    @Test
    void test_getParamMap_multiple_Parameters(){
        reqctx.setParam(new String[] {"Parameter-1", "Parameter-2", "Parameter-3"}, "1|2|3"); // This will succeed
        assertTrue(reqctx.getParamMap().containsKey("Parameter-3"));
        assertEquals("1|2|3",reqctx.getParam().toString());
        assertFalse(reqctx.getParamMap().containsKey("Parameter-1"));
        assertFalse(reqctx.getParamMap().containsKey("Parameter-2"));
        assertTrue(reqctx.getParamMap().containsKey("Parameter-3"));

        assertTrue(reqctx.getParamMap().containsKey("Parameter-4"));
        assertEquals("3|4",reqctx.getParamMap().get("Parameter-4").toString());
        assertTrue(reqctx.getParamMap().containsKey("Parameter-5"));
        assertEquals("2",reqctx.getParamMap().get("Parameter-5").toString());
        assertTrue(reqctx.getParamMap().containsKey("Parameter-6"));
        assertEquals("1",reqctx.getParamMap().get("Parameter-6").toString());
    }
	
    @Test
    void test_getParams(){
        assertArrayEquals(new String[] {"Parameter-1", "Parameter-2", "Parameter-3"}, 
                new String[] {reqctx.getParam(0).toString(), reqctx.getParam(1).toString(), reqctx.getParam(2).toString()});
        
        reqctx.clearParams();
        reqctx.setParam(new String[] {"Parameter-1", "Parameter-3"}, "3|4");
        assertArrayEquals(new String[] {"1", "3", "4"}, 
                new String[] {reqctx.getParam(1).toString(), reqctx.getParam(2).toString(), reqctx.getParam(3).toString()});            
    }
      
    @Test
    void test_setFileParameter_one_parameter(){        
        reqctx.setFileParam("p1", "File contents");
        assertEquals("p1=File contents",
                reqctx.getFileParamToString("p1"));
        reqctx.setFileParam(null, "File contents");
        assertNull(reqctx.getFileParam("p1"));
    }
      
    @Test
    void test_setFileParameter_multiple_parameters(){        
        reqctx.setFileParam("p1", "File contents");
        reqctx.setFileParam(null, "File contents");
        assertNull(reqctx.getFileParam("p1"));
        assertNull(reqctx.getFileParam("p2"));        
    }
      
    @Test
    void test_getFileParameter() {
        reqctx.setFileParam("p1", "File content");
        assert