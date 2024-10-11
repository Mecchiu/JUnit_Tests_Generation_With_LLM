// CompareOneTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
// CompareOne.java
package scenario2;

class CompareOne {

    /**
     * * Create a function that takes integers, floats, or strings representing
     * real numbers, and returns the larger variable in its given variable type.
     * Return null if the values are equal.
     * Note: If a real number is represented as a string, the floating point might be. or,
     */
    public static Object compareOne(Object a, Object b) {
        Object temp_a = a;
        Object temp_b = b;
        if (temp_a instanceof String) {
            temp_a = ((String) temp_a).replace(',', '.');
        }
        if (temp_b instanceof String) {
            temp_b = ((String) temp_b).replace(',', '.');
        }
        if (Float.parseFloat(temp_a.toString()) == Float.parseFloat(temp_b.toString())) {
            return null;
        }
        return Float.parseFloat(temp_a.toString()) > Float.parseFloat(temp_b.toString())? a : b;
    }
}

// CompareOneTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
		
	@Test
	public void compareOneTest() throws Exception {
		
		assertEquals(compareOne(new String("12.0"), new String("2.0")), "2.0");
		assertEquals(compareOne(new String("12.0"), new String("01.0")), "01.0");
        
	}
	
}