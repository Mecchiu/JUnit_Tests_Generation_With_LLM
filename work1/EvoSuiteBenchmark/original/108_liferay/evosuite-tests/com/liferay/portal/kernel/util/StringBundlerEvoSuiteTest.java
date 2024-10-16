/*
 * This file was automatically generated by EvoSuite
 */

package com.liferay.portal.kernel.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.liferay.portal.kernel.util.StringBundler;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.Writer;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StringBundlerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      stringBundler0.append('>');
      stringBundler0.append(true);
      String string0 = stringBundler0.toString(true);
      assertEquals(3, stringBundler0.index());
      assertEquals(">true", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(",eq0(B");
      assertNotNull(stringBundler0);
      
      String string0 = stringBundler0.toString();
      assertEquals(16, stringBundler0.capacity());
      assertEquals(",eq0(B", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler((-1835));
      assertNotNull(stringBundler0);
      
      char[] charArray0 = new char[4];
      stringBundler0.setIndex((int) 'a');
      stringBundler0.append(charArray0);
      String string0 = stringBundler0.stringAt((int) 'a');
      assertEquals("\u0000\u0000\u0000\u0000", stringBundler0.toString());
      assertEquals("\u0000\u0000\u0000\u0000", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("k-+^[\"W%U[}Pj");
      assertNotNull(stringBundler0);
      
      stringBundler0.append((float) '\u0015');
      assertEquals(2, stringBundler0.index());
      assertEquals("k-+^[\"W%U[}Pj21.0", stringBundler0.toString());
  }

  @Test
  public void test4()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      stringBundler0.append((double) 0);
      assertEquals(2, stringBundler0.index());
  }

  @Test
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[12];
      StringBundler stringBundler0 = new StringBundler(stringArray0, 227);
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append((long) (-1237));
      assertEquals(5, stringBundler0.length());
      assertEquals(1, stringBundler1.index());
  }

  @Test
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      StringBundler stringBundler0 = new StringBundler(stringArray0);
      assertNotNull(stringBundler0);
      
      // Undeclared exception!
      try {
        stringBundler0.stringAt((-1155));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: -1155
         */
      }
  }

  @Test
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[12];
      StringBundler stringBundler0 = new StringBundler(stringArray0, 227);
      assertNotNull(stringBundler0);
      
      int int0 = stringBundler0.capacity();
      assertEquals(239, int0);
  }

  @Test
  public void test8()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      int int0 = stringBundler0.index();
      assertEquals(16, stringBundler0.capacity());
      assertEquals(1, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append(0);
      assertEquals(2, stringBundler0.index());
      assertEquals(1, stringBundler1.length());
  }

  @Test
  public void test10()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler();
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append(stringBundler0);
      assertEquals(16, stringBundler1.capacity());
  }

  @Test
  public void test11()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append((Object) "");
      assertNotNull(stringBundler1);
      assertEquals(16, stringBundler0.capacity());
      assertEquals(1, stringBundler0.index());
      assertEquals("", stringBundler1.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(6);
      assertNotNull(stringBundler0);
      
      String string0 = stringBundler0.toString();
      assertEquals(6, stringBundler0.capacity());
      assertNotNull(string0);
  }

  @Test
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[12];
      stringArray0[6] = "F;}!di(qgB6,pK0MD";
      StringBundler stringBundler0 = new StringBundler(stringArray0, 227);
      assertNotNull(stringBundler0);
      
      stringBundler0.setStringAt("F;}!di(qgB6,pK0MD", 0);
      assertEquals(239, stringBundler0.capacity());
      assertEquals(1, stringBundler0.index());
      assertEquals("F;}!di(qgB6,pK0MD", stringBundler0.toString());
  }

  @Test
  public void test14()  throws Throwable  {
      String[] stringArray0 = new String[26];
      stringArray0[1] = "";
      StringBundler stringBundler0 = new StringBundler(stringArray0);
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append(stringArray0);
      assertEquals(0, stringBundler1.index());
      assertNotNull(stringBundler1);
      assertEquals(26, stringBundler1.capacity());
  }

  @Test
  public void test15()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      stringBundler0.append(false);
      String string0 = stringBundler0.toString(false);
      assertEquals(2, stringBundler0.index());
      assertEquals("false", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      stringBundler0.append(true);
      assertEquals(2, stringBundler0.index());
  }

  @Test
  public void test17()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("k-+^[\"W%U[}Pj");
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append((char[]) null);
      StringBundler stringBundler2 = stringBundler1.append(stringBundler0);
      String string0 = stringBundler2.toString(true);
      assertEquals(4, stringBundler0.index());
      assertEquals("k-+^[\"W%U[}Pjnullk-+^[\"W%U[}Pjnull", string0);
  }

  @Test
  public void test18()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(59);
      assertNotNull(stringBundler0);
      
      stringBundler0.append((String) null);
      assertEquals(4, stringBundler0.length());
      assertEquals(1, stringBundler0.index());
  }

  @Test
  public void test19()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append((String[]) null);
      assertEquals(16, stringBundler1.capacity());
      assertEquals(1, stringBundler1.index());
      assertNotNull(stringBundler1);
  }

  @Test
  public void test20()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      
      String[] stringArray0 = new String[1];
      StringBundler stringBundler1 = stringBundler0.append(stringArray0);
      assertNotNull(stringBundler1);
      assertEquals(16, stringBundler0.capacity());
      assertEquals(1, stringBundler0.index());
      assertEquals(16, stringBundler1.capacity());
  }

  @Test
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[26];
      stringArray0[8] = "w#f`A?ehQTQ!0";
      StringBundler stringBundler0 = new StringBundler(stringArray0);
      assertNotNull(stringBundler0);
      
      stringBundler0.append(stringArray0);
      assertEquals(2, stringBundler0.index());
      assertEquals(26, stringBundler0.length());
  }

  @Test
  public void test22()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(59);
      assertNotNull(stringBundler0);
      
      StringBundler stringBundler1 = stringBundler0.append((StringBundler) null);
      assertNotNull(stringBundler1);
      assertEquals(59, stringBundler0.capacity());
      assertEquals(59, stringBundler1.capacity());
  }

  @Test
  public void test23()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("k-+^[\"W%U[}Pj");
      assertNotNull(stringBundler0);
      
      stringBundler0.append(stringBundler0);
      assertEquals(2, stringBundler0.index());
  }

  @Test
  public void test24()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(59);
      assertNotNull(stringBundler0);
      
      stringBundler0.setIndex(59);
      stringBundler0.append(stringBundler0);
      assertEquals(236, stringBundler0.capacity());
      assertEquals(118, stringBundler0.index());
  }

  @Test
  public void test25()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler(",eq0(B");
      assertNotNull(stringBundler0);
      
      int int0 = stringBundler0.length();
      assertEquals(16, stringBundler0.capacity());
      assertEquals(6, int0);
  }

  @Test
  public void test26()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler((String) null);
      assertNotNull(stringBundler0);
      
      // Undeclared exception!
      try {
        stringBundler0.setIndex((-7));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: -7
         */
      }
  }

  @Test
  public void test27()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("");
      assertNotNull(stringBundler0);
      assertEquals(1, stringBundler0.index());
      
      stringBundler0.setIndex(0);
      assertEquals(0, stringBundler0.index());
  }

  @Test
  public void test28()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler();
      assertNotNull(stringBundler0);
      
      // Undeclared exception!
      try {
        stringBundler0.setStringAt("'7@0D7", (-1934));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: -1934
         */
      }
  }

  @Test
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[12];
      StringBundler stringBundler0 = new StringBundler(stringArray0, 227);
      assertNotNull(stringBundler0);
      
      // Undeclared exception!
      try {
        stringBundler0.setStringAt("F;}!di(qgB6,pK0MD", 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 0
         */
      }
  }

  @Test
  public void test30()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("W/#aS");
      assertNotNull(stringBundler0);
      
      // Undeclared exception!
      try {
        stringBundler0.stringAt(232);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 232
         */
      }
  }

  @Test
  public void test31()  throws Throwable  {
      StringBundler stringBundler0 = new StringBundler("k-+^[\"W%U[}Pj");
      assertNotNull(stringBundler0);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter((int) '\u0015');
      stringBundler0.writeTo((Writer) charArrayWriter0);
      assertEquals("k-+^[\"W%U[}Pj", charArrayWriter0.toString());
      assertEquals(14, charArrayWriter0.size());
  }
}
