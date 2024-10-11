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
private StateMachineStateMachine stateMachine;
  public EndState_1Test() {
    stateMachine = new StateMachineStateMachine(StateMachineType.END);
  }
  @Test
  public void toObject() {
  	return stateMachine.toObject();
  }
  @Test
  public void equalsId() {
  	EqualsBuilder builder = new EqualsBuilder();
    final String E1 = "E1";
    final String E2 = "E2";
    final EndState A1 = new EndState_1Test();
    A1.stateMachine = new StateMachineStateMachine(StateMachineType.END);
    A1.stateMachine.setStateType(StateMachineSwing.END.name());
    final EndState A2 = new EndState_1Test();
    A2.stateMachine = new StateMachineStateMachine(StateMachineType.END);
    A2.stateMachine.setStateType(StateMachineSwing.END.name());
  	assertTrue(builder.isEquals(A1));
  	assertFalse(builder.isEquals(A2));
    assertEquals(A1.hashCode(), A2.hashCode());
  	StateMachineStateMachine C1 = new StateMachineStateMachine(StateMachineType.ERROR_ONMEMORY);
  	C1.setType(StateMachineType.END.name());
  	C1.setMemoryAmount(20);
  	A1 = new EndState_1Test();
  	A1.stateMachine.setStateType(StateMachineSwing.END.name());
  	assertTrue(builder.isEquals(A1));
  	assertFalse(builder.isEquals(C1));
  	A2 = new EndState_1Test();
  	A2.stateMachine.setStateType(StateMachineSwing.END.name());
  	assertFalse(builder.isEquals(A2));
  	assertTrue(builder.isEquals(C1));
  	assertFalse(builder.isEquals(new EndState_1Test()));
  	assertFalse("not equals",builder.isEquals(new EndState_1Test()));
  }
  @Test
  public void hashCode() {
  	final EndState A1 = new EndState_1Test();
  	final int H1 = A1.hashCode();
  	final EndState A2 = new EndState_1Test();
  	final int H2 = A2.hashCode();
  	System.out.println("hash1 :" + H1);
  	System.out.println("hash2:" + H2);
  	assertTrue(new EndState_1Test().hashCode() == H1);
  	assertTrue(new EndState_1Test().hashCode() == H2);
  	System.out.println("hash1:" + new EndState_1Test().hashCode());
  	System.out.println("hash2:" + new EndState_1Test().hashCode());
  	A2.stateMachine.setMemorySize(20);
  	final int H3 = -A1.hashCode();
  	final int H4 = A2.hashCode();
  	assertEquals(H3,H4);
  }
  /**
 * Set a new memory amount.
 * @param memoryAmount the new MemoryAmount
 */
  public void setMemoryAmount(final int memoryAmount) {
    stateMachine.setMemoryAmount(memoryAmount);
  }
  public int getMemoryAmount() {
  	return stateMachine.getMemoryAmount();
  }
  /**
 * Change a state-machine's action.
 * @param stateMachine the new state-machine
 * @param action the new action
 */
public void setStateType(final StateMachineStateMachine stateMachine, final StateMachineStateAction action){
	stateMachine.setStateType(action);
}
}
