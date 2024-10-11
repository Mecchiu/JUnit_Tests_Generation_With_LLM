// TotalMatchTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains ten unit test cases for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
	// Test case 1
    @Test
    void testTotalMatch1() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("d", "e", "f");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }
			// Test case 2
    @Test
    void testTotalMatch2() {
        List<Object> lst1 = List.of("a", "b", "c");
        List<Object> lst2 = List.of("d", "e", "f", "g");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst1, result);
    }
			// Test case 3
    @Test
    void testTotalMatch3() {
        List<Object> lst1 = List.of("a", "b", "c", "d");
        List<Object> lst2 = List.of("d", "e", "f");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 4
    @Test
    void testTotalMatch4() {
        List<Object> lst1 = List.of("a", "b", "c", "d");
        List<Object> lst2 = List.of("d", "e", "f", "g");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 5
    @Test
    void testTotalMatch5() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e");
        List<Object> lst2 = List.of("d", "e", "f");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 6
    @Test
    void testTotalMatch6() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e");
        List<Object> lst2 = List.of("d", "e", "f", "g");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 7
    @Test
    void testTotalMatch7() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f");
        List<Object> lst2 = List.of("d", "e", "f");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 8
    @Test
    void testTotalMatch8() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f");
        List<Object> lst2 = List.of("d", "e", "f", "g");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 9
    @Test
    void testTotalMatch9() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f", "g");
        List<Object> lst2 = List.of("d", "e", "f");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
			// Test case 10
    @Test
    void testTotalMatch10() {
        List<Object> lst1 = List.of("a", "b", "c", "d", "e", "f", "g");
        List<Object> lst2 = List.of("d", "e", "f", "g");
        List<Object> result = TotalMatch.totalMatch(lst1, lst2);
        assertEquals(lst2, result);
    }
}
