// ExchangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

	/**
	  * Test method of {@link Exchange#exchange(List, List)}.
	  */
	@Test
	void test1 ( ) {
	}
		
	/**
	  * Class with unit tests for the method.
	  */
	public static class UnitTest {

	    private int[] input1;
	    private int[] input2;

	    public UnitTest( ) {
	    }

	    @Test
	    void test2( ) {
		// Input
		// 1 => 0
		// 2 => 1
		// 3 => 2
		// 4 => 3
		// 5 => 4
		input1 = new int[] { 0, 1, 2,  3,  4 };

		// Expected
		// 1 => 0
		// 2 => 1
		// 3 => 4
		// 4 => 5
		List<Integer> res = exchange(input1, input2);

		assertEquals("YES", res.get(0).toString());
		assertEquals("YES", res.get(1).toString());
		assertEquals("YES", res.get(2).toString());
		assertEquals("YES", res.get(3).toString());
		assertEquals("YES", res.get(4).toString());
		assertEquals("YES", res.get(5).toString());
	    }

	    @Test
	    void test3( ) {
		// Input
		// 1 => 0
		// 2, 5 => 3
		// 3, 4 => 4
		input2 = new int[] { 1, 5, 3, 4 };

		// Expected
		// 1 => 0
		// 2, 5 => 3, 4
		// 3, 4 => 4
		List<Integer> res = exchange(input1, input2);

		assertEquals("YES", res.get(0).toString());
		assertEquals("YES", res.get(1).toString());
		assertEquals("YES", res.get(2).toString());
		assertEquals("YES", res.get(3).toString());
		assertEquals("YES", res.get(4).toString());
		assertEquals("YES", res.get(5).toString());
	    }

	    @Test
	    void test4( ) {
		// Input
		input2 = new int[] { 1, 5, 3, 4, 1 };

		// Expected
		// 1 => 0
		// 2, 5 => 3, 4
		// 3, 4 => 4
		List<Integer> res = exchange(input1, input2);

		assertEquals("YES", res.get(0).toString());
		assertEquals("YES", res.get(1).toString());
		assertEquals("YES", res.get(2).toString());
		assertEquals("YES", res.get(3).toString());
		assertEquals("YES", res.get(4).toString());
		assertEquals("YES", res.get(5).toString());
	    }
	}
}
