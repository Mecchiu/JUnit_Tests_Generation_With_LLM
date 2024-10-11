// EndState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#toObject()} method.
*/
class EndState_1Test {
		
  /**
   * Class representing a  state machines ending state.
   * <p>
   *   A state machine ends when the State Pattern is started in the 
   *   <code>StateStack</code> of a State Machine.  If the 
   *   State pattern represents the final state of that State Machine, then 
   *   the final State has to be the final state of the State Machine.
   * Create a new <code>EndState</code> class using the 
   *   <code>EndState.getSingleton()</code> method and create a new <code>EndState</code> 
   *   object using the <a href=http://commons-lang.org/commons-lang/usage/clause.html+State.html+State+Pattern>
   *   <code>StateStack</code> of a State Machine. 
   * @since 0.1
   * @author Don Stewart
   * @version 0.1
   * @stereotype singleton
   */
  public static class EndState2 extends java.lang.Object {
    /**
     * Create a new <code>EndState</code> object in the <code>StateStack</code>
     * of a State Machine.
     * @since 0.1
     * @see org.apache.commons.lang.builder.Builder#newObject(java.lang.Class)
     */
    public EndState2(){
      //Do nothing
    }
    
    /**
     * Method to check equality for a <code>EndState</code> 
     * The method checks the following ways:
     * *<code>EqualsBuilder.reflectionEquals(this, pObject);</code> method
     * *<code> EqualsBuilder.reflectionEquals(pObject,"");</code> method
     * *<code> HashCodeBuilder.reflectionHashCode(pObject);</code> method
     * If the states are equal, then true is returned.
     * Any state can be equal to it's State Pattern.
     * For an end state it is not allowed to have the same StatePattern as that 
     * of any state.
     * In a state machine it cannot have the StatePattern the same as the one 
     * the state pattern.
     * This method is used to check the equality of two EndState objects.
     * @param pObject the <code>Object</code> to be compared.
     * @return boolean true if this and pOject are equal, otherwise false
     */
    public boolean equals(java.lang.Object pObject);
    

    /**
     * Test <code>equals</code> for an <code>EndState</code> using a <code>ReflectionBuilder</code>
     * @since 0.1
     * @author Don Stewart
     */
    @Test
    public void testEquals(){
        // Check the equals
        assertTrue(EqualsBuilder.reflectionEquals(this, pObject));
        assertTrue(!EqualsBuilder.reflectionEquals(pObject, ""));
        assertTrue(!EqualsBuilder.reflectionEquals(pObject, " "));
        assertFalse(EqualsBuilder.reflectionEquals(pObject, "A"));
        // Check the hashcode
        assertFalse(HashCodeBuilder.reflectionHashCode(this));
        assertFalse(HashCodeBuilder.reflectionHashCode(pObject));
        HashCodeBuilder.reflectionHashCode(pObject);
        assertFalse(!EqualsBuilder.reflectionEquals(pObject, " "));
        assertFalse(!EqualsBuilder.reflectionEquals(pObject, " "));
    }
}
}