// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

	@Test
	void testIsSorted() {
		assertTrue(IsSorted.isSorted(List.of(5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6, 7)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5, 6, 7)));
		assertTrue(IsSorted.isSorted(List.of()));
		assertTrue(IsSorted.isSorted(List.of(1)));
		assertFalse(IsSorted.isSorted(List.of(3, 2, 1)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 2, 2, 3, 4)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 3, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 2, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4)));
	}
}

// IsSorted.java
package scenario3;

import java.util.List;

class IsSorted {

    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5, 6]) ➞ True
     * isSorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
     * isSorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
     * isSorted([1, 2, 2, 3, 3, 4]) ➞ True
     * isSorted([1, 2, 2, 2, 3, 4]) ➞ False
     *
     * > isSorted([5])
     * true
     * > isSorted([1, 2, 3, 4, 5])
     * true
     * > isSorted([1, 3, 2, 4, 5])
     * false
     * > isSorted([1, 2, 3, 4, 5, 6])
     * true
     * > isSorted([1, 2, 3, 4, 5, 6, 7])
     * true
     * > isSorted([1, 3, 2, 4, 5, 6, 7])
     * false
     * > isSorted([])
     * true
     * > isSorted([1])
     * true
     * > isSorted([3, 2, 1])
     * false
     * > isSorted([1, 2, 2, 2, 3, 4])
     * false
     * > isSorted([1, 2, 3, 3, 3, 4])
     * false
     * > isSorted([1, 2, 2, 3, 3, 4])
     * true
     * > isSorted([1, 2, 3, 4])
     * true
     */
    public static Boolean isSorted(List<Object> lst) {
        if (lst.size() == 0) {
            return true;
        }
        int prev = (int) lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int curr = (int) lst.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }
}

// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
		
	@Test
	void testIsSorted() {
		assertTrue(IsSorted.isSorted(List.of(5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6, 7)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5, 6, 7)));
		assertTrue(IsSorted.isSorted(List.of()));
		assertTrue(IsSorted.isSorted(List.of(1)));
		assertFalse(IsSorted.isSorted(List.of(3, 2, 1)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 2, 2, 3, 4)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 3, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 2, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4)));
	}
}

// IsSorted.java
package scenario3;

import java.util.List;

class IsSorted {

    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5, 6]) ➞ True
     * isSorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
     * isSorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
     * isSorted([1, 2, 2, 3, 3, 4]) ➞ True
     * isSorted([1, 2, 2, 2, 3, 4]) ➞ False
     *
     * > isSorted([5])
     * true
     * > isSorted([1, 2, 3, 4, 5])
     * true
     * > isSorted([1, 3, 2, 4, 5])
     * false
     * > isSorted([1, 2, 3, 4, 5, 6])
     * true
     * > isSorted([1, 2, 3, 4, 5, 6, 7])
     * true
     * > isSorted([1, 3, 2, 4, 5, 6, 7])
     * false
     * > isSorted([])
     * true
     * > isSorted([1])
     * true
     * > isSorted([3, 2, 1])
     * false
     * > isSorted([1, 2, 2, 2, 3, 4])
     * false
     * > isSorted([1, 2, 3, 3, 3, 4])
     * false
     * > isSorted([1, 2, 2, 3, 3, 4])
     * true
     * > isSorted([1, 2, 3, 4])
     * true
     */
    public static Boolean isSorted(List<Object> lst) {
        if (lst.size() == 0) {
            return true;
        }
        int prev = (int) lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int curr = (int) lst.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }
}

// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
		
	@Test
	void testIsSorted() {
		assertTrue(IsSorted.isSorted(List.of(5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6, 7)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5, 6, 7)));
		assertTrue(IsSorted.isSorted(List.of()));
		assertTrue(IsSorted.isSorted(List.of(1)));
		assertFalse(IsSorted.isSorted(List.of(3, 2, 1)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 2, 2, 3, 4)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 3, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 2, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4)));
	}
}

// IsSorted.java
package scenario3;

import java.util.List;

class IsSorted {

    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5, 6]) ➞ True
     * isSorted([1, 2, 3, 4, 5, 6, 7]) ➞ True
     * isSorted([1, 3, 2, 4, 5, 6, 7]) ➞ False
     * isSorted([1, 2, 2, 3, 3, 4]) ➞ True
     * isSorted([1, 2, 2, 2, 3, 4]) ➞ False
     *
     * > isSorted([5])
     * true
     * > isSorted([1, 2, 3, 4, 5])
     * true
     * > isSorted([1, 3, 2, 4, 5])
     * false
     * > isSorted([1, 2, 3, 4, 5, 6])
     * true
     * > isSorted([1, 2, 3, 4, 5, 6, 7])
     * true
     * > isSorted([1, 3, 2, 4, 5, 6, 7])
     * false
     * > isSorted([])
     * true
     * > isSorted([1])
     * true
     * > isSorted([3, 2, 1])
     * false
     * > isSorted([1, 2, 2, 2, 3, 4])
     * false
     * > isSorted([1, 2, 3, 3, 3, 4])
     * false
     * > isSorted([1, 2, 2, 3, 3, 4])
     * true
     * > isSorted([1, 2, 3, 4])
     * true
     */
    public static Boolean isSorted(List<Object> lst) {
        if (lst.size() == 0) {
            return true;
        }
        int prev = (int) lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int curr = (int) lst.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }
}

// IsSortedTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {
		
	@Test
	void testIsSorted() {
		assertTrue(IsSorted.isSorted(List.of(5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4, 5, 6, 7)));
		assertFalse(IsSorted.isSorted(List.of(1, 3, 2, 4, 5, 6, 7)));
		assertTrue(IsSorted.isSorted(List.of()));
		assertTrue(IsSorted.isSorted(List.of(1)));
		assertFalse(IsSorted.isSorted(List.of(3, 2, 1)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 2, 2, 3, 4)));
		assertFalse(IsSorted.isSorted(List.of(1, 2, 3, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 2, 3, 3, 4)));
		assertTrue(IsSorted.isSorted(List.of(1, 2, 3, 4)));
	}
}

// IsSorted.java
package scenario3;

import java.util.List;

class IsSorted {

    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     *
     * Examples
     * isSorted([5]) ➞ True
     * isSorted([1, 2, 3, 4, 5]) ➞ True
     * isSorted([1, 3, 2, 4, 5]) ➞ False
     * isSorted([1, 2, 3, 4, 5,