// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
private JniInchiStereo0D stereo;

		/**
		* Constructor. 
		*
		* @since v3.9
		*/
		public JniInchiStereo0D_1Test() {
			stereo = createNewDoublebondStereo0D(new JniInchiBaseAtom<JniInchiBaseAtom>(), new JniInchiBaseAtom<JniInchiBaseAtom>(), new JniInchiBaseAtom<JniInchiBaseAtom>(), new JniInchiBaseAtom<JniInchiBaseAtom>(), INCHI_STEREOTYPE.DOUBLEBOND);
		}

		/**
		* Test if {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method handles atom (and parity correctly.)
		*/
		@Test
		public void testStereo1a() {
			assertEquals("Inchi stereo type", INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereotype());
		}


	}