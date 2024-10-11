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
		assertTrue(StartState.getSingleton().getName() instanceof java.lang.Boolean);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link java.lang.Character}.
	*/
	@Test
	void testGetName_8() {
		assertTrue(StartState.getSingleton().getName() instanceof java.lang.Character);
	}
	
	/**
	* Test case for {@link StartState#getName()}.
	* <p>
	* This test case checks if the {@link StartState#getName()} method returns a value of type {@link java.lang.Byte}.
	*/
	@Test
	void testGetName_9() {
		assertTrue(StartState.getSingleton().getName() instanceof java.lang.Byte);
	}
	
}

// StartState_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartState_2Test {
		
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a non-null value.
	*/
	@Test
	void testToObject_0() {
		assertNotNull(StartState.getSingleton().toObject());
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link StartState}.
	*/
	@Test
	void testToObject_1() {
		assertTrue(StartState.getSingleton().toObject() instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link IState}.
	*/
	@Test
	void testToObject_2() {
		assertTrue(StartState.getSingleton().toObject() instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link Object}.
	*/
	@Test
	void testToObject_3() {
		assertTrue(StartState.getSingleton().toObject() instanceof Object);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link uk.me.jockmacmad.jstate.patterns.ISingleton}.
	*/
	@Test
	void testToObject_4() {
		assertTrue(StartState.getSingleton().toObject() instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link java.lang.String}.
	*/
	@Test
	void testToObject_5() {
		assertTrue(StartState.getSingleton().toObject() instanceof java.lang.String);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link java.lang.Integer}.
	*/
	@Test
	void testToObject_6() {
		assertTrue(StartState.getSingleton().toObject() instanceof java.lang.Integer);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link java.lang.Boolean}.
	*/
	@Test
	void testToObject_7() {
		assertTrue(StartState.getSingleton().toObject() instanceof java.lang.Boolean);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link java.lang.Character}.
	*/
	@Test
	void testToObject_8() {
		assertTrue(StartState.getSingleton().toObject() instanceof java.lang.Character);
	}
	
	/**
	* Test case for {@link StartState#toObject()}.
	* <p>
	* This test case checks if the {@link StartState#toObject()} method returns a value of type {@link java.lang.Byte}.
	*/
	@Test
	void testToObject_9() {
		assertTrue(StartState.getSingleton().toObject() instanceof java.lang.Byte);
	}
	
}

// StartState_3Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#equals(Object)} method.
*/
class StartState_3Test {
		
	/**
	* Test case for {@link StartState#equals(Object)}.
	* <p>
	* This test case checks if the {@link StartState#equals(Object)} method returns a non-null value.
	*/
	@Test
	void testEquals_0() {
		assertNotNull(StartState.getSingleton().equals(StartState.getSingleton()));
	}
	
	/**
	* Test case for {@link StartState#equals(Object)}.
	* <p>
	* This test case checks if the {@link StartState#equals(Object)} method returns a value of type {@link StartState}.
	*/
	@Test
	void testEquals_1() {
		assertTrue(StartState.getSingleton().equals(StartState.getSingleton()) instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#equals(Object)}.
	* <p>
	* This test case checks if the {@link StartState#equals(Object)} method returns a value of type {@link IState}.
	*/
	@Test
	void testEquals_2() {
		assertTrue(StartState.getSingleton().equals(StartState.getSingleton()) instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#equals(Object)}.
	* <p>
	* This test case checks if the {@link StartState#equals(Object)} method returns a value of type {@link Object}.
	*/
	@Test
	void testEquals_3() {
		assertTrue(StartState.getSingleton().equals(StartState.getSingleton()) instanceof Object);
	}
