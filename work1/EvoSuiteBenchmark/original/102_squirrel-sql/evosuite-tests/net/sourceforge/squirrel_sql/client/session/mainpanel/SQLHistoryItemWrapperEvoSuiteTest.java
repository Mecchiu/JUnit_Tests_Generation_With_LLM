/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.squirrel_sql.client.session.mainpanel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.ArrayList;
import net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistoryItem;
import net.sourceforge.squirrel_sql.client.session.mainpanel.SQLHistoryItemWrapper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SQLHistoryItemWrapperEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      String[] stringArray0 = SQLHistoryItemWrapper.getColumns();
      assertNotNull(stringArray0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = SQLHistoryItemWrapper.getSQLColIx();
      assertEquals(2, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem("*", "*");
      SQLHistoryItemWrapper sQLHistoryItemWrapper0 = new SQLHistoryItemWrapper(sQLHistoryItem0, 602);
      String string0 = sQLHistoryItemWrapper0.getUpperCaseSQL();
      assertEquals("*", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem();
      ArrayList<SQLHistoryItem> arrayList0 = new ArrayList<SQLHistoryItem>();
      arrayList0.add(sQLHistoryItem0);
      ArrayList<SQLHistoryItemWrapper> arrayList1 = SQLHistoryItemWrapper.wrap(arrayList0);
      assertEquals(1, arrayList0.size());
      assertEquals(false, arrayList1.isEmpty());
  }

  @Test
  public void test4()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem("", "");
      SQLHistoryItemWrapper sQLHistoryItemWrapper0 = new SQLHistoryItemWrapper(sQLHistoryItem0, 0);
      assertNotNull(sQLHistoryItemWrapper0);
      
      Integer integer0 = (Integer)sQLHistoryItemWrapper0.getColum(0);
      assertEquals(0, (int)integer0);
  }

  @Test
  public void test5()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem("", "");
      SQLHistoryItemWrapper sQLHistoryItemWrapper0 = new SQLHistoryItemWrapper(sQLHistoryItem0, (-759));
      Integer integer0 = (Integer)sQLHistoryItemWrapper0.getColum(1);
      assertNull(integer0);
  }

  @Test
  public void test6()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem("false", "false");
      SQLHistoryItemWrapper sQLHistoryItemWrapper0 = new SQLHistoryItemWrapper(sQLHistoryItem0, 2000);
      assertNotNull(sQLHistoryItemWrapper0);
      
      String string0 = (String)sQLHistoryItemWrapper0.getColum(2);
      assertEquals("false", string0);
      assertNotNull(string0);
  }

  @Test
  public void test7()  throws Throwable  {
      SQLHistoryItem sQLHistoryItem0 = new SQLHistoryItem("4EGf", "4EGf");
      SQLHistoryItemWrapper sQLHistoryItemWrapper0 = new SQLHistoryItemWrapper(sQLHistoryItem0, 1173);
      // Undeclared exception!
      try {
        sQLHistoryItemWrapper0.getColum((-1));
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Unknown colum index -1
         */
      }
  }
}
