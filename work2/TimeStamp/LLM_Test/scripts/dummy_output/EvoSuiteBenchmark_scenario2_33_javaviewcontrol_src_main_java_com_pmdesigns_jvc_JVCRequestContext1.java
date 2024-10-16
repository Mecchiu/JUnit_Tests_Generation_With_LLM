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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContextTest {
		
	/**
	* Test case for {@link JVCRequestContext#getParamMap(String)} method.
	* It tests the case when the parameter name is null.
	*/
	@Test
	void testGetParamMap_NullName() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("bar1", "baz1");
		m.put("bar2", "baz2");
		
}
}