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
* It contains ten unit test cases for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is not null.
	*/
	@Test
	public void testGetCookie_NotNull() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name");
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		Cookie result = context.getCookie("name");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null2() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null3() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null4() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null5() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null6() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null7() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null8() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null9() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getCookie(String)} method.
	* It tests the case when the cookie is null.
	*/
	@Test
	public void testGetCookie_Null10() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		Cookie cookie = new Cookie("name", "value");
		context.setCookie(cookie);
		
		// Act
		Cookie result = context.getCookie("name2");
		
		// Assert
		assertNull(result);
	}
}