/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.gds.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.firebirdsql.gds.impl.GDSType;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GDSTypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GDSType gDSType0 = GDSType.getType("EMBEDDED");
      assertNotNull(gDSType0);
      
      // Undeclared exception!
      GDSType gDSType1 = null;
      try {
        gDSType1 = (GDSType)gDSType0.readResolve();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      GDSType gDSType0 = GDSType.getType("EMBEDDED");
      String string0 = gDSType0.toString();
      assertEquals("EMBEDDED", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      GDSType gDSType0 = GDSType.getType((String) null);
      assertNull(gDSType0);
  }
}
