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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContextTest {

	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor is null.
	*/
	@Test
	void testMakeLink_anchorIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = null;
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>path</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor is empty.
	*/
	@Test
	void testMakeLink_anchorIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "";
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>path</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor is not empty.
	*/
	@Test
	void testMakeLink_anchorIsNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the path is null.
	*/
	@Test
	void testMakeLink_pathIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = null;
		String options = "options";
		String expected = "<a href=\"\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the path is empty.
	*/
	@Test
	void testMakeLink_pathIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "";
		String options = "options";
		String expected = "<a href=\"\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the path is not empty.
	*/
	@Test
	void testMakeLink_pathIsNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the options is null.
	*/
	@Test
	void testMakeLink_optionsIsNull() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = null;
		String expected = "<a href=\"path\">anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the options is empty.
	*/
	@Test
	void testMakeLink_optionsIsEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = "";
		String expected = "<a href=\"path\">anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the options is not empty.
	*/
	@Test
	void testMakeLink_optionsIsNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor, path and options are null.
	*/
	@Test
	void testMakeLink_anchorPathOptionsAreNull() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = null;
		String path = null;
		String options = null;
		String expected = "<a href=\"\"></a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor, path and options are empty.
	*/
	@Test
	void testMakeLink_anchorPathOptionsAreEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "";
		String path = "";
		String options = "";
		String expected = "<a href=\"\"></a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the anchor, path and options are not empty.
	*/
	@Test
	void testMakeLink_anchorPathOptionsAreNotEmpty() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "path";
		String options = "options";
		String expected = "<a href=\"path\" options>anchor</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
}

// JVCRequestContext.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.