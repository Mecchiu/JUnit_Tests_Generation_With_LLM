/*
 * This file was automatically generated by EvoSuite
 */

package org.heal.module.oai.provider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.text.ParseException;
import java.util.Date;
import org.heal.module.oai.provider.OAIGranularity;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class OAIGranularityEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      OAIGranularity oAIGranularity0 = OAIGranularity.getGranularity("");
      assertNull(oAIGranularity0);
  }

  @Test
  public void test1()  throws Throwable  {
      OAIGranularity oAIGranularity0 = new OAIGranularity("", "");
      try {
        oAIGranularity0.parse("");
        fail("Expecting exception: ParseException");
      } catch(ParseException e) {
        /*
         * Unparseable date: \"\"
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      OAIGranularity oAIGranularity0 = OAIGranularity.yearMonthDayHourMinuteSecond;
      String string0 = oAIGranularity0.getDisplay();
      assertEquals("YYYY-MM-DDThh:mm:ssZ", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      OAIGranularity oAIGranularity0 = OAIGranularity.yearMonthDayHourMinuteSecond;
      Date date0 = new Date(0L);
      String string0 = oAIGranularity0.format(date0);
      assertEquals("1970-01-01T00:00:00Z", string0);
  }
}
