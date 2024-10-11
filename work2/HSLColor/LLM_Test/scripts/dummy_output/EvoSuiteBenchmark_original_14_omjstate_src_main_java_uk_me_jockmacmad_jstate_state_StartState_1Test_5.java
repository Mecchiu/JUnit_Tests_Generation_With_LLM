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
		
	/**
	 * The class under test.
    * @since 0.8.18, toString added
	 */
	class ToObject extends StartState_1Test {
		
		/**
		 * Default constructor - constructor used by {@link org.apache.commons.lang.builder.BuilderUtils}.
		 * @see org.apache.commons.lang.builder.BuilderUtils
		 * @since 0.8.18
		 */
		public ToObject() {
			super("ToObject") ;
		}
		
		/**
		 * Test method for {@link org.apache.commons.lang.builder.BuilderUtils#getObject(java.lang.Object, java.lang.Object)}
		 * where the source object is <code>aInstance</code> and the destination object is <code>anObject</code>.
		 * @throws Exception is thrown in case any of the steps fail.
		 * @since 0.8.18
		 */
		@Test
		public final void testBuilderObject(){
			assertNotNull("Constructor - constructor used by @Before(java.lang.Class) annotation", new org.apache.commons.lang3.builder.BuilderUtils.Builder(StartState.class, "aInstance", "anObject", null));
			assertNotNull("Constructor - constructor used by @After(java.lang.Class) annotation", new org.apache.commons.lang3.builder.BuilderUtils.Builder(StartState.class, null, "anObject", null));
		}
	}
}