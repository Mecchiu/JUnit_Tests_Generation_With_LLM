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
     * Tests the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
 			- Tests the correct case where all given atoms have exactly the same number of neighbors.
     */
    @Test
    public void createNewTetrahedralStereo0D() throws JniInchiException {
		 // Test 1
		 final JniInchiStereo0D par1 = createNewTetrahedralStereo0D(JniInchiAtom.A, JniInchiAtom.X, JniInchiAtom.Y, JniInchiAtom.Z, JniInchiAtom.C, INCHI_PARITY_EVEN);
		 assertTrue("Parity should be 'a' for a tetrahedral stereo",  par1.getType()==JniInchiStereoType.Tetrahedral);
		 assertTrue("Parity should be 'o' for an implicit H, as well as an implicit A and a X-coordinate",  par1.getType()==JniInchiStereoType.Invalid);
        final JniInchiStereo0D par2 = createNewTetrahedralStereo0D(JniInchiAtom.A, JniInchiAtom.X, JniInchiAtom.Y, JniInchiAtom.Z, JniInchiAtom.C, INCHI_PARITY_ODD);
		 assertTrue("Both atom should exist",    	   par1.getType()!=par2.getType());
		 assertTrue("Parity should be 'e' for one stereo",  par1.getType()==JniInchiStereoType.Even);
		 assertTrue("Parity should be 'o' for an optional A and an X-coordinate",  par1.getType()==JniInchiStereoType.OptA);

		
		// Test 2
		  final JniInchiStereo0D par3 = createNewTetrahedralStereo0D(JniInchiAtom.X, JniInchiAtom.Y, JniInchiAtom.Z, JniInchiAtom.C, INCHI_PARITY_ONCE, JniInchiStereoType.Even);
		  assertTrue("Parity should be 'o' for an optional A and an Y-coordinate",  par3.getType()==JniInchiStereoType.OptA);
		  
		  final JniInchiStereo0D par4 = createNewTetrahedralStereo0D(JniInchiAtom.A, JniInchiAtom.X, JniInchiAtom.Y, JniInchiAtom.Z, JniInchiAtom.B, INCHI_PARITY_ONCE);
		  assertTrue("Parity should be 'e' for an optional A, B and a Z-coordinate",  par4.getType()==JniInchiStereoType.OptA);
		 
		  
		// Test 3
		  final JniInchiStereo0D par5 = createNewTetrahedralStereo0D(JniInchiAtom.A, JniInchiAtom.B, JniInchiAtom.B, JniInchiAtom.C, INCHI_PARITY_ONCE, JniInchiStereoType.Even);
		  assertTrue("Parity should be 'o' for an optional A, A, and B and B",  par5.getType()==JniInchiStereoType.OptA);
		 // Test 4
		  final JniInchiStereo0D par6 = createNewTetrahedralStereo0D(JniInchiAtom.X, JniInchiAtom.Y, JniInchiAtom.Z, JniInchiAtom.B, JniInchiAtom.H, INCHI_PARITY_ONCE);
		  assertTrue("Parity should be 'u' for an optional A, X, and Y and Z",  par6.getType()==JniInchiStereoType.OptA);
}
}