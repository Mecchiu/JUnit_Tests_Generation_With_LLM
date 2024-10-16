/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HttpUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getCookies();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.encodeURL("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getParameter("eC", "eC", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("?", "?", 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("#ir3", "#ir3", "#ir3");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getProtocol("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getCompleteURL((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.isProxyHost("EwcPh^q* 9-E(");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("~b", "~b", (short)2057);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getProtocol((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Http.Options http_Options0 = new Http.Options();
      // Undeclared exception!
      try {
        HttpUtil.URLtoString(http_Options0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getRequestURL((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.URLtoString("CF'", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.hasDomain("Pdk(4migg");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getDomain("!oJ]8w~%");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.hasProtocol(">~*3wX");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.decodePath("CWP-sgZzO;");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.URLtoString(". Attemting next option.");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("xK", "xK", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.encodeURL("d`[joQcAG=Z]}S", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.parameterMapToString((Map<String, String[]>) null, false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test21()  throws Throwable  {
      HttpUtil httpUtil0 = new HttpUtil();
      httpUtil0.setHttp((Http) null);
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getQueryString((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.protocolize("", (ActionRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.decodeURL((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.parameterMapFromString("Vd}>OSo|n/A");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getParameterMap("6R/pZ,n+)K<nTU");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test27()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.encodePath("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("", "", (-1640.9936170330861));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.protocolize("", (RenderRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getProtocol((ActionRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getPath("\u0002v(}*1");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.fixPath("l", true, true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.URLtoByteArray("enter HttpState.setCredentials(String, String, Credentials)");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getParameter("Interrupted while waiting for connection", "Interrupted while waiting for connection");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.decodeURL("Invalid 'day' argument.", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test36()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("javax.script.ScriptEngine", "javax.script.ScriptEngine", 1933L);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test37()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.removeParameter("6m", "6m");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test38()  throws Throwable  {
      Http.Options http_Options0 = new Http.Options();
      // Undeclared exception!
      try {
        HttpUtil.URLtoByteArray(http_Options0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("put", "put", (short)1);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test40()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("ME220B^||dmuS", "ME220B^||dmuS", "ME220B^||dmuS");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test41()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getIpAddress("d)<u|28^c");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("", "", (-1L));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.removeProtocol("");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("LENGTH", "LENGTH", 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.setParameter("v,W> OD>", "v,W> OD>", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test46()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.protocolize("m]&ONqnQ.8", false);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.fixPath("enter lengthOfat(");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.addParameter("*S _", "*S _", 0.0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test49()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getProtocol((RenderRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.isNonProxyHost("se`z/T~o_XphY9^2%t6");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test51()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.getProtocol(true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test52()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.URLtoString((URL) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test53()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.protocolize("t>bEX|L(nDf?", (HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test54()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.parameterMapToString((Map<String, String[]>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test55()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.removeDomain("w(8-");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test56()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.hasProxyConfig();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try {
        HttpUtil.URLtoByteArray("", true);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
