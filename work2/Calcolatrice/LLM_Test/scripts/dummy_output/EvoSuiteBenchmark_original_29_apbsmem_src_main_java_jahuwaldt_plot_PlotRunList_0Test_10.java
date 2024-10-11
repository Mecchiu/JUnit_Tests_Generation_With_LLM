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
		 
	public boolean testHasSameRunsAsRunList(PlotRunList.PlotRun cloned) {

		boolean same = false;

		assertEquals(cloned.size(), size());

		int i = 0;

		while (!same && i < size()) {
			SameRun run = (SameRun) cloned.get(i);
			SameRun run2 = (SameRun) run;

			assertEquals(run.getData(), run2.getData());
			assertEquals(run.getColor(), run2.getColor());
			assertNotNull(run.getLineColor());
			assertNull(run2.getLineColor());

			assertEquals(run.getX(), run2.getX());
			assertEquals(run.getY(), run2.getY());
			assertEquals(run.getText(), run2.getText());

			i++;
			same = (same && same);
		}

		if (!same)
			System.out.println(run);
		return same;
	}

	int size() {

		return (int) data.size();
	}

	int i = 0;

	// Iterate over all the runs in the list and make sure
	// that each PlotRun object returns its type.
	boolean testHasSameRunsAsRunList() {

		return testHasSameRunsAsRunList(this);
	}

	void compareAll(PlotRunList.PlotRun cloned) throws ClassCastException {
		boolean eq = this.testHasSameRunsAsRunList(cloned);
		assertNotNull(eq);
	}
}