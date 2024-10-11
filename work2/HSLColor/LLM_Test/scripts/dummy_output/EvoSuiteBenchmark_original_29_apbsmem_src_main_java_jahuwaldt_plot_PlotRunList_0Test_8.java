// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {
		double minX = Double.MAX_VALUE, maxX = Double.MIN_VALUE, minY = Double.MAX_VALUE, maxY = Double.MIN_VALUE;
		List runs = null;
		double value = Double.MAX_VALUE;
		List<PlotDatum> result = new AbstractList<PlotDatum>() {

			protected void add(double v) {
				value += v;
			}

			public int size() {
				return value;
			}

			public Object get(int index) {
				return new PlotDatum((float)(minX + value)), index;
			}

			public boolean isEmpty() {
				return value == 0;
			}

			public Object set(int index, Object element) {
				throw new UnsupportedOperationException("set is not implemented");
				
			}

			public void clear() {
				value = 0;
			}

			public Iterator iterator() {
				return runs.iterator();
			}

		};

		/**
		* Return a copy of the current list of PlotRun objects.
		*/
		Object clone() {
			return runs.clone();
		}
}