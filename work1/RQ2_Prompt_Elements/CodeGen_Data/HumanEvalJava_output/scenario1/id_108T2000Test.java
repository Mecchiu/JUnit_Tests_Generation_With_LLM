// CountNumsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains one unit test case for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
// CountNums.java
package scenario1;

import java.util.List;

class CountNums {

    public static int countNums(List<Object> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int num = (int) arr.get(i);
            boolean isNegative = num < 0;
            if (isNegative) {
                num = -num;
            }
            while (num!= 0) {
                if (isNegative && num / 10 == 0) {
                    sum -= num % 10;
                } else {
                    sum += num % 10;
                }
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }
}

// CountNumsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains one unit test case for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
		/**
		* Creates a new instance of CountNumsTest.
		* @return The created object.
		*/
		public CountNumsTest() {
		}

		/**
		* Tests the method {@link CountNums#countNums(List)} method in client.
		* @throws Exception is thrown during test.
		*/
		@Test
		public void test() throws Exception {
				List<Object> testItems = new java.util.ArrayList<Object>();
		List<Object> testNums = new CountNums().countNums(testItems);
				assertTrue("test not passed.", testNums.size() == 3);
		}
}