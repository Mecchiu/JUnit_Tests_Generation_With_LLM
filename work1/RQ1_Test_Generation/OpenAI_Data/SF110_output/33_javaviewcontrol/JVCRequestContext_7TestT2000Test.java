// JVCRequestContext_7Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {

	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String options = "options";
		String result = jvcRequestContext.makeLink(anchor, path, options);
		assertEquals("<a href='path' options>anchor</a>", result);
	}
}

// JVCRequestContext_8Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_8Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<a href='path' >anchor</a>", result);
	}
}

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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_9Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<a href='path' >anchor</a>", result);
	}
}

// JVCRequestContext_Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<a href='path' >anchor</a>", result);
	}
}

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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_1Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<a href='path' >anchor</a>", result);
	}
}

// JVCRequestContext_2Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_2Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<a href='path' >anchor</a>", result);
	}
}

// JVCRequestContext_3Test.java
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
* It contains ten unit test cases for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_3Test {
		
	@Test
	void testMakeLink() {
		JVCRequestContext jvcRequestContext = new JVCRequestContext(null, null, null, null, null, null);
		String anchor = "anchor";
		String path = "path";
		String result = jvcRequestContext.makeLink(anchor, path);
		assertEquals("<