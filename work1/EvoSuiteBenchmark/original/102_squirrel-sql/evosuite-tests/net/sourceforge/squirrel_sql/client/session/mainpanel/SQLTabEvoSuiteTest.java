/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.session.mainpanel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.squirrel_sql.client.session.ISession;
import net.sourceforge.squirrel_sql.client.session.mainpanel.SQLTab;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SQLTabEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SQLTab sQLTab0 = null;
      try {
        sQLTab0 = new SQLTab((ISession) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Null ISession passed
         */
      }
  }
}
