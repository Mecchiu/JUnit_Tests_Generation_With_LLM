// _Progress_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _Progress_1Test {
		/**
		* Test method for {@link java.lang.String#equals(java.lang.Object)}.
		* Test object is {@link mygrid.web.Job#TYPE}.
		*/
	@Test
	public final void testEquals() throws Exception {
		assertEquals(true, new _Progress(Job.TYPE, null) == new _Progress(Job.TYPE, null));
	}

	/**
	 * Test method for {@link java.lang.String#hashCode()}.
	 * Test object is {@link mygrid.web.Job#TYPE}, and {@link Job#TYPE} hashcode.
	 */
	@Test
	public final void testHashCode() throws Exception {
		assertEquals(1, new _Progress(Job.TYPE, null).hashCode());
		assertEquals(2, new _Progress(Job.TYPE, null).hashCode());
		assertEquals(3, new _Progress(Job.TYPE, null).hashCode());
		assertEquals(4, new _Progress(Job.TYPE, null).hashCode());
	}

		/**
		* Test method for {@link java.lang.String#toString()}.
		* Test object is {@link mygrid.web.Job#TYPE}.
		*/
	@Test
	public final void testToString() throws Exception {
		assertEquals("<Progress job=\"TYPE\"/>", new _Progress(Job.TYPE, null).toString());
	}
}