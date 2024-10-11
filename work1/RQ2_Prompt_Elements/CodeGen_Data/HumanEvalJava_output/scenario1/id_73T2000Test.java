// SmallestChangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
// SmallestChange.java
package scenario1;

import java.util.List;

class SmallestChange {

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
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains one unit test case for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {
		/**
		* Tests {@link SmallestChange#smallestChange(List)} method of the {@link SmallestChange} class.
		*/
    @Test
    public void testSmallestChange() {
        List<Integer> a = new List();
        List<Integer> b = new List();
        SmallestChange s = new SmallestChange();
        a.addAll(b);
        b.addAll(a);
        assertEquals(s.smallestChange(a), 2);
    }
}


