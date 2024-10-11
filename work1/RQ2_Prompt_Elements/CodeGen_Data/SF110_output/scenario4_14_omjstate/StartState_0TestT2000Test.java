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
		 * The following test method compares this
		 * object with an instance retrieved from 
		 * the {@code getSingleton()} method.
		 * @throws java.lang.NullPointerException if this
		 * object array returned from the method is null.
		 * @throws uk.me.jockmacmad.jstate.patterns.NonExistentKeyException if this
		 * object cannot be found in the {@code getSingleton()} array.
		 * @throws uk.me.jockmacmad.jstate.patterns.IllegalKeyException if the
		 * object array used as array can not be validated by the
		 * {@code Key} in the {@code getSingleton()} array.
		 * @see StartState#getSingleton()
		 */
		@Test
		public void testEquals()
		{
			assertEquals("Error in comparing StartState",
						getSingleton().equals(new StartState()), false);
		}

		/**
		 * The following test method is a method that determines
		 * if the instance object from the array of object matches
		 * that in the first object.
		 * @since 0.1
		 * @throws java.lang.NullPointerException if this
		 * array is null, false if the object is null or the
		 * objects are not of the same type.
		 * @throws uk.me.jockmacmad.jstate.patterns.NonExistentKeyException if
		 * this object in the array object is of a different type than the
		 * object array object.
		 * @throws uk.me.jockmacmad.jstate.patterns.IllegalKeyException
		 * if the object array used as array can not be validated by the
		 * {@code Key} in the {@code getSingleton()} array.
		 * @see java.lang.Object#equals(java.lang.Object)
		 * @see StartState#equals(java.lang.Object)
		 */
		@Test
		public void testEquals2()
		{
			assertTrue("Error in matching a StartState instance",
						getSingleton().equals(getClass()));
		}

		/**
		 * The following test method is a method that determines
		 * if the type of objects in the array is {@link java.lang.Object}
		 * or an instance of the array class.
		 * @since 0.1
		 * @throws java.lang.ClassCastException if the value in the array is
		 * not an object type.
		 * @throws uk.me.jockmacmad.jstate.patterns.NonExistentKeyException if
		 * the object in the array cannot be cast to the array class.
		 */
		@Test
		public void testToString()
		{
			String refExpected;

			// Test with Array containing a not-equal Object.
			refExpected = "ERROR: Error in comparing a StartState instance";
			assertEquals("Incorrect toString", refExpected,
						getSingleton().toString());
			
			// Test with Array containing an object of the Array class.
			refExpected = "Object with toString:";
			assertEquals("Incorrect toString", refExpected,
							getSingleton().toString());

		}

		/**
		 *  The following test method is a method that attempts
		 *  to convert a StartState into an Object.
		 *  It then tests if an IllegalKeyException is thrown.
		 * @since 0.1
		 * @throws java.lang.NullPointerException if this
		 * object cannot be converted into an object of the given
		 * kind.
		 * @throws uk.me.jockmacmad.jstate.patterns.NonExistentKeyException if the
		 * object cannot be converted into an object of the supplied
		 * type.
		 * @throws uk.me.jockmacmad.jstate.patterns.IllegalKeyException if a
		 * object cannot be converted to the givety.
		 * @see java.lang.Object#toString()
		 */
		@Test(expected=java.lang.IllegalKeyException.class)
		public void testToObject()
		{
			getSingleton().toObject().equals(getClass()[0]);
		}

		/**
		 * The following test method is a method that constructs the
		 * an object representing a StartState object.
		 * As this is just a test