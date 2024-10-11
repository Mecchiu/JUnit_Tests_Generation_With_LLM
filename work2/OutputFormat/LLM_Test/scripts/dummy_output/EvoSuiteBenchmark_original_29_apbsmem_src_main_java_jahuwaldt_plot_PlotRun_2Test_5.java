// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		
  /**
   * Do unit tests.
   */
  @Test
    void run() {
      PlotRun r1 = new PlotRun();
      PlotSet s1 = new PlotSet();
      Object o;
      double d=0.5;

      assertNotNull(s1);

      o = s1.elementAt(0);
      assertTrue(o instanceof PlotDatum);
      assertEquals(d, ((PlotDatum) o).getMinX(), 0);
      assertEquals(d, ((PlotDatum) o).getMaxX(), 0);

      o = s1.elementAt(1);
      assertTrue(o instanceof PlotDatum);
      assertEquals(d, ((PlotDatum) o).getMinY(), 0);
      assertEquals(d, ((PlotDatum) o).getMaxY(), 0);
      assertEquals(r1.size(), 2);

      r1 = null;
      d=0.5;
      s1 = null;

      o = s1.elementAt(0);
      assertTrue(o instanceof PlotDatum);
      assertEquals(d, ((PlotDatum) o).getMinX(), 1.5);
      assertEquals(d, ((PlotDatum) o).getMaxX(), 1.5);
      assertEquals(r1.size(), 1);
      d = 0.5;
      r1 = null;
    }
  
}