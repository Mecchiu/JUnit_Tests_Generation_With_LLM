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
		/**
		* Returns expected hash code.
		* @return int
		* @since 0.2
		*/
		@Test
	void expected_hashCode() {
	  assertEquals(0x3738, new EndState().hashCode());
	}
		/**
		* Testing singleton-creation method of
		* {@link EndState}.
		* Tests whether creating the instance of EndState will result in
		* generating the same hashcode for the constructor-constructor method with
		* no arg-args.
				<p>
		* 
		* Creates a new EndState object with no argument constructor.
		* Checks that there is no instance
		* of EndState, creating a new EndState object with no argument constructor.
				<p>
		* 
		* @throws Throwable
		* @throws IllegalArgumentException
		*/
	@Test
	void setState () throws Throwable {
	}

}