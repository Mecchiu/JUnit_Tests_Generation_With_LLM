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
/**
		* Contains a plot that is a collection of PlotDatum objects.
		* It contains three objects: one for each PlotDatum object in the collection.
		*
		* @return A collection of all object.
		 */
		private Collection<PlotDatum> getAllObjects() {
			final HashSet set = new HashSet();
			set.addAll( new PlottedDatums_2( ) );
			set.addAll( new PlottedDatums( ) );
			return set;
		}


		@Test
        void testRemoveAllObjects() {
            Set<PlotDatum> s = getAllObjects();
            ArrayList<PlotDatum> aL = new ArrayList<PlotDatum>();
            setToArray(aL);
            aL.addAll(s);
            s.removeAll(setToArray(aL));
        }

        @Test
        void testRemoveOneObject() {
            ArrayList<PlotDatum> aL = new ArrayList<PlotDatum>();
            setToArray(aL);
            aL.add(PlottedDatums_2.getInstance( ) );
            setToArray(aL);
            s.remove(aL.get(0));
        }

		@Test
        void testRemoveFirstObject() {
            ArrayList<PlotDatum> aL = new ArrayList<PlotDatum>();
            setToArray(aL);
            aL.add(PlottedDatums_2.getInstance( ) );
            setToArray(aL);
            s.remove(aL.get(0));
        }
}