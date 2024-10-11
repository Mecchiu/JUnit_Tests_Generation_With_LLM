// NextSmallestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
// NextSmallest.java
package original;

import java.util.List;

class NextSmallest {

    /**
     * * You are given a list of integers.
     * Write a function next_smallest() that returns the 2nd smallest element of the list.
     * Return null if there is no such element.
     * Examples:
     * nextSmallest([1, 2, 3, 4, 5]) == 2
     * nextSmallest([5, 1, 4, 3, 2]) == 2
     * nextSmallest([]) == None
     * nextSmallest([1, 1]) == None
     *
     * > nextSmallest([1, 2, 3, 4, 5])
     * 2
     * > nextSmallest([5, 1, 4, 3, 2])
     * 2
     * > nextSmallest([])
     * null
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([1, 1, 1, 1, 0])
     * 1
     * > nextSmallest([1, 1])
     * null
     * > nextSmallest([-35, 34, 12, -45])
     * -35
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
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains one unit test case for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {
		
	@Test
	  void nextSmallest_1() {
		assertNextSmallest(new Integer[] {1, 0, 2, 3, 0});
		assertNextSmallest(new Integer[] {0, 1, 2, 3, 0});
		assertNextSmallest(new Integer[] {0, 0, 1, 2, 0});
		assertNextSmallest(new Integer[] {});
		assertNextSmallest(new Integer[] {1});
		assertNextSmallest(new Integer[] {1, 0});
		assertNextSmallest(new Integer[] {1, 1, 0, 0, 0});
		assertNextSmallest(new Integer[] {1, 1, 1, 0, 0});
		assertNextSmallest(new Integer[] {1, 1, 1, 1, 1, 0});
		assertNextSmallest(new Integer[] {-10, -5, -5, 6, 5, -5, 1 });
		assertNextSmallest(new Integer[] {2, 2});
		assertNextSmallest(new Integer[] {4, 4});
		assertNextSmallest(new Integer[] {5, 5});
		assertNextSmallest(new Integer[] {1, 10, 3, 8, 1});
		assertNextSmallest(new Integer[] {2, 2, 1});
		assertNextSmallest(new Integer[] {-10, 5, 5, -5});
		assertNextSmallest(new Integer[] {-10, 5, 5, -5, 1, 5, 5, 5, 5, 5 });
		assertNextSmallest(new Integer[] {2, 1, 1});
	}   
	
	@Test
	  void nextSmallest_2() {

		assertNextSmallest(new Integer[] {1, 0, 2, 3, 0});
		assertNextSmallest(new Integer[] {0, 1, 2, 3, 0});
		assertNextSmallest(new Integer[] {0, 0, 1, 2, 0});
		assertNextSmallest(new Integer[] {0, 1, 1, 2, 0});
		assertNextSmallest(new Integer[] {});
		assertNextSmallest(new Integer[] {1});
		assertNextSmallest(new Integer[] {1, 0});
		assertNextSmallest(new Integer[] {1, 1, 0, 0, 0});
		assertNextSmallest(new Integer[] {1, 1, 1, 0, 0});
		assertNextSmallest(new Integer[] {1, 1, 1, 1, 1, 0});
		assertNextSmallest(new Integer[] {-10, -5, -5, 6, 5, -5, 1 });
		assertNextSmallest(new Integer[] {2, 2});
		assertNextSmallest(new Integer[] {5, 5});
		assertNextSmallest(new Integer[] {1, 10, 3, 8, 1});
		assertNextSmallest(new Integer[] {2, 2, 1});
		assertNextSmallest(new Integer[] {-10, 5, 5, -5, 1, 5, 5, 5, 5, 5 });
		assertNextSmallest(new Integer[] {2, 1, 1});
	}
	
	@Test
	  void nextSmallest_3() {
		assertNextSmallest(new Integer[] {12, 13, 14, 15});
	}
	
	@Test
	  void nextSmallest_4() {
		assertNextSmallest(new Integer[] {0, 1});
	}
	
	@Test
	  void nextSmallest_5() {
		assertNextSmallest(new Integer[] {10, 10, 10});
	}
	
	/**
	 * Assert nextSmallest returns the 2nd smallest element of the list.
	 * @param lst the list to test with.
	 */
	private static void assertNextSmallest(final Integer[] lst) {

		assertTrue(lst.length >= 2);

		Integer nextSmallest1 = lst[0];
		Integer nextSmallest2 = lst[1];

		assertTrue(nextSmallest1 >= 1);
		assertTrue(nextSmallest1 <= nextSmallest2);
		assertTrue(nextSmallest2 < nextSmallest1);

		for (int i = 2; i < lst.length; i++) {
			Integer current = lst[i];
			if (current < nextSmallest1) {
				nextSmallest1 = current;
			} else if (current < nextSmallest2) {
				nextSmallest2 = current;
			}
		}

		assertTrue(nextSmallest2 >= current);
		assertTrue(nextSmallest2 <= nextSmallest1);
		assertTrue(nextSmallest1 < nextSmallest2);

	}
		
	/**
	 * <p>
	 * Note: You should be using {@code compareTo} on the list itself, since it is ordered by
	 * smallest, smallest first.
	 * </p>
	 * <p>
	 * Note: The lists are sorted; only the first {@code k} elements remain in the list.
	 * </p>
	 */
	@Test
	  void compareTo_Smallest() {
		List<Integer> list = new SmallestList<>();
		List<Integer> list2 = new NextSmallest<>(list.get(0), list.get(0)) {
			@Override
			protected Item<Iterator<Integer>, List<Integer>, Integer, Integer> getComparator() {
				item = new NextSmallest<>(list.get(0), list.get(0));
				return item;
			}
		};
		assertListCompareAscending(list2, list);
		
	}
	
	/**
	 * <p>
	 * Note: You should not use this method when {@link NextSmallest#compareTo(Object)} has been
	 * overridden by a super {@link CompareItem#nextItem()}.
	 * </p>
	 */
	private void assertListCompareAscending(List<Integer> list, List<Integer> list2) {
		List<Integer> list3 = new NextSmallest<>(list2.get(0), list.get(0)) {
			@Override
			protected Item<Iterator<Integer>, List<Integer>, Integer, Integer> getComparator() {
				item = new NextSmallest<>(list2.get(0), list.get(0