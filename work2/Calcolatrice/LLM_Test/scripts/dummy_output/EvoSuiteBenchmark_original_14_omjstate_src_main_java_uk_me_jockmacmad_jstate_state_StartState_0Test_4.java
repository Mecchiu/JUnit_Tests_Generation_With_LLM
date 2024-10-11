// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {
		/**
		 * Test the <code>getSingleton</code> public method.
		 * Creation date: (2/18/01 01:00:00 AM)
		 * @throws Throwable
		 */
	@Test
	void testGetSingleton() throws Throwable {
		assertInstance(getSingleton(), StartState.class);
	}

	/** test method to get a reference to the class from supertype. */
	static void assertInstance(final Runnable pInstance, final Class<? extends Object[]> pSuperclass) throws Throwable {
		final Object[] pArgs = new Object[1];
		pArgs[0] = new Object();
		pInstance.run();
		final Object result = Object.class.cast(pArgs[0]);
		assertInstance(result, pSuperclass);
	}

	/** test method to get a reference to the class from supertype. */
	static void assertInstance(final Object pInstance, final Class<? extends Object[]> pSuperclass) {
		assertTrue((pInstance==null) || Objects.equals(pInstance, pSuperclass.cast(pInstance)));
	}

	/** test method to compare two Objects. */
	@Test
	void testEquals() {
		new EqualsBuilder()
			.append(getSingleton(), getSingleton())
			.isEqual();
	}

	/** test method to compare two Array instances. */
	@Test
	void testEquals2() {
		new EqualsBuilder()
			.append(getSingleton(), new Object[1])
			.isEqual();
	}

	/** test method to compare two Strings. */
	@Test
	void testHashCode() {
		final int hash = HashCodeBuilder.reflectionHashCode(getSingleton());
		assertEquals(hash, hash2(getSingleton()));
	}

	@Test
	void testToString() {
		final String name = new Object() { @Override
			public String toString() { return "IState: "; }
		}.getClass().getName();
		assertEquals(name, startClass.getName());
	}

	/** test method to make a new object using the null type. */
	@Test
	void makeNullable() {
		assertNull(StartState_0Test.getSingleton());
	}
}
// end class StartState_0Test.java