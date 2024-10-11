// CompareOneTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
// CompareOne.java
package scenario3;

class CompareOne {

    /**
     * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be. or,
     *
     * compareOne(1, 2.5) ➞ 2.5
     * compareOne(1, "2,3") ➞ "2,3"
     * compareOne("5,1", "6") ➞ "6"
     * compareOne("1", 1) ➞ None
     *
     * > compareOne(1, 2)
     * 2
     * > compareOne(1, 2.5)
     * 2.5
     * > compareOne(2, 3)
     * 3
     * > compareOne(5, 6)
     * 6
     * > compareOne(1, "2,3")
     * "2,3"
     * > compareOne("5,1", "6")
     * "6"
     * > compareOne("1", "2")
     * "2"
     * > compareOne("1", 1)
     * null
     */
    public static Object compareOne(Object a, Object b) {
    }
}

// CompareOneTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
		static void assertEqual(double a, double b){
		assertTrue(a == b);
		}
	@Test
	void test(){
		assertEqual(1, "1");
		assertEqual(2.56, "1,2.56");
		assertEqual(2, "1,2");
	}

	@Test
	public void test_2int(){
		Object a = new CompareOne(1,"1");
		Object b = new CompareOne(2,"1");
		assertEqual(1, "1,2");
		assertEqual(2.56, "1,2.56");
		assertEqual(1, "1,2");
		assertEqual(1, a);
		assertEqual(1, b);
	}

	@Test
	public void test_booleanOperations(){
		assertTrue(true);
		assertFalse(false);
	}
}
