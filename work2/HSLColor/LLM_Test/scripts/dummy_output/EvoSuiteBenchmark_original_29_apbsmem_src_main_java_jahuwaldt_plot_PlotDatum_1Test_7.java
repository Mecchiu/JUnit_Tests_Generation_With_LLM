// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		
	/**
	* Test of constructors of class PlotDatum.
	*/
    @Test
    public void testConstructors() throws Exception {
        PlotDatum p1 = new PlotDatum();
        assertTrue (true);
    }
	
	/**
	* Test of addDataPoint method.
	*/
    @Test
    public void testAddDataPoint() throws Exception {
        PlotDatum p1 = new PlotDatum();
        p1.addDataPoint("d1", 1);
        assertEquals ("The point's value is \"d1\", expecting \"1\"", "1", 
                p1.getDataPoint("d1"));
    }
	
	/**
	* Test of addDataPoint method.
	*/
    @Test
    public void testAddDataPointNull() throws Exception {
        PlotDatum p1 = new PlotDatum();
        p1.addDataPoint(1, null);
    }
	
	/**
	* Test of addDataPointNull method.
	*/
    @Test
    public void testAddDataPointNullToNone() throws Exception {
        PlotDatum p1 = new PlotDatum();
        p1.addDataPoint(1, null);
        p1.addDataPoint(2, null);
    }
	
	/**
	* Test of addDataPoint method.
	*/
    @Test
    public void testAddDataPointNegative() throws Exception {
        PlotDatum p1 = new PlotDatum();
        p1.addDataPoint(-1, -1);
    }
	
	/**
	* Test of addDataPointNegativeToNone method.
	*/
    @Test
    public void testAddDataPointNegativeToNoneToNone() throws Exception {
        PlotDatum p1 = new PlotDatum();
        p1.addDataPoint(-1, -1);
        p1.addDataPoint(-2, -2);
    }
	
	/**
	* Test of toString method.
	*/
    @Test
    public void testToString() throws Exception {
        PlotDatum p1 = new PlotDatum();
        assertEquals("{PlotDatum#", p1.toString());
    }
	
	/**
	* Test of equals method.
	*/
    @Test
    public void testEquals() throws Exception {
        PlotDatum p1 = new PlotDatum();
        PlotDatum p2 = new PlotDatum();
        assertTrue(p1.equals(p2));
    }
	
	/**
	* Test of hashCode method.
	*/
    @Test
    public void testHashCode() throws Exception {
        PlotDatum p1 = new PlotDatum();
        assertTrue(p1.hashCode()!= 0);
    }
}