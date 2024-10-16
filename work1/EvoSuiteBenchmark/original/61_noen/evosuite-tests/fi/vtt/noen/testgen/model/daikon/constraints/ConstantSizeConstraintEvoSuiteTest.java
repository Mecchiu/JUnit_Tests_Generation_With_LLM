/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.testgen.model.daikon.constraints;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.testgen.model.daikon.constraints.ConstantSizeConstraint;
import java.util.Collection;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ConstantSizeConstraintEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n");
      assertNotNull(constantSizeConstraint0);
      
      Collection<String> collection0 = constantSizeConstraint0.arrayNames();
      assertEquals("sizeof(reference:`|AF*zmWgCo) one of {if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;}", constantSizeConstraint0.toString());
      assertNotNull(collection0);
      assertEquals(1, collection0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "size(`|AF*zmWgCo?9@");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.toString();
      assertEquals("sizeof(reference:`|AF*zmWgCo) == reference:`|AF*zmWgCo", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "0");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.toString();
      assertNotNull(string0);
      assertEquals("sizeof(reference:size(=z/O9W8Io) == 0.0", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "size(size(=z/O9W8Io?9@");
      assertNotNull(constantSizeConstraint0);
      
      Collection<String> collection0 = constantSizeConstraint0.arrayNames();
      assertEquals("sizeof(reference:size(=z/O9W8Io) == reference:size(=z/O9W8Io", constantSizeConstraint0.toString());
      assertNotNull(collection0);
      assertEquals(false, collection0.isEmpty());
  }

  @Test
  public void test4()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "1}");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.toString();
      assertEquals("sizeof(reference:size(=z/O9W8Io) one of {1.0}", string0);
      assertNotNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "size(`|AF*zmWgCo?9@");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.toJava();
      assertNotNull(string0);
      assertEquals("    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n", string0);
  }

  @Test
  public void test6()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardMethod();
      assertNotNull(string0);
      assertEquals("  public boolean `|AF*zmWgCoSizeDoesNotEquals__if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;_() {\n    Collection validSizes = new HashSet();\n    validSizes.add(\"if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\");\n    if (validSizes.contains(new Double(`|AF*zmWgCo.size()))) {\n      return false;\n    }\n    return true;\n  }\n", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "0");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardMethod();
      assertNotNull(string0);
      assertEquals("  public boolean size(=z/O9W8IoSizeDoesNotEqual0() {\n    if (size(=z/O9W8Io.size() == 0.0) {\n      return false;\n    }\n    return true;\n  }\n", string0);
  }

  @Test
  public void test8()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "size(`|AF*zmWgCo?9@");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.asAssert("size(`|AF*zmWgCo?9@");
      assertEquals("sizeof(reference:`|AF*zmWgCo) == reference:`|AF*zmWgCo", constantSizeConstraint0.toString());
      assertNotNull(string0);
      assertEquals("assertEquals(`|AF*zmWgCo, size(`|AF*zmWgCo?9@.size());\n", string0);
  }

  @Test
  public void test9()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.asAssert("    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n");
      assertEquals("Collection validSizes = new HashSet();\nvalidSizes.add(\"if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\");\nassertTrue(validSizes.contains(new Double(    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n.size())));\n", string0);
      assertEquals("sizeof(reference:`|AF*zmWgCo) one of {if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;}", constantSizeConstraint0.toString());
      assertNotNull(string0);
  }

  @Test
  public void test10()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "size(`|AF*zmWgCo?9@");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardInvocation();
      assertNotNull(string0);
      assertEquals("sizeof(reference:`|AF*zmWgCo) == reference:`|AF*zmWgCo", constantSizeConstraint0.toString());
      assertEquals("  public boolean `|AF*zmWgCoSizeDoesNotEqual`|AF*zmWgCo() {\n    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n    return true;\n  }\n", constantSizeConstraint0.guardMethod());
  }

  @Test
  public void test11()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "0");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardInvocation();
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals("sizeof(reference:size(=z/O9W8Io) == 0.0", constantSizeConstraint0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(`|AF*zmWgCo?9@", "    if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;\n    }\n");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardInvocation();
      assertNotNull(string0);
      assertEquals("sizeof(reference:`|AF*zmWgCo) one of {if (`|AF*zmWgCo.size() == `|AF*zmWgCo) {\n      return false;}", constantSizeConstraint0.toString());
      assertEquals("", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      ConstantSizeConstraint constantSizeConstraint0 = new ConstantSizeConstraint("size(size(=z/O9W8Io?9@", "1}");
      assertNotNull(constantSizeConstraint0);
      
      String string0 = constantSizeConstraint0.guardInvocation();
      assertEquals("    if(size(=z/O9W8Io.isEmpty()) return false;\n", string0);
      assertEquals("    Collection validSizes = new HashSet();\n    validSizes.add(1.0);\n    if (validSizes.contains(new Double(size(=z/O9W8Io.size()))) {\n      return false;\n    }\n", constantSizeConstraint0.toJava());
      assertNotNull(string0);
  }
}
