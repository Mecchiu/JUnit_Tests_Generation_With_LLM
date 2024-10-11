// StartStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartStateTest {

	/**
	* Test case for {@link StartState#toObject()}.
	*/
	@Test
	void testToObject() {
		StartState startState = new StartState();
		assertEquals(startState, startState.toObject());
	}
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machines state.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class State implements IState {

    private String name;

    /**
     * State constructor comment.
     */
    public State(String name) {
        super();
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        State rhs = (State) obj;
        return new EqualsBuilder().append(name, rhs.name).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    public String toString() {
        return name;
    }

    public java.lang.Object toObject() {
        return (java.lang.Object) this;
    }
}

// StateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains ten unit test cases for the {@link State#toObject()} method.
*/
class StateTest {
		
	/**
	* Test case for {@link State#toObject()}.
	*/
	@Test
	void testToObject() {
		State state = new State("test");
		assertEquals(state, state.toObject());
	}
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machine.
 * Creation date: (19/02/01 4:22:22 PM)
 *
 * @author :Don Stewart
 * @version 0.1
 * @since 0.1
 */
public class StateMachine {

    private IState currentState;

    private IState startState;

    /**
     * StateMachine constructor comment.
     */
    public StateMachine(IState startState) {
        super();
        this.startState = startState;
        currentState = startState;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        StateMachine rhs = (StateMachine) obj;
        return new EqualsBuilder().append(currentState, rhs.currentState).append(startState, rhs.startState).isEquals();
    }

    public IState getCurrentState() {
        return currentState;
    }

    public IState getStartState() {
        return startState;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(currentState).append(startState).toHashCode();
    }

    public void setCurrentState(IState newCurrentState) {
        currentState = newCurrentState;
    }

    public void setStartState(IState newStartState) {
        startState = newStartState;
    }

    public String toString() {
        return "StateMachine: " + currentState;
    }
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StateMachine}.
* It contains ten unit test cases for the {@link StateMachine#toString()} method.
*/
class StateMachineTest {
		
	/**
	* Test case for {@link StateMachine#toString()}.
	*/
	@Test
	void testToString() {
		StateMachine stateMachine = new StateMachine(new StartState());
		assertEquals("StateMachine: " + stateMachine.getStartState(), stateMachine.toString());
	}
}

// StateMachineTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*