// GetMaxTriplesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains one unit test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {

	@Test
	public void test() {
        int[] arr = new int[GetMaxTriples.getMaxTriples(12)];
        for (int i = 0; i < 12; i++) {
            arr[i] = 1;
            arr[i]++;
        }
		System.out.println("The max triple of length " + arr.length);
		System.out.println("Returns the value a[i]");
        assertEquals("The max triple of length 12 is 1 (a[2] in this example)", arr[12], GetMaxTriples.getMaxTriples(12));
	}

}
