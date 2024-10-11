// EndStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#getSingleton()} method.
*/
class EndStateTest {

	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton2() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton3() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton4() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton5() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton6() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton7() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton8() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton9() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link EndState#getSingleton()}.
	*
	* @since 0.1
	*/
	@Test
	void testGetSingleton10() {
		EndState result = EndState.getSingleton();
		assertNotNull(result);
	}
	
}

// IState.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a state in a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface IState {
}

// ISingleton.java
package uk.me.jockmacmad.jstate.patterns;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Interface representing a singleton pattern.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public interface ISingleton {
}

// State.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state in a state machine.
 * Creation date: (2/19/01 4:22:51 PM)
 *
 * @since 0.1
 * @author :Don Stewart
 * @version 0.1
 */
public class State implements IState {
}

// StateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link State}.
* It contains ten unit test cases for the {@link State#State()} method.
*/
class StateTest {
		
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState2() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState3() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState4() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState5() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState6() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState7() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState8() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState9() {
		State result = new State();
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link State#State()}.
	*
	* @since 0.1
	*/
	@Test
	void testState10() {
		State result = new State();
		assertNotNull(result);
	}
	
}

// StateMachine.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/**
 * Class representing a state machine.