// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains one unit test case for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    /**
     * Unit test to concatenate string.
     */
    @Test
	public void testConcatenate() {
		assertEquals("", concatenate("One"));
		assertEquals("Two", concatenate("Two"));
        assertEquals("Three", concatenate("Three"));
        assertEquals("A", concatenate("A"));
        assertEquals("", concatenate(""));
    }

    /**
     * Test that the correct index range has been initialized.
     */
    @Test
	public void testInitList() {
        List<Object> list = concatenate([1, 2, 3]);
        assertTrue(list.size() == 3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    /**
     * Unit test with the number of elements that will be
     * printed to the console in the unit test case.
     */
    @Test
	public void testConsole() {
        List<Object> list = concatenate([1, 2, 3]);
        System.out.println(list);
        list = concatenate([2, 3]);
        System.out.println(list);
        list = concatenate([1, 2, 5]);
        System.out.println(list);
    }

}