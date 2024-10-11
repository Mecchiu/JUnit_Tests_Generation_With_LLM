// SortEvenTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortEven}.
* It contains one unit test case for the {@link SortEven#sortEven(List)} method.
*/
class SortEvenTest {

    /**
     * This method tests the {@link SortEven#sortEven(List)} method with two inputs of
     * a null list.
     */
    @Test
    public void testNonNullInputs() {
        List<Integer> dummyList = null;
        List<Integer> leftList = new ArrayList<Integer>();
        leftList.add(-12);
        // We expect a sorted list [-12, -9, 9, 12, -11, -7, -5, -3, 3, 1, 0] to have been sorted correctly
        List<Integer> rightList = new ArrayList<Integer>();
        rightList.add(5);
        rightList.add(-12);
        sortEven(dummyList, leftList, rightList);
        assertEquals(-11, rightList.get(0));
        assertEquals(5, leftList.get(0));
    }

    /**
     * This method tests the {@link SortEven#sortEven(List)} method with two inputs of
     * a null list and null for a null input.
     */
    @Test
    public void testNullInputs() {
        List<Integer> dummyList = null;
        List<Integer> leftList = new ArrayList<Integer>();
        leftList.add();
        // We expect a sorted list [-12, -9, 9, 12, -11, -7, -5, -3, 3, 1, 0] to have been sorted correctly
        List<Integer> rightList = null;
        rightList = new ArrayList<Integer>();
        rightList.add(5);
        rightList.add(-12);
        sortEven(dummyList, leftList, rightList);
        assertEquals(-11, rightList.get(0));
        assertEquals(5, leftList.get(0));
    }

	/**
	 * This method tests the {@link SortEven#sortEven(List)} method with two inputs of
	 * a null list and a list of two null inputs.
	 */
    @Test
    public void testTwoNullInputs() {
        List<Integer> dummyList = new ArrayList<Integer>();
        List<Integer> leftList = null;
        List<Integer> rightList = new ArrayList<Integer>();
        rightList.add(-12);
        // We expect a sorted list [-12, -9, 9, 12, -11, -7, -5, -3, 3, 1, 0] to have been sorted correctly
        List<Integer> rightList2 = new ArrayList<Integer>(rightList.size() * 2);
        rightList2.add(5);
        rightList2.add(-12);
        assertEquals(-11, rightList.get(0));
        assertEquals(4, leftList.get(0));
        assertEquals(-14, rightList.get(rightList.size() - 1));
        // We expect a sorted list [-12, -9, 9, 12, -11, -7, -5, -3, 3, 1, 0] to have been sorted correctly
        assertEquals(-11, leftList.get(0));
        assertEquals(5, rightList.get(0));
        assertEquals(-14, leftList.get(rightList.size() - 1));
        // We expect a sorted list to have been sorted correctly
        assertEquals(-12, rightList2.get(0));
        assertEquals(5, rightList2.get(rightList2.size() - 1));
        assertEquals(-14, rightList.get(rightList.size() - 1));
        List<Integer> secondLst = new ArrayList<Integer>();
        secondLst.add(-12);
        // We expect a sorted list [-12, -9, 9, 12, -11, -7, -5, -3, 3, 1, 0] to have been sorted correctly
        rightList2.clear();
        firstList = new ArrayList<Integer>(rightList.size() * 2);
        secondList = new ArrayList<Integer>(rightList2.size() * 2);
        for (int i = 0; i < rightList.size(); i++) {
            firstList.add(rightList.get(i));
            secondList.add(rightList2.get(i));
        }
    }

}