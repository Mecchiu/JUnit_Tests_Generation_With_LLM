// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {
int runs[];
	/**
	 *  This method creates the tests for the Run object
	 *
	 *  <p>  Modified by:  Joseph A. Huwaldt  Date:  September 12, 2000
	 */
    public void run() {
        List list = new ArrayList();
        for (int i = 0; i < runs.length; i++) {
            list.add(
                    new PlotDatum(
                            new Color(
                                    0,
                                    runs[i]
                                )
                    )
            );
        }
		run(list);
    }

	/**
	*  Method to run the test
	*
	*  <p>  Modified by:  Joseph A. Huwaldt  Date:  November 21, 2000
	*/
    public void run(Collection listOfCollection) {
        Collections.sort(listOfCollection);
        int size = listOfCollection.size();
        assertEquals(size, runs.length);
        for (int i = 0; i < runs.length; i++) {
            assertEquals((Integer)i, runs[i].getNumber());
            if (i < size - 1) {
				for (int j = i + 1; j < size; j++)
					assertEquals(listOfCollection.get(j), ListUtil.lastOrNull((Collection)listOfCollection.get(j)));
            }
            else {
				assertEquals(listOfCollection.get(size - 1), listOfCollection.get(j-1));
            }
        }
    }
	/**
	*  Creates a new {@link PlotRun} object
	*
	*  <p>  Modified by:  Joseph A. Huwaldt  Date:  September 12, 2000
	*/
	private void init(int dataSize) {
		for (int i = 0; i < dataSize; i++) {
			add(new PlotDatum(
							new Color(
									0,
									dataSize
							)
                    ),
                    i
            );
		}
	}
}
