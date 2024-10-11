// SmallestChangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
// SmallestChange.java
package scenario2;

import java.util.List;

class SmallestChange {

    /**
     * * Given an array arr of integers, find the minimum number of elements that
     * need to be changed to make the array palindromic. A palindromic array is an array that
     * is read the same backwards and forwards. In one change, you can change one element to any other element.
     */
    public static int smallestChange(List<Integer> arr) {
        int result = 0;
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i)!= arr.get(j)) {
                result++;
            }
            i++;
            j--;
        }
        return result;
    }
}

// SmallestChangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
		// unit test for smallestChange
		@Test
		void test() {
			listTest();
			int[] arr = {1, 7, 12, 13};
			assertEquals(smallestChange(arr),  12);
			int[] arr2 = {1, 7, 12, 13};
			assertEquals(smallestChange(arr2),  14);
		}
}
