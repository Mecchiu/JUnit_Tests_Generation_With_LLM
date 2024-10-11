// MonotonicTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains one unit test case for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {

    /**
     * Test case for the <code>monotongo</code> method.
     */
    @Test
    public void testMonotongo_0arg() {
        Monotonic.monotonic(new List<Integer>());
    }
    
    /**
     * Test case for the <code>monotongo</code> method.
     */
    @Test
    public void testMonotongo_1arg() {
        Monotonic.monotonic(new List<Integer>());
    }
    
    /**
     * Test case for the <code>monotongo</code> method.
     */
    @Test
    public void testMonotongo_1argNull() {
        boolean cond = false;
        assertFalse(Monotonic.monotongo(null));
        List<Integer> l = new List<Integer>();
        assertFalse(Monotonic.monotongo(l));
        l.clear();
        assertFalse(Monotonic.monotongo(l));
        l.addAll(new List<Integer>());
        assertTrue(Monotonic.monotongo(l));
        l.clear();
        assertTrue(Monotonic.monotongo(l));
        assertEquals(new Long(1), new Long(Monotonic.monotongo(new Long(1)).doubleValue()));
        assertEquals(new Long(1), new Long(Monotonic.monotongo(new Long(1)).longValue()));
    }
    
    /**
     * Test case for the <code>monotongo</code> method.
     */
    @Test
    public void testMonotongo_2args() {
        List<Integer> l1 = new List<Integer>();
        l1.addAll(new List<Integer>());
        assertFalse(Monotonic.monotongo(l1));
        assertEquals(new Float(1.0), new Float(Monotonic.monotongo(new Float(1)).doubleValue()));
        assertEquals(new Float(1.0), new Float(Monotonic.monotongo(new Float(1)).longValue()));
        
        List<Integer> l2 = new List<Integer>();
        l2.addAll(new List<Integer>());
        assertFalse(Monotonic.monotongo(l1, l2));
        assertEquals(new Double(1.0), new Double(Monotonic.monotongo(new Double(1)).doubleValue()));
        assertEquals(new Double(1.0), new Double(Monotonic.monotongo(new Double(1)).longValue()));
        
        List<Integer> l3 = new List<Integer>();
        l3.addAll(new List<Integer>());
        assertFalse(Monotonic.monotongo(l1, l3, new Integer(1)));
        assertEquals(new Double(1.0), new Double(Monotonic.monotongo(new Double(1)).doubleValue()));
        assertEquals(new Double(1.0), new Double(Monotonic.monotongo(new Double(1)).longValue()));
    }
}
