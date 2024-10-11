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
// Tests the toObject() method
	@Test
    public void toObject_1() {
		//System.out.println("toObject");
		/*
		 * Test cases
		 * Case 1.1: ToObject() can always return a fully initialized object.
		 */
		EndState test = EndState.getSingleton();
		System.out.println(test);
		assertEquals(test, Object.toObject(test));
		assertFalse (test instanceof EndState);




		// Case 1.2: Creating the object instance will not create the object
		//      If the object instance does already exist, this is the test case
		//      that should NOT be executed.
		EndState test2 = EndState.getSingleton();
		assertEquals(test2, Object.toObject(test2));
		assertFalse (test2 instanceof EndState);


	}


	@Test
    public void getName_1() {
		/*
		 * Test cases
		 * Case 1.1 a.b.c.d (a test case)
		 */
		EndState test = EndState.getSingleton();
		assertEquals(test.getName(), test.getName());
	}


	@Test
	public void setName_1() throws Exception {
		/*
		 * Constructors in classes and interfaces of interfaces.
		 * Case 1.1 a.b.c.d (a test case)
		 * @throws Exception
		 */
		EndState test = EndState.getSingleton();
		test.setName(NAME);
		assertEquals(NAME, test.getName());
		assertFalse(ENDSTATE_SINGLETON_INSTANCE == test);

		/*
		 * Test cases
		 * Case 1.2 1.3 (a test case)
		 * Case 1.3 1.3.1 (a test case)
		 * @throws Exception
		 */
		/*
		 * test1 : Case 1.1.1_1.1a.b.c (a test case)
		 */
		test = EndState.getSingleton();
		EndState test1 = EndState.getSingleton();
		//System.out.println(test);
		assertEquals(test1, test.toObject());

		/*
		 * test2 : Case 1.1.1.1.2 (a test case)
		 */
		test = EndState.getSingleton();
		assertTrue(test instanceof EndState);
		EndState tmp = (EndState) test;
		//System.out.println(tmp);
		assertEquals(test.getName(), test1.getName());
		assertFalse(test2 == tmp);
		//System.out.println(test2);

		/*
		 * test3 : Case 1.1.1.1a (a test case)
		 * @throws Exception
		 */
		/*
		 * test3.1 : Case 1.1 a.b.c (a test case)
		 * @throws Exception
		 */
		test = EndState.getSingleton();
		tmp = new EndState(ENDSTATE_SINGLETON_INSTANCE);
		//System.out.println(test);
		//System.out.println(tmp);
		assertEquals(tmp, test.toObject());

		//Case 1.1.1 aa (same name, different type)
		/*
		 * test4 : Case 1.1 ab (same name, different type)
		 */
		test = new EndState();
		tmp = new EndState(ENDSTATE_SINGLETON_INSTANCE);
		//System.out.println(test);
		//System.out.println(tmp);
		assertEquals(tmp, test.toObject());

	}
		/*
		 * Test cases
		 * //Case 1.1.2
		 * Case 1.2.1
		 * @throws Exception
		 */
		/*
		 * test5 : Case 1.1
		 */
		/*
		 * Test cases
		 * //Case 1.2
		 */
		/*
		 * test6 : Case 1.1
		 */
		/*
		 * test7 : Case 1.2
		 */

}