// TriangleArea1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea1}.
* It contains one unit test case for the {@link TriangleArea1#triangleArea(int, int, int)} method.
*/
class TriangleArea1Test {

	int a, b, c;

	@Test
	public void whenOneSidesOfASingleSidesAreValidThenTheResultIsCorrect() {
		assertEquals(expectedArea(), triangleArea(a, b, c));
	}

	@Test
	public void whenOneSidesOfASingleSidesAreDifferentThenReturnDifferentForEachOfTheSidesOfTheValidSide() {
		b = 4;
		c = 1;

		assertEquals(expectedArea(), triangleArea(b, c, a));
		
		// assertTrue(expectedArea() == max(expectedArea(), max(expectedArea(), calculatedArea(b, c, a)) ));
	}

	@Test
	public void whenAnySidesOfASingleSidesAreDifferentThenReturnDifferentForEachOfTheSidesOfTheValidSide() {
		a = 3;
		b = 2;
		c = 2;

		assertEquals(expectedArea(), triangleArea(b, c, a));
		
		// assertTrue(expectedArea() == max(expectedArea(), max(expectedArea(), calculatedArea(b, c, a)) ));
	}
	
	private Number expectedArea() {
		return expectedArea(a,b,c);
	}
	private Number expectedArea(int a,int b,int c) {
		return (a+b+c)/3;
	}
	private double expectedArea(int a,int b,int c) {
		return (a+b+c)/3.0;
	}
}
