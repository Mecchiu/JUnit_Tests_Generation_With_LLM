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
* It contains ten unit test cases for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {

		@Test
		void testGetParamMap_1() throws Exception {
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				Map<String, String> m = context.getParamMap("foo");
				assertEquals(0, m.size());
		}
		
		@Test
		void testGetParamMap_2() throws Exception {
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setParameter("foo[bar1]", "baz1");
				request.setParameter("foo[bar2]", "baz2");
				Map<String, String> m = context.getParamMap("foo");
				assertEquals(2, m.size());
				assertEquals("baz1", m.get("bar1"));
				assertEquals("baz2", m.get("bar2"));
		}
		
		@Test
		void testGetParamMap_3() throws Exception {
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setParameter("foo[bar1]", "baz1");
				request.setParameter("foo[bar2]", "baz2");
				request.setParameter("foo[bar3]", "baz3");
				request.setParameter("foo[bar4]", "baz4");
				request.setParameter("foo[bar5]", "baz5");
				Map<String, String> m = context.getParamMap("foo");
				assertEquals(5, m.size());
				assertEquals("baz1", m.get("bar1"));
				assertEquals("baz2", m.get("bar2"));
				assertEquals("baz3", m.get("bar3"));
				assertEquals("baz4", m.get("bar4"));
				assertEquals("baz5", m.get("bar5"));
		}
		
		@Test
		void testGetParamMap_4() throws Exception {
				HttpServletRequest request = new MockHttpServletRequest();
				HttpServletResponse response = new MockHttpServletResponse();
				HttpServlet servlet = new MockHttpServlet();
				Map<String, String> flash = new HashMap<String, String>();
				JVCRequestContext context = new JVCRequestContext(request, response, servlet, flash, "", "");
				request.setParameter("foo[bar1]", "baz1");
				request.setParameter("foo[bar2]", "baz2");
				request.setParameter("foo[bar3]", "baz3");
				request.setParameter("foo[bar4]", "baz4");
				request.setParameter("foo[bar5]", "baz5");
				request.setParameter("foo[bar6]", "baz6");
				request.setParameter("foo[bar7]", "baz7");
				request.setParameter("foo[bar8]", "baz8");
				request.setParameter("foo[bar9]", "baz9");
				request.setParameter("foo[bar10]", "baz10");
				request.setParameter("foo[bar11]", "baz11");
				request.setParameter("foo[bar12]", "baz12");
				request.setParameter("foo[bar13]", "baz13");
				request.setParameter("foo[bar14]", "baz14");
				request.setParameter("foo[bar15]", "baz15");
				request.setParameter("foo[bar16]", "baz16");
				request.setParameter("foo[bar17]", "baz17");
				request.setParameter("foo[bar18]", "baz18");
				request.setParameter("foo[bar19]", "baz19");
				request.setParameter("foo[bar20]", "baz20");
				request.setParameter("foo[bar21]", "baz21");
				request.setParameter("foo[bar22]", "baz22");
				request.setParameter("foo[bar23]", "baz23");
				request.setParameter("foo[bar24]", "baz24");
				request.setParameter("foo[bar25]", "baz25");
				request.setParameter("foo[bar26]", "baz26");
				request.setParameter("foo[bar27]", "baz27");
				request.setParameter("foo[bar28]", "baz28");
				request.setParameter("foo[bar29]", "baz29");
				request.setParameter("foo[bar30]", "baz30");
				request.setParameter("foo[bar31]", "baz31");
				request.setParameter("foo[bar32]", "baz32");
				request.setParameter("foo[bar33]", "baz33");
				request.setParameter("foo[bar34]", "baz34");
				request.setParameter("foo[bar35]", "baz35");
				request.setParameter("foo[bar36]", "baz36");
				request.setParameter("foo[bar37]", "baz37");
				request.setParameter("foo[bar38]", "baz38");
				request.setParameter("foo[bar39]", "baz39");
				request.setParameter("foo[bar40]", "baz40");
				request.setParameter("foo[bar41]", "baz41");
				request.setParameter("foo[bar42]", "baz42");
				request.setParameter("foo[bar43]", "baz43");
				request.setParameter("foo[bar44]", "baz44");
				request.setParameter("foo[bar45]", "baz45");
				request.setParameter("foo[bar46]", "baz46");
				request.setParameter("foo[bar47]", "baz47");
				request.setParameter("foo[bar48]", "baz48");
				request.setParameter("foo[bar49]", "baz49");
				request.setParameter("foo[bar50]", "baz50");
				request.setParameter("foo[bar51]", "baz51");
				request.setParameter("