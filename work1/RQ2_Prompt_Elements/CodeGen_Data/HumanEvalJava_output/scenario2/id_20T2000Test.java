// FindClosestElementsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains one unit test case for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {
/**
		* Given Number of values to find, return Number of possible values for which the first {@link Double} is greater
          * than this argument.
    */
	@Test
	public void givenParameterInt_thenReturnElementsLessThanInt() {
		List<Double> numberArray = new ArrayList<Double>();
		for(int i = 1; i < numberArray.size(); i++) {
            numberArray.add(i);
        }
		
	}
		/**
		* Given two lists of numbers (of length at least two) with two elements each being the smallest and equal value 
		* in both lists, select the elements with smallest total value that are less than both lists. Return the 
		* first element in each list.
    */
	@Test
	public void givenParameterListOfDoubles_thenEqualToTheOnlyElement() {
	    List<Double> numbers = new ArrayList<Double>();
	    numbers.add(1);
	    numbers.add(3);   
	    numbers.add(2); 
	    numbers.add(4); 
	    numbers.add(13);
	
	    List<Double> result = findClosestElements(numbers);
	    assertEquals(2, result.size());
	    assertEquals(13, result.get(0));
	    assertEquals(1, result.get(1)); 
		}
		/**
		* Given two lists of numbers (of length at least two) with two elements each being the second element of each list.
		* The second list must contain all remaining elements plus the first. The elements in the second must be the value
		* of the smallest remaining element in the list. 
    */
		@Test
		public void givenParameterValueEqualToBothElements_thenReturnValuesInTheSecondList() {
		    List<Double> numbers = new ArrayList<Double>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(15);

	        List<Double> result = findClosestElements(numbers);
	        assertEquals(20, result.get(0));
	        assertEquals(15, result.get(1)); 
		}
		/**
		* Given parameter value that is larger than the value of two elements in both lists. The value in the first of
		* the lists must be the value of the second; the value in the second must be the value of this parameter. 
    */
		@Test
		public void givenParameterValueEqlTwoElements_thenReturnValueBetweenTheTwoValues() {
		    List<Double> numbers = new ArrayList<Double>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(15);

	        List<Double> result = findClosestElements(numbers);
	        assertEquals(5, result.get(0));
	        assertEquals(20, result.get(1)); 
		}
		/**
		* Given two lists of numbers (of length at least two), with two elements each having different elements 
		* in the list. The second list must contain an identical number of elements with different elements 
		* in each list.
    */
		@Test
		public void givenParameterDifferentFromTwoElements_thenReturnListOfNumbersOfEqualSize() {
		    List<Double> numbers = new ArrayList<Double>();
	        numbers.add(6);
	        numbers.add(4);
	        numbers.add(2);
	        numbers.add(10);
	        numbers.add(11);
	        numbers.add(1);

	        List<Double> result = findClosestElements(numbers);
	        assertEquals(2, result.size());
	        assertEquals(6, result.get(0));
	        assertEquals(4, result.get(1)); 
		}
		
}
		
//FindClosestElementsTest.java