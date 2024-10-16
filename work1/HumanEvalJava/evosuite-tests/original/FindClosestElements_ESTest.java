/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 21:43:55 GMT 2023
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
import original.FindClosestElements;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FindClosestElements_ESTest extends FindClosestElements_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.add(double0);
      linkedList0.add(double0);
      Double double1 = new Double((-2841.33523963));
      linkedList0.add(double1);
      List<Double> list0 = FindClosestElements.findClosestElements(linkedList0);
      assertFalse(list0.contains((-2841.33523963)));
      assertTrue(list0.contains(0.0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      List<Double> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Double) null);
      // Undeclared exception!
      try { 
        FindClosestElements.findClosestElements(list0);
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
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      linkedList0.add((Double) null);
      linkedList0.add((Double) null);
      // Undeclared exception!
      try { 
        FindClosestElements.findClosestElements(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.FindClosestElements", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.add(double0);
      linkedList0.add(double0);
      linkedList0.add(double0);
      List<Double> list0 = FindClosestElements.findClosestElements(linkedList0);
      assertTrue(list0.contains(0.0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(0.0);
      linkedList0.add(double0);
      List<Double> list0 = FindClosestElements.findClosestElements(linkedList0);
      assertFalse(list0.contains(0.0));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FindClosestElements findClosestElements0 = new FindClosestElements();
  }
}
