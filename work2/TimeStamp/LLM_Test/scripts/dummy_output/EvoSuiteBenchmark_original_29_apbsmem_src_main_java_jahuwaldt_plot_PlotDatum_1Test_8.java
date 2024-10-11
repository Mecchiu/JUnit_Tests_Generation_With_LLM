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
		 *  @since  May 30, 2005
		 */
	@Test
	public void testConstructWithValidConnectedDataAndColor() {
		
		PlotDatum plotDatum = new PlotDatum("", Color.BLUE);
		
		assertFalse(plotDatum.connected());
		assertNull(plotDatum.getData());
		assertNull(plotDatum.getColor());
		
		plotDatum.setColor(new Color(31, 32, 33));
		assertTrue(plotDatum.connected());
		
		plotDatum.setColor(new Color(31, 32, 33));
		assertTrue(plotDatum.connected());
	}

		/**
		*  @since  May 30, 2005
		*/
	@Test
	public void testConstructWithValidConnectedDataAndColorButDifferent() {
		
		PlotDatum plotDatum = new PlotDatum("", Color.BLUE);
		Color color1 = new Color(31, 32, 33);
		Color color2 = new Color(31, 32, 0);
		PlotDatum plotDatum1 = new PlotDatum("Name", color1);
		PlotDatum plotDatum2 = new PlotDatum("Name", color2);
		
		assertFalse(plotDatum.connected());
		assertNotSame(plotDatum.getData(), plotDatum1.getData());
		assertSame(plotDatum1.getData(), plotDatum.getData());
		assertNotSame(plotDatum.getColor(), plotDatum1.getColor());
		
		plotDatum1.setColor(plotDatum.getColor());
		assertFalse(plotDatum.connected());
		assertSame(plotDatum.getData(), plotDatum1.getData());
		assertSame(plotDatum.getColor(), plotDatum1.getColor());
		
		plotDatum1.setColor(color1);
		assertTrue(plotDatum.connected());
		
		plotDatum1.setColor(color2);
		assertTrue(plotDatum.connected());
	}
}