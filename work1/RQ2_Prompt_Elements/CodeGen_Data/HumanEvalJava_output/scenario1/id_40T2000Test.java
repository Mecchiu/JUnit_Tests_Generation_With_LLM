// TriplesSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains one unit test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
/**
* Test method for
* {@link TriplesSumToZero#triplesSumToZero(List)}.
* Assert that -1 is returned if all nodes have the same number of
* positive values (the same for both children, which have the same
* number of values) or -1 is returned if the sum of all values of
* those values is equal to 0 (the same if both children equal at
* the same node) or -1 is returned if the sum of all values of
* those values is 0 (which means the different values).
*/
	@Test
    public void testTriplesSumOfTwoPositiveValuesSame(){
        assertEquals(-1, triplesSumToZero(List.of(1)));
        assertEquals(-1, triplesSumToZero(List.of(-1)));
    }

		/**
* Test method for
* {@link TriplesSumToZero#triplesSumToZero(List)}.
* Assert that -1 is returned if all the nodes have different elements.
*/
	@Test
    public void testTriplesSumOfTwoNegativeValuesDifferent(){
        assertEquals(-1, triplesSumToZero(List.of(-1, -1)));
        assertEquals(-1, triplesSumToZero(List.of(1,1)));
    }

		/**
* Test method for {@link TriplesSumToZero#triplesSumToZero(List)}.
*/
	@Test
	public void testTriplesSumOfTwoZero() {
		assertEquals(1, triplesSumToZero(List.of(1)));
		assertEquals(1, triplesSumToZero(List.of(-1)));
	}

		/**
* Test method for {@link TriplesSumToZero#triplesSumToZero(List)}.
*/
	@Test
    public void testTriplesSumOfTwoZeroDifferent(){
        assertEquals(1, triplesSumToZero(List.of(-1, -1)));
        assertEquals(1, triplesSumToZero(List.of(1,1)));
    }

}
