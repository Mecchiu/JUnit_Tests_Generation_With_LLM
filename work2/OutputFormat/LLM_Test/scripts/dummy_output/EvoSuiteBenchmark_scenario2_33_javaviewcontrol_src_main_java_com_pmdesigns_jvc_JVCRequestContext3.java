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
* It contains ten unit test cases for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is null.
	*/
	@Test
	public void testGetAttribute_Null() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(null));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is empty.
	*/
	@Test
	public void testGetAttribute_Empty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute(""));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not empty.
	*/
	@Test
	public void testGetAttribute_NotEmpty() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
	
	/**
	* Test case for {@link JVCRequestContext#getAttribute(String)} method.
	* It tests the case when the attribute is not null.
	*/
	@Test
	public void testGetAttribute_NotNull() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext();
		assertNull(jvcRequestContext.getAttribute("test"));
	}
}