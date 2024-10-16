/*
 * This file was automatically generated by EvoSuite
 */

package bible.servlet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import bible.servlet.ServletUtil;
import javax.servlet.http.HttpServletRequest;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ServletUtilEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try {
        ServletUtil.GetIntParameter((HttpServletRequest) null, "IQkD9iBXgd%s3");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try {
        ServletUtil.GetIntParameters((HttpServletRequest) null, (String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test2()  throws Throwable  {
      ServletUtil servletUtil0 = new ServletUtil();
      assertNotNull(servletUtil0);
  }

  @Test
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try {
        ServletUtil.GetStringParameter((HttpServletRequest) null, "c@pMb2t,u;e0e+%^");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int[] intArray0 = ServletUtil.GetIntParameters((String[]) null);
      assertNotNull(intArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[15];
      // Undeclared exception!
      try {
        ServletUtil.GetIntParameters(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * null
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      int[] intArray0 = ServletUtil.GetIntParameters(stringArray0);
      assertNotNull(intArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "LN";
      // Undeclared exception!
      try {
        ServletUtil.GetIntParameters(stringArray0);
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"LN\"
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = ServletUtil.GetIntParameter((String) null);
      assertEquals((-10), int0);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = ServletUtil.GetIntParameter("");
      assertEquals((-10), int0);
  }

  @Test
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try {
        ServletUtil.GetIntParameter("e!M");
        fail("Expecting exception: NumberFormatException");
      } catch(NumberFormatException e) {
        /*
         * For input string: \"e!M\"
         */
      }
  }
}
