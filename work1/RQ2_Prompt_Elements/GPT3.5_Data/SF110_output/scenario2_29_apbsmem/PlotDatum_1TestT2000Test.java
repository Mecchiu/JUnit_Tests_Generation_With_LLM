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
     * Test case to verify that a new PlotDatum is not connected by default.
     */
    @Test
    void testNotConnectedByDefault() {
        PlotDatum datum = new PlotDatum();
        assertFalse(datum.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be set to be connected.
     */
    @Test
    void testSetConnected() {
        PlotDatum datum = new PlotDatum();
        datum.setConnected(true);
        assertTrue(datum.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be set to be not connected.
     */
    @Test
    void testSetNotConnected() {
        PlotDatum datum = new PlotDatum();
        datum.setConnected(false);
        assertFalse(datum.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be cloned and the clone is not connected by default.
     */
    @Test
    void testCloneNotConnectedByDefault() {
        PlotDatum datum = new PlotDatum();
        PlotDatum clone = datum.clone();
        assertFalse(clone.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be cloned and the clone can be set to be connected.
     */
    @Test
    void testCloneSetConnected() {
        PlotDatum datum = new PlotDatum();
        PlotDatum clone = datum.clone();
        clone.setConnected(true);
        assertFalse(datum.connected());
        assertTrue(clone.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be cloned and the original can be set to be connected.
     */
    @Test
    void testCloneOriginalSetConnected() {
        PlotDatum datum = new PlotDatum();
        PlotDatum clone = datum.clone();
        datum.setConnected(true);
        assertFalse(clone.connected());
        assertTrue(datum.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be serialized and deserialized and is not connected by default.
     */
    @Test
    void testSerializationNotConnectedByDefault() throws Exception {
        PlotDatum datum = new PlotDatum();
        byte[] serialized = SerializationUtils.serialize(datum);
        PlotDatum deserialized = (PlotDatum) SerializationUtils.deserialize(serialized);
        assertFalse(deserialized.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be serialized and deserialized and can be set to be connected.
     */
    @Test
    void testSerializationSetConnected() throws Exception {
        PlotDatum datum = new PlotDatum();
        byte[] serialized = SerializationUtils.serialize(datum);
        PlotDatum deserialized = (PlotDatum) SerializationUtils.deserialize(serialized);
        deserialized.setConnected(true);
        assertFalse(datum.connected());
        assertTrue(deserialized.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be serialized and deserialized and the original can be set to be connected.
     */
    @Test
    void testSerializationOriginalSetConnected() throws Exception {
        PlotDatum datum = new PlotDatum();
        byte[] serialized = SerializationUtils.serialize(datum);
        PlotDatum deserialized = (PlotDatum) SerializationUtils.deserialize(serialized);
        datum.setConnected(true);
        assertFalse(deserialized.connected());
        assertTrue(datum.connected());
    }
    
    /**
     * Test case to verify that a PlotDatum can be compared to another PlotDatum and they are equal if they have the same connected flag.
     */
    @Test
    void testEquals() {
        PlotDatum datum1 = new PlotDatum();
        PlotDatum datum2 = new PlotDatum();
        assertTrue(datum1.equals(datum2));
        datum1.setConnected(true);
        assertFalse(datum1.equals(datum2));
        datum2.setConnected(true);
        assertTrue(datum1.equals(datum2));
    }
    
    /**
     * Test case to verify that a PlotDatum can be compared to a non-PlotDatum object and they are not equal.
     */
    @Test
    void testNotEquals() {
        PlotDatum datum = new PlotDatum();
        assertFalse(datum.equals(new Object()));
    }
}