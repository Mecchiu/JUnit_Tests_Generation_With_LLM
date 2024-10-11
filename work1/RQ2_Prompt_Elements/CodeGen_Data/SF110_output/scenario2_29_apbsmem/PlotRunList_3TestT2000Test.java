// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
/**
		 * Test the iterator method for a run list. Check the
		 * following conditions:
		 * <ul>
		   <li>a run has fewer plots in it than it should have.</li>
		              <li>an runs list has fewer plots than it should have.</li></ul>
		   <p>
		   The test case is executed by <code>$ java -cp /Users/t.a.ciao/Projects/Plot/tests/src/jahuwaldt</code>
		</p>
		*/
	@Test
        public <T extends Run> void test0() {

        List runs = new ArrayList();
        T start = new T(0f, 0, 0);
        for (int i = 0f; i < 5; i++) {
            runs.add(new PlotRun(start, new PlotDatum((long) 5)));
            start.setZ((long) 5);
            start.setX((long) 10);
        }

        int last = ((PlotData) runs.get(runs.size()-1)).getNumber();
        int size = runs.size();

        assertEquals(size, runs.size());
        // now make sure that everything is the same

        for (int count=size-1; count >= 0; count--) {
            int run_number = ((PlotRun) runs.get(count)).getNumber();
            int run_start, run_end, step, length;
            
            run_start = ((PlotRun) runs.get(count)).getStart();
            if (count < last) {
                // The start position is at this point
                run_end = start.getNumber();
            } else {
                // The start position is now at the last position we expect.
                run_end = last;
            }

            step = run_start - run_end;
            length = step / size;

            //System.out.println(run_start + " --> " + run_end + " -- " + length);
            
            // Check that things are consistent
            assertEquals("Plots are different in run [" + count + "] (" + run_start + ", "+run_end+"), "+run_number + ":"
                    + " runs, run_start="+run_start+", run_length="+length, runs.size(), count);

            start = ((PlotRun) runs.get(count)).getStart();
            if (count >= last) {
                // the last position is at the end, so we assert this
                assertEquals("Plots are different in run [" + count + "] (run_end, "+run_end+")"), count+1, runs.size());
            }
            if (count < last) {
                // The end position is now at the last position we expect.
                assertEquals("Plots are different in run [" + count + "] (" + run_start + ", "+run_end+")"), count+1, runs.size());
            }
            //System.out.println(size+" run numbers are the same")
        }
		}
}
