// CompareOneTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
// CompareOne.java
package scenario1;

class CompareOne {

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
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
		
  /**
   * Constructor of the class.
   */
    public CompareOneTest() {
    }
	
	@Test
	public void testToString() {
		System.out.println(CompareOne.compareOne(1,2));
	}
	
}

// Class to test class {@link CompareOne}
