// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {
		/**
		* Tests for {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
		*/
	@Test
	public void test() {
		final JniInchiStereo0D jniInchiStereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom(0), new JniInchiAtom(1), new JniInchiAtom(2), new JniInchiAtom(3), new JniInchiAtom(4),(INCHI_PARITY) );
		final int y = jniInchiStereo0D.getCenterAtom().getCentralAtom().getCentralAtomReference().getY();
		
		assertEquals("Wrong y value", y, 3);

		assertFalse("Right-handed wrong", jniInchiStereo0D.getCenterAtom().getCentralAtom().getCentralAtomIncludingCoordinateSystem().isRightHanded());	
		
		final JniInchiStereo0D jniStereo0D = jniInchiStereo0D.createNewTetrahedralStereo0D(new JniInchiAtom(0), new JniInchiAtom(1), new JniInchiAtom(2), new JniInchiAtom(4), new JniInchiAtom(9), (INCHI_PARITY) );
		final int z = jniStereo0D.getCenterAtom().getCentralAtom().getCentralAtomReference().getZ();
		
		assertEquals("Wrong z value", z, 9);
		
		assertFalse("Right-handed wrong", jniStereo0D.getCenterAtom().getCentralAtom().getCentralAtomIncludingCoordinateSystem().isRightHanded());	
	}
		
}