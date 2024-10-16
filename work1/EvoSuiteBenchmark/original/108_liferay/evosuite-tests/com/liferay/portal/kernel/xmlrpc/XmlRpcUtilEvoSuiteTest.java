/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.xmlrpc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.xmlrpc.XmlRpc;
import com.liferay.portal.kernel.xmlrpc.XmlRpcException;
import com.liferay.portal.kernel.xmlrpc.XmlRpcUtil;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class XmlRpcUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      // Undeclared exception!
      try {
        XmlRpcUtil.executeMethod("", "", objectArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        XmlRpcUtil.createSuccess("{~$xJ;{K',50QS:");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      XmlRpcUtil xmlRpcUtil0 = new XmlRpcUtil();
      xmlRpcUtil0.setXmlRpc((XmlRpc) null);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        XmlRpcUtil.createFault((-1), "v");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
