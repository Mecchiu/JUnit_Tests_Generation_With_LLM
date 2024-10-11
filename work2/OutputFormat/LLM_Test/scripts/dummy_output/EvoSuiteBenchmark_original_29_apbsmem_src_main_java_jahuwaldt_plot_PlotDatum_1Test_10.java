// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		private int x;
		private int y;
		private Color color, color_diff;

        @Test
        public void testValid() {
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};

            // test if the datum is connected
            assertFalse(Color.isTransparent(color));
		}

		@Test
		public void testIsConnected() {
			// test false-y values
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};

			assertFalse(Color.isTransparent(color));
			assertTrue(testObject.connected());
            
			// test correct input
			testObject.data = new double[] {1, 2, 3};
			Color testColor1 = new Color(1, 51, 0);
			Color testColor2 = new Color(51, 2, 0);
			assertEquals(Color.isTransparent(testColor1), Color.isTransparent(testColor2));
			assertEquals(testObject.data[0], testObject.data[1]);
            assertEquals(testObject.data[2], testObject.data[3]);
            
			// test incorrect input
            testObject.data = new double[] {2, 3, 4};
            assertFalse(Color.isTransparent(color));
            assertFalse(testObject.connected());
        }

		@Test
		public void testCopyDatum() {
			// TODO check that the copy has the same datum
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};
			
            // test the copy
            PlotDatum testCopy = new PlotDatum(testObject);
            assertEquals(testObject.data[0], testCopy.data[0]);
            assertEquals(testObject.data[1], testCopy.data[1]);
            assertEquals(testObject.data[2], testCopy.data[2]);
            assertEquals(testObject.color, testCopy.color);
			assertNotSame(testObject.color, testCopy.color);
		}

		@Test
		public void testCopy() {
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};
			
            // test the copy
            PlotDatum testCopy = new PlotDatum(testObject);
			assertEquals(testObject.data[0], testCopy.data[0]);
            assertEquals(testObject.data[1], testCopy.data[1]);
            assertEquals(testObject.data[2], testCopy.data[2]);
        }

		@Test
		public void testCloneDatum() {
			// TODO check that the clone has the same datum
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};
			
            // test the clone
            PlotDatum testClone = testObject.clone();
			assertEquals(testObject.data[0], testClone.data[0]);
			assertEquals(testObject.data[1], testClone.data[1]);
            assertEquals(testObject.data[2], testClone.data[2]);
            assertEquals(testObject.color, testClone.color);
			assertNotSame(testObject.color, testClone.color);
		}

		@Test
		public void testClone() {
			// TODO check that the clone has the same datum
			PlotDatum testObject = new PlotDatum();
			testObject.data = new double[] {1, 2, 3};
			
            // test the clone
            PlotDatum testClone = new PlotDatum(testObject.clone());
			assertEquals(testObject.data[0], testClone.data[0]);
			assertEquals(testObject.data[1], testClone.data[1]);
            assertEquals(testObject.data[2], testClone.data[2]);
            assertEquals(testObject.color, testClone.color);
			assertNotSame(testObject.color, testClone.color);
		}
}