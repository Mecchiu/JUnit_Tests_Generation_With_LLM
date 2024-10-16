/*
 * This file was automatically generated by EvoSuite
 */

package org.sourceforge.ifx.framework.complextype;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.sourceforge.ifx.framework.complextype.TerminalObjInqRq_Type;
import org.sourceforge.ifx.framework.element.MsgRqHdr;
import org.sourceforge.ifx.framework.element.RqUID;
import org.sourceforge.ifx.framework.element.TerminalObjId;

@RunWith(EvoSuiteRunner.class)
public class TerminalObjInqRq_TypeEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      TerminalObjId terminalObjId0 = terminalObjInqRq_Type0.getTerminalObjId();
      assertNull(terminalObjId0);
  }

  @Test
  public void test1()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      TerminalObjId terminalObjId0 = new TerminalObjId();
      terminalObjInqRq_Type0.setTerminalObjId(terminalObjId0);
      assertEquals("org.sourceforge.ifx.framework.element.TerminalObjId = {\n  String = NULL\n}", terminalObjId0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      terminalObjInqRq_Type0.setMsgRqHdr((MsgRqHdr) null);
      assertEquals("org.sourceforge.ifx.framework.complextype.TerminalObjInqRq_Type = {\n  RqUID = NULL\n  MsgRqHdr = NULL\n  TerminalObjId = NULL\n}", terminalObjInqRq_Type0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      MsgRqHdr msgRqHdr0 = terminalObjInqRq_Type0.getMsgRqHdr();
      assertNull(msgRqHdr0);
  }

  @Test
  public void test4()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      boolean boolean0 = terminalObjInqRq_Type0.equals((Object) "org.sourceforge.ifx.framework.element.NetworkRefId = {\n  String = NULL\n}");
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      RqUID rqUID0 = terminalObjInqRq_Type0.getRqUID();
      assertNull(rqUID0);
  }

  @Test
  public void test6()  throws Throwable  {
      TerminalObjInqRq_Type terminalObjInqRq_Type0 = new TerminalObjInqRq_Type();
      RqUID rqUID0 = new RqUID();
      terminalObjInqRq_Type0.setRqUID(rqUID0);
      assertNull(rqUID0.getString());
  }
}
