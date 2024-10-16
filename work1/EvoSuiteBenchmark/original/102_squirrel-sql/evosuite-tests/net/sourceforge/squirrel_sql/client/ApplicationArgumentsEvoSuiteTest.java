/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.ApplicationArguments;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ApplicationArgumentsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      applicationArguments0.printHelp();
      assertNull(applicationArguments0.getLoggingConfigFileName());
  }

  @Test
  public void test1()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      boolean boolean0 = applicationArguments0.useNativeLAF();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      String[] stringArray0 = applicationArguments0.getRawArguments();
      assertNotNull(stringArray0);
      
      boolean boolean0 = ApplicationArguments.initialize(stringArray0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      ApplicationArguments.reset();
  }

  @Test
  public void test4()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      String string0 = applicationArguments0.getLoggingConfigFileName();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      boolean boolean0 = applicationArguments0.useDefaultMetalTheme();
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      String string0 = applicationArguments0.getUserSettingsDirectoryOverride();
      assertNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      boolean boolean0 = applicationArguments0.getShowHelp();
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      String string0 = applicationArguments0.getSquirrelHomeDirectory();
      assertNull(string0);
  }

  @Test
  public void test9()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      assertNotNull(applicationArguments0);
      
      applicationArguments0.getPluginList();
      boolean boolean0 = applicationArguments0.getShowSplashScreen();
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      applicationArguments0.getShutdownTimerSeconds();
  }

  @Test
  public void test11()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      boolean boolean0 = applicationArguments0.getUserInterfaceDebugEnabled();
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[5];
      boolean boolean0 = ApplicationArguments.initialize(stringArray0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      ApplicationArguments applicationArguments0 = ApplicationArguments.getInstance();
      assertNotNull(applicationArguments0);
      
      boolean boolean0 = applicationArguments0.getLoadPlugins();
      assertEquals(true, boolean0);
  }
}
