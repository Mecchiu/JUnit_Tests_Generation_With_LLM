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
		 * 
		 * @param pTestCaseName Name of the testcase
		 * @param pInitialState Initial State of State Machine
		 * @param pTrigger Event to trigger
		 * @exception Exception
		 */
	private Transition(
			 final java.lang.String pTestCaseName, 
    final IState pInitialState, 
			 final Event pTriggerEvent ) throws Exception {
			runMethod( this.getClass(), pTestCaseName, "(Lukan.java.lang.Object;Lukan.java.lang.Event)", 
				"{Lukan.java.util.Arrays.toString(arguments);arguments[1]==null?"+pTriggerEvent+":"+pTriggerEvent+",("+pInitialState.toString()+")}," +
				 "event);" 
			);

	}

	/**
	* Runs the method, this is included of code written in Java to invoke 
	* the <code>toString</code> method that is returned by {@link Transition#willTrigger(IState, Event)}.
	* @since 0.1
	*/
	private void runTestCase() {
		runMethod(this.getClass(), "willTrigger(IState, Event)", "(Lukan.java.lang.Object;Lukan.java.lang.Event)", "event);");


	}


	/**
	* Checks the result from {@link Transition#willTrigger(IState, Event)}
	* @since 0.1
	*/
	@Test
	void willTriggerCheckResult() {
}
}