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
		PlotDatum _TestObject, _TestAfterLast;
		Color _TestColor;
	@Test
	void testConstructor() {
		PlotDatum _TestObject = new PlotDatum(Color.LIGHT_GRAY);
		assertEquals(Color.BLACK, _TestObject.getColor());
		_TestObject = new PlotDatum(Color.LIGHT_GRAY, Color.LIGHT_GRAY);
		assertNull(Color.LIGHT_GRAY);
		assertEquals(Color.LIGHT_GRAY, _TestObject.getColor());

		_TestAfterLast = new PlotDatum(Color.BLACK, Color.DKGRAY);
		_TestAfterLast = new PlotDatum(Color.DARK_GRAY, Color.GRAY);
		assertEquals(Color.DKGRAY, _TestAfterLast.getColor());
		_TestAfterLast = new PlotDatum(Color.GRAY);
		assertEquals(Color.DKGRAY, _TestAfterLast.getColor());

		_TestColor = Color.BLACK;
	}

	@Test
	void equalsSelf() {
		PlotDatum _TestObject = new PlotDatum(_TestColor);
		PlotDatum other = new PlotDatum(_TestColor);
		assertEquals(_TestObject, _TestObject);
		assertEquals(_TestObject, other);
		assertNotNull(_TestObject);
		assertFalse(_TestObject.equals(null));
		else {
			_TestObject = new PlotDatum(_TestColor);
			_TestObject.connected();
			assertFalse(_TestObject.equals(new PlotDatum(_TestColor)));
		}
	}
}