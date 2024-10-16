/*
 * This file was automatically generated by EvoSuite
 */

package org.firebirdsql.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import org.firebirdsql.jdbc.FBEscapedParser;
import org.firebirdsql.jdbc.FBSQLException;
import org.firebirdsql.jdbc.FBSQLParseException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class FBEscapedParserEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(12);
      String string0 = fBEscapedParser0.escapeToNative("escape");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(1, fBEscapedParser0.getState());
  }

  @Test
  public void test1()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1235));
      try {
        fBEscapedParser0.setState((-1235));
        fail("Expecting exception: IllegalStateException");
      } catch(IllegalStateException e) {
        /*
         * State -1235 is unknown.
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-3));
      String string0 = fBEscapedParser0.escapeToNative("call");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals("EXECUTE PROCEDURE null", string0);
      assertNotNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-4));
      String string0 = fBEscapedParser0.escapeToNative("d");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(138);
      String string0 = fBEscapedParser0.escapeToNative("t");
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals("", string0);
      assertEquals(1, fBEscapedParser0.getLastState());
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1235));
      String string0 = fBEscapedParser0.escapeToNative("ts");
      assertEquals(1, fBEscapedParser0.getState());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = FBEscapedParser.supportsLikeEscapeClause();
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = FBEscapedParser.supportsStoredProcedures();
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1333));
      try {
        fBEscapedParser0.parse("SUBSTRI3G({0} FROM {1} FOR2{t})");
        fail("Expecting exception: FBSQLParseException");
      } catch(FBSQLParseException e) {
        /*
         * Unknown keyword 0 for escaped syntax.
         */
      }
  }

  @Test
  public void test9()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1333));
      fBEscapedParser0.switchState('\'');
      fBEscapedParser0.switchState('\'');
      assertEquals(2, fBEscapedParser0.getLastState());
  }

  @Test
  public void test10()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(505);
      String string0 = fBEscapedParser0.parse("\"$U{*'/gP{t\"");
      assertEquals(4, fBEscapedParser0.getState());
      assertEquals("\"$U", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(53);
      fBEscapedParser0.switchState('}');
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(1, fBEscapedParser0.getState());
  }

  @Test
  public void test12()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-57));
      String string0 = fBEscapedParser0.parse(";{call");
      assertEquals(4, fBEscapedParser0.getState());
      assertEquals(";", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-15));
      String string0 = fBEscapedParser0.parse("{?");
      assertEquals(4, fBEscapedParser0.getState());
      assertEquals("", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-16));
      boolean boolean0 = fBEscapedParser0.checkForEscapes("{d");
      assertEquals(true, boolean0);
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals(1, fBEscapedParser0.getLastState());
  }

  @Test
  public void test15()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-641));
      String string0 = fBEscapedParser0.parse("O{escape");
      assertEquals(4, fBEscapedParser0.getState());
      assertEquals("O", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-57));
      String string0 = fBEscapedParser0.parse("{fn");
      assertEquals(4, fBEscapedParser0.getState());
      assertEquals("", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(1659);
      boolean boolean0 = fBEscapedParser0.checkForEscapes("{oj");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(true, boolean0);
      assertEquals(1, fBEscapedParser0.getState());
  }

  @Test
  public void test18()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1235));
      String string0 = fBEscapedParser0.parse("ts");
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals("ts", string0);
      assertNotNull(string0);
  }

  @Test
  public void test19()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-16));
      StringBuffer stringBuffer0 = new StringBuffer("Pg;?)Ay?~4<p2pP");
      fBEscapedParser0.processEscaped("Pg;?)Ay?~4<p2pP", stringBuffer0, stringBuffer0);
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals("Pg;?)Ay?~4<p2pP", stringBuffer0.toString());
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals(15, stringBuffer0.length());
  }

  @Test
  public void test20()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-4));
      StringBuffer stringBuffer0 = new StringBuffer();
      StringBuffer stringBuffer1 = new StringBuffer((CharSequence) "d");
      fBEscapedParser0.processEscaped("d", stringBuffer0, stringBuffer1);
      assertEquals(0, stringBuffer1.length());
      assertEquals(1, stringBuffer0.length());
  }

  @Test
  public void test21()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(12);
      String string0 = fBEscapedParser0.escapeToNative("?bZu|E783HvgF");
      assertNotNull(string0);
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals("EXECUTE PROCEDURE ?bZu|E783HvgF", string0);
  }

  @Test
  public void test22()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(271);
      try {
        fBEscapedParser0.escapeToNative("fn");
        fail("Expecting exception: FBSQLParseException");
      } catch(FBSQLParseException e) {
        /*
         * No opening parenthesis found, not a function call.
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser(155);
      String string0 = fBEscapedParser0.escapeToNative("oj");
      assertEquals("", string0);
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(1, fBEscapedParser0.getState());
      assertNotNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1333));
      String string0 = fBEscapedParser0.convertEscapedFunction("SUBSTRI3G({0} FROM {1} FOR2{t})");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals("SUBSTRI3G({0} FROM {1} FOR2{t})", string0);
      assertNotNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      FBEscapedParser fBEscapedParser0 = new FBEscapedParser((-1333));
      String string0 = fBEscapedParser0.convertEscapedFunction("SUBSTRING({0} FROM {1} FOR {2})");
      assertEquals(1, fBEscapedParser0.getLastState());
      assertEquals(1, fBEscapedParser0.getState());
      assertEquals("SUBSTRING({0}FROM{1}FOR{2} FROM {1} FOR {2})", string0);
      assertNotNull(string0);
  }
}
