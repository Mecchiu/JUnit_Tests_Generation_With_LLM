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
		/**
		 *  The run is a simple array of PlotDatum objects that consist
		 *  of three PlotDatum objects:
		 *      <p>PlotDatum p0 -->	<em>x0</em>
		 *      <p>PlotDatum p1 -->	<em>X</em>
		 *      <p>PlotDatum p2 -->	<em>Y</em>
		 *  where each of the four PlotDatum objects constitute a separate,
		 *  uniform series of data values for the given plot dimension
		 *  (X or Y).
		 */
		@java.lang.Test
		public void testRunIterator() {
		}

		/**
		 *  This test case tests for the functionality of the
		 *  {@link ArrayList#add(Object)} method.
		 *  <p>Note this class can only
		 *  be run in conjunction with the following classes:
		 *      ArrayList and java.util.AbstractList.
		 */
		@java.lang.Test
		public void testAdd() {

			/**
			 *  The arrayList this class is being run in is a
			 *  ArrayList that has the following properties:
			 *  <ul>
			 *  <li>Add and remove of all the objects in the arrayList</li>
			 *  <li>For each element in the arrayList, check that
			 *      the element at the index is a PlotDatum</li>
			 *  <ul>
			 */
			final ArrayList arrayList = new ArrayList();

			/**
			 *  Use to add an object to the arrayList
			 *  <p>Adds any object in the specified array of PlotDatum
			 *  objects to the arrayList.
			 */
			arrayList.add(new PlotDatum(new double[]{1.0, 1.0}));
			arrayList.add(new PlotDatum(new double[]{1.0, 1.0}));
}
}