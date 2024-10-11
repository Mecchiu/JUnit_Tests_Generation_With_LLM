// Transition_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains one unit test case for the {@link Transition#willTrigger(IState, Event)} method.
*/
class Transition_1Test {
		 /**
          * Description of the Test cases.
          */
		 static final String testDescription =
				"Test cases should be commented with the header description.";
		

	private final StateMachineImpl stateMachineImpl = new StateMachineImpl();
	private final Transition transitionToApp = new Transition("", "", "", "");
			/**
			* Test that transitions can trigger the state of one object of the
			* object machine are executed correctly.
			*/
	@Test
	public void testApp() {
		transitionToApp.willTrigger(stateMachImpl.getStateOfMachine("junit.framework.jvmmodule.state.suite.TestSuite"), "TestEvent");
	}

	/**
	 * Unit test for the {@link Transition#getName()} method.
	 */
	@Test
	public void testGetName() {
		assertEquals("Transition_1Test", transitionToApp.getName());
	}
	
	private static class StateMachineImpl
			extends
		  StateMachineImpl {
			private final String currentStateName = "TestState";
			/**
			* Constructor.
			* Creation date: (3/11/01 1:37:34 PM)
			* @since 0.1
			* @param pId The id of the new state
			* @param pName The name of the new state
			*/
			public StateMachineImpl(final String pId, final String pName) {
				super(pId, pName);
			}

}
}