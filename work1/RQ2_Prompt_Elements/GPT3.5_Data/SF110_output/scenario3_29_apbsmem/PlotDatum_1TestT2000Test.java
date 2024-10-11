// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
    
    /**
     * Test case for when the datum is connected to the previous one.
     */
    @Test
    void testConnectedTrue() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum2.setConnected(true);
        assertTrue(datum2.connected());
    }
    
    /**
     * Test case for when the datum is not connected to the previous one.
     */
    @Test
    void testConnectedFalse() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum2.setConnected(false);
        assertFalse(datum2.connected());
    }
    
    /**
     * Test case for when the datum is not connected to the previous one and no previous datum exists.
     */
    @Test
    void testConnectedFalseNoPrevious() {
        PlotDatum datum = new PlotDatum();
        datum.setConnected(false);
        assertFalse(datum.connected());
    }
    
    /**
     * Test case for when the datum is connected to the previous one and no previous datum exists.
     */
    @Test
    void testConnectedTrueNoPrevious() {
        PlotDatum datum = new PlotDatum();
        datum.setConnected(true);
        assertTrue(datum.connected());
    }
    
    /**
     * Test case for when the datum is connected to the previous one and the previous datum is also connected.
     */
    @Test
    void testConnectedTruePreviousConnected() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(true);
        datum2.setConnected(true);
        assertTrue(datum2.connected());
    }
    
    /**
     * Test case for when the datum is not connected to the previous one and the previous datum is also not connected.
     */
    @Test
    void testConnectedFalsePreviousNotConnected() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(false);
        datum2.setConnected(false);
        assertFalse(datum2.connected());
    }
    
    /**
     * Test case for when the datum is connected to the previous one and the previous datum is not connected.
     */
    @Test
    void testConnectedTruePreviousNotConnected() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(false);
        datum2.setConnected(true);
        assertTrue(datum2.connected());
    }
    
    /**
     * Test case for when the datum is not connected to the previous one and the previous datum is connected.
     */
    @Test
    void testConnectedFalsePreviousConnected() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(true);
        datum2.setConnected(false);
        assertFalse(datum2.connected());
    }
    
    /**
     * Test case for when the datum is connected to the previous one and the previous datum is also connected, but with a different color.
     */
    @Test
    void testConnectedTruePreviousConnectedDifferentColor() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(true);
        datum1.setColor(Color.RED);
        datum2.setConnected(true);
        datum2.setColor(Color.BLUE);
        assertFalse(datum2.connected());
    }
    
    /**
     * Test case for when the datum is connected to the previous one and the previous datum is also connected, with the same color.
     */
    @Test
    void testConnectedTruePreviousConnectedSameColor() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        datum1.setConnected(true);
        datum1.setColor(Color.RED);
        datum2.setConnected(true);
        datum2.setColor(Color.RED);
        assertTrue(datum2.connected());
    }
}