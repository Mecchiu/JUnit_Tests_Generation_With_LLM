/*
 * This file was automatically generated by EvoSuite
 */

package de.huxhorn.lilith.logback.classic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.huxhorn.lilith.data.logging.Message;
import de.huxhorn.lilith.logback.classic.SimpleNDCAdapter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleNDCAdapterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      boolean boolean0 = simpleNDCAdapter0.isEmpty();
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      int int0 = simpleNDCAdapter0.getDepth();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      simpleNDCAdapter0.push("?[a=vYX");
      assertEquals(true, simpleNDCAdapter0.isEmpty());
      assertEquals(1, simpleNDCAdapter0.getDepth());
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      Object[] objectArray0 = new Object[2];
      simpleNDCAdapter0.push("?[a=vYX", objectArray0);
      simpleNDCAdapter0.push("?[a=vYX", (Object[]) null);
      assertEquals(true, simpleNDCAdapter0.isEmpty());
      assertEquals(2, simpleNDCAdapter0.getDepth());
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      simpleNDCAdapter0.clear();
      assertEquals(true, simpleNDCAdapter0.isEmpty());
  }

  @Test
  public void test5()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      simpleNDCAdapter0.pop();
      assertEquals(true, simpleNDCAdapter0.isEmpty());
  }

  @Test
  public void test6()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      Message[] messageArray0 = simpleNDCAdapter0.getContextStack();
      assertNotNull(messageArray0);
      
      simpleNDCAdapter0.push((String) null, (Object[]) messageArray0);
      assertEquals(true, simpleNDCAdapter0.isEmpty());
      assertEquals(1, simpleNDCAdapter0.getDepth());
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      Object[] objectArray0 = new Object[2];
      simpleNDCAdapter0.push("?[a=vYX", objectArray0);
      assertEquals(true, simpleNDCAdapter0.isEmpty());
      
      simpleNDCAdapter0.setMaximumDepth((-169));
      assertEquals(0, simpleNDCAdapter0.getDepth());
  }

  @Test
  public void test8()  throws Throwable  {
      SimpleNDCAdapter simpleNDCAdapter0 = new SimpleNDCAdapter();
      Object[] objectArray0 = new Object[2];
      simpleNDCAdapter0.push("?[a=vYX", objectArray0);
      simpleNDCAdapter0.getContextStack();
      assertEquals(1, simpleNDCAdapter0.getDepth());
      assertEquals(true, simpleNDCAdapter0.isEmpty());
  }
}
