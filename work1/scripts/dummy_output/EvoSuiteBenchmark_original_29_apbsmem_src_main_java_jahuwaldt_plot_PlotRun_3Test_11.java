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
		
//	Setup:
	
//	Test:
	
//	@Test
		public void testGet() {
			// Test null argument.
			PlothieroTest.testGet(null, 0, 1);
			
			// Test length of array equal to 10
			PlothieroTest.testGet(new double[10], 0, 1);
		}
		
//  @Test
		public void testSize() {
			// Test get of size 0
			PlothieroTest.testSize(0, 1);
			
			// Test get of size 1
			PlothieroTest.testSize(1, 1);
			
			// Test get of size 2
			PlothieroTest.testSize(2, 1);
			
		}

//  @Test
		public void testAdd() {
			// Test add function with no arguments.
			PlothieroTest.testAdd(null);
			
			// Test add function with argument 1
			PlothieroTest.testAdd(1);
			
			// Test add function with argument 2
			PlothieroTest.testAdd(2);
			
		}

//  @Test
		public void testRemove() {
			// Test remove function with no arguments.
			PlothieroTest.testRemove(null);
			
			// Test remove function with argument 1
			PlothieroTest.testRemove(1);
			
			// Test remove function with argument 2
			PlothieroTest.testRemove(2);
		}

//  @Test
		public void testClear() {
			// Test clear function with no arguments.
			PlothieroTest.testClear(null);
			
			// Test clear function with argument 1
			PlothieroTest.testClear(1);
			
			// Test clear function with argument 2
			PlothieroTest.testClear(2);
		}

//  @Test
		public void testClearByPosition() {
}
}