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
		
    /**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
     */
    @Test
    public void testParamMap() {
        System.out.println("ParamMap.getParamMap(test_param)");

        try {
            testParamMap();
        }catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
     */
    public void testParamMap() {
        System.out.println("ParamMap.getParamMap(test)");

        Map<String, String> paramMap = JVCRequestContext.getParamMap("test");
        assertNull(paramMap);
    }

    /**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} using the constructor.
     */
    public void testParamMapUsingConstructor() {
        System.out.println("ParamMap.getParamMap(test)");

        Map<String, String> paramMap = new java.util.HashMap<String, String>();
        JVCRequestContext.setParamMap(paramMap, "test");
        System.out.println("ParamMap using constructor:\n" + paramMap.toString());
        assertEquals(paramMap.toString(), "test");
    }

	/**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} using the constructor.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} with a parameter.
	 * 
	 * This method does not really work, but it takes a pretty simple approach to test it.
	 */
    public void testParamMapUsingConstructorT1(String name) {
        System.out.println("\ni=1, paramMap =  " +  JVCRequestContext_1Test.testParamMapUsingConstructor);

        Map<String, String> paramMap = new HashMap<String, String>();
        JVCRequestContext_1Test.setParamMap(paramMap, name); //use parameter named name
        System.out.println("ParamMap using constructor with name=\"" + name + "\":\n" + paramMap.toString());
        assertEquals(paramMap.toString(), "test");
    }

    /**
     * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
     */
	public void testParamMapUsingConstructorT2(Map<String,String> nameMap) {
	        System.out.println("\ni= 2, paramMap = " +  JVCRequestContext_2Test.testParamMapUsingConstructor);
	        JVCRequestContext_2Test.setParamMap(nameMap, "test");
	        System.out.println("ParamMap using constructor with parameters:\n" + nameMap.toString());
	        assertEquals(nameMap.toString(), "test");
	    }

	/**
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} using the constructor.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} with a parameter.
	 */
	public void testParamMapUsingConstructorT3(String name) {
	        System.out.println("\ni= 3, paramMap = " +  JVCRequestContext_3Test.testParamMapUsingConstructor);
	        JVCRequestContext_3Test.setParamMap(name, "test");
	        System.out.println("ParamMap using constructor with name=\"" + name + "\":\n" + paramMap.toString());
	        assertEquals(paramMap.toString(), "test");
	    }

	/**
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)}.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} using the constructor.
	 * Test method for {@link com.pmdesigns.jvc.JVCRequestContext#getParamMap(String)} with a parameter.
	 */
	public void testParamMapUsingConstructorT4(String name) {
		System.out.println("\ni= 4, paramMap = " +  JVCRequestContext_4Test.testParamMapUsingConstructor);
		JVCRequestContext_4Test.setParamMap(name, "");
		System.out.println("ParamMap using constructor with parameters empty:\n" + paramMap.toString());
		assertNull(paramMap);
	}

	private void testParamMap() throws ServletException {
		byte[] request = null;
		ServletFileUpload upload = new ServletFileUpload(new DiskInputStream(System.in));
		request = upload.getFile("test");
}
}