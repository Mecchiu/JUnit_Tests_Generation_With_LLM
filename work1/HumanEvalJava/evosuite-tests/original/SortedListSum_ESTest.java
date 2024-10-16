/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:53:19 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.SortedListSum;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SortedListSum_ESTest extends SortedListSum_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("\"UD/'g44Q,wirD?I");
      List<Object> list0 = SortedListSum.sortedListSum(linkedList0);
      assertTrue(list0.contains("\"UD/'g44Q,wirD?I"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      linkedList0.add("7BZjHXv _G");
      // Undeclared exception!
      try { 
        SortedListSum.sortedListSum(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String[] stringArray0 = new String[1];
      linkedList0.add(stringArray0[0]);
      // Undeclared exception!
      try { 
        SortedListSum.sortedListSum(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.SortedListSum", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("");
      linkedList0.add("");
      List<Object> list0 = SortedListSum.sortedListSum(linkedList0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("mA.");
      List<Object> list0 = SortedListSum.sortedListSum(linkedList0);
      assertFalse(list0.contains("mA."));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SortedListSum sortedListSum0 = new SortedListSum();
  }
}
