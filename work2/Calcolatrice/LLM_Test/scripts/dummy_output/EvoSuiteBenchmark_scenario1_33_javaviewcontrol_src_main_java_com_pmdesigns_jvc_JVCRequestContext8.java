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
	* Test case for {@link JVCRequestContext#makeLink(String, String, String)} method.
	* It tests the case when the path starts with a slash.
	*/
	@Test
	void testMakeLinkWithPathStartingWithSlash() {
		JVCRequestContext context = new JVCRequestContext();
		String anchor = "anchor";
		String path = "/path";
		String options = "options";
		String expected = "<a href='" + path + "' " + options + ">" + anchor + "</a>";
		String actual = context.makeLink(anchor, path, options);
		assertEquals(expected, actual);
	}
}