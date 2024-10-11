// EndState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#getSingleton()} method.
*/
class EndState_0Test {
		
	@Test
	void testToObject() {
		assertEquals("EndState_0Test#testToObject -- Equality Testing", SINGLETON, SINGLETON.toObject());
		assertNotEquals("EndState_0Test#testToObject -- Not (2) Equal", SINGLETON, new Object());;
	}
	
	/**
	 *  Test the {@link EqualsBuilder} class.
	 * 
	 *  @since 0.2
	 */
	@Test
	public void testEquals() {
		EndState obj1
			= new EndState();
		assertEquals(obj1, obj1);
		EndState equalObj;
		assertDefaultEquals(equalObj = new EndState());
		assertEquals(equalObj, equalObj);
		assertNotDefaultEquals(equalObj, new Object());
		assertEquals(equalObj.hashCode(), obj1.hashCode());
        assertTrue(obj1 instanceof EqualsBuilder);
		assertFalse(obj1 == null);
		assertFalse(obj1 instanceof EqualsBuilder || obj1 instanceof HashCodeBuilder);
	}
	
}