/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.model.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.model.impl.PortletCacheModel;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.DebugGraphics;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PortletCacheModelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      PortletCacheModel portletCacheModel0 = new PortletCacheModel();
      // Undeclared exception!
      try {
        portletCacheModel0.readExternal((ObjectInput) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      PortletCacheModel portletCacheModel0 = new PortletCacheModel();
      String string0 = portletCacheModel0.toString();
      assertEquals("{id=0, companyId=0, portletId=null, roles=null, active=false}", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      PortletCacheModel portletCacheModel0 = new PortletCacheModel();
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      portletCacheModel0.portletId = "`$";
      portletCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("{id=0, companyId=0, portletId=`$, roles=null, active=false}", portletCacheModel0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      PortletCacheModel portletCacheModel0 = new PortletCacheModel();
      PrintStream printStream0 = DebugGraphics.logStream();
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) printStream0);
      portletCacheModel0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(0L, portletCacheModel0.id);
  }
}
