/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.jiprof.timeline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.sourceforge.jiprof.timeline.Action;
import net.sourceforge.jiprof.timeline.ActionRecord;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ActionRecordEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Action action0 = Action.STOP;
      ActionRecord actionRecord0 = new ActionRecord((String) null, (String) null, action0, 1030L);
      actionRecord0.getClassName();
      assertEquals(1030L, actionRecord0.getThreadId());
  }

  @Test
  public void test1()  throws Throwable  {
      Action action0 = Action.STOP;
      ActionRecord actionRecord0 = new ActionRecord((String) null, (String) null, action0, 1030L);
      actionRecord0.getMethodName();
      assertEquals(1030L, actionRecord0.getThreadId());
  }

  @Test
  public void test2()  throws Throwable  {
      Action action0 = Action.STOP;
      ActionRecord actionRecord0 = new ActionRecord((String) null, (String) null, action0, 1030L);
      actionRecord0.getAction();
      assertEquals(1030L, actionRecord0.getThreadId());
  }

  @Test
  public void test3()  throws Throwable  {
      Action action0 = Action.STOP;
      ActionRecord actionRecord0 = new ActionRecord((String) null, (String) null, action0, 1030L);
      long long0 = actionRecord0.getThreadId();
      assertEquals(1030L, long0);
  }
}
