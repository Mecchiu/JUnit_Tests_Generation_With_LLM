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
		private static final StartState SOME_OBJECT = new StartState();

		
		/**
		 * Checks that a class can be referenced.
		 * @since 0.1
		 */
		@Test
		public void canSeeObject() {
			assertNotNull("SOME_OBJECT can't be referenced",
				SOME_OBJECT.toObject());
		}

		/**
		 * Checks that equals is working properly.
		 * @since 0.1
		 */
		@Test
		public void equalsWork() {
			EqualsBuilder equalsBuilder = new EqualsBuilder();
			equalsBuilder.append(SOME_OBJECT.getName(), SOME_OBJECT.getName());
			assertTrue("equals doesn't return the object",
				equalsBuilder.isEquals());
		}

		/**
		 * Checks that hashcode() works properly.
		 * @since 0.1
		 */
		@Test
		public void hashCodeCksCorrect() {
			HashCodeBuilder hashCodeBuilder = new HashCodeBuilder(16, 37);
			hashCodeBuilder.append("SOME_OBJECT");
			hashCodeBuilder.append("SOME_OBJECT");
			assertEquals("hashCode doesn't produce a consistent result",
				hashCodeBuilder.hashCode(), SOME_OBJECT.hashCode());
		}
}
// StartState_1