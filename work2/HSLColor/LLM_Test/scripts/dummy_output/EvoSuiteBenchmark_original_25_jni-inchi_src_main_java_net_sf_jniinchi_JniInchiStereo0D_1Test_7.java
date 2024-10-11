// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		private JniInchiStereo0D s0;
		private JniInchiStereo0D t1;
		private JniInchiStereo1D t2;

		/**
		 * The constructors.
		 */
		@Test
		public void testctorStereo0Dp0T0t2() {
			s0 = new JniInchiStereo0D(4, 0, 0, null, JniInchiStereo0D.O);
			assertTrue(s0.isValidState());
		}

		/**
		 * The validate() method.
		 * @return
		 */
		@Test
		public void testvalidate() {
			s0 = new JniInchiStereo0D(4, 0, 0, null, JniInchiStereo0D.O);
			s0.validate();
		}

		/**
		 * The validate() method.
		 * @return
		 */
		@Test
		public void testvalidate_2() {
			t1 = new JniInchiStereo1D(4, 0, 0, null, JniInchiStereo1D.O);
			t1.validate();
		}

		/**
		 * @return
		 */
		@Test
		public void testvalidate_3() {
			t2 = new JniInchiStereo1D(4, 0, 0, null, JniInchiStereo1D.O);
			t2.validate();
		}

		/**
		 * A valid stereo cannot be set as a neighbor of a triple-bond, this requires the type
		 * of bond to be the same.
		 */
		@Test(expected = IllegalArgumentException.class)
		public void testSetNeighbor_typeDifferent() {
			s0.setNeighbor(-1);
		}

		/**
		 * A valid stereo cannot be set as a neighbor of a triple-bond, this requires the type
		 * of bond to be the same.
		 */
		@Test(expected = IllegalArgumentException.class)
		public void testSetNeighbor_typeDifferent2() {
			t1.setNeighbor(-1);
		}

		/**
		 * A valid stereo cannot be set as a neighbor of a triple-bond, this requires the type
		 * of bond to be the same.
		 */
		@Test(expected = IllegalArgumentException.class)
		public void testSetNeighbor_typeDifferent3() {
			t2.setNeighbor(-1);
		}

		/**
		 * @return
		 */
		@Test
		public void testSetNeighbor() {
			t1.setNeighbor(-1);
			assertTrue(s0.isValidState());
			t1.setNeighbor(-1);
			assertTrue(s0.isValidState());
		}
}