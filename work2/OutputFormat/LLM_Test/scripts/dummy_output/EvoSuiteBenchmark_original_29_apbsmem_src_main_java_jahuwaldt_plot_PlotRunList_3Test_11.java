// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		public static void main(String argv[]) throws ClassNotFoundException {
				jahuwaldt.plottest.JahuwaldtTestMain.main(new String[]{PlotRunList_3Test.class.getName()});
		}

        public enum TestColor{RED,GREEN,BLUE,CYAN };
		private final TestColor testCol = TestColor.RED;

		/**
		*  Test method for the method "iterator".
		*/
		@org.junit.Test
		public void testIterator() {
		long sum  = 0;
		int min   = Integer.MAX_VALUE;
		int max   = -Integer.MAX_VALUE;
		
		for (Object run : this.data) {
			sum           += ((PlotRun) run).getSize();
			min           = Math.min(min,sum);
			max           = Math.max(max,sum);
		}
		//
		//  Return an iterator for the specified run list object.
		//
		PlotRun[] runArr = ((AbstractList) this.data).iterator();
		for (Object run : runArr) {
			System.out.println(((PlotRun) run).toString());
		}

		assertTrue(TestColor.RED!= testCol);
		assertTrue(0<=sum);
		assertTrue(TestColor.RED < min);
		assertTrue(max>min);
		System.out.println();
		}
}