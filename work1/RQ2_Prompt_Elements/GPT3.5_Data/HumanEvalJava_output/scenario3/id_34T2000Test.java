// UniqueTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
    
    @Test
    void testUniqueWithEmptyList() {
        List<Integer> l = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithOneElementList() {
        List<Integer> l = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithAllElementsUnique() {
        List<Integer> l = Arrays.asList(5, 3, 2, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithAllElementsSame() {
        List<Integer> l = Arrays.asList(5, 5, 5, 5, 5, 5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithSomeElementsRepeated() {
        List<Integer> l = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        List<Integer> expected = Arrays.asList(0, 2, 3, 5, 9, 123);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithNegativeElements() {
        List<Integer> l = Arrays.asList(-5, -3, -2, -9, 0, -123);
        List<Integer> expected = Arrays.asList(-123, -9, -5, -3, -2, 0);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithMixedElements() {
        List<Integer> l = Arrays.asList(5, -3, 5, -2, 3, 3, -9, 0, 123);
        List<Integer> expected = Arrays.asList(-9, -3, -2, 0, 3, 5, 123);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithNullList() {
        List<Integer> l = null;
        assertThrows(NullPointerException.class, () -> Unique.unique(l));
    }
    
    @Test
    void testUniqueWithLargeList() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                          21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                                          41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                                          61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                                          81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                                               21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                                               41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                                               61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                                               81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
    
    @Test
    void testUniqueWithDuplicateElements() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> actual = Unique.unique(l);
        assertEquals(expected, actual);
    }
}