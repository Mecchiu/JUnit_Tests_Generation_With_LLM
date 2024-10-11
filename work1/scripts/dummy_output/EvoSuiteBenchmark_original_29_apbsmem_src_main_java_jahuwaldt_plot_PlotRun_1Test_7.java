// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {
		
   class F1 {}
    
   class F2 {
      void m() {
      }
 
      void f1() {
      }
   }
   class F3 {
      void m() {
      }
      void f1() {
      }
   }
   class F4 {
      void m() {
      }
      void f1() {
      }
   }
   class F5 {
     void m();
     void f1();
   }

   @Test
  public void test_f1() {
    F5 f = new F5();
    PlotRun run = new PlotRun(new PlotDatum[] { f });
    assertEquals(10, run.size());
  }
  
  @Test
  public void test_new_clone() {
    F5 f = new F5();
    new PlotRun(new PlotDatum[] { f });
    assertEquals(10, new PlotRun(new PlotDatum[] { f }).size());
    
    PlotRun fNew = new PlotRun(new PlotDatum[] { f });
    assertNotSame(f, fNew);
    assertEquals(10, new PlotRun(new PlotDatum[] { f }).size());
  }

	@Test
  public void test_add() {
    F5 f = new F5();
    new PlotRun(new PlotDatum[] { f });
    new PlotRun(new PlotDatum[] { f });
    ArrayList list = new ArrayList();
    assertEquals(10, new PlotRun(new PlotDatum[] { f }).size());
    list.add(f);
    assertEquals(10, new PlotRun(new PlotDatum[] { f }).size());
    arraysToTestEquivalents(list, f);
    list.addAll(f);
    arraysToTestEquivalents(list, f);
    list.add(f);
}
}