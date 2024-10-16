/*
 * This file was automatically generated by EvoSuite
 */

package framework.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import framework.util.StringUtils;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class StringUtilsEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      List<Object> list0 = StringUtils.stringToWordList("Error while trying to output diagnostics about bad class '");
      assertNotNull(list0);
      
      String[] stringArray0 = StringUtils.listToStringArray(list0);
      List<Object> list1 = StringUtils.stringArrayToList(stringArray0);
      assertNotNull(list1);
      assertEquals(10, list1.size());
  }

  @Test
  public void test1()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      assertEquals(".src/main/resources/keyword", stringUtils0.getKeywordDirectory());
  }

  @Test
  public void test2()  throws Throwable  {
      boolean boolean0 = StringUtils.isBoolean("'VjLui+j?5zw~59", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test3()  throws Throwable  {
      boolean boolean0 = StringUtils.isFloat((String) null, false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      String[] stringArray0 = StringUtils.stringToStringArray("$RUs`~e>wZ7F7-m_", "$RUs`~e>wZ7F7-m_");
      assertNotNull(stringArray0);
  }

  @Test
  public void test5()  throws Throwable  {
      boolean boolean0 = StringUtils.isEmail("'VjLui+j?5zw~59", true);
      assertEquals(false, boolean0);
  }

  @Test
  public void test6()  throws Throwable  {
      boolean boolean0 = StringUtils.isInteger("", true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      boolean boolean0 = StringUtils.isJavaName("V*x{_dWSu0rBmFfT$#");
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      boolean boolean0 = StringUtils.isPositiveFloat(".src/main/resources/keyword", true);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      boolean boolean0 = StringUtils.isPositiveInteger("|BXL&z#w^DE$-(/o", false);
      assertEquals(false, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      boolean boolean0 = StringUtils.isWhitespace("", true);
      assertEquals(true, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      boolean boolean0 = StringUtils.isJavaPackageName("|BXL&z#w^DE$-(/o");
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      try {
        StringUtils.getKeywords("");
        fail("Expecting exception: FileNotFoundException");
      } catch(FileNotFoundException e) {
        /*
         * .src/main/resources/keyword/.kw (No such file or directory)
         */
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = StringUtils.replacePattern("", "", "");
      assertEquals("", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      HashMap<StringUtils, String> hashMap0 = new HashMap<StringUtils, String>();
      String string0 = StringUtils.prettyPrint((Map) hashMap0, "Vb~w(h'\"kWaSx", "Vb~w(h'\"kWaSx", "Vb~w(h'\"kWaSx", "Vb~w(h'\"kWaSx");
      assertNotNull(string0);
      assertEquals("Vb~w(h'\"kWaSx", string0);
  }

  @Test
  public void test15()  throws Throwable  {
      HashMap<Object, StringUtils> hashMap0 = new HashMap<Object, StringUtils>();
      String string0 = StringUtils.prettyPrint((Map) hashMap0, "", "", "Error while trying to output diagnostics about bad class '", "");
      assertEquals("", string0);
  }

  @Test
  public void test16()  throws Throwable  {
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      String string0 = StringUtils.prettyPrint((Map) hashMap0, "I?&[M", (String) null, "I?&[M", "I?&[M");
      assertNotNull(string0);
      assertEquals("I?&[M", string0);
  }

  @Test
  public void test17()  throws Throwable  {
      List<Object> list0 = StringUtils.stringToList("http://apache.org/xml/features/internal/parser-settings", 'p');
      assertNotNull(list0);
      
      // Undeclared exception!
      try {
        StringUtils.replaceTokens("Invalid POSIX character class syntax", (Collection) list0, "http://apache.org/xml/features/internal/parser-settings", "http://apache.org/xml/features/internal/parser-settings");
        fail("Expecting exception: ClassCastException");
      } catch(ClassCastException e) {
        /*
         * java.lang.String cannot be cast to [Ljava.lang.Object;
         */
      }
  }

  @Test
  public void test18()  throws Throwable  {
      List<Object> list0 = StringUtils.stringToList("", 'P');
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = StringUtils.trimEmptyToNull((String) null);
      assertNull(string0);
  }

  @Test
  public void test20()  throws Throwable  {
      String string0 = StringUtils.trimEmptyToNull("");
      assertNull(string0);
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = StringUtils.replace("Error while trying to output diagnostics about bad class '", "Error while trying to output diagnostics about bad class '", "Error while trying to output diagnostics about bad class '");
      assertNotNull(string0);
      assertEquals("Error while trying to output diagnostics about bad class '", string0);
  }

  @Test
  public void test22()  throws Throwable  {
      // Undeclared exception!
      try {
        StringUtils.replace("", (String) null, "");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Cannot accept null argument
         */
      }
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = StringUtils.replace("Error while trying to output diagnostics about bad class '", ".src/main/resources/keyword", ".src/main/resources/keyword");
      assertEquals("Error while trying to output diagnostics about bad class '", string0);
      assertNotNull(string0);
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = StringUtils.initCap((String) null);
      assertNull(string0);
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = StringUtils.initCap("'VjLui+j?5zw~59");
      assertEquals("'vjlui+j?5zw~59", string0);
      assertNotNull(string0);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = StringUtils.valueOf((Object) "'vjlui+j?5zw~59");
      assertNotNull(string0);
      assertEquals("'vjlui+j?5zw~59", string0);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = StringUtils.valueOf((Object) null);
      assertEquals("", string0);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = StringUtils.getJavaName("2esP?");
      assertNotNull(string0);
      assertEquals("2esp?", string0);
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = StringUtils.toUpperFirstChar("");
      assertEquals("", string0);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = StringUtils.getJavaName("");
      assertEquals("", string0);
  }

  @Test
  public void test31()  throws Throwable  {
      String string0 = StringUtils.replaceTokens("V*x{_dWSu0rBmFfT$#", (Collection) null, "V*x{_dWSu0rBmFfT$#", "V*x{_dWSu0rBmFfT$#");
      assertEquals("V*x{_dWSu0rBmFfT$#", string0);
  }

  @Test
  public void test32()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = StringUtils.replaceTokens("", (Collection) linkedList0, "", "");
      assertEquals("", string0);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = StringUtils.removeWhitespaces("Error while trying to output diagnostics about bad class '");
      assertEquals("Errorwhiletryingtooutputdiagnosticsaboutbadclass'", string0);
      assertNotNull(string0);
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = StringUtils.removeWhitespaces((String) null);
      assertNull(string0);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = StringUtils.reformat("Error while trying to output diagnostics about bad class '");
      assertEquals("Error while trying to output diagnostics about bad class ' ", string0);
      assertNotNull(string0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = StringUtils.reformat((String) null);
      assertNull(string0);
  }
}
