/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.impl.WebDAVPropsCacheModel;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WebDAVPropsCacheModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WebDAVPropsCacheModel webDAVPropsCacheModel0 = new WebDAVPropsCacheModel();
      String string0 = webDAVPropsCacheModel0.toString();
      assertEquals("{webDavPropsId=0, companyId=0, createDate=0, modifiedDate=0, classNameId=0, classPK=0, props=null}", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      WebDAVPropsCacheModel webDAVPropsCacheModel0 = new WebDAVPropsCacheModel();
      // Undeclared exception!
      try {
        webDAVPropsCacheModel0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      WebDAVPropsCacheModel webDAVPropsCacheModel0 = new WebDAVPropsCacheModel();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      webDAVPropsCacheModel0.props = "#t7BH";
      webDAVPropsCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, webDAVPropsCacheModel0.webDavPropsId);
  }

  @Test
  public void test3()  throws Throwable  {
      WebDAVPropsCacheModel webDAVPropsCacheModel0 = new WebDAVPropsCacheModel();
      BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream((OutputStream) null);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) bufferedOutputStream0);
      webDAVPropsCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, webDAVPropsCacheModel0.classPK);
  }
}
