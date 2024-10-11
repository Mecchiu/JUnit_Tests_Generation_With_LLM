// JVCRequestContext_9Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		
	@jvc.jvcs
    private Map<String,String> flash = new HashMap<>(1);
	
	@jvc.jvcs
    private List<File> files;
	
	@jvc.jvcs
    private List<String> paths;
	
	@jvc.jvcs
    private boolean valid;
	
	@jvc.jvcs
    private boolean ctorLoggedIn;
	
	/**
	 * Initialise some components for the request
	 * 
	 * @param ctorLoggedIn
	 * Indicates that this test's user logged in or not,
	 */
	@jvc.jvcs
    void init() {
	    
    	files = new ArrayDeque<>(4);
    	files.addFirst("index");
    	files.addFirst("index/file.txt");
    	files.addFirst("index/file2.txt");
    	files.addFirst("index/file.gz");
    	
    	paths = new ArrayList<>(3);
		paths.add("/home/jdoe/test.jav");
		paths.add("/home/jdoe/javafiles");
		paths.add("/home/jdoe/file.txt");
		
    }
    
    /**
     * Test method for {@link JVCRequestContext#getFlash(String)}.
     */
    @jvc.jvcs(valid=true,ctorLoggedIn=true)
    void testGetFlash() {
		
    	getFlash("flash1");
    	assertTrue("flash1 should be present", flash.get("flash1")!=null);
    	assertTrue("flash2 should be present", flash.get("flash2")!=null);
    	
    }
    
    /**
     * Test method for {@link JVCRequestContext#getFlash(String)}.
     */
    @jvc.jvcs(valid=true,ctorLoggedIn=false)
    void testGetFlash_missing_ctorLoggedIn() {
    	getFlash("flash1");
    	assertNull("missing ctor-logged-in class should return null",flash.get("flash1"));
    }

	/**
	 * Test method for {@link JVCRequestContext#getFlash(String)}.
	 * 
	 * @throws java.io.IOException
	 */
	@Test
	@org.junit.jupiter.api.parallel()
	public void TestGetFlash_ctorloggedIn() throws IOException {
		init();
		jvc.context = this;
		
		jvc.jvcs.getFlash(paths.get(0));		
	}	

	/**
	 * Test method for {@link JVCRequestContext#getFlash(String)}.
	 * 
	 * @throws java.io.IOException
	 */
	@Test
	@org.junit.jupiter.api.parallel()
	public void TestGetFlash_badpath() throws IOException {
		init();
		jvc.context = this;
		
		jvc.jvcs.getFlash("badpath");
	}
	
	/**
	 * Test method for {@link JVCRequestContext#getFlash(String)}.
	 * 
	 * @throws java.io.IOException
	 */
	@Test
	@org.junit.jupiter.api.parallel()
	public void TestGetFlash_wrongpath() {
		init();
		jvc.jvcs.getFlash("notalfile");
	}

	/**
	 * Test method for {@link JVCRequestContext#hasFlash(String)}.
	 */
	@Test
	@org.junit.jupiter.api.parallel().onlyIf(valid=true)
	public void testHasFlash() {
		jvc.init();
		jvc.context = this;
		
		assertTrue("file1 should exist",exists("file1"));
		assertEquals("file2 should exist",exists("file2"),!exists("file2"));
		assertTrue("file3 should exist",exists("file3"));
		assertNotNull("flash with no value should be present", flash.get("flash"));
		assertEquals("incorrect value of flash",flash.get("flash"), 1.0, 0.001);
		
		getFlash("flash2");
		flash = jvc.getFlash("flash2");
		assertTrue("flash2 should be present",flash.get("flash2")!=null);
		assertTrue("flash3 should be present",flash.get("flash3")!=null);
		assertEquals("wrong value of flash",flash.get("flash"),2.0, 0.001);
		
		getFlash("flash1");
		flash = jvc.getFlash("flash1");
		assertEquals("wrong flash id (i.e flash2)",flash.get("flash2"),flash.get("flash1"));
		assertEquals("incorrect value of flash", flash.get("flash2"), 2.0, 0.001);
		
		init();
		jvc.init();
		boolean success = getFlash("flash2");
		assertFalse("flash3 should not exist", success);
		

		getFlash("flash1");
		init();
		success = jvc.getFlash("flash1");		
		assertTrue("incorrect value of flash", success);
		
	}
	
	@Override
    public String toString() {
        return "JVCRequestContext [init()=" + init() + ", ctorLoggedIn=" + ctorLoggedIn + ", files==" + files + ", paths==" + paths + ", valid=" + valid + ", flash=" + flash + " ]";
    }

}