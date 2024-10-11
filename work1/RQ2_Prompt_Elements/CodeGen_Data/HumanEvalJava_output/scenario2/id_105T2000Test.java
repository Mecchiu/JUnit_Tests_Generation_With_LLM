// ByLengthTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains one unit test case for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

	/**
	 * Tolerance is {@value}
	 */
	private final double tolerance = 1e-6;
	
	/**
	 * Minimum test value is {@value}
	 */
	private final double minValue = 1e-8;
	
	/**
	 * Test value for {@value minValue} is 0. 
	 */
	private final int startNum = 1;

	/**
	 * Test value for {@value minValue} is 0. 
	 */
	private final int endNum = 10;

	/**
	 * Constructor test suite.
	 */
	public ByLengthTest() {
		
	}

	/**
	 * Constructor with values of {@value startNum} and  {@value endNum}.
	 * @param startNum values of the test values.
	 * @param endNum values of the test values.
	 */
	public ByLengthTest(final int startNum, final int endNum) {
		this.startNum = startNum;
		this.endNum = endNum;		
	}

	/**
	 * Test {@link ByLength#byLength(List)} method for one unit test.
	 */
	@Test
	public final void test1() {			
		List<Object> results = ByLength.byLength(Collections.singletonList(startNum));
		assertEquals("Results not correct", new ArrayList<Object>(), results);
	}

	/**
	 * Test {@link ByLength#byLength(List)} method for two unit tests.
	 */
	@Test
	public final void test2() {	
		List<Object> results = ByLength.byLength(Collections.singletonList(startNum));
		assertEquals("Results not correct", new ArrayList<Object>(), results);
	}

	/**
	 * Test {@link ByLength#byLength(List)} method for three unit tests.
	 */
	@Test
	public final void test3() {
		List<Object> results = ByLength.byLength(Collections.singletonList(startNum));
		
		List<Object> expected = new ArrayList<Object>();
		expected.add(10.0);
		assertSame(expected, results);
	}
	
	/**
	 * Test {@link ByLength#byLength(List)} method for four unit tests.
	 */
	@Test
	public final void test4() {
		List<Object> results = ByLength.byLength(Collections.singletonList(startNum));
		
		List<Object> expected = new ArrayList<Object>();
		expected.add(1.0);
		expected.add(10.0);
		expected.add(15.0);
		expected.add(21.0);
		assertSame(expected, results);
	}
	
	/**
	 * Test {@link ByLength#byLength(List)} method for five unit tests.
	 */
	@Test
	public final void test5() {
		List<Object> results = ByLength.byLength(Collections.singletonList(startNum).plus(endNum));
		
		List<Object> expected = new ArrayList<Object>();
		expected.add(10.0);
		expected.add(21.0);
		expected.add(30.0);
		expected.add(45.0);
		assertSame(expected, results);
	}
}
