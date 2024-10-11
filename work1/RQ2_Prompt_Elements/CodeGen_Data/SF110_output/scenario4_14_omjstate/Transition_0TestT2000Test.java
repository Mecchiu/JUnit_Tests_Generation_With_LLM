// Transition_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#trigger(IState, Event)} method.
*/
class Transition_0Test {
/**
		* Test value constructor.
		*/
		public Transition_0Test() {
		}

		/**
		 * Insert the method's description here.
		 * Creation date: (16/07/2013 00:51:57 PM)
		 * @return com.objectmentors.state.State
		 * @throws Exception 
		*/
		@Test
		public final void testTrigger_0_1() throws Exception {
				fail("Not yet implemented");
		}

		/**
		* Insert the description JUnit method here instead.
		* Creation date: (12/08/2012 12:28:46)
		* @throws Exception 
		*/
		@Test
		public void testTrigger_0_2() throws Exception {
		    final IState state = new State();
		    
		    // Test value for trigger with NULL event
		    assertThrows(ClassCastException.class, ()->{
		    	assertTrue(state.trigger(null, new Event("")));
		    });
		}
		 
		
		/**
		 * Test Equality.
		* Creation date: (22/06/2013 23:06:36)
		* @throws Exception 
		*/
		@Test
		public void testEquals() throws Exception {

		assertTrue(new Transition().equals(new Transition()));
		
		assertFalse(new Transition().equals(new Transition_0Test()));
		
		assertEquals(new Transition_0Test(), new Transition_0Test());
		
		assertFalse(new Transition_0Test().equals(new Transition()));
			
		assertFalse(new Transition().equals(null));
			
		assertFalse(new Transition_0Test().equals(null));
		}
		
		/**
		* Insert the description JUnit method here instead.
		* Creation date: (10/11/2013 15:06:34)
		* @throws Exception 
		*/
		@Test