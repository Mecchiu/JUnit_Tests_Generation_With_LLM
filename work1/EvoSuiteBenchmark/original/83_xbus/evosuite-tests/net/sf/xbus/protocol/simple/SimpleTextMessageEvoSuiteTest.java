/*
 * This file was automatically generated by EvoSuite
 */

package net.sf.xbus.protocol.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sf.xbus.base.xbussystem.XBUSSystem;
import net.sf.xbus.protocol.simple.SimpleTextMessage;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SimpleTextMessageEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage((XBUSSystem) null);
      simpleTextMessage0.setRequestObject((Object) "Default", (XBUSSystem) null);
      assertEquals("TEST_EXECUTION_THREAD_1_1372721918222", simpleTextMessage0.getId());
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test1()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage(",FynICFP", (XBUSSystem) null, ",FynICFP");
      simpleTextMessage0.getRequestObject((XBUSSystem) null);
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test2()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage("", (XBUSSystem) null, "");
      simpleTextMessage0.setResponseObject((Object) null, (XBUSSystem) null);
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test3()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage("", (XBUSSystem) null, "");
      simpleTextMessage0.getRequestText((XBUSSystem) null);
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test4()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage((XBUSSystem) null);
      simpleTextMessage0.setRequestText("", (XBUSSystem) null);
      assertEquals("TEST_EXECUTION_THREAD_1_1372721918344", simpleTextMessage0.getId());
  }

  @Test
  public void test5()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage("", (XBUSSystem) null, "");
      simpleTextMessage0.getResponseObject();
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test6()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage(",FynICFP", (XBUSSystem) null, ",FynICFP");
      simpleTextMessage0.getResponseText();
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }

  @Test
  public void test7()  throws Throwable  {
      SimpleTextMessage simpleTextMessage0 = new SimpleTextMessage(",FynICFP", (XBUSSystem) null, ",FynICFP");
      simpleTextMessage0.setResponseText(",FynICFP", (XBUSSystem) null);
      assertEquals("SimpleTextMessage", simpleTextMessage0.getShortname());
  }
}
