// CommonTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
private List<List<Object>> o1 = null;
		private List<Object> o2 = null;

    /**
     * Initializes the objects of the test class to the default values.
     */
    public void setUp() {
        o1 = new List[] {
             new Object[] { 1, 2 },
             new Object[] { 2, 3 },
             new Object[] { 3, 4 },
             new Object[] { 4, 5 },
             new Object[] { 5, 6 },};
        o2 = new List[] {
             new Object[] { 1, 5 },
             new Object[] { 3, 4 },
             new Object[] { 5, 5 },};
	}

    /**
     * Creates a new check object. <B>It is guaranteed to be consistent with the set of objects in the test.</B>
     * It should use the constructor
     * of {@link Common} class.
     */
    public void testConstructor() {
        assertNotNull("The new check object can not be null.",
               new Common());
    }

    /**
     * Test-case for {@link Common#isUnique(List, List)}.
     */
    @Test
    public void isUnique_Test() {
        boolean b = Common.isUnique(o1, o2);
        assertTrue("The result is incorrect.",
               b);
    }

    /**
     * Test-case for {@link Common#sum(Object, Object)}.
     */
    @Test
    public void sumOfSums_Test() {
        int i = Common.sum(o2, o2);
        assertEquals("The sum of results is incorrect.",
                  ((Common) o1).sum(o1),
                  (o2).sum(o2));
    }
}
