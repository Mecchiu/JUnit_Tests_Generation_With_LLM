/*
 * This file was automatically generated by EvoSuite
 */

package fr.pingtimeout.jtail.gui.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fr.pingtimeout.jtail.gui.model.JTailMainModelEvent;
import fr.pingtimeout.jtail.gui.model.JTailModel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class JTailMainModelEventEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      JTailMainModelEvent.Type jTailMainModelEvent_Type0 = JTailMainModelEvent.Type.CREATED;
      JTailMainModelEvent jTailMainModelEvent0 = new JTailMainModelEvent((JTailModel) null, 25, jTailMainModelEvent_Type0);
      String string0 = jTailMainModelEvent0.toString();
      assertNotNull(string0);
      assertEquals("type : CREATED - index : 25 - model : null", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      JTailMainModelEvent.Type jTailMainModelEvent_Type0 = JTailMainModelEvent.Type.CREATED;
      JTailMainModelEvent jTailMainModelEvent0 = new JTailMainModelEvent((JTailModel) null, 25, jTailMainModelEvent_Type0);
      boolean boolean0 = jTailMainModelEvent0.equals((Object) "type : CREATED - index : 25 - model : null");
      assertEquals(false, boolean0);
      assertEquals("type : CREATED - index : 25 - model : null", jTailMainModelEvent0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      JTailMainModelEvent.Type jTailMainModelEvent_Type0 = JTailMainModelEvent.Type.CREATED;
      JTailMainModelEvent jTailMainModelEvent0 = new JTailMainModelEvent((JTailModel) null, 25, jTailMainModelEvent_Type0);
      JTailMainModelEvent jTailMainModelEvent1 = new JTailMainModelEvent((JTailModel) null, 25, jTailMainModelEvent_Type0);
      boolean boolean0 = jTailMainModelEvent0.equals((Object) jTailMainModelEvent1);
      assertEquals(true, boolean0);
      assertEquals("type : CREATED - index : 25 - model : null", jTailMainModelEvent1.toString());
  }
}
