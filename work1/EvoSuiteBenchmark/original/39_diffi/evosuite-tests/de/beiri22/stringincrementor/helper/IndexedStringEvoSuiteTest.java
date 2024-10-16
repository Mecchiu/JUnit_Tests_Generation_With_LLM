/*
 * This file was automatically generated by EvoSuite
 */

package de.beiri22.stringincrementor.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import de.beiri22.stringincrementor.helper.IndexedString;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IndexedStringEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("y{-R|j3u%.xN^}");
      char[] charArray0 = new char[7];
      charArray0[0] = '}';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }

  @Test
  public void test1()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("DemV#s^J0vqQL0b");
      assertNotNull(indexedString0);
      
      char[] charArray0 = new char[1];
      charArray0[0] = 's';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals(5, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      IndexedString indexedString0 = new IndexedString("}7*x4=Yl#:St^QuQuX");
      assertNotNull(indexedString0);
      
      char[] charArray0 = new char[6];
      charArray0[0] = 'Y';
      charArray0[1] = 'l';
      int int0 = indexedString0.indexOf(charArray0);
      assertEquals((-1), int0);
  }
}
