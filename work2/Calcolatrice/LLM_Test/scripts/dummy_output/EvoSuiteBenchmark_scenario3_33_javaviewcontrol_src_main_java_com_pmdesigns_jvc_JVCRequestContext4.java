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
* It contains ten unit test cases for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* It tests the case when the name is null and expects a NullPointerException.
	*/
	@Test
	void testGetSessionAttr_NullName() {
		JVCRequestContext context = new JVCRequestContext();
		assertThrows(NullPointerException.class, () -> {
			context.getSessionAttr(null);
		});
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* It tests the case when the name is empty and expects a IllegalArgumentException.
	*/
	@Test
	void testGetSessionAttr_EmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		assertThrows(IllegalArgumentException.class, () -> {
			context.getSessionAttr("");
		});
	}
	
	/**
	* Test case for {@link JVCRequestContext#getSessionAttr(String)} method.
	* It tests the case when the name is not null and not empty and expects a NullPointerException.
	*/
	@Test
	void testGetSessionAttr_NotNullAndNotEmptyName() {
		JVCRequestContext context = new JVCRequestContext();
		assertThrows(NullPointerException.class, () -> {
			context.getSessionAttr("name");
		});
	}
}