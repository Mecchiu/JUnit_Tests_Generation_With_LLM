/*
 * This file was automatically generated by EvoSuite
 */

package util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import util.TaintedByteArrayOutputStream;

@RunWith(EvoSuiteRunner.class)
public class TaintedByteArrayOutputStreamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TaintedByteArrayOutputStream taintedByteArrayOutputStream0 = new TaintedByteArrayOutputStream();
      byte[] byteArray0 = taintedByteArrayOutputStream0.getByteArray();
      assertNotNull(byteArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      TaintedByteArrayOutputStream taintedByteArrayOutputStream0 = new TaintedByteArrayOutputStream(0);
      assertEquals("", taintedByteArrayOutputStream0.toString());
  }
}
