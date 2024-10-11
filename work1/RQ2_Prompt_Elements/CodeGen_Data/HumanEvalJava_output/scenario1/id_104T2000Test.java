// UniqueDigitsTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains one unit test case for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

    // Tests for {@link UniqueDigits#uniqueDigits(Object)}.
    //
    // @Test
    // public void test1() {
    // UniqueDigitsTest.assertResultsCorrect(expected, uniqueDigits(3));
    // }
    //
    // @Test
    // public void test2() {
    // UniqueDigitsTest.assertResultsCorrect(expected, UniqueDigits.uniqueDigits(3, 1));
    // }
    //
    // @Test
    // public void test3() {
    // UniqueDigitsTest.assertResultsCorrect(expected, uniqueDigits(3, 10));
    // }
    //
    // @Test
    // public void test4() {
    // UniqueDigitsTest.assertResultsCorrect(expected, UniqueDigits.uniqueDigits(3, 20));
    // }
    @Test
    public void test0() {
        // null
        test0Null();
        // ArrayList
		test0ArrayList();
        // LinkedList
		test0LinkedList();
        // List
        test0List();
        // ArrayList
		test0ArrayListOrdered();
        // LinkedList
		test0LinkedListOrdered();
        // ArrayList
		test0ArrayListUnordered();
        // LinkedList
		test0LinkedListUnordered();
    }
    
	private static void test0Null() {
		List<Integer> expected = new ArrayList<Integer>();
        final List<Integer> result = UniqueDigits.uniqueDigits(null);
        assertNotNull(result);
		assertEquals(expected, result);
	}
	private static void test0ArrayList() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
		assertNotNull(result);
		assertEquals(expected, result);
	}
	private static void test0LinkedList() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> result = UniqueDigits.uniqueDigits(new LinkedList<Integer>());
		assertNotNull(result);
		assertEquals(expected, result);
	}
	private static void test0List() {
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
		assertNotNull(result);
		assertEquals(expected, result);
	}
	private static void test0ArrayListOrdered() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
        assertNotNull(result);
        assertEquals(expected, result);
	}
	private static void test0LinkedListOrdered() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
		LinkedList<Integer> result = UniqueDigits.uniqueDigits(new LinkedList<Integer>());
		assertNotNull(result);
		assertEquals(expected, result);
	}
    private static void test0ListOrdered() {
        final ArrayList<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
        assertNotNull(result);
        assertEquals(0, result.size());
    }
	private static void test0ArrayListUnordered() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
        List<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
        assertNotNull(result);
        assertEquals(expected, result);
	}
	private static void test0LinkedListUnordered() {
		LinkedList<Integer> expected = new LinkedList<Integer>();
        List<Integer> result = UniqueDigits.uniqueDigits(new LinkedList<Integer>());
        assertNotNull(result);
        assertEquals(expected, result);
	}
	private static void test0ArrayListUnordered() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		ArrayList<Integer> result = UniqueDigits.uniqueDigits(new ArrayList<Integer>());
		assertNotNull(result);
		assertEquals(expected, result);
	}

}
class ArrayList<E> implements Comparable<ArrayList<E>> {
    // The array.
    private final Object array;
    // The index of the first element.
    private final int firstIndex;
    // The index of the last element.
    private final int lastIndex;
    // The length of the array.
    private final int length;
    private final int size;
    // The object at the index.
    private final E object;

    public ArrayList(final Object array) {
        this(array, 0, -1);
    }

    public ArrayList(final Object array, final int first, final int last) {
        this(array, first, last, array!= null? array.size() : 0);
    }

    public ArrayList(final Object array, final int first, final int last, final int length) {
        this(array, first, last, length, array!= null? array.size() : 0);
    }

    public ArrayList(final Object array, final int firstIndex, final int lastIndex, final int last,
                      final int length) {
        this.array = array;
        this.firstIndex = firstIndex;
        this.lastIndex  = lastIndex;
        this.length    = last - first + 1;
        this.size      = length;
        this.object    = null;
    }

    public ArrayList(final Object array, final Object first, final Object last,
                      final int firstIndex, final int lastIndex, final int length, final int size) {
        this.array = array;
        this.firstIndex = firstIndex;
        this.lastIndex  = lastIndex;
        this.length    = last - first + 1;
        this.size      = size;
        this.object    = first;
    }

    public Object getArray() {
        return array;
    }

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public int getLength() {
        return length;
    }

    public E getObject() {
        return object;
    }

    public int size() {
        return size;
    }

    public boolean add(final Object object) {
        // Remove first index.
        int newIndex = ObjectUtils.removeIndex(this.length, this.firstIndex);

        // Remove last index.
        int newLength = ObjectUtils.removeIndex(this.length, this.lastIndex);

        // Check length
        if (this.length + newLength > this.size) {
            // Index out of bounds, error!
            return false;
        }

        // Remove element.
        this.firstIndex = this