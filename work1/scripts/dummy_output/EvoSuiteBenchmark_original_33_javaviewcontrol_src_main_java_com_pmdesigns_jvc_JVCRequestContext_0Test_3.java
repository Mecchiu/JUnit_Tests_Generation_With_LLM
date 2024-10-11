// JVCRequestContext_0Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParam(String)} method.
*/
class JVCRequestContext_0Test {
		
    //--------------------------------------------------------------------------
    //
    // Instance variables
    //
    //--------------------------------------------------------------------------


    private JVCRequestContext context = new JVCRequestContext();

    //--------------------------------------------------------------------------
    //
    // Constructors
    //
    //--------------------------------------------------------------------------

    static {
        System.setProperty("java.security.auth.login.config", "file:etc/client/login/jvc/login.conf");
    }
    
    public static void main(String[] args) throws Exception {
		JVCRequestContext.main(new javax.servlet.ServletConfig());
    }

    //--------------------------------------------------------------------------
    //
    // Public methods
    //
    //--------------------------------------------------------------------------

    /**
     *
     */
    public void test01() throws Exception {

        System.out.println("Test01");
        
        // Create input stream to get the form fields
        InputStream fis = new ByteArrayInputStream(new byte[] { 0x00, 0x00, 0x00, 0x01, 0x0a, 0x00 } );

        // Check that getParam returns the correct parameters
        String expect = "test_0";
        String got = context.getParam(expect);
        System.out.println("Got\nexp=" + expect);
        System.out.println("Got\ngot=" + got);

        assertEquals(expect, got);

        String key = "n_0";
        String value = "n_0_v";

        // Check the flash maps
        HashMap<String, String> flash = context.getParams(key);
        assertNotNull(flash);
        assertEquals(expect, flash.get(key));
        assertEquals(value, flash.get(key + "_v"));

        // Check that a parameter has been successfully set/updated in the flash
        assertNotNull(fis);
        fis = new ByteArrayInputStream(new byte[] { 0x00, 0x00, 0x00, 0x01, 0x0a, 0x00 } );
        context.setParam(expect, fis);
        String got2 = context.getParam(expect);
        assertEquals(expect, got2);

        // Check that a parameter in the flash has been deleted
        assertFalse(fis.available());

        // Check that the flash contains the correct key and updated
        // value, and the flash has been deleted and a new value has been added
        Vector <String> keys = new Vector<>();
        Vector <String> values = new Vector<>();
        String key2 = "n_1";
        fis = new ByteArrayInputStream(new byte[] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x01 } );
        keys.add(key2);
        values.add(value);
        context.setParams(keys, values);
        String got3 = context.getParam(expect);
        assertEquals(expect, got3);

        // Check that a newly created parameter contains the correct key and updated
        // value, the flash has changed and the value has been added correctly
        HashMap<String, String> newflash = context.getParams(got3);
        for (int i = 0; i < keys.size() - 1; i++) {
            assertEquals(key, keys.get(i));
            assertEquals(value, newflash.get(keys.get(i)));
            keys.remove(i);
        }
        assertEquals(keys.size(), 0);
        assertEquals(values.size(), 0);
    }
    
    public void test_02_addParameter() throws Exception {
    	
    	String file = "this_is_a_file_we_want_to_store_to_the_web";
    	String parameter1 = "the_param_name1";
    	String param2 = "the_param_value2";
    	String parameter3 = "a new parameter name3 with valus";
    	
    	
    	System.out.println("TEST1");
         // Add parameter
         context.addParam(parameter1, file);
    	
    	//Check that the Flash contains the correct key and updated
        // value, and the flash has been created and added correctly
        context.addParamsIfNotExists(parameter1, Collections.singletonList(param2));
    	System.out.println( "param_flashes");
    	System.out.println( context.getParams(parameter1));
    	
    	System.out.println( "param_flashes2");
    	context.addParamsIfNotExists(parameter1, Collections.singletonList(param3));
    	
      	System.out.println( "param_flashes3");
      	context.addParamsIfNotExists(parameter3, Collections.singletonList(param2));

    	
    	assertEquals(3, context.getParams(parameter1).size());
    	assertEquals(1, context.getParams(param2).size());
    	assertEquals(3, context.getParams(param3).size()); //this would fail, but the add will not 
    											//work until we pass this check
    	
    }
    
    public void test_03_getParam() throws Exception {
    	
    	String file = "this_is_a_file_we_want_to_store_to_the_web";
    	String parameter1 = "the_param_name1";
    	String param2 = "the_param_value2";
    	String parameter3 = "a new parameter name3 with valus";
    	
    	context.addParam(parameter1, file);
    	System.out.println( "TEST1");
    	System.out.println( context.getParam(parameter1, file));
    	
    	//Check that the Flash contains the correct key and updated
        System.out.println( "context.getParam(parameter1, file)");
}
}