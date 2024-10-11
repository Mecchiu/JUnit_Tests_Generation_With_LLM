// Add1Test.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {
			// Test case 1
    @Test
    void testAdd1() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5);
        int result = Add1.add(lst);
        assertEquals(6, result);
    }

    // Test case 2
    @Test
    void testAdd2() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6);
        int result = Add1.add(lst);
        assertEquals(10, result);
    }

    // Test case 3
    @Test
    void testAdd3() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7);
        int result = Add1.add(lst);
        assertEquals(10, result);
    }

    // Test case 4
    @Test
    void testAdd4() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int result = Add1.add(lst);
        assertEquals(18, result);
    }

    // Test case 5
    @Test
    void testAdd5() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int result = Add1.add(lst);
        assertEquals(18, result);
    }

    // Test case 6
    @Test
    void testAdd6() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int result = Add1.add(lst);
        assertEquals(28, result);
    }

    // Test case 7
    @Test
    void testAdd7() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        int result = Add1.add(lst);
        assertEquals(28, result);
    }

    // Test case 8
    @Test
    void testAdd8() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        int result = Add1.add(lst);
        assertEquals(40, result);
    }

    // Test case 9
    @Test
    void testAdd9() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        int result = Add1.add(lst);
        assertEquals(40, result);
    }

    // Test case 10
    @Test
    void testAdd10() {
        List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int result = Add1.add(lst);
        assertEquals(54, result);
    }
}