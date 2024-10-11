// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
		public static int NUM_RUNS = 25;
		public static int[][] PLOT_RUNS = {
            {0,0}, {1,2}, {2,3}};
        public static double NUM_CALLS = 24;

        // Constructor Tests
        @Test
		public void numCalls() {
			// check method has the right number of calls
			int calls = 0;
			for(int i = 0; i < NUM_RUNS; i ++) {
				for(int j = 0; j < NUM_CALLS; j ++) {
		            assertEquals("get(int)", i, PlotRunList.get(i,j));
        				assertEquals("get(int)(int)", ((double)i*NUM_CALLS)+j, PlotRunList.get(i,j), 1e-15);
				}
				calls += NUM_CALLS;
			}
       
        }
        // Constructor Tests
        @Test(expected = IllegalArgumentException.class)
        public void testGetIndexOf() {
            // check the number of calls
            int calls = 0;
            for(int i = 0; i < NUM_RUNS; i++ )
                    assertEquals("get(int)", i, PlotRunList.getIndexOf(i,10,i), 1e-15);
            calls += NUM_CALLS;
        }
        // Set methods Tests
        @Test
		public void testSetArray() {
			// check the number of calls
			int calls = 0;
			for(int i = 0; i < NUM_RUNS; i ++)
				for(int j = 0; j < NUM_CALLS; j ++)
					assertEquals("set(int,int)", i, PlotRunList.set(i,j,i));
			calls += NUM_CALLS;
			
        }
        @Test
		public void testSetArrayLByIndex() {
			// check the number of calls
			int calls = 0;
			for(int i = 0; i < NUM_RUNS; i ++)
				for(int j = 0; j < NUM_CALLS; j ++)
					assertEquals("set(int, int, int)", ((int)i), (int)PlotRunList.set(i,j,((int)i)+((int)j)));
			calls += NUM_CALLS;
			
        }
        @Test
		public void testSet(int runNo) {
			// check the number of calls
			int calls = 0;
}
}