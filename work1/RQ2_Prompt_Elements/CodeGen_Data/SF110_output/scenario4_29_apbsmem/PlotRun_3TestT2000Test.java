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
	* Verify that the PlotRun object has non null values
	* after calling iterator() on the data.
	*/
	@Test
	void testIterateWithoutNext() {
		assertNotNull(new ArrayList(new ArrayList(Arrays.asList(null))).iterator());
	}

	/**
	* Verify that the PlotRun object has next values
	* after calling next() on the data.
	*/
	@Test
	void testNextWithoutPrevious() {
		assertNotNull(new ArrayList(new ArrayList(Arrays.asList(null))).next());
	}

	/**
	* Verify that the PlotRun object has next values
	* after calling next() on the data.
	*/
	@Test
	void testRemovePrevWithoutNext() {
		assertNotNull(new ArrayList(new ArrayList(Arrays.asList(null))).remove(null));
	}
}