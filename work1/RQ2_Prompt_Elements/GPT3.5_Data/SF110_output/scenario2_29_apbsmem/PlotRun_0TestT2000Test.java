// Here is the source code for the PlotRun_0Test class:

package jahuwaldt.plot;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link PlotRun}.
 * It contains ten unit test cases for the {@link PlotRun#size()} method.
 */
class PlotRun_0Test {

    /**
     * Test of size method, of class PlotRun.
     */
    @Test
    void testSize() {
        // Test case 1: Empty run
        PlotRun run = new PlotRun();
        assertEquals(0, run.size());

        // Test case 2: Single datum in run
        run.add(new PlotDatum(1.0, 2.0));
        assertEquals(1, run.size());

        // Test case 3: Multiple data in run
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        assertEquals(3, run.size());

        // Test case 4: Clearing the run
        run.clear();
        assertEquals(0, run.size());

        // Test case 5: Adding null datum to run
        run.add(null);
        assertEquals(1, run.size());

        // Test case 6: Adding null datum to non-empty run
        run.add(new PlotDatum(1.0, 2.0));
        run.add(null);
        assertEquals(3, run.size());

        // Test case 7: Removing datum from run
        run.remove(1);
        assertEquals(2, run.size());

        // Test case 8: Removing all data from run
        run.clear();
        assertEquals(0, run.size());

        // Test case 9: Adding data using addAll method
        List<PlotDatum> dataList = new ArrayList<>();
        dataList.add(new PlotDatum(1.0, 2.0));
        dataList.add(new PlotDatum(2.0, 3.0));
        dataList.add(new PlotDatum(3.0, 4.0));
        run.addAll(dataList);
        assertEquals(3, run.size());

        // Test case 10: Adding data using addAll method with null element
        dataList.add(null);
        run.addAll(dataList);
        assertEquals(7, run.size());
    }
}