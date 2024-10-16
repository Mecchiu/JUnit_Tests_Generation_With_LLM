/*
 * This file was automatically generated by EvoSuite
 */

package jcmdline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import jcmdline.CmdLineException;
import jcmdline.DateParam;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DateParamEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DateParam dateParam0 = new DateParam("8>[^6M7", "8>[^6M7", false);
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(0, 0, 0, (-1362));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid milliseconds value specified (-1,362) must be between 0 and 999, inclusive.
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Date[] dateArray0 = new Date[1];
      Date date0 = new Date(1L);
      dateArray0[0] = date0;
      DateParam dateParam0 = new DateParam("uWPfg", "uWPfg", dateArray0);
      assertNotNull(dateParam0);
      
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime((-1892), (-1892), (-1892), (-1892));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid hours value specified (-1,892) must be between 0 and 23, inclusive.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      DateParam dateParam0 = new DateParam("AzK^o1tb@5~1:d;V", "AzK^o1tb@5~1:d;V", false);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        dateParam0.setAcceptableValues((Collection) linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DateParam dateParam0 = new DateParam("ak?lJ*~%", "ak?lJ*~%", false);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try {
        dateParam0.setAcceptableValues(stringArray0);
        fail("Expecting exception: UnsupportedOperationException");
      } catch(UnsupportedOperationException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      DateParam dateParam0 = new DateParam("0BbfG*8#~-hP`DW)", "0BbfG*8#~-hP`DW)", true, true);
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(12, 999, 12, 12);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid minutes value specified (999) must be between 0 and 59, inclusive.
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      String string0 = DateParam.getParseFormat();
      assertEquals("MM/dd/yyyy", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      DateParam dateParam0 = new DateParam("4\bU?&z_+JqCj", "4\bU?&z_+JqCj");
      try {
        dateParam0.validateValue("4\bU?&z_+JqCj");
        fail("Expecting exception: CmdLineException");
      } catch(CmdLineException e) {
        /*
         * Invalid date specified for <4\bU?&z_+JqCj>, expecting MM/dd/yyyy
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Date[] dateArray0 = new Date[2];
      Date date0 = new Date();
      dateArray0[0] = date0;
      dateArray0[1] = dateArray0[0];
      assertEquals(1372786405219L, dateArray0[1].getTime());
      
      DateParam dateParam0 = new DateParam("+?LqN<a5M4Z", "+?LqN<a5M4Z", dateArray0, true, true);
      dateParam0.getAcceptableDates();
      assertEquals(false, dateParam0.isHidden());
  }

  @Test
  public void test8()  throws Throwable  {
      DateParam dateParam0 = new DateParam("I}}95>OuZ:@3\"OyB`]{b", "I}}95>OuZ:@3\"OyB`]{b", true);
      int[] intArray0 = dateParam0.getDefaultTime();
      assertEquals(true, dateParam0.isOptional());
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
      assertEquals(false, dateParam0.isMultiValued());
      assertNotNull(intArray0);
      assertEquals(false, dateParam0.isHidden());
  }

  @Test
  public void test9()  throws Throwable  {
      DateParam dateParam0 = new DateParam("AzK^o1tb@5~1:d;V", "AzK^o1tb@5~1:d;V", false);
      dateParam0.getDate();
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
      assertEquals(false, dateParam0.isMultiValued());
      assertEquals(false, dateParam0.isHidden());
      assertEquals(false, dateParam0.isOptional());
  }

  @Test
  public void test10()  throws Throwable  {
      DateParam dateParam0 = new DateParam("D_teP{bmVivli3Datp", "D_teP{bmVivli3Datp", false);
      Date[] dateArray0 = dateParam0.getDates();
      assertNotNull(dateArray0);
      assertEquals(false, dateParam0.isMultiValued());
      assertEquals(false, dateParam0.isHidden());
      assertEquals(false, dateParam0.isOptional());
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
  }

  @Test
  public void test11()  throws Throwable  {
      DateParam dateParam0 = new DateParam("I}}95>OuZ:@3\"OyB`]{b", "I}}95>OuZ:@3\"OyB`]{b", true);
      dateParam0.getAcceptableDates();
      assertEquals(false, dateParam0.isHidden());
      assertEquals(false, dateParam0.isMultiValued());
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
      assertEquals(true, dateParam0.isOptional());
  }

  @Test
  public void test12()  throws Throwable  {
      DateParam dateParam0 = new DateParam("4\bU?&z_+JqCj", "4\bU?&z_+JqCj");
      Collection<Object> collection0 = dateParam0.getValues();
      dateParam0.setAcceptableDates(collection0);
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
      assertEquals(false, dateParam0.isMultiValued());
      assertEquals(false, dateParam0.isHidden());
      assertEquals(true, dateParam0.isOptional());
  }

  @Test
  public void test13()  throws Throwable  {
      DateParam dateParam0 = new DateParam("MIR}JSty{Ig|:]Qv?1", "MIR}JSty{Ig|:]Qv?1", true);
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(1854, 1854, 1854, 1854);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid hours value specified (1,854) must be between 0 and 23, inclusive.
         */
      }
  }

  @Test
  public void test14()  throws Throwable  {
      DateParam dateParam0 = new DateParam("Paraetr.vlNotMFWeptableVal", "Paraetr.vlNotMFWeptableVal");
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(18, (-145), (-145), (-145));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid minutes value specified (-145) must be between 0 and 59, inclusive.
         */
      }
  }

  @Test
  public void test15()  throws Throwable  {
      DateParam dateParam0 = new DateParam("r+ r-fJ:h8w}?57`o79", "r+ r-fJ:h8w}?57`o79", false, false, false);
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(15, 15, (-1871), (-1871));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid seconds value specified (-1,871) must be between 0 and 59, inclusive.
         */
      }
  }

  @Test
  public void test16()  throws Throwable  {
      DateParam dateParam0 = new DateParam("D_teP{bmVivli3Datp", "D_teP{bmVivli3Datp", false);
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(5, 5, 1614, 5);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid seconds value specified (1,614) must be between 0 and 59, inclusive.
         */
      }
  }

  @Test
  public void test17()  throws Throwable  {
      DateParam dateParam0 = new DateParam("`r>6[WD;Xtp;", "`r>6[WD;Xtp;");
      // Undeclared exception!
      try {
        dateParam0.setDefaultTime(23, 23, 23, 2012);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Invalid milliseconds value specified (2,012) must be between 0 and 999, inclusive.
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      DateParam dateParam0 = new DateParam("ak?lJ*~%", "ak?lJ*~%", false);
      dateParam0.setDefaultTime(0, 0, 0, 0);
      assertEquals(false, dateParam0.isMultiValued());
      assertEquals("MM/dd/yyyy", dateParam0.getOptionLabel());
      assertEquals(false, dateParam0.isOptional());
      assertEquals(false, dateParam0.isHidden());
  }
}
