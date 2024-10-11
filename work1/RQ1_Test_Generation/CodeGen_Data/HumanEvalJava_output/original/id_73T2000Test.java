// SmallestChangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
// SmallestChange.java
package original;

import java.util.List;

class SmallestChange {

    /**
     * * Given an array arr of integers, find the minimum number of elements that
     * need to be changed to make the array palindromic. A palindromic array is an array that
     * is read the same backwards and forwards. In one change, you can change one element to any other element.
     *
     * For example:
     * smallest_change([1,2,3,5,4,7,9,6]) == 4
     * smallest_change([1, 2, 3, 4, 3, 2, 2]) == 1
     * smallest_change([1, 2, 3, 2, 1]) == 0
     *
     * > smallestChange([1, 2, 3, 5, 4, 7, 9, 6])
     * 4
     * > smallestChange([1, 2, 3, 4, 3, 2, 2])
     * 1
     * > smallestChange([1, 4, 2])
     * 1
     * > smallestChange([1, 4, 4, 2])
     * 1
     * > smallestChange([1, 2, 3, 2, 1])
     * 0
     * > smallestChange([3, 1, 1, 3])
     * 0
     * > smallestChange([1])
     * 0
     * > smallestChange([0, 1])
     * 1
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
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
		
    /**
     * Constructor for the class.
     */
    public SmallestChangeTest() {
    }
	 
	@Test
    public void testConstructor(){
        List<Integer> arr = List.of(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9, 9, 10);
        
        assertNotNull(SmallestChange.smallestChange(arr));
    }
}
