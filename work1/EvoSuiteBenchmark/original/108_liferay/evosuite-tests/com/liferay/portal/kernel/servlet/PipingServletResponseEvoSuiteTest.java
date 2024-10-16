/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.io.unsync.UnsyncPrintWriter;
import com.liferay.portal.kernel.servlet.PipingServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.PageContext;
import jodd.servlet.filter.GzipResponseStream;
import org.apache.jasper.runtime.JspContextWrapper;
import org.displaytag.filter.SimpleServletOutputStream;
import org.junit.BeforeClass;
import org.springframework.mock.web.MockPageContext;

@RunWith(EvoSuiteRunner.class)
public class PipingServletResponseEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext((ServletContext) null);
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      SimpleServletOutputStream simpleServletOutputStream0 = new SimpleServletOutputStream();
      PipingServletResponse pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (OutputStream) simpleServletOutputStream0);
  }

  @Test
  public void test1()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      PipingServletResponse pipingServletResponse1 = null;
      try {
        pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (OutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Output stream is null
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      assertNotNull(pipingServletResponse0);
      
      UnsyncPrintWriter unsyncPrintWriter0 = (UnsyncPrintWriter)pipingServletResponse0.getWriter();
      PipingServletResponse pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (PrintWriter) unsyncPrintWriter0);
      assertEquals(true, pipingServletResponse0.isCommitted());
      assertEquals(true, pipingServletResponse1.isCommitted());
  }

  @Test
  public void test3()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      PipingServletResponse pipingServletResponse1 = null;
      try {
        pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Print writer is null
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext((ServletContext) null);
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      SimpleServletOutputStream simpleServletOutputStream0 = new SimpleServletOutputStream();
      PipingServletResponse pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (ServletOutputStream) simpleServletOutputStream0);
      UnsyncPrintWriter unsyncPrintWriter0 = (UnsyncPrintWriter)pipingServletResponse1.getWriter();
      assertEquals(false, unsyncPrintWriter0.checkError());
  }

  @Test
  public void test5()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      JspContextWrapper jspContextWrapper0 = new JspContextWrapper((JspContext) mockPageContext0, arrayList0, arrayList0, arrayList0, (Map<String, String>) hashMap0);
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) jspContextWrapper0);
      PipingServletResponse pipingServletResponse1 = null;
      try {
        pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (ServletOutputStream) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Servlet output stream is null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      PipingServletResponse pipingServletResponse1 = null;
      try {
        pipingServletResponse1 = new PipingServletResponse((HttpServletResponse) pipingServletResponse0, (Writer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
        /*
         * Writer is null
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      MockPageContext mockPageContext0 = new MockPageContext();
      PipingServletResponse pipingServletResponse0 = new PipingServletResponse((PageContext) mockPageContext0);
      pipingServletResponse0.getOutputStream();
      GzipResponseStream gzipResponseStream0 = new GzipResponseStream((HttpServletResponse) pipingServletResponse0);
      assertEquals(false, gzipResponseStream0.closed());
  }
}
