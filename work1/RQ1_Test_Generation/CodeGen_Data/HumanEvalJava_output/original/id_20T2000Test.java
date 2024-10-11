// FindClosestElementsTest.java
package original;

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
     * Test if the return value of {@link FindClosestElements#findClosestElements(List)} is correct.
     */
	private void assertFindClosestElementsCorrect(List<Double> numbers) {
		List<Double> result = FindClosestElements.findClosestElements(numbers);
		assertTrue(result.toString(), result.equals(numbers));
	}
	
	/**
	 * Test if the return value of {@link FindClosestElements#findClosestElements(List)} is correct.
	 */
	@Test
	public void testFindClosestElementsCorrect() {
		List<Double> numbers = new ArrayList<Double>(10);
		for (int i = 0; i < 10; i++) {
			numbers.add(1.0 - i/10.0);
			numbers.add(2.0 - i/10.0);
			numbers.add(3.0 - i/10.0);
		}
		assertFindClosestElementsCorrect(numbers);
	}
	
	/**
	 * Test if the return value of {@link FindClosestElements#findClosestElements(List)} is incorrect.
	 */
	@Test
	public void testFindClosestElementsIllegalData() {
		List<Double> numbers = new ArrayList<Double>();
		try {
            FindClosestElements.findClosestElements(numbers);
        } catch (IllegalArgumentException e) {
            assertEquals("Could not create a List<Double> for use as an argument for this method. Expected an empty list, but got: " + e.getMessage(), e.getMessage());
		}
	}

	/**
	 * Test if the return value of {@link FindClosestElements#findClosestElements(List)} is incorrect.
	 */
	@Test
	public void testFindClosestElementsTooMany() {
		List<Double> number0 = new ArrayList<Double>(5);
		Collections.shuffle(number0);
		List<Double> number1 = new ArrayList<Double>(50);
		Collections.shuffle(number1);
		List<Double> number3 = new ArrayList<Double>(50);
		Collections.shuffle(number3);
		for (int i = 0; i <= number0.size(); i++) {
			double number0Value = number0.get(i);
			for (int j = 0; j <= i; j++) {
				double number1Value = number1.get(j);
				for (int k = 0; k <= i; k++) {
					double number3Value = number3.get(k);

					// FindClosestElements is supposed to handle the case when the arguments do not fit into the return value of findClosestElements
					List<Double> result = FindClosestElements.findClosestElements(number0Value, number1Value, number3Value);
					assertTrue("Return value fits in number0 but not number1. List to find: " + result.toString(), result.equals(number0));
				}
			}
		}
	}

}