// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		
	@Test
	public void testCreateNewTetrahedralStereo0D(){
		
		//1. create stereo stereo 0D
		final JniInchiStereo0D_0 stereo =
				JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, null, null, JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, INCHI_PARITY_ODD);
		stereo.setStereo(0,1);
		assertEquals(0, stereo.getStereo(0));
		assertEquals(1, stereo.getStereo(1));
		
		//2. invalidate stereo 0D
		stereo = 		JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, null, null, JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, INCHI_PARITY_ODD);
		stereo.setStereo(1,0);
		assertEquals(0,   stereo.getStereo(0));
		assertEquals(0,   stereo.getStereo(1));
		
		//3. test for stereo 0D
		assertEquals(0, stereo.getStereo(0));
		//4. check stereo atom 0D
		final JniInchiStereo0D_0 stereoAt =
						JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, null, null, "A", INCHI_PARITY_ODD);
		assertEquals(0, stereo.getStereo(0));
		assertEquals("A",  stereoAt.getCentralAtomParity());
		stereoAt.setCentralAtomParity("O");
		assertEquals("O", stereo.getCentralAtomParity());

		//5. Check stereo atom 1D
		final JniInchiStereo0D_0 stereoAt1 =
						JniInchiStereo0D.createNewTetrahedralStereo0D(JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, JniInchiAtom.ATOMREF_AT_RIGHT_HANDED, null, INCHI_PARITY_ODD);
		assertEquals(1, stereoAt1.getStereo(0));
		assertEquals(null, stereoAt1.getCentralAtomParity());
		
		}

}