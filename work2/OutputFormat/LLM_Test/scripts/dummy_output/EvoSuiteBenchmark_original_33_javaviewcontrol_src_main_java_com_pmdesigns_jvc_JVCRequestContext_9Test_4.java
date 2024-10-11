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
* It contains one unit test case for the {@link JVCRequestContext#getFlash(String)} method.
*/
class JVCRequestContext_9Test {
		private final String url = "C:\\Users\\mike\\Dropbox\\Projects\\PMMDesigns\\PMM\\Projects\\Data\\TestData\\webcontent\\test_js_f.html";
		private final String field1 = "jvc_field1_value";
		private final String field2 = "jvc_field2-value";

	/**
	 * Test method for
	* {@link org.apache.commons.fileupload.servlet.ServletFileUpload#encodeInputStream(InputStream)}
	*/
	@Test
    public void testEncodeInputStream() throws Exception {
		ServletFileUpload uploader = new ServletFileUpload();
			ServletFileUpload uploader1 = new ServletFileUpload();
        	ServletFileUpload uploader2 = new ServletFileUpload();

		InputStream is = getClass().getResourceAsStream(url);
        uploader.setFileSizeMax(20L * 1024L * 1024L);
        uploader.setFileSizeThreshold(1L * 1024L * 1024L);
        uploader1.setFileSizeMax(2L * 1024L * 1024L);
        uploadzoonz.setMaxInputStreamSize(2L * 1024L * 1024L);
        uploader2.setFileSizeMax(4L * 1024L * 1024L);
        uploader3.setFileSizeMax(5L * 1024L * 1024L);

        FileUploadField ff1 = (FileUploadField)uploader.parseField(is);
        FileUploadField ff2 = (FileUploadField)uploader1.parseField(is);
        FileUploadField ff3 = (FileUploadField)uploader2.parseField(is);

		assertEquals("testUpload 1 failed",ff1.getFileName(),file1.getFileName());
		assertEquals("testUpload 1 failed",ff1.getFileName(),ff2.getFileName());
        assertEquals("testUpload 1 failed",ff1.getFileName(),ff3.getFileName());

		assertEquals("testUpload 2 failed",ff3.getFileName(),field1);

	}
}