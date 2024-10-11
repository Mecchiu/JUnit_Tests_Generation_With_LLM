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

    // Constant used for the name of the session attribute to retrieve
    private static final String NAME = "name";
    
    // The set of attribute names to retrieve
    private static final String[] ATTRIBUTE_NAMES = {"username", "password",
            "code", "language", "region", "country"};

    /**
     * Get a session attribute object at the indicated name
     * @param name the desired attribute name
     *
     * @return the value for the indicated attribute name, if found.  Returns null
     *
     * @throws JVCLibraryException indicates a problem retrieving the attribute name from
     * the request.
     */
    String getSessionAttr(String name){
      
        assert(!JVCRequestContext.getSessionAttrNames().isEmpty());
       
        int i = name.indexOf(".");
        String attribute = null;
        if(i > 0) {
            attribute = name.substring(i + 1);
        } else {
            attribute = name;
        }

        Object jvcAttribute = null;
        for(int ii = 0; ii < getSessionAttrNames().length; ii++){
            if(attribute.equalsIgnoreCase(getSessionAttrNames()[ii])){
                jvcAttribute = getSessionAttr(getSessionAttrNames()[ii]);  
                break;
            }
        }
      
        return jvcAttribute;
    }
    
    @Test
    public void testGetSessionAttr(){
        
        Map<String, String> flash = new HashMap<>();
        
        JVCRequestContext context = new JVCRequestContext(new MockServletRequest(), 
            new MockServletResponse());
        String name = "" + getSessionAttr(NAME);
        assertEquals(name, context.getSessionAttr(NAME));

        
    }    
    
    @Test
    public void testResetSession(){
        
        Map<String, String> flash = new HashMap<>();
        
        JVCRequestContext context = new JVCRequestContext(new MockServletRequest(), 
            new MockServletResponse());
        String name = "" + getSessionAttr(NAME);
        assertEquals(name, context.getSessionAttr(NAME));
        
        JVCRequestContext context2 = new JVCRequestContext(new MockRequest(), 
            new MockHttpServletResponse());
        assertEquals(name, context2.getSessionAttr(NAME));
        Object jvcAttribute = context2.getSessionAttr(NAME);
        assertEquals(true, jvcAttribute instanceof Map);
        setSessionAttr(NAME, "oldattribute");
        assertEquals("oldattribute", context2.getSessionAttr(NAME));
        
        
    }
    
    @Test
    public void testResetSessionInString() throws Exception {
        String name = "" + getSessionAttr(NAME);
        assertEquals(name, new StringTokenizer(name, ".")[0]);
        getSessionAttr(NAME);
        
    }
  
    @Test
    public void testGetSessionAttrNames() throws Exception {
        String[] names = getSessionAttrNames();
        assertEquals(names, JVCRequestContext.getSessionAttrNames());
    }
    
    /**
     * Create a new session attribute mapping, setting the value of the existing
     * property as the key and the specified value as the value.
     * @param name the desired attribute name, not null
     * @param value the desired property value
     * @return the key/value pair of the new session attribute, or null
     */
    protected Map<String,String> newSessionAttr(String name, String value) {
        
        Map<String,String> rtn = new HashMap<>();
        rtn.put(name, value);

        return rtn;
    }
    
}