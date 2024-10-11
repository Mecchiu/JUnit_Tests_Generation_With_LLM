// ProdSignsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
	// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Object> arr = List.of();
        Integer result = ProdSigns.prodSigns(arr);
        assertNull(result);
    }

    // Test case 2: List with one element
    @Test
    void testOneElement() {
        List<Object> arr = List.of(5);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(5, result);
    }

    // Test case 3: List with two elements
    @Test
    void testTwoElements() {
        List<Object> arr = List.of(5, -2);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(-10, result);
    }

    // Test case 4: List with three elements
    @Test
    void testThreeElements() {
        List<Object> arr = List.of(5, -2, 0);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 5: List with four elements
    @Test
    void testFourElements() {
        List<Object> arr = List.of(5, -2, 0, 3);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 6: List with five elements
    @Test
    void testFiveElements() {
        List<Object> arr = List.of(5, -2, 0, 3, -4);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 7: List with six elements
    @Test
    void testSixElements() {
        List<Object> arr = List.of(5, -2, 0, 3, -4, 2);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 8: List with seven elements
    @Test
    void testSevenElements() {
        List<Object> arr = List.of(5, -2, 0, 3, -4, 2, -1);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 9: List with eight elements
    @Test
    void testEightElements() {
        List<Object> arr = List.of(5, -2, 0, 3, -4, 2, -1, 4);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }

    // Test case 10: List with nine elements
    @Test
    void testNineElements() {
        List<Object> arr = List.of(5, -2, 0, 3, -4, 2, -1, 4, -3);
        Integer result = ProdSigns.prodSigns(arr);
        assertEquals(0, result);
    }
}
