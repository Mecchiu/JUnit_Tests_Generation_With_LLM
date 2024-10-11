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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {
		
    @Test
	public void testMakingLink() throws Exception {
		JVCRequestContext context = new JVCRequestContext();
		assertEquals('a', context.getHttpServletRequest().getCharacterEncoding());
		assertEquals('b', context.getHttpServletResponse().getCharacterEncoding());
		context.absPath(null, "..");
		pathCheck( "../../", context );
		context.absPath(null, "a/b");
		pathCheck( "a/b", context );
		context.absPath(null, "/b");
		pathCheck( "/b", context );
		context.absPath("/b", "/c");
		pathCheck( "/c", context );
		context.absPath("/c", "../..");
		pathCheck( "../..", context );
	}
	
	public void pathCheck(String path, JVCRequestContext context) throws Exception {
		context.linkCheck(null, path);
		context.linkCheck("#", path);
		context.linkCheck("#/", path);
		context.linkCheck("%2F", path);
		context.linkCheck("%", path);
		context.linkCheck("%../", path);
	}
	
	public void linkCheck(String link1, String link2) throws Exception {

	}

	public void testGettingAJAXRequest() throws Exception {
		JVCRequestContext context = new JVCRequestContext();

}
}