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
		
    /**
     * Tests the hasErrorBar() method; an unit test can't
     * use non-default settings -- but a default setting
     * is available.
     */
    @org.junit.jupiter.api.Test
    void testHasErrorBar() {
        assertFalse(PlotDatum.hasErrorBar(""), "hasErrorBar() should return false");
    }
	
    /**
     * Tests the toString() method; an unit test can't
     * use non-default settings -- but a default setting
     * is available.
     */
    @org.junit.jupiter.api.Test
    void testToString() {
        assertNotNull(PlotDatum.toString(""), "toString() should return a value not null");
    }
	
    /**
     * Tests the setToString() method; an unit test can't
     * use non-default settings -- but a default setting
     * is available.
     */
    @org.junit.jupiter.api.Test
    void testSetToString() {
        assertEquals(PlotDatum.toString(PlotDatum.toString("")), "", "setToString() should return a string");
    }
	
    /**
     * Tests another unit test can use the default settings.
     */
    @org.junit.jupiter.api.Test
    void testEqual() {
        Object a1 = new PlotDatum("Test1", 2, new Color(0, 1, 0), 2);
        Object a2 = new PlotDatum("Test2", 2, new Color(0, 1, 0), 2);
        assertEquals(a1, a2);
    }
	
}