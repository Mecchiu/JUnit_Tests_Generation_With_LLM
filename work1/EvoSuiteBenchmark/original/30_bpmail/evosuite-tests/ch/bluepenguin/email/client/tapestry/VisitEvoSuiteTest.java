/*
 * This file was automatically generated by EvoSuite
 */

package ch.bluepenguin.email.client.tapestry;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import ch.bluepenguin.email.client.tapestry.Visit;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VisitEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Visit visit0 = new Visit();
      String string0 = visit0.getUserID();
      assertNull(string0);
  }

  @Test
  public void test1()  throws Throwable  {
      Visit visit0 = new Visit();
      visit0.setUserID("");
      assertEquals("", visit0.getUserID());
  }
}
