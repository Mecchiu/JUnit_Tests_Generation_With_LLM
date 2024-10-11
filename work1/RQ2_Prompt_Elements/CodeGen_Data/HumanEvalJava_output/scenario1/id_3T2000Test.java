// BelowZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains one unit test case for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	/**
	 * Test cases, for {@link BelowZero#belowZero(List)}.
	 */
    @junit.jupiter.Skipping(feature = "unit")
    @Test
    public void testBelowZero() {
		List<Object> operArray = underTest();
		List<Object> expected = Arrays.asList(1, 2, 3);
		
//		System.out.println("Operations: ");
//		for (List<Object> operation : operArray) {
//			System.out.println("  o1: " + operation.get(0));
//			System.out.println("  o2: " + operation.get(1));
//			System.out.println("  o3: " + operation.get(2));
//		}
//		System.out.println();
		
		List<Object> after = belowZero(operArray);
		assertEquals(expected, after);
	}
	
    @junit.jupiter.Skipping(feature = "unit")
    @Test
    public void testAboveZero() {
		List<Object> operArray = underTest();
		List<Object> expected = Arrays.asList(4, 5, 6);
		
//		System.out.println("Operations: ");
//		for (List<Object> operation : operArray) {
//			System.out.println("  o1: " + operation.get(0));
//			System.out.println("  o2: " + operation.get(1));
//			System.out.println("  o3: " + operation.get(2));
//		}
//		System.out.println();
		
		List<Object> after = belowZero(operArray);
		assertEquals(expected, after);
	}
	
    @junit.jupiter.Skipping(feature = "unit")
    @Test
    public void testOperationAboveZero() {
		List<Object> operArray = underTest();
		List<Object> expected = Arrays.asList(7, 8, 9);
		
//		System.out.println("Operations: ");
//		for (List<Object> operation : operArray) {
//			System.out.println("  o1: " + operation.get(0));
//			System.out.println("  o2: " + operation.get(1));
//			System.out.println("  o3: " + operation.get(2));
//		}
//		System.out.println();
		
		List<Object> after = aboveZero(operArray);
		assertEquals(expected, after);
	}
	
    @junit.jupiter.Skipping(feature = "unit")
    @Test
    public void testOperationsAboveZero() {
		List<Object> operArray = underTest();
		List<Object> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
		
//		System.out.println("Operations: ");
//		for (List<Object> operation : operArray) {
//			System.out.println("  o1: " + operation.get(0));
//			System.out.println("  o2: " + operation.get(1));
//			System.out.println("  o3: " + operation.get(2));
//		}
//		System.out.println();
		
		List<Object> after = aboveZero(operArray);
		assertEquals(expected, after);
	}

    @junit.jupiter.Skipping(feature = "unit")
    @Test
    public void testSameNumberOfOperations() {
		List<Object> operArray = underTest();
		List<Object> expected = Arrays.asList(1, 2, 2, 2);
		
	//	System.out.println("Operations: ");
	//	for (List<Object> operation : operArray) {
	//		System.out.println("  o1: " + operation.get(0));
	//		System.out.println("  o2: " + operation.get(1));
	//		System.out.println("  o3: " + operation.get(2));
	//	}
//		System.out.println();
		
		List<Object> after = belowZero(operArray);
		assertEquals(expected, after);
	}
	
    private <T> List<T> underTest() {
    	return Arrays.asList("o1", "o2", "o3");
    }
    
}
