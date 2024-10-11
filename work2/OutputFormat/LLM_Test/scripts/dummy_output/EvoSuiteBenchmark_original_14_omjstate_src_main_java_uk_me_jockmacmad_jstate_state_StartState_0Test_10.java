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
		 * Method for {@link StartState#getSingleton()} tests.
		 * @since 0.1
		 */
    @Test
    public void testInstanceOf_1() {
        assertNotNull(StartState.getSingleton());
    }

    // Instance of StartState_0Test
    private final static StartState START = new StartState();
                /**
* Method for testing of the equals().
* @since 0.1
* @see EqualsBuilder#reflectionEquals(Object, Object)
* @param pIState the state to compare against
* @param pObject the state to compare against
*/
    @Test
      public void testEquals_2() {
      assertTrue(START.equals(StartState.getSingleton()));
      }

    // Instance of StartState_0Test
    private static final StartState START1 = new StartState();
                /**
* Method for testing of the hashCode().
* @since 0.1
* @see HashCodeBuilder#reflectionHashCode(Object)
* @param pIState the state to compare against
*/
    @Test
    public void testHashCode_3(@SuppressWarnings("unused") final StartState pIState) {
        assertEquals(START1.hashCode(), START.hashCode());
    }

    // Instance of StartState_0Test
    private final static StartState START2 = new StartState();
                /**
* Test equals method.
* @since 0.1
* @see EqualsBuilder#reflectionEquals(Object)
* @param pIState the state to compare against
*/
    @Test
      public void testEquals(@SuppressWarnings("unused") final StartState pIState) {
        assertNotNull(START2.equals(START2));
    }

    // Instance of StartState_0Test
    private final static StartState START3 = new StartState();
                /**
* Method for testing of the toString() method.
* @since 0.1
* @see ReflectionToStringBuilder#toString(Object)
* @param pIState the state to compare against
*/
    @Test
      public void testToString_4(@SuppressWarnings("unused") final StartState pIState) {
        assertNotEquals(START3, START2);
  }
}