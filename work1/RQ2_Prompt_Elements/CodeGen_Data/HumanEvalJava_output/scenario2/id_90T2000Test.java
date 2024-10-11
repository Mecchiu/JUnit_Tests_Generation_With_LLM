// NextSmallestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
// NextSmallest.java
package scenario2;

import java.util.List;

class NextSmallest {

    /**
     * * You are given a list of integers.
     * Write a function next_smallest() that returns the 2nd smallest element of the list.
     * Return null if there is no such element.
     */
    public static Integer nextSmallest(List<Object> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = (Integer) lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = (Integer) lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (current!= smallest)
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }
}

// NextSmallestTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
		final int size = 100;
		final int N = 20;
		final List<Integer> list = new LinkedList<>();

		void insert(int i) {
				list.add(i);
		}

		@Test
        void test() {
                nextSmallest(list);
        }
}
