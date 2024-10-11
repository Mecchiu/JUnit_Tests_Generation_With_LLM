// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {
@Test
		void removeRun_ShouldReturnLastItemAsRemoveResultOfRemove() {
			PlotRunList runList = new PlotRunList();

			assertEquals(runList.remove(0), null);
		}
}