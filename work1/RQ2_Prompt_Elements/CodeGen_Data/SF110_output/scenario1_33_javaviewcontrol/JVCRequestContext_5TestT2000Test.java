// JVCRequestContext_5Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getCookie(String)} method.
*/
class JVCRequestContext_5Test {

   /**
   * Test method for
   * {@link java.util.map.Map#get(java.lang.String)}.
   */
  @Test
  public void testGetCookie2() {
    Cookie cookie1 = (Cookie)request.getCookies()[0];
    Cookie cookie2 = (Cookie)request.getCookies()[1];
    String value1 = cookie1.getValue();
    String value2 = cookie2.getValue();
    assertEquals(value1, "jvctest");
    assertEquals(value2, "jvctest");
  }
  
  /**
   * Test method for
   * {@link java.util.Map#get(java.lang.String)}.
   */
  @Test
  public void testGetCookie1() {
    Cookie[] array = request.getCookies();
    String value = ((Cookie)array[0]).getValue();
    String value2 = ((Cookie)array[1]).getValue();
    assertEquals(value, "jvctest");
    assertEquals(value2, "jvctest");
  }
 
  /**
   * Test method for
   * {@link java.util.Map#get(java.lang.String)}.
   */
  @Test
  public void testGetCookie() {
    String value = request.getCookies()[0].getValue();
    String value2 = request.getCookies()[1].getValue();
    assertEquals(value, "jvctest");
    assertEquals(value2, "jvctest");
  }

  /**
   * Test method for
   * {@link javax.servlet.http.HttpServletRequest#getPathInfo()}.
   */
  @Test
  public void testGetPathInfo() {
    assertEquals(request.getPathInfo(), "/");
  }

  /**
   * Test method for {@link javax.servlet.http.HttpServletRequest#getParameter(String)}.
   */
  @Test
  public void testGetParameter() {
    String[] array = request.getParameterValues("p1");
    assertEquals(array[0], "");
    assertEquals(array[1], "");
  }

  /**
   * Test method for {@link javax.servlet.http.HttpServletRequest#getParameterMap()}.
   */
  @Test
  public void testGetParameterMap() {
      Map<String, List<String>> map = request.getParameterMap();
      assertEquals(map.size(), 2);
      Entry<String, List<String>> entry0 = map.entrySet().iterator().next();
      assertEquals(entry0.getKey(), "p1");
      List<String> values = entriesToList(entry0.getValue());
      assertEquals(values.size(), 2);
      assertTrue(values.contains("value1"));
      assertTrue(values.contains("value2"));
  }

  @Test
  public void testGetInputStream() throws IOException {
    try (FileInputStream stream = new FileInputStream("src/test/files/testfile.txt")) {
      assertNotNull(stream);
      assertNotNull(request.getInputStream());
    }
  }
  
  @Test
  public void testGetInputStreamFile() throws IOException {
    try (FileInputStream stream = new FileInputStream("src/test/files/testfile.txt")) {
      assertNotNull(stream);
      assertNotNull(request.getInputStream(0));
    }
  }
  
  @Test
  public void testGetInputStreamContentDisposition() throws IOException {
    try (FileInputStream stream = new FileInputStream("src/test/files/testfile.txt")) {
      assertNotNull(stream);
      try {
        request.getContentDisposition("");
        assertEquals(0, count);
        assertNotNull(count);
      } catch(IOException e) {
        fail("ContentDisposition should be resolved");
      }
    }
  }

  @Test
  public void testGetInputStreamContentLength() throws IOException {
    try (FileInputStream stream = new FileInputStream("src/test/files/testfile.txt")) {
       assertNotNull(stream);
       try {
        request.getContentLength();
        fail("content length not supported");
       } catch(IOException e) {
       }
    }
  }

  private String[] entriesToList(List<String> list) {
    ArrayList<String> result = new ArrayList<>();

    for (String entry: list) {
      result.add(entry);
    }

    return result.toArray(new String[result.size()]);
  }
}

// end JVCTestContext_5Test.java

