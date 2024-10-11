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
     * Private constructor for JniInchiStereo0D_0Test class.
     * This constructor is only used by the unit test class.
     */
    private JniInchiStereo0D_0Test() { }
    
    /**
     * Unit test for 
     * {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}
     *.
	 */
	@Test
    public void testCreateNewTetrahedralStereo0D_test() {
	
		JniInchiAtom atC = new JniInchiAtom("C");
		JniInchiAtom at0 = new JniInchiAtom("1");
		JniInchiAtom at1 = new JniInchiAtom("2");
		JniInchiAtom at2 = new JniInchiAtom("0");
		JniInchiAtom at3 = new JniInchiAtom("2");
		
		INCHI_PARITY parity = INCHI_PARITY.EVEN;
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, 0));
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.ODD), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD));
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.TIMES2), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.TIMES4));
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.MODES_0), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, 0));
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.TIMES4|PARITY.MODES_1), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, 0));
		
		assertEquals(JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, PARITY.TIMES4|PARITY.MODES_2), 
			JniInchiStereo0D.JniInchiStereo0D_0Test.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, 0));
		
}
}