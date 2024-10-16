/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.mfw.bundle.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.mfw.bundle.common.Logger;
import org.junit.BeforeClass;
import sf.net.sinve.trace.data.Param;

@RunWith(EvoSuiteRunner.class)
public class LoggerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      logger0.debug("Started :", (Throwable) null);
  }

  @Test
  public void test1()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      logger0.info("Started :");
  }

  @Test
  public void test2()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      logger0.error((String) null);
  }

  @Test
  public void test3()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      logger0.error("Started :", (Throwable) null);
  }

  @Test
  public void test4()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      logger0.debug("l.g!Yko{2jJAY/");
  }

  @Test
  public void test5()  throws Throwable  {
      Class<?> class0 = Logger.class;
      Logger logger0 = new Logger(class0);
      Param[] paramArray0 = new Param[9];
      logger0.start((String) null, paramArray0);
  }

  @Test
  public void test6()  throws Throwable  {
      Class<?> class0 = Object.class;
      Logger logger0 = new Logger(class0);
      Param[] paramArray0 = new Param[6];
      logger0.complete("Started :", paramArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      Logger logger0 = new Logger("");
      logger0.info("", (Throwable) null);
  }
}
