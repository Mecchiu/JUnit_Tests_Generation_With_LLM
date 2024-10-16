/*
 * This file was automatically generated by EvoSuite
 */

package freemind.controller.filter.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import freemind.controller.filter.util.SortedMapVector;
import java.util.NoSuchElementException;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class SortedMapVectorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      int int0 = sortedMapVector0.add((Comparable) 0, object0);
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      sortedMapVector0.getValue(0);
      assertEquals(10, sortedMapVector0.capacity());
  }

  @Test
  public void test2()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.clear();
      assertEquals(0, sortedMapVector0.capacity());
  }

  @Test
  public void test3()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      int int0 = sortedMapVector0.capacity();
      assertEquals(0, int0);
  }

  @Test
  public void test4()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      // Undeclared exception!
      try {
        sortedMapVector0.remove(1276);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * 1276 >= 0
         */
      }
  }

  @Test
  public void test5()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      // Undeclared exception!
      try {
        sortedMapVector0.getKey(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 0
         */
      }
  }

  @Test
  public void test6()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      // Undeclared exception!
      try {
        sortedMapVector0.getValue((Comparable) "0");
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) 0, (Object) "Zl");
      sortedMapVector0.getValue((Comparable) 0);
      assertEquals(10, sortedMapVector0.capacity());
  }

  @Test
  public void test8()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      boolean boolean0 = sortedMapVector0.containsKey((Comparable) 0);
      assertEquals(false, boolean0);
      assertEquals(0, sortedMapVector0.capacity());
  }

  @Test
  public void test9()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) 0, (Object) "Zl");
      int int0 = sortedMapVector0.indexOf((Comparable) (-467));
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals((-1), int0);
  }

  @Test
  public void test10()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) (-15), (Object) (-1));
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      sortedMapVector0.add((Comparable) 1276, (Object) "2353");
      sortedMapVector0.add((Comparable) (-1), (Object) 2);
      boolean boolean0 = sortedMapVector0.containsKey((Comparable) (-15));
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals(true, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) (-15), (Object) (-1));
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      sortedMapVector0.add((Comparable) 1276, (Object) "2353");
      sortedMapVector0.add((Comparable) (-1), (Object) 2);
      boolean boolean0 = sortedMapVector0.remove((Comparable) 1);
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals(false, boolean0);
  }

  @Test
  public void test12()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) (-15), (Object) (-1));
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      sortedMapVector0.add((Comparable) 1276, (Object) "2353");
      int int0 = sortedMapVector0.indexOf((Comparable) 1259);
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals((-1), int0);
  }

  @Test
  public void test13()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      sortedMapVector0.add((Comparable) (-15), (Object) (-1));
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      sortedMapVector0.add((Comparable) 1276, (Object) "2353");
      int int0 = sortedMapVector0.indexOf((Comparable) 1276);
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals(2, int0);
  }

  @Test
  public void test14()  throws Throwable  {
      SortedMapVector sortedMapVector0 = new SortedMapVector();
      Object object0 = new Object();
      sortedMapVector0.add((Comparable) 0, object0);
      boolean boolean0 = sortedMapVector0.remove((Comparable) 0);
      assertEquals(10, sortedMapVector0.capacity());
      assertEquals(true, boolean0);
  }
}
