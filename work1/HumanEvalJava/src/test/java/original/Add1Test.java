// Add1Test.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add1}.
* It contains ten unit test cases for the {@link Add1#add(List)} method.
*/
class Add1Test {
			// Test case 1: empty list
    @Test
    void testAdd1() {
        List<Integer> lst = List.of();
        assertEquals(0, Add1.add(lst));
    }

    // Test case 2: list with one element
    @Test
    void testAdd2() {
        List<Integer> lst = List.of(4);
        assertEquals(0, Add1.add(lst));
    }

    // Test case 3: list with two elements
    @Test
    void testAdd3() {
        List<Integer> lst = List.of(4, 2);
        assertEquals(0, Add1.add(lst));
    }

    // Test case 4: list with three elements
    @Test
    void testAdd4() {
        List<Integer> lst = List.of(4, 2, 6);
        assertEquals(0, Add1.add(lst));
    }

    // Test case 5: list with four elements
    @Test
    void testAdd5() {
        List<Integer> lst = List.of(4, 2, 6, 7);
        assertEquals(2, Add1.add(lst));
    }

    // Test case 6: list with five elements
    @Test
    void testAdd6() {
        List<Integer> lst = List.of(4, 2, 6, 7, 2);
        assertEquals(2, Add1.add(lst));
    }

    // Test case 7: list with six elements
    @Test
    void testAdd7() {
        List<Integer> lst = List.of(4, 2, 6, 7, 2, 122);
        assertEquals(122, Add1.add(lst));
    }

    // Test case 8: list with seven elements
    @Test
    void testAdd8() {
        List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 8);
        assertEquals(130, Add1.add(lst));
    }

    // Test case 9: list with eight elements
    @Test
    void testAdd9() {
        List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 8, 9);
        assertEquals(130, Add1.add(lst));
    }

    // Test case 10: list with nine elements
    @Test
    void testAdd10() {
        List<Integer> lst = List.of(4, 2, 6, 7, 2, 122, 8, 9, 10);
        assertEquals(130, Add1.add(lst));
    }
}