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
* It contains one unit test case for the {@link JVCRequestContext#getAttribute(String)} method.
*/
class JVCRequestContext_3Test {

    @Test
	void test_noParameters(){
		assertEquals(new Object[0], new String[]{});
	}

    @Test
	void test_oneParameter_returns_file(){
		HttpURLConnection conn = (HttpURLConnection) request.openConnection(request.getScheme());
		String file = "test.txt";
		conn.addHeader("Content-Length", "6");
		File fileHandle = new File("test/" + file);
		ServletFileUpload sfu = new ServletFileUpload();
		FileItemFactory factory = new DiskFileItemFactory();
		ServletContext ctx = this.getClass().getClassLoader().getParent();
		try {
            sfu.parseRequest(conn, factory, new FileReader(fileHandle));
			FileItem item = sfu.getItem(0);
            assertEquals(file, item.getName());
		} catch (FileUploadException fe) {
			fail("Unexpected exception type " + fe.getClass().getName());
		}
		try {
			conn.getInputStream();
			assertFalse(true);
		} catch (FileNotFoundException fnf) {
			fail("Unexpected exception type "+fnf.getClass().getName());
		}
	}

    @Test
	void test_oneParameter_returns_file_returns_error()
	{
		HttpURLConnection conn = (HttpURLConnection) request.openConnection(request.getScheme());
		String file = "test.txt";
		conn.addHeader("Content-Length", "6");
		File fileHandle = new File("test/" + file);
		ServletFileUpload sfu = new ServletFileUpload();
		FileItemFactory factory = new DiskFileItemFactory();
		ServletContext ctx = this.getClass().getClassLoader().getParent();
		try {
            sfu.parseRequest(conn, factory, new FileReader(fileHandle));
			fail("No exception occurred");
		} catch (FileUploadException fe) {
			assertFalse(true);
		}
	}

    @Test
	void test_oneParameter_returns_file_returns_error2()
	{
		HttpURLConnection conn = (HttpURLConnection) request.openConnection(request.getScheme());
		String file = "test.txt";
		conn.addHeader("Content-Length", "6");
		File fileHandle = new File("test/" + file);
		ServletFileUpload sfu = new ServletFileUpload();
		FileItemFactory factory = new DiskFileItemFactory();
		ServletContext ctx = this.getClass().getClassLoader().getParent();
		try {
            sfu.parseRequest(conn, factory, new FileReader(fileHandle));
			fail("No exception occurred");
		} catch (FileUploadException fe) {
			fail("Expected exception");
		}
	}

    @Test
	void test_file_upload_response_is_file(){
        File file = new File("test/test.txt");
        BufferedImage a = null;
        ByteArrayOutputStream b = null;
        try {
            b = new ByteArrayOutputStream();
            a = new BufferedImage(600, 300, BufferedImage.TYPE_INT_ARGB);
            ServletUtils.fillImage(a, 600, 300, a.getRGB(0, 0));
            Streams.compress(a);
            a.flush();
            b.write(a.getImageData()[5]);
            ServletFileUpload upload = new ServletFileUpload();
            Map<String,Object> requestMap = new HashMap<String,Object>();
            requestMap.put("file", b.toString());
            ServletFileUpload sfu = new ServletFileUpload(requestMap);
            FileItem image = sfu.parseRequest(request);
            if(sfu.isExhausted()) {
                fail("File upload exception: "+sfu.getNumberOfFiles()+". Was expecting "+2);
            }
            // test case verifies that the request was sent with a specific file name.
            String temp = "testFileUpload_request_file_test.txt";
            request.setAttribute("file", temp);
            String data = null;
            data = sfu.getItem(0).getString();
            assertEquals(file.length()+". Was expecting "+(b.toString().length()+1) +", but was received  "+data.length(),"  Expecting "+file.length()+".  Was expecting "+(b.toString().length()+1)+", but was received "+data.length());
        } catch (Exception e) {
            fail(e.getMessage());
        }
	}
	
}