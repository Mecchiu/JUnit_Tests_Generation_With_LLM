// BelowZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains one unit test case for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	/**
	 * Given a list of deposit and withdrawal operations on a bank account,
	 * then you're supposed to output False for the above boolean function.
	 * However, if {@link BelowZero#belowZero(List)} does not return
	 * that, your test should continue and you should not generate
	 * any output.
	 *
	 * > belowZero([1, 2, 3])
	 * false
	 */
	@Test
	void test() {
		assertFalse(BelowZero.belowZero(null));
	}
}

// BelowZero.java
/*
 * Class belowZero implements <a href="https://en.wikipedia.org/wiki/If_expression">if</a>-case-
 * operator and the <a href="https://en.wikipedia.org/wiki/Else_expression">else</a>-expression.
 * This also covers and example from below documentation.
 */
class BelowZero {

    /**
     * Checks if <code>oper</code> is satisfied by {@link BeforeZero#aboveZero(List)},
     * and that <code>oper.add(belowZero)</code> does.
     */
    public static Boolean belowZero(List<Object> oper) {  
        List<Object> listToCheck = beforeZeroCheck(oper);
        return (listToCheck.get(0) == null);
    }
    
    /**
     * Checks the size of the list <code>oper</code> is equal to the list, and that
     * the operations below the oper are less than this list, with all remaining iterations.
     * If the list is not equal to the other oper list, <code>equal</code>, False is returned.
     */
    public static Boolean equal(List<Object> oper, List<Object> other) {
        int sizeList = oper.size();
        int otherSizeList = other.size();
        if (otherSizeList == 0) {
            return Boolean.FALSE;
        }
        if (otherSizeList == sizeList) {
            for (int i = 0; i < oper.size(); i++) {
                Object o = oper.get(i);
                Object ob = other.get(i);
                // Check if both oper are equal
                if (o!= ob) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
    
    /**
     * Tests that the other oper set is smaller than <code>oper</code>
     */
    public static Boolean same(List<Object> oper, List<Object> other) {
        return equal(oper, other);
    }
    
    public final static List<Object> beforeZeroCheck(List<Object> oper) {
        // This is the size of the other oper list.
        int size = oper.size();
        // Make the other oper list at least equal to the oper list
        List<Object> previousList = new List();
        for (int i = 0; i < oper.size(); i++) {
            Object temp = oper.get(i);
            previousList.add(temp);
        }
        boolean same = beforeZeroCheck(previousList);
        return same? previousList : new List();
    }
}
