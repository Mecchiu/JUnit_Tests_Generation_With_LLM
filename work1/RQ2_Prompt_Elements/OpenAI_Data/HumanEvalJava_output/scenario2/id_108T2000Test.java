// CountNumsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {
	@Test
    void testCountNums() {
        assertEquals(0, CountNums.countNums(List.of()));
        assertEquals(0, CountNums.countNums(List.of(0)));
        assertEquals(1, CountNums.countNums(List.of(1)));
        assertEquals(1, CountNums.countNums(List.of(-1)));
        assertEquals(1, CountNums.countNums(List.of(10)));
        assertEquals(1, CountNums.countNums(List.of(-10)));
        assertEquals(2, CountNums.countNums(List.of(1, 2)));
        assertEquals(2, CountNums.countNums(List.of(-1, 2)));
        assertEquals(2, CountNums.countNums(List.of(1, -2)));
        assertEquals(2, CountNums.countNums(List.of(-1, -2)));
    }
}
