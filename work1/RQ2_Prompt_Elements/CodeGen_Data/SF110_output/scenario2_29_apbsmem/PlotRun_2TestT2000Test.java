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

    @Test
    void testRemove(){
/**         Integer index1 = 0;
 *         Integer index2 = 1;
    */
        int count1 = 10;
        int count2 = 20;
        
        List<PlotDatum> data1 = new ArrayList<PlotDatum>();
        List<PlotDatum> data2 = new ArrayList<PlotDatum>();
        
        for (int i=0; i < 10; ++i) {
            data1.add(new PlotDatum(i, 0));
            data2.add(new PlotDatum(i, 2));
        }
        
        // Remove the first element.
        data1.remove(count1);
        assertEquals(count1, data1.size());
        
        // Remove the last element.
        data1.remove(count2);
        assertEquals(count2, data1.size());
        
        // Remove the element at index 0.
        data1.remove(count1);
        assertEquals(count1, data1.size());
    }
}

