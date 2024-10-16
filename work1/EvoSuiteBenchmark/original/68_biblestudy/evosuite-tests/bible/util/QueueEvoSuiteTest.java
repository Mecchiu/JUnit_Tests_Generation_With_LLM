/*
 * This file was automatically generated by EvoSuite
 */

package bible.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import bible.util.Queue;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class QueueEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Queue queue0 = new Queue((-1935));
      int int0 = queue0.getPeakNumberItems();
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1935, getObjects()=[]\r\n]", queue0.toString());
      assertEquals(0, int0);
  }

  @Test
  public void test1()  throws Throwable  {
      Queue queue0 = new Queue();
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]", queue0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      int int0 = queue0.getNumberItems();
      assertEquals(0, int0);
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]", queue0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      queue0.enqueue((Object) "bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]");
      Object object0 = new Object();
      queue0.enqueue(object0);
      queue0.dequeue();
      assertEquals(1, queue0.getNumberItems());
      assertEquals(2, queue0.getPeakNumberItems());
  }

  @Test
  public void test4()  throws Throwable  {
      Queue queue0 = new Queue(1015);
      queue0.refreshElement((Object) null);
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=1015, getObjects()=[]\r\n]", queue0.toString());
      assertEquals(0, queue0.getPeakNumberItems());
  }

  @Test
  public void test5()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      Object object0 = new Object();
      queue0.enqueue(object0);
      queue0.refreshElement(object0);
      assertEquals(1, queue0.getNumberItems());
  }

  @Test
  public void test6()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      queue0.enqueue((Object) "bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]");
      queue0.dequeue();
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=1, maxCapacity=-1, getObjects()=[]\r\n]", queue0.toString());
  }

  @Test
  public void test7()  throws Throwable  {
      Queue queue0 = new Queue((-1935));
      queue0.dequeue();
      assertEquals(-1, queue0.getNumberItems());
      assertEquals(0, queue0.getPeakNumberItems());
  }

  @Test
  public void test8()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      Object object0 = new Object();
      queue0.enqueue((Object) "bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]");
      Object object1 = new Object();
      queue0.enqueue(object0);
      queue0.refreshElement(object1);
      assertEquals(3, queue0.getPeakNumberItems());
      assertEquals(3, queue0.getNumberItems());
  }

  @Test
  public void test9()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      queue0.enqueue((Object) "bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]");
      Object object0 = new Object();
      queue0.enqueue(object0);
      queue0.enqueue(object0);
      queue0.refreshElement(object0);
      assertEquals(3, queue0.getPeakNumberItems());
      assertEquals(2, queue0.getNumberItems());
  }

  @Test
  public void test10()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      Object object0 = new Object();
      queue0.refreshElement(object0);
      queue0.toString();
      assertEquals(1, queue0.getNumberItems());
      assertEquals(false, queue0.maxCapacityExceeded());
  }

  @Test
  public void test11()  throws Throwable  {
      Queue queue0 = new Queue(1015);
      boolean boolean0 = queue0.maxCapacityExceeded();
      assertEquals(false, boolean0);
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=1015, getObjects()=[]\r\n]", queue0.toString());
  }

  @Test
  public void test12()  throws Throwable  {
      Queue queue0 = new Queue((-1));
      boolean boolean0 = queue0.maxCapacityExceeded();
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-1, getObjects()=[]\r\n]", queue0.toString());
      assertEquals(false, boolean0);
  }

  @Test
  public void test13()  throws Throwable  {
      Queue queue0 = new Queue((-552));
      boolean boolean0 = queue0.maxCapacityExceeded();
      assertEquals(true, boolean0);
      assertEquals("bible.util.Queue:[numItems=0, maxNumItems=0, maxCapacity=-552, getObjects()=[]\r\n]", queue0.toString());
  }
}
