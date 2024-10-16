/*
 * This file was automatically generated by EvoSuite
 */

package org.jcvi.jillion.internal.trace.chromat.scf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.jcvi.jillion.internal.trace.chromat.scf.PrivateDataImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PrivateDataImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      PrivateDataImpl privateDataImpl0 = new PrivateDataImpl(byteArray0);
      PrivateDataImpl privateDataImpl1 = new PrivateDataImpl(byteArray0);
      boolean boolean0 = privateDataImpl1.equals((Object) privateDataImpl0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      PrivateDataImpl privateDataImpl0 = new PrivateDataImpl(byteArray0);
      int int0 = privateDataImpl0.hashCode();
      assertEquals((-1807454432), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      PrivateDataImpl privateDataImpl0 = new PrivateDataImpl(byteArray0);
      Object object0 = new Object();
      boolean boolean0 = privateDataImpl0.equals(object0);
      assertEquals(false, boolean0);
  }
}
