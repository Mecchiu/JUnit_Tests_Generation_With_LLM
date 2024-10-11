// OrderByPointsTest.java
package original;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OrderByPoints}.
* It contains one unit test case for the {@link OrderByPoints#orderByPoints(List)} method.
*/
class OrderByPointsTest {

    /**
     * Test static method of {@link OrderByPoints#orderByPoints(List)}.
     */
    @Test(expected = UnsupportedOperationException.class)
    public void testUnsupportedOperationException_orderByPoints() {
        List<Object> result = Collections.emptyList();
        orderByPoints(result);
    }

    /**
     * Test static method of {@link OrderByPoints#orderByPoints(List)}.
     */
    @Test
    public void testOrderByPoints_emptyList() {
        assertEquals(Collections.emptyList(), Collections.emptyList());
        assertEquals(Collections.emptyList(), orderByPoints(Collections.<Integer>emptyList()));
    }

    /**
     * Test static method of {@link OrderByPoints#orderByPoints(List)}.
     */
    @Test
    public void testOrderByPoints_oneItem() {
        List<Integer> result = Collections.singletonList(1);
        List<Object> expected = Collections.singletonList(1);
        assertEquals(expected, orderByPoints(Collections.singletonList(1)));
        assertEquals(Collections.singletonList(1), orderByPoints(Collections.singletonList(1)));
        assertEquals(Collections.singletonList(1), orderByPoints(Collections.singletonList()));
        assertEquals(expected, orderByPoints(Collections.singletonList()));

        List<Object> result2 = Collections.singletonList(11);
        List<Object> expected2 = Collections.singletonList(11);
		assertEquals(expected2, orderByPoints(Collections.singletonList(11)));
        assertEquals(Collections.singletonList(11), orderByPoints(Collections.singletonList(11)));
        assertEquals(Collections.singletonList(11), orderByPoints(Collections.singletonList()));
		assertEquals(expected2, orderByPoints(Collections.singletonList()));
      
        List<Object> result3 = Collections.singletonList(-11);
        List<Object> expected3 = Collections.singletonList(-11);
		assertEquals(expected3, orderByPoints(Collections.singletonList(-11)));
        assertEquals(Collections.singletonList(-11), orderByPoints(Collections.singletonList(-11)));
        assertEquals(Collections.singletonList(-11), orderByPoints(Collections.singletonList()));

        List<Object> result9 = Collections.singletonList(-12);
        List<Object> expected9 = Collections.singletonList(-12);
		assertEquals(expected9, orderByPoints(Collections.singletonList(-12)));
        assertEquals(Collections.singletonList(-12), orderByPoints(Collections.singletonList(-12)));
        assertEquals(Collections.singletonList(-12), orderByPoints(Collections.singletonList()));

        
    }

    /**
     * Test static method of {@link OrderByPoints#orderByPoints(List)}.
     */
    @Test
    public void testOrderByPoints_multipleItems() {
        List<Integer> result = Collections.singletonList(1);
        Collections.singletonList(1);
        Collections.singletonList(11);
	Collections.singletonList(2);
	Collections.singletonList(13);
	Collections.singletonList(6);
		Collections.singletonList(7);
		Collections.singletonList(14);

        List<Object> expected = Collections.singletonList(1);
        assertEquals(expected, orderByPoints(Collections.singletonList(1)));
        assertEquals(Collections.singletonList(1), orderByPoints(Collections.singletonList(1)));
        assertEquals(expected, orderByPoints(Collections.singletonList()));

        List<Object> result2 = Collections.singletonList(11);
        Collections.singletonList(11);
		assertEquals(expected2, orderByPoints(Collections.singletonList(11)));
        assertEquals(Collections.singletonList(11), orderByPoints(Collections.singletonList(11)));
		assertEquals(expected2, orderByPoints(Collections.singletonList()));
      
        List<Object> result3 = Collections.singletonList(-11);
        Collections.singletonList(-11);
		assertEquals(expected3, orderByPoints(Collections.singletonList(-11)));
        assertEquals(Collections.singletonList(-11), orderByPoints(Collections.singletonList(-11)));
		assertEquals(expected3, orderByPoints(Collections.singletonList()));
        
        List<Object> result9 = Collections.singletonList(-12);
        Collections.singletonList(-12);
		assertEquals(expected9, orderByPoints(Collections.singletonList(-12)));
        assertEquals(Collections.singletonList(-12), orderByPoints(Collections.singletonList(-12)));
		assertEquals(expected9, orderByPoints(Collections.singletonList()));

        
    }

    /**
     * Test static method of {@link OrderByPoints#orderByPoints(List)}.
     */
    @Test
