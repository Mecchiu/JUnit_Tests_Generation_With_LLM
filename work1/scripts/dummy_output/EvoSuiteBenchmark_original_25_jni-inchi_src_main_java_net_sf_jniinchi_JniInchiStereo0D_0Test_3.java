// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		final JniInchiAa aa;
		final JniInchiAsasasasa asasasasasasasasa;


		public JniInchiStereo0D_0Test(final INCHI_PARITY parity) {
			aa = new JniInchiAa(parity);
			asasasasasasasa = new JniInchiAsasasasasasasasasasa(parity);
		}


		/**
		 * Test method for
		 * {@link net.sf.jniinchi.JniInchiStereo0D#JniInchiStereo0D(JniInchiParity, net.sf.jniinchi.JniInchiParity)}
		 *.
		 */
		@Test
		public void testJniInchiStereo0D_JniInchiStereo0D_0MethodInvocation() {
		}

		public JniInchiStereo0D createNewTetrahedralStereo0D(final JniInchiAtom c, final JniInchiAtom d, final JniInchiAtom a, final JniInchiAtom b, final JniInchiAtom c0, final JniInchiAtom c1, final JniInchiAtom d2, final INCHI_PARITY par) {
			assertEquals(aa, new JniInchiAa(par));
			assertEquals(asasasasasasa, new JniInchiAsasasasasasasasa(par));

			return new JniInchiStereo0D(c, d, a, b, c0, c1, d2);
		}
}