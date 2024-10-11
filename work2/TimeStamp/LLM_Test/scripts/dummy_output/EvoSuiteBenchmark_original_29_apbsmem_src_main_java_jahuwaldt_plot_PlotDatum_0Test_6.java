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
	 *  Tests if the hasErrorBar method returns true for a valid data point.
	 */
	@Test
	public void testPlotDatum() {
        
		System.out.println ("PlotDatum_0Test");
        PlotDatum p = new PlotDatum();
        Color col = (Color)p.get(0);
        System.out.println(col);
        assertEquals("PlotDatum.hasErrorBar() Error Bar is not checked.", false,
                                           p.hasErrorBar());
		int val = (Integer)p.get(0);
		assertEquals("PlotDatum.get() 1 Error Bar is not checked.",
                                   Color.blue, new Integer(val));
	}

	/**
	 *  Tests if the hasErrorBar method returns true for a valid data point.
	 */
	@Test
	public void testPlotDatumClone() {
	
		// make a PlotDatum()
        PlotDatum p = new PlotDatum();
        Color col = (Color)p.get(0);
        p.setColor(col);
        Color col2 = (Color)p.clone();
        assertTrue("plotDatumClone() Error. get() not called clone() correctly.",
                      p.get((Integer)null).equals(col2));
	}

    
    
    /**
	<p> Tests if two data points of the same unit and value <b>cannot
	</b> have the same {@link PlotDatum#hasErrorBar()} method return
	<b>false</b>.
     */
    @Test
    public void testHashCode() {
	
		int value = (new Integer(42)).hashCode();
		Object obj = value;
		boolean equals = obj.equals(value);
		assertFalse("hashCode() is not defined for data points.", equals);

		PlotDatum p1 = new PlotDatum();
		PlotDatum p2 = new PlotDatum();
		p1.setValue(value);
		p2.setValue(value);
    }

	// PlotDatum_0.java
    @Test
	public void testEquals() {
		
		PlotDatum p1 = new PlotDatum();
		assertEquals(p1, p1);
		PlotDatum p2 = new PlotDatum(Color.green);
		assertNotEquals(p1, p2);
		p2.setColor(p1.getColor());
		assertEquals(p1, p2);
		p2.setColor(Color.blue);
		assertNotEquals(p1, p2);
		p2.setValue(new Integer(3));
		assertNotEquals(p1, p2);
		p2.setValue(3);
		assertEquals(p1, p2);
	}
    
	// PlotDatum_0.java
	@Test
	public void testParallelHashCode() {
		
		PlotDatum p1 = new PlotDatum();
		PlotDatum p2 = new PlotDatum();
		p1.setColor(p2.getColor());
		p1.setValue(p2.getValue());
		p2.setColor(p1.getColor());
		p2.setValue(p1.getValue());
		
		int objHashcode = (new Integer(3)).hashCode();
		int objParallelHashcode = p2.hashCode();

		assertEquals("Number of Objects of parallel hashcode.", objParallelHashcode, objHashcode);
	}

	// PlotDatum_0.java
	@Test
	public void testConstructor() {
	
		PlotDatum p1 = new PlotDatum(Color.red);
        Color c1 = p1.getColor();
        assertEquals(Color.red, c1);

        Integer val = (new Integer(3)).hashCode();
        p1.setValue(val);

        Color c2 = p1.getColor();
        assertEquals(Color.red, c2);
	}
}