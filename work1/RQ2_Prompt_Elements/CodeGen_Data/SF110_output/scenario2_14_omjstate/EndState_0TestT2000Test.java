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
static final org.junit.jupiter.api.Tag TAG = org.junit.jupiter.api.Tag.NONE;

	@Test
    void testConstructor() {
		System.out.println("Testing Constructor with no specific constructor argument");
	}

	@Test
    void testEquals() {
		System.out.println("Testing equals");

		// We can't just use EqualsBuilder as a finalizer
		EndState aObj;
		EndState bObj;
		assertEquals(aObj, bObj);

		aObj = new EndState();
		assertNotEquals(aObj, bObj);
		assertNotEquals(aObj, bObj);

		aObj = new EndState();
		bObj = new EndState();
		assertNotEquals(aObj, bObj);
		assertNotEquals(aObj, bObj);
	}

	@Test
    @org.junit.jupiter.api.Disabled
    void testHashCode() {
		System.out.println("Testing hashtable hashcode");

		// We can't just use HashCodeBuilder since finalizers need to be installed
		EndState aObjCmp;
		EndState aObj;
		aObjCmp = new EndState();
		aObj = new EndState();
		HashCodeBuilder hb = new HashCodeBuilder(29, 7);
		hb.toHashCode(aObj);
		assertEquals(aObj.hash(), hb.toHashCode(aObj));

		aObj = new EndState();
		aObjCmp = new EndState();
		HashCodeBuilder hb2 = new HashCodeBuilder(29, 7);
		hb2.toHashCode(aObjCmp);
		assertEquals(aObjCmp.hash(), hb2.toHashCode(aObjCmp));

		aObj = new EndState();
		aObjCmp = new EndState();
		hb2 = new HashCodeBuilder(17, 3);
		hb2.toHashCode(aObjCmp);
		assertEquals(aObjCmp.hash(), hb2.toHashCode(aObjCmp));

		aObj = new EndState();
		aObjCmp = new EndState();
		hb2 = new HashCodeBuilder(17, 3);
		hb2.toHashCode(aObjCmp);
		assertEquals(aObjCmp.hash(), hb2.toHashCode(aObjCmp));

		aObj = new EndState();
		aObjCmp = new EndState();
		aObjCmp.setType("TYPE");
		aObjCmp.getName();
		assertNotEquals(aObjCmp.hashCode(), aObjCmp.hashCode());
	}
}

/**
 * {@link uk.me.jockmacmad.jstate.state.EndState #END_STATE} class.
 *
 * @author Don Stewart
 * @version 0.1
 * @since 0.1
 * @see EndState
 */
public final IState endState;

/**
 * Instantiates an EndState object by the given singleton implementation.
 *
 * @param singleton The object implementation.
 * @since 0.1
 * @see EndState
 */
public EndState_0Test(final IState singleton) {
	endState = singleton;
	// Empty default constructor
}


/**
* @return Returns the singleton instance of {@link uk.me.jockmacmad.jstate.state.EndState}.
* @since 0.1
* @see uk.me.jockmacmad.jstate.state.EndState
*/
public final IState getSingleton() {
	return endState;
}

}
