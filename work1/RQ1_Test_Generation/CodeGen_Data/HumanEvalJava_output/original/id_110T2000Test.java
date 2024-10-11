// ExchangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains one unit test case for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

	// Test data
	final int[] data = {1, 2, 3, 4};

	// Unit test class
	class Test {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		}
	}

	/**
	 * Test method for org.junit.jupiter.api.Function.test().
	 */
	@Test
	public void test() {
        String message = "NO";
        List<Integer> list1 = new Test().new List<Integer>();
        List<Integer> list2 = new Test().new List<Integer>();
        // try {
        try {
            // if (exchange("[1, 2, 3, 4]", "[1, 2, 3, 4])
            // return "YES";
            message = exchange(data, list1);
            assertNotNull("Message expected to not to be null", message);

            // if (exchange("[1, 2, 3, 4]", "[1, 5, 3, 4])
            // doSomething();
        } catch (Exception e) {
        }
        // expect the exception to be thrown
        // e.printStackTrace();
        // assertTrue("Expect exception thrown due to lack of data, data",
                  //  e instanceof NullPointerException);
        // assertTrue("Expect exception thrown due to lack of data",
                  //  e instanceof IllegalArgumentException);
        // assertTrue("Expect exception thrown due to lack of data",
                  //  e instanceof IllegalStateException);
        // assertTrue("Expect exception thrown due to lack of data",
                  //  e instanceof ArrayStoreException);
        // assertTrue("Expect exception thrown due to lack of data",
                  //  e instanceof ClassCastException);
        // assertTrue("Expect exception thrown due to lack of data",
                  //  e instanceof UnsupportedOperationException);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// CHECKSTYLE.OFF: AnonymousClass
