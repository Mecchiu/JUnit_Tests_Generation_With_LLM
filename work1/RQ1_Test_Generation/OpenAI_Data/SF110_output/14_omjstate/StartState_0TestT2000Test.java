// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {

	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a non-null value.
	*/
	@Test
	void testGetSingleton_0() {
		assertNotNull(StartState.getSingleton());
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link StartState}.
	*/
	@Test
	void testGetSingleton_1() {
		assertTrue(StartState.getSingleton() instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link IState}.
	*/
	@Test
	void testGetSingleton_2() {
		assertTrue(StartState.getSingleton() instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link Object}.
	*/
	@Test
	void testGetSingleton_3() {
		assertTrue(StartState.getSingleton() instanceof Object);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link uk.me.jockmacmad.jstate.patterns.ISingleton}.
	*/
	@Test
	void testGetSingleton_4() {
		assertTrue(StartState.getSingleton() instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link java.lang.String}.
	*/
	@Test
	void testGetSingleton_5() {
		assertTrue(StartState.getSingleton() instanceof java.lang.String);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link java.lang.Integer}.
	*/
	@Test
	void testGetSingleton_6() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Integer);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link java.lang.Boolean}.
	*/
	@Test
	void testGetSingleton_7() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Boolean);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link java.lang.Character}.
	*/
	@Test
	void testGetSingleton_8() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Character);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks if the {@link StartState#getSingleton()} method returns a value of type {@link java.lang.Byte}.
	*/
	@Test
	void testGetSingleton_9() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Byte);
	}
	
}

// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getName()} method.
*/
class StartState_1Test {
		
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a non-null value.
	*/
	@Test
	void testGetName_0() {
		assertNotNull(StartState.getSingleton().getName());
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link StartState}.
	*/
	@Test
	void testGetName_1() {
		assertTrue(StartState.getSingleton().getName() instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link IState}.
	*/
	@Test
	void testGetName_2() {
		assertTrue(StartState.getSingleton().getName() instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link Object}.
	*/
	@Test
	void testGetName_3() {
		assertTrue(StartState.getSingleton().getName() instanceof Object);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link uk.me.jockmacmad.jstate.patterns.ISingleton}.
	*/
	@Test
	void testGetName_4() {
		assertTrue(StartState.getSingleton().getName() instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link java.lang.String}.
	*/
	@Test
	void testGetName_5() {
		assertTrue(StartState.getSingleton().getName() instanceof java.lang.String);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link java.lang.Integer}.
	*/
	@Test
	void testGetName_6() {
		assertTrue(StartState.getSingleton().getName() instanceof java.lang.Integer);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link java.lang.Boolean}.
	*/
	@Test
	void testGetName_7() {
		