// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {
/**
		* The singleton instance of {@link StartState} should be a singleton instance.
		* Creation date: (19/02/01 4:22:22 PM)
		*
		* @throws IllegalStateException
		*    If {@link StartState#getSingleton()} does not return a singleton instance.
		*    There must be exactly one non-null instance to be valid.
		*/
    @junit.jupiter.Unit
    @Test
    void getSingleton_illegalStateTest() {
	  assertTrue(StartState.getSingleton().getClass() == StartState.class);
    }

		/**
		* Create instance of {@link StartState} with only a single instance of {@link StartState} class.
		* Testing this case by setting the instance of {@link StartState} to {@code null} by setting its
		*      {@link java.lang.IllegalStateException} static field to exception class {@link NullPointerException}.
		*    Creation date: (19/02/01 4:22:22 PM)
		*    In method: {@link com.example.jockmacmad.jstate.state.StartState#getSingleton()}
		*/
    @junit.jupiter.Unit
    @Test
    void getSingletonWith_illegalStateTest_nullTest() {
	  assertTrue(null == StartState.getSingletonWith());
    }

		/**
		* Test equals implementation of {@link Object#equals(Object)}.
		*    Creation time: (11/06/2013 07:19:23 PM)
		*    Author: Don Stewart
		*/
    @junit.jupiter.Test
    void getSingletonWith_equals_2_1_Test() {
	  EqualsBuilder equalsBuilder = new EqualsBuilder();
	  equalsBuilder.appendSuper(false);
	  equalsBuilder.append(StartState.class, null, null);
	  assertTrue(equalsBuilder.isEquals());

	  equalsBuilder = new EqualsBuilder();
	  equalsBuilder.appendSuper(false);
	  equalsBuilder.append(StartState.class, null, null);   
	
	  assertFalse("Null and non-null objects should be distinct", equalsBuilder.isEquals());

	  equalsBuilder = new EqualsBuilder();
	  equalsBuilder.appendSuper(false);
	  equalsBuilder.append(null, null, null);   
	
	  assertFalse("Different objects should be distinct", equalsBuilder.isEquals());
    }

		/**
		* Test hash generation via {@link HashCodeBuilder}, {@link HashCodeBuilder}, {@link HashCodeBuilder}, and
		* {@link EqualsBuilder}.
		*    Creation time: (11/06/2013 06:34:28 PM)
		*    Author: Don Stewart
		*/
    @junit.jupiter.Test
    void getSingletonWith_hashCode_Test() {
	  int hashCode;
	  hashCode = -619303046;
	  assertEquals("Different hash codes should be different", hashCode, 
		        new HashCodeBuilder(hashCode, 1339558923).hashCode());
	  hashCode = new HashCodeBuilder(hashCode, 1339558923).appendSuper(false).toHashCode();
	  assertNotEquals("Different hash code should be different", hashCode, 
		                new HashCodeBuilder(hashCode, 1339558923).toHashCode());
	}

		/**
		* Test {@link String#valueOf()} and 
		*    {@link String#toString()} implementations.
		*    Creation time: (10/12/2013 02:16:09 PM)
		*    Author: Don Stewart
		*/
    @junit.jupiter.Test
    void getSingletonWith_toString_Test() {

	  String string = null;
	  string = null;

	  final int hashCode = 30;
	  string = null;
	  assertEquals("String to string differs",
		  "StartState [null]", 
		  string.toString());
	  string = "a";
	  assertEquals("String to string differs with int", 
		  "StartState [a]", 
		  string.toString());

	  assertEquals("String to string differs with int", 
		  "StartState [a]", 
		  new String(string.toCharArray()));

	  assertEquals("String to string differs with int", 
		  "StartState [a]", 
		  "\"a\": \"b\"");

	  string = "A";
	  assertEquals("Should be in String representation", 
		  "StartState [A]", 
		  string.toString());
	  assertEquals("Should be in String representation", 
		  "StartState A", 
		  string.toString());

        string = "StartState [a]";
	  assertEquals("Should be in String representation", 
		  "StartState [a]", 
		  string.toString());

	  final StringBuilder stringBuilder = new StringBuilder();
	  stringBuilder.append("Escape sequence");
	  assertEquals("End of StringBuilder differs", 
		  "StartState e", 
		  stringBuilder.toString());

	  stringBuilder.append("New char sequence");
	  assertEquals("StartState n", 
		  "StartState n", 
		  stringBuilder.toString());

	  stringBuilder.append('X');
	  assertEquals("StartState o", 
		  "StartState o", 
		  stringBuilder.toString());

	  stringBuilder.setLength(0);
	  assertEquals("StartState E", 
		  "StartState e", 
		  stringBuilder.toString());
    }

    /**
     * Class of the state machine that is to be tested.
     * Testing case: {@code null} returned by {@link StartState#getSingleton()}.
     *    Creation time: (19/02/01 4:22:27 PM)
     */
    @junit.jupiter.Category(Category.TESTS)
    public final static class Main {

	/** Singleton {@link org.junit.jupiter.api.Test} test case for {@link StartState#getSingleton()} method. */
	public final static class DefaultStartState {

	    private static final Object SINGLETON = new StartState();

	    @junit.jupiter.Test
	    @Test
	    public void test_getSingleton_illegalStateTest() {
		assertTrue(StartState.getSingleton().getClass() == StartState.class);
	    }

	    /**
	     * Test overriding {@link #getSingleton_test()} to return a non-singleton instance.
	     *    This case does not test that a state that is non-singleton has a reference to itself.
	     *    Creation date: (29/10/2013 16:03:06 PM)
	     