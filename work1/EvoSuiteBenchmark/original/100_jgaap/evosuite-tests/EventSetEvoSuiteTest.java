/*
 * This file was automatically generated by EvoSuite
 */


import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class EventSetEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      EventSet eventSet0 = new EventSet();
      // Undeclared exception!
      try {
        eventSet0.eventAt(0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * Array index out of range: 0
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      LinkedList<Event> linkedList0 = new LinkedList<Event>();
      EventSet eventSet0 = new EventSet((List<Event>) linkedList0);
      int int0 = eventSet0.size();
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      LinkedList<Event> linkedList0 = new LinkedList<Event>();
      EventSet eventSet0 = new EventSet((List<Event>) linkedList0);
      eventSet0.setAuthor("fwsxSbK?F");
      assertEquals("", eventSet0.toString());
  }

  @Test
  public void test3()  throws Throwable  {
      EventSet eventSet0 = new EventSet();
      // Undeclared exception!
      try {
        eventSet0.subset(1085, 1085);
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * toIndex = 1085
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      LinkedList<Event> linkedList0 = new LinkedList<Event>();
      EventSet eventSet0 = new EventSet((List<Event>) linkedList0);
      String string0 = eventSet0.getAuthor();
      assertNull(string0);
  }

  @Test
  public void test5()  throws Throwable  {
      Vector<Event> vector0 = new Vector<Event>();
      Event event0 = new Event("");
      vector0.add(event0);
      EventSet eventSet0 = new EventSet((List<Event>) vector0);
      String string0 = eventSet0.toString();
      assertNotNull(string0);
      assertEquals(", ", string0);
  }
}
