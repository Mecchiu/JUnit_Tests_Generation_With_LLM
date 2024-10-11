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
     * Test case for {@link PlotRun#remove(int)}.
     * @throws java.lang.Exception
     */
    @Test
    public final void test_remove() throws Exception {

      PlotRun run = new PlotRun(new double[]{3.0, 2.0, -2.0, 1.0});
      run.data = Arrays.asList( new PlotDatum((Color)null, "1", "Hello"),
                                new PlotDatum((Color)null, "2", "World"),
                                new PlotDatum((Color)null, "3", "Goodbye") );

      run.setTitle( "First test" );
      
      run.remove(2);
      assertEquals(run.size(), 0);
      
      run.setTitle( "Second test" );

      run.remove(1);
      
      assertEquals(run.size(), 0);
  }

}

