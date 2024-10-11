// JVCRequestContextTest.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getFlash(String)} method.
	* It tests the case when the key is null.
	*/
	@Test
	void testGetFlash_NullKey() {
		JVCRequestContext context = new JVCRequestContext();
		assertNull(context.getFlash(null));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getFlash(String)} method.
	* It tests the case when the key is empty.
	*/
	@Test
	void testGetFlash_EmptyKey() {
		JVCRequestContext context = new JVCRequestContext();
		assertNull(context.getFlash(""));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getFlash(String)} method.
	* It tests the case when the key is not in the flash.
	*/
	@Test
	void testGetFlash_KeyNotInFlash() {
		JVCRequestContext context = new JVCRequestContext();
		assertNull(context.getFlash("key"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getFlash(String)} method.
	* It tests the case when the key is in the flash.
	*/
	@Test
	void testGetFlash_KeyInFlash() {
		JVCRequestContext context = new JVCRequestContext();
		context.flash.put("key", "value");
		assertEquals("value", context.getFlash("key"));
	}
}