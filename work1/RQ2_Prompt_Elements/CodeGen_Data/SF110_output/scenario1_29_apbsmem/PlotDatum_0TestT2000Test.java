// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {

    PlotDatum_0Test() {	

    }
    
     /**
     * Test whether the {@code hasErrorBar()} method returns a true value for a
     * {@code PlotDatum}.
     */
     @Test
     public void hasErrorBars() {

        boolean errBars;
        errBars = PlotDatum.hasErrorBar();

        assert (errBars);

    }
	
}
