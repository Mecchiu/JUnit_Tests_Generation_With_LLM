// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_1() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test");
		boolean result = fixture.evaluate(o);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_2() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test2");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_3() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_4() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test ");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_5() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event(" test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_6() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_7() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_8() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_9() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_10() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
}

// StringMatchesGuardCondition.java
package uk.me.jockmacmad.jstate.state;

/**
 * Insert the type's description here.
 * Creation date: (2/26/01 5:09:09 PM)
 *
 * @author: Administrator
 */
public class StringMatchesGuardCondition implements uk.me.jockmacmad.jstate.state.IGuardCondition {

    public boolean evaluate(Object o) {
        boolean rc = false;
        try {
            java.util.Vector params = ((uk.me.jockmacmad.jstate.state.Event) o).getParameters();
            String str = (String) params.elementAt(0);
            if (Value.equals(str)) {
                rc = true;
            }
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return rc;
    }
}

// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_1() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test");
		boolean result = fixture.evaluate(o);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_2() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test2");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_3() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_4() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test ");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_5() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event(" test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_6() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_7() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_8() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_9() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_10() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test test test test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
}

// StringMatchesGuardCondition.java
package uk.me.jockmacmad.jstate.state;

/**
 * Insert the type's description here.
 * Creation date: (2/26/01 5:09:09 PM)
 *
 * @author: Administrator
 */
public class StringMatchesGuardCondition implements uk.me.jockmacmad.jstate.state.IGuardCondition {

    public boolean evaluate(Object o) {
        boolean rc = false;
        try {
            java.util.Vector params = ((uk.me.jockmacmad.jstate.state.Event) o).getParameters();
            String str = (String) params.elementAt(0);
            if (Value.equals(str)) {
                rc = true;
            }
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return rc;
    }
}

// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {
		
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_1() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test");
		boolean result = fixture.evaluate(o);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_2() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test2");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_3() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_4() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test ");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_5() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event(" test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_6() {
		StringMatchesGuardCondition fixture = new StringMatchesGuardCondition();
		fixture.Value = "test";
		Object o = new Event("test test");
		boolean result = fixture.evaluate(o);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: false.
	