/*
 * This file was automatically generated by EvoSuite
 */

package fi.vtt.noen.testgen.model.daikon.constraints;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import fi.vtt.noen.testgen.model.daikon.constraints.ArrayElementsConstraint;
import java.util.Collection;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArrayElementsConstraintEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ArrayElementsConstraint arrayElementsConstraint0 = new ArrayElementsConstraint("`RI@&`Xq?8", "`RI@&`Xq?8");
      assertNotNull(arrayElementsConstraint0);
      
      Collection<String> collection0 = arrayElementsConstraint0.arrayNames();
      assertNotNull(collection0);
      assertEquals(false, collection0.isEmpty());
      assertEquals(false, arrayElementsConstraint0.isEnabled());
  }

  @Test
  public void test1()  throws Throwable  {
      ArrayElementsConstraint arrayElementsConstraint0 = new ArrayElementsConstraint("`RI@&`Xq?8", "`RI@&`Xq?8");
      assertNotNull(arrayElementsConstraint0);
      
      String string0 = arrayElementsConstraint0.guardName();
      assertNotNull(string0);
      assertEquals("`RI@&`XqAreDifferentFrom`RI@&`Xq", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      ArrayElementsConstraint arrayElementsConstraint0 = new ArrayElementsConstraint("`RI@&`Xq?8", "`RI@&`Xq?8");
      assertNotNull(arrayElementsConstraint0);
      
      String string0 = arrayElementsConstraint0.asAssert("`RI@&`Xq?8");
      assertEquals("reference:`RI@&`Xq elements == `RI@&`Xq", arrayElementsConstraint0.toString());
      assertNotNull(string0);
      assertEquals("for (Object o : `RI@&`Xq?8) {\n  assertEquals(`RI@&`Xq, o);\n}\n", string0);
  }

  @Test
  public void test3()  throws Throwable  {
      ArrayElementsConstraint arrayElementsConstraint0 = new ArrayElementsConstraint("`RI@&`Xq?8", "`RI@&`Xq?8");
      assertNotNull(arrayElementsConstraint0);
      
      String string0 = arrayElementsConstraint0.toJava();
      assertNotNull(string0);
      assertEquals("  public boolean `RI@&`XqAreDifferentFrom`RI@&`Xq() {\n    Object expected = `RI@&`Xq;\n    for (Object o : `RI@&`Xq) {\n      if (expected.equals(o)) {\n        return false;\n      }\n    }\n    return true;\n  }\n", arrayElementsConstraint0.guardMethod());
      assertEquals("    Object expected = `RI@&`Xq;\n    for (Object o : `RI@&`Xq) {\n      if (expected.equals(o)) {\n        return false;\n      }\n    }\n", string0);
  }

  @Test
  public void test4()  throws Throwable  {
      ArrayElementsConstraint arrayElementsConstraint0 = new ArrayElementsConstraint("`RI@&`Xq?8", "`RI@&`Xq?8");
      assertNotNull(arrayElementsConstraint0);
      
      String string0 = arrayElementsConstraint0.toString();
      assertEquals("reference:`RI@&`Xq elements == `RI@&`Xq", string0);
      assertNotNull(string0);
  }
}
