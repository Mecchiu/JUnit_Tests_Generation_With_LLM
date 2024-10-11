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
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "Test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("Test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Longer() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "tes".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Shorter() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("tes"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test2".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Different() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test2"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
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

    private final java.lang.String Value;

    /**
     * StringMatchesGuardCondition constructor comment.
     */
    public StringMatchesGuardCondition(java.lang.String newStr) {
    }

    /**
     * Insert the method's description here.
     * Creation date: (2/26/01 5:09:09 PM)
     * @return boolean
     * @param o java.lang.Object
     */
    public boolean evaluate(Object o);

    /**
     * Insert the method's description here.
     * Creation date: (2/26/01 5:11:09 PM)
     * @return java.lang.String
     */
    public final java.lang.String getValue();

    /**
     * Returns a String that represents the value of this object.
     * @return a string representation of the receiver
     */
    @Override
    public String toString();
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
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "Test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("Test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Longer() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "tes".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Shorter() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("tes"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test2".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Different() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test2"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
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

    private final java.lang.String Value;

    /**
     * StringMatchesGuardCondition constructor comment.
     */
    public StringMatchesGuardCondition(java.lang.String newStr) {
    }

    /**
     * Insert the method's description here.
     * Creation date: (2/26/01 5:09:09 PM)
     * @return boolean
     * @param o java.lang.Object
     */
    public boolean evaluate(Object o);

    /**
     * Insert the method's description here.
     * Creation date: (2/26/01 5:11:09 PM)
     * @return java.lang.String
     */
    public final java.lang.String getValue();

    /**
     * Returns a String that represents the value of this object.
     * @return a string representation of the receiver
     */
    @Override
    public String toString();
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
	* Test data: null.
	* Expected result: false.
	*/
	@Test
	void testEvaluate_Null() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(null));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_EmptyString() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate(""));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "Test".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("Test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test1".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Longer() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test1"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "tes".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Shorter() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("tes"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test2".
	* Expected result: false.
	*/
	@Test
	void testEvaluate_String_Different() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertFalse(guard.evaluate("test2"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseSensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
	}
	
	/**
	* Test case for {@link StringMatchesGuardCondition#evaluate(Object)} method.
	* Test data: "test".
	* Expected result: true.
	*/
	@Test
	void testEvaluate_String_Same_CaseInsensitive() {
		StringMatchesGuardCondition guard = new StringMatchesGuardCondition("test");
		assertTrue(guard.evaluate("test"));
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

    private final java.lang.String Value;

    /**
     * StringMatchesGuardCondition constructor comment.
     */
    public StringMatchesGuardCondition(java.lang.String newStr) {
    }

    /**
     * Insert the method's