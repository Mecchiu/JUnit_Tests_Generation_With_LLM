// SpecialfilterTest.java
package scenario2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains one unit test case for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {
private Set<Double> set;

    /**
     * Create an array with a single item that will be used as an input for the {@link Specialfilter#specialfilter(List)} method.
     *
     * @return A new array.
     */
	private Set<Double> newSet(){
		return new HashSet<>(3);
    }
    /**
     * Create an array with a single item that will be used as an input for the {@link Specialfilter#specialfilter(List)} method.
     *
	 * @return A new set.
     */
    private Set<Double> newSet2(){
		return new HashSet<>(1);
    }
	private void setUp() throws Exception{
		set = newSet();
	}
	/**
		Create an array of two items which will be used as an input for the {@link Specialfilter#specialfilter(List)} method.
		
	 * @return A new array.
	 */
    private Set<Double> allItems(){
        return new HashSet<>(2);
    }

	/**
	 * Checks if there are no items left that are less than 10 or only first and then last digits of the given number.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkOneArray(){
		Integer num = new Specialfilter().specialfilter(allItems());
		assertEquals(newSet(), newHashSet(num));
	}
	/**
	 * Checks if there are one or two more that a given number of items.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkDifferents(){
		newSet.add(4);
		Integer num = new Specialfilter().specialfilter(newSet2());
		List<Double> newList = new Specialfilter().specialfilter(newSet);
    	assertNotEquals(newSet, newhashSet(num));
	}
	/**
	 * Checks if two items which are the same are considered equal.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkEqual(){
		Integer num = new Specialfilter().specialfilter(allItems());
		Integer num2 = newSpecialfilter().specialfilter(newSet2());
		Set<Double> newSet = new HashSet<>();
		newSet.add(4);
		newHashSet(num).add(4);
		newHashSet(num2).add(4);
		assertEquals(num, new HashSet<>(num).size());
		assertEquals(1, new HashSet<>(num).size());
		assertEquals(0, newHashSet(2).size());
	}
	/**
	 * Checks if the items are different when they are different by first and last digits (1, 3, 5, 7, 9) of two items.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkDifference(){
		Integer num = new Specialfilter().specialfilter(allItems());
		newSet.add(0);
		Integer num2 = newSpecialfilter().specialfilter(num);
		assertTrue(newSet.contains(0));
		assertFalse(newSet.contains(1));
		assertTrue(newSet.contains(2));
		assertFalse(newSet.contains(4));
	}

    /**
     * Create an array with a single item that will be used as an input for the {@link Specialfilter#specialfilter(Set)} method.
     *
     * @return A new array.
     */
    private Set<Integer> newSet(){
        return new HashSet<>();
    }
    /**
     * Create an array with a single item that will be used as an input for the {@link Specialfilter#specialfilter(Set)} method.
     *
	 * @return A new set.
     */
    private Set<Integer> newSet2(){
        return new HashSet<>();
    }
	/**
	 * Checks if there are no items left than only first and only last digits of the given number.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkTwoArray(){
		Integer num = new Specialfilter().specialfilter(allItems());
		assertNotEquals(newSet(), newHashSet(num));
	}
	/**
	 * Checks if two items which are the same are considered equal.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkEqual2(){
		Integer num = new Specialfilter().specialfilter(allItems());
		Integer num2 = newSpecialfilter().specialfilter(newSet2());
		Set<Integer> newSet = new HashSet<>();
		newSet.add(1);
		newSet.add(1);
		newHashSet(num).add(1);
		newHashSet(num2).add(1);
		assertEquals(2, newHashSet(num).size());
		assertEquals(0, newHashSet(2).size());
		assertEquals(1, newHashSet(num2).size());
		assertEquals(1, newHashSet(num).size());
	}
	/**
	 * Checks if the items are different when they are different by first and only last digit (1, 3, 5, 7, 9) of two items.
	 *
	 * {@link #specialfilter(List) }
	 *
	 * @throws Exception when something goes wrong.
	 */
	@Test public void checkDifferents2(){
		Integer num = new Specialfilter().specialfilter(allItems());
		newSet.add(0);
		Integer num2 = newSpecialfilter().specialfilter(newSet2());
		Set<Integer> newSet = new HashSet<>();
		newSet.add(0);
		newHashSet(num).add(0);
		newHashSet(num2).add(0);
		assertNotEquals(0, newHashSet(num), newSet);
		assertNotEquals(0, newHashSet(num2), newSet);
	}
}
