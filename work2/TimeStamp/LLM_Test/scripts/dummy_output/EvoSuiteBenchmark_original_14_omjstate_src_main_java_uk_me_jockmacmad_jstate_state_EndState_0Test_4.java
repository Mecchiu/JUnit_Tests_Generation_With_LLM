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
		private final EndState instance = EndState.getSingleton();

    /**
    * Creates a <code>EndState</code> object by calling its 
    * <code>{@link java.lang.Class#newInstance() create()}</code> method. 
    * The <code>{@link EndState#getSingleton() getSingleton()}</code>
    * method return the object to which this state variable should  
    * to.
    * Creation date: (1/10/17 4:29:19 AM)
    * @since 0.1
    */
	@Test
	public void newInstance() {
		assertTrue(EndState.getSingleton().equals(instance));
	}
	
	/**
	 * Test method for {@link EndState#equals(Object)}
	 * created by {@link java.lang.Object#equals(Object)}.
	 * <P>
	 * Tests correct behavior in case the <code>Object</code>
	 * representing the objects are equal to the objects.
	 * <P>
	 * Creation date: (3/16/10 4:37:18 AM)
	 * @since 0.1
	 */
	@Test
	public void testEqualsObject() {
		assertTrue(EqualsBuilder.reflectionEquals(instance, instance));
	}
	
	/**
	 * Test method for {@link EndState#hashCode()}
	 * created by {@link java.lang.Object#hashCode()}.
	 * <P>
	 * Tests correct behavior in case the {@link EndState} object is 
	 * instance of a class <code>Object</code>.
	 * <P>
	 * Creation date: (18/12/10 11:49:43 AM)
	 * @since 0.1
	 */
	@Test
	public void testHashCode() {
		assertTrue(HashCodeBuilder.reflectionHashCode(instance)== instance.hashCode());
	}

}