/*
 * This file was automatically generated by EvoSuite
 */

package dk.statsbiblioteket.summa.common.shell.commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import dk.statsbiblioteket.summa.common.shell.commands.Help;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HelpEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Help help0 = new Help();
      assertEquals("help [command]", help0.getUsage());
  }
}
