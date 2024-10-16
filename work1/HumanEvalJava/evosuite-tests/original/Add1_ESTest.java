/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 21:13:48 GMT 2023
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
import original.Add1;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Add1_ESTest extends Add1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      Integer integer0 = new Integer((-2569));
      linkedList0.add(integer0);
      int int0 = Add1.add(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1928);
      linkedList0.offerFirst(integer0);
      linkedList0.add(integer0);
      int int0 = Add1.add(linkedList0);
      assertEquals(1928, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-376));
      linkedList0.add(integer0);
      linkedList0.add(integer0);
      int int0 = Add1.add(linkedList0);
      assertEquals((-376), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      List<Integer> list0 = linkedList0.subList(0, 0);
      linkedList0.addFirst(integer0);
      // Undeclared exception!
      try { 
        Add1.add(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        Add1.add(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.Add1", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.offerFirst(integer0);
      linkedList0.offerFirst(integer0);
      linkedList0.add(integer0);
      Integer integer1 = new Integer(7);
      linkedList0.add(integer1);
      int int0 = Add1.add(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Add1 add1_0 = new Add1();
  }
}
