/*
 * This file was automatically generated by EvoSuite
 */

package freemind.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import freemind.common.TextTranslator;
import freemind.common.ThreeCheckBoxProperty;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ThreeCheckBoxPropertyEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty("_", "_");
      assertNotNull(threeCheckBoxProperty0);
      
      String string0 = threeCheckBoxProperty0.getDescription();
      assertEquals("_", string0);
      assertNotNull(string0);
      assertEquals("_", threeCheckBoxProperty0.getLabel());
      assertEquals("true", threeCheckBoxProperty0.getValue());
  }

  @Test
  public void test1()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty((String) null, (String) null);
      assertNotNull(threeCheckBoxProperty0);
      
      threeCheckBoxProperty0.setEnabled(true);
      assertEquals("true", threeCheckBoxProperty0.getValue());
  }

  @Test
  public void test2()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty("onmousemove", "onmousemove");
      assertEquals(0, threeCheckBoxProperty0.state);
      
      threeCheckBoxProperty0.setValue("false");
      String string0 = threeCheckBoxProperty0.getValue();
      assertEquals(1, threeCheckBoxProperty0.state);
      assertEquals("false", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty("gxad/u", (String) null);
      assertNotNull(threeCheckBoxProperty0);
      
      // Undeclared exception!
      try {
        threeCheckBoxProperty0.layout((DefaultFormBuilder) null, (TextTranslator) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty((String) null, (String) null);
      assertNotNull(threeCheckBoxProperty0);
      
      // Undeclared exception!
      try {
        threeCheckBoxProperty0.setValue((String) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Cannot set a boolean to null
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty((String) null, (String) null);
      assertNotNull(threeCheckBoxProperty0);
      
      threeCheckBoxProperty0.setValue("true");
      assertEquals("true", threeCheckBoxProperty0.getValue());
      assertEquals(0, threeCheckBoxProperty0.state);
  }

  @Test
  public void test6()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty("bz~gaO*cev9|", "bz~gaO*cev9|");
      assertNotNull(threeCheckBoxProperty0);
      
      // Undeclared exception!
      try {
        threeCheckBoxProperty0.setValue("bz~gaO*cev9|");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Cannot set a boolean to bz~gaO*cev9|
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty((String) null, (String) null);
      assertNotNull(threeCheckBoxProperty0);
      
      String string0 = threeCheckBoxProperty0.getValue();
      assertNotNull(string0);
      assertEquals("true", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      ThreeCheckBoxProperty threeCheckBoxProperty0 = new ThreeCheckBoxProperty("bz~gaO*cev9|", "bz~gaO*cev9|");
      assertEquals(0, threeCheckBoxProperty0.state);
      assertNotNull(threeCheckBoxProperty0);
      
      threeCheckBoxProperty0.state = 1577;
      threeCheckBoxProperty0.getValue();
      assertEquals("bz~gaO*cev9|", threeCheckBoxProperty0.getDescription());
  }
}
