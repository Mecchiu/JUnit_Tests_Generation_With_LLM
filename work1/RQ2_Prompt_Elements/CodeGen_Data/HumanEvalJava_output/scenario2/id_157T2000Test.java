// RightAngleTriangleTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RightAngleTriangle}.
* It contains one unit test case for the {@link RightAngleTriangle#rightAngleTriangle(int, int, int)} method.
*/
class RightAngleTriangleTest {

	@Test
	public void rightAngleTriangleWithTest() {
		int a = 10;
		int b = 15;
		int c = 15;
		for (int i = 1 ; i <= 3; ++i) {
			rightAngleTriangle(a, b, c);
			rightAngleTriangle(a, b, c);
		}
	}
	
}