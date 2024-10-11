// SortArray1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains one unit test case for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

	/**
	 * Simple and unittest class for {@link SortArray1#sortArray(List,Object)}.
	 */
    static class SortArray1TestCases extends AbstractScenarioTest{

		/** {@inheritDoc} */
        public void testSortArray1(){
            //given
            List<Integer> numbers  = new ArrayList<Integer>();
            List<Object> numbers1 = new ArrayList<Object>();
            numbers.add(Integer.valueOf(1));
            numbers.add(Integer.valueOf(2));
            numbers.add(Integer.valueOf(3));
            numbers.add(Integer.valueOf(4));
            numbers.add(Integer.valueOf(5));
            //when
            SortArray1.sortArray(numbers, Integer.valueOf(5));
            //then
            assertFalse(numbers.contains(Integer.valueOf(5)));
            assertTrue(numbers.remove(Integer.valueOf(5)));
        }
		
		/** {@inheritDoc} */
        public void testNullSort() {
            //given
            List<Integer> numbers  = new ArrayList<Integer>();
            List<Object> numbers1 = new ArrayList<Object>();
            numbers.add(Integer.valueOf(1));
            numbers.add(Integer.valueOf(2));
            numbers.add(Integer.valueOf(3));
            //when
            SortArray1.sortArray(numbers, Integer.valueOf(5));
            //then
            assertFalse(numbers.contains(Integer.valueOf(5)));
        }

                    
		/** {@inheritDoc} */
        public void testSortArray() {
            //given
            List<Integer> numbers  = new ArrayList<Integer>();
            List<Object> numbers1 = new ArrayList<Object>();
            List<Integer> numbers2 = new ArrayList<Integer>();
            numbers.add(Integer.valueOf(1));
            numbers.add(Integer.valueOf(2));
            numbers.add(Integer.valueOf(3));
            numbers.add(Integer.valueOf(4));
            numbers.add(Integer.valueOf(5));
            numbers2.add(Integer.valueOf(1));
            numbers2.add(Integer.valueOf(2));
            numbers2.add(Integer.valueOf(3));
            numbers2.add(Integer.valueOf(4));
            numbers2.add(Integer.valueOf(5));
            //when
            SortArray1.sortArray(numbers, numbers1);
            SortArray1.sortArray(numbers, numbers2);
            //then
            assertEquals(numbers.size(), numbers2.size());
            for (int i = 0; i < numbers2.size(); i++) {
                assertEquals(numbers2.get(i), numbers.get(i));
            }
        }
		
	}

	/**
	 * Simple class for {@link AbstractScenarioTest#testSortArray()}.
	 */
    static class SortArray1Test extends SortArray1TestCases {
		
		/** {@inheritDoc} */
        public SortArray1Test() {
            //no-op
        }
	}

	/**
	 * Create unittest for {@link SortArray1#sortArray(List,List)}.
	 */        
    @Test
    public void sortArray() {
        
        //given
        //TODO: implement
        //given
        
    }

	/**
	 * Compares two numbers with the comparator.
	 * <p>
	 * @return A list containing only unique elements in both sublists if the sublists
	 *     are sorted and duplicates are removed.
	 */
    private List<Object> sortArray(List<Object> numbers1, List<Object> numbers2) {
        List<Object> sortedNumbers = new ArrayList<Object>();
        Collections.sort(numbers1);
        Collections.sort(numbers2);
        sortedNumbers.addAll(numbers1);
        sortedNumbers.addAll(numbers2);
        return sortedNumbers;
    }
    
}
                            
