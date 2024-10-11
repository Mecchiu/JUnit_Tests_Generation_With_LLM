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
	* Test of add() method, of class jahuwaldt.plot.PlotDatum.
	*/
    @Test
	public void testAddConstructors() {
        PlotDatum p = new PlotDatum();
	}

	/**
	* Test of {@link PlotDatum#getColor()} method, creating instance.
	*/
    @Test
	public void testGetColor() {
        PlotDatum p = new PlotDatum(Color.RED);
		assertNotNull(p.getColor());
	}

	/**
	* Test of {@link PlotDatum#setColor(Color)} method, creating instance.
	*/
    @Test
	public void testSetColor() {
        Color b = new Color(0, 0, 0, 0);
        PlotDatum p = new PlotDatum(b);
		assertFalse(p instanceof PlotDatum); // can't set a color!
		p.setColor(Color.BLUE);
	}

    /**
	* Test of {@link PlotDatum#getY()} method, creating instance.
	*/
    @Test
	public void testGetY() {
        PlotDatum p = new PlotDatum(Color.CYAN);
		assertNotNull(p.getY());
	}
    
    /**
	* Test of {@link PlotDatum#setX(double)} method, creating instance.
	*/
    @Test
	public void testSetX() {
        double[] x = {1,2,3,4};
        PlotDatum p = new PlotDatum(x);
        assertEquals(p.getX(), x[0], 0);
        assertEquals(p.getX(), x[1], 0);
        assertEquals(p.getX(), x[2], 0);
        p.setX(3.7);
	}

}