// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#toObject()} method.
*/
class StartState_1Test {
		private static final org.junit.jupiter.api.NestedTest <?,?> NESS = new org.junit.jupiter.api.NestedTest<Object, Object>() {
			@Override
			public org.junit.jupiter.api.Test
			<T extends StartState<T>>
			void apply(T pTStartState) throws Exception {
				assertSame(pTStartState.toObject(), pTStartState);
			}
		};

		private static final org.junit.jupiter.api.Test
		<T extends StartState<T>>
		void test(T pTStartState) throws Exception {
			new EqualsBuilder<>(pTStartState.toObject())
			.append(NAME, NESS)
			.build()
			.testEquals();

			new HashCodeBuilder<>(pTStartState.toObject())
			.append(NAME, NESS)
			.build()
			.testHashCode();
		};

	@Test
	public void testToObject() throws Exception {
		test(StartState.<?>getSingleton());
	}
}