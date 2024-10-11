// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
static final int RUN_LENGTH = 1000000;
		static final int NUM_RUNS = 10;

		public static void clear() {
			for (int i = 0; i < RUN_LENGTH; ++i) {
				clear(new HashSet());
			}
		}

		public static void clear(Set<PlotDatum> set) {
			ListIterator it = set.iterator();
			while (it.hasNext()) {
				PlotDatum v = (PlotDatum) it.next();
				v.clear();
			}
		}
		
		@Test
		void removesRows() {
			PlotRun run = new PlotRun(0, RUN_LENGTH);
			assertNull(run.remove(0));
			assertEquals(0, run.size());
			for (int j = 0; j < NUM_RUNS; ++j) {
				run = new PlotRun(0, RUN_LENGTH);
				run.add(new PlotDatum(new Object(), true, 200, 0, 20));
				assertEquals(j, run.remove(0));
			}
			assertEquals(RUN_LENGTH, run.size());
			assertTrue(run.contains(new PlotDatum(2147483647, false, 100, 1, 30)));
			assertTrue(run.contains(new PlotDatum(2147483648, false, 100, 1, 300)));
		}

		@Test
		void removesRowsToOne() {
			List<PlotDatum> old = new ArrayList(RUN_LENGTH);
			for (int i=0; i < RUN_LENGTH; ++i) {
				PlotDatum v = new PlotDatum(new Object(), false, i, 0, 20);
				long start = System.nanoTime();
				System.out.println(i);
				old.add(v);
				v.clear();
				long end = System.nanoTime();
				System.out.println(" time "+Time.formatTime((end - start)/1e9)+
					" us : "+1000000/(end - start)+" ns.\n");
			}
			
			old.clear();
			PlotDatum v = new PlotDatum(2147483647, true, 0, 0, 0);
			PlotDatum result = run.remove(v.index());
			assertTrue("Failed to remove Run.", result!= null);
			assertEquals(2147483647, result.getDatumIndex());
			assertEquals(v, result);
		}

		@Test
		void removes() {
			List<PlotDatum> old = new ArrayList(RUN_LENGTH);
			for (int i=0; i < RUN_LENGTH; ++i) {
				PlotDatum v = new PlotDatum(new Object(), false, i, 0, 20);
				PlotDatum result = run.remove(i);
				assertTrue("Failed to remove Run.", result!= null);
				System.out.println(" "+i+" : "+result);
				old.remove(result);
			}
			assertEquals(0, old.size());
		}

		@Test
		void add() {
			List<PlotDatum> list = new ArrayList<PlotDatum>(RUN_LENGTH);
			for (int j = 0; j < RUN_LENGTH; ++j) {
				PlotDatum v = new PlotDatum(new Object(), true, j, 0, 20);
				list.add(v);
			}
			for (int i = 0; i < RUN_LENGTH; ++i) {
				Object result = run.add(i, new PlotDatum(null, false, i, 1, 30));
				assertNotNull(result);
				assertTrue("Failed to add Run.", result!= null);
				assertEquals(i, result);
			}
		}

		@Test
		void index() {
			List<PlotDatum> old = new ArrayList(RUN_LENGTH);
			for (int i=0; i < RUN_LENGTH; ++i) {
				PlotDatum v = new PlotDatum(new Object(), false, i, 0, 20);
				old.add(i+1, v);
			}
			
			Map<Object, Color> colorMap = PlotRun.map(old);
			
			for (int j = 0; j < RUN_LENGTH; ++j) {
				assertTrue("Failed to add Run.", colorMap.containsKey(run.add(j, new PlotDatum(new Object(), false, j, 2, 30))));
			}
			assertEquals(RUN_LENGTH, colorMap.size());
		}
}

/**
 *  <p> This class represents an element of a runs list.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 29, 2000
 * @version December 27, 2000
 */
final class PlotDatum implements Comparable<PlotDatum> {

    /**
     *  <p> This method contains data that is required to be
     *  processed in this run.  This data is expected to
     *  be serialized using the method {@link #serialize()}
     *  or to be deserialized using the method {@link #deserialize()}.
     *  </p>
     */
    public Object data;
    
    /**
     *  <p> This method is used to store information about
     *  data in this plot run.  Its implementation is expected
     *  to use the {@link #serialize()} or {@link #deserialize()}
     *  method to deserialize the data or to store information
     *  about the data.
     */
    public void clear() {
        data = null;
        this.toString();
    }
    
    public PlotDatum(PlotDatum other) {
        data = other.data;
    }

    @Override
    public int compareTo(PlotDatum other) {
        return this.data.compareTo(other.data);
    }

    /**
     *  <p> This method is used to serialize the data
     *  associated with this run.  Its implementation
     *  is expected to use the {@link #serialize()} method.
     */
    public String serialize() {
        if (data == null) {
            return "null";
        }
        return data.toString();
    }

    /**
     *  <p> This method is used to deserialize the data
     *  associated with this run.  Its implementation
     *  is expected to use the {@link #serialize()} method.
     */
    public void deserialize() {
        data = null;
        clear();
    }

    /**
     *  <p> This method is used to perform comparison
     *  of individual datum elements.  This method takes
     *  the form