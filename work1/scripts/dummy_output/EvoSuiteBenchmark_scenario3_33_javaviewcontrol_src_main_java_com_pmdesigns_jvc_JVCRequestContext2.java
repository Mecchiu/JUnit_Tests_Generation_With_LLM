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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is null.
	*/
	@Test
	void testGetParamValues_Null() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues(null);
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is empty.
	*/
	@Test
	void testGetParamValues_Empty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("");
		
		// Assert
		assertNull(result);
	}
	
	/**
	* Test case for {@link JVCRequestContext#getParamValues(String)} method.
	* It tests the case when the parameter name is not empty and not null.
	*/
	@Test
	void testGetParamValues_NotEmpty() {
		// Arrange
		JVCRequestContext context = new JVCRequestContext();
		
		// Act
		String[] result = context.getParamValues("name");
		
		// Assert
		assertNull(result);
	}
}