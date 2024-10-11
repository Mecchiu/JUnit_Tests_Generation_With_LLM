// AddElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains ten unit test cases for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
			@Test
    void testAddElements() {
        assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
        assertEquals(0, AddElements.addElements(List.of(111, 121, 3, 4000, 5, 6), 2));
        assertEquals(125, AddElements.addElements(List.of(11, 21, 3, 90, 5, 6, 7, 8, 9), 4));
        assertEquals(24, AddElements.addElements(List.of(111, 21, 3, 4000, 5, 6, 7, 8, 9), 4));
        assertEquals(1, AddElements.addElements(List.of(1), 1));
        assertEquals(-4, AddElements.addElements(List.of(1, -2, -3, 41, 57, 76, 87, 88, 99), 3));
        assertEquals(0, AddElements.addElements(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), 0));
        assertEquals(0, AddElements.addElements(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), -1));
        assertEquals(0, AddElements.addElements(List.of(), 0));
        assertEquals(0, AddElements.addElements(List.of(), 1));
    }
}