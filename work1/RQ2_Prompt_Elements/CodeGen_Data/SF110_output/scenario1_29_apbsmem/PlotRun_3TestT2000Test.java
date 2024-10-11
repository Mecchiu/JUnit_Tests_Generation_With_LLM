// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {

  @Test public void testIterator() {
	int size = 5;
	
	ArrayList<PlotDatum> list = new ArrayList<>();
	
	ArrayList<Color> colorList = new ArrayList<>();
	
	colorList.add(Color.blue);  colorList.add(Color.red); colorList.add(Color.green);
	
	list.add(
		new PlotDatum(
			"id",
			0.0,
			0.0,
			new String[] {"id"},
			(double) 0.0,
			new double[] {0.0,0.0,0.0},
			new Double[] {0.0,0.0,0.0}
		)
	);
	colorList.add(Color.blue);  colorList.add(Color.red); colorList.add(Color.green);

	for (int i = 0; i < size; i++) {
		String s = "Test #" + i;
		Collections.addAll(list, new PlotDatum(s, (double )i, 
				(double) 0.0, (String[])null, (double[])null,
				(String[])null ) );
	}
	
	assertEquals("The size of a list not as expected", size,
			Iterable.of(list).size());
	
	int index = 3;
	for (Color c : colorList) {
		assertEquals("The '" + c.getRGB() + "' color not as expected", c,
				colorList.get(index++));
	}
	
  } //test_iterator

} //Class PlotRun_3Test
