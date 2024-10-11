// RightAngleTriangleTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains one unit test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {
private static final int NUM_ROWS = 5;
		private static final int NUM_COLUMNS = 7;
		
	
	private RightAngleTriangle rightAngleTriangle   = new RightAngleTriangle();
	
		@Test
		public void test() {
			println("==     RightAngleTriangleTest.test()");
			println("RightAngleTriangleTest.rightAngleTriangle(5, 7, 10) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(1, 1, 10) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(12, 12, 10) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(5, 1, 36) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(2, 2, 36) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(7, 7, 5) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(7, 15, 10) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(10, 7, 26) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(12, 7, 13) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(5, 18, 19) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(6, 7, 32) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(7, 15, 17) = " 
				+ "True");
			println("RightAngleTriangleTest.rightAngleTriangle(1, 5, 10) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(1, 3, 1) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(10, 10, 15) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(7, 24, 24) = " 
				+ "False");
			println("RightAngleTriangleTest.rightAngleTriangle(2, 5, 20) = " 
				+ "True");
			rightAngleTriangle.setDefaultPaintColor("blue");
			assertTrue(rightAngleTriangle.rightAngleTriangle(20, 20, 20) instanceof Boolean);
			assertTrue(rightAngleTriangle.rightAngleTriangle(20, 7, 20) instanceof Boolean);
			assertTrue(rightAngleTriangle.rightAngleTriangle(1, 1, 20) instanceof Boolean);
			assertFalse(rightAngleTriangle.rightAngleTriangle(5, 1, 20) instanceof Boolean);
			assertFalse(rightAngleTriangle.rightAngleTriangle(7, 1, 30) instanceof Boolean);
			assertNull(rightAngleTriangle.rightAngleTriangle(10, 1, 30));
			assertFalse(rightAngleTriangle.rightAngleTriangle(7, 1, 50) instanceof Boolean);
			break;
		}
}
