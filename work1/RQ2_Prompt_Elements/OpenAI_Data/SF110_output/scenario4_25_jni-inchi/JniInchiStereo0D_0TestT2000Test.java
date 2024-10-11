// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

		@Test
		void testCreateNewTetrahedralStereo0D_0() {
				JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at0 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
				assertNotNull(stereo0D);
				assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo0D.getStereoType());
				assertEquals(INCHI_PARITY.EVEN, stereo0D.getParity());
				assertEquals(atC, stereo0D.getCentralAtom());
				assertEquals(at0, stereo0D.getNeighbor(0));
				assertEquals(at1, stereo0D.getNeighbor(1));
				assertEquals(at2, stereo0D.getNeighbor(2));
				assertEquals(at3, stereo0D.getNeighbor(3));
		}
		
		@Test
		void testCreateNewTetrahedralStereo0D_1() {
				JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at0 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
				assertNotNull(stereo0D);
				assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo0D.getStereoType());
				assertEquals(INCHI_PARITY.ODD, stereo0D.getParity());
				assertEquals(atC, stereo0D.getCentralAtom());
				assertEquals(at0, stereo0D.getNeighbor(0));
				assertEquals(at1, stereo0D.getNeighbor(1));
				assertEquals(at2, stereo0D.getNeighbor(2));
				assertEquals(at3, stereo0D.getNeighbor(3));
		}
		
		@Test
		void testCreateNewTetrahedralStereo0D_2() {
				JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at0 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
				assertNotNull(stereo0D);
				assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo0D.getStereoType());
				assertEquals(INCHI_PARITY.UNKNOWN, stereo0D.getParity());
				assertEquals(atC, stereo0D.getCentralAtom());
				assertEquals(at0, stereo0D.getNeighbor(0));
				assertEquals(at1, stereo0D.getNeighbor(1));
				assertEquals(at2, stereo0D.getNeighbor(2));
				assertEquals(at3, stereo0D.getNeighbor(3));
		}
		
		@Test
		void testCreateNewTetrahedralStereo0D_3() {
				JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at0 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo0D = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.NONE);
				assertNotNull(stereo0D);
				assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo0D.getStereoType());
				assertEquals(INCHI_PARITY.NONE, stereo0D.getParity());
				assertEquals(atC, stereo0D.getCentralAtom());
				assertEquals(at0, stereo0D.getNeighbor(0));
				assertEquals(at1, stereo0D.getNeighbor(1));
				assertEquals(at2, stereo0D.getNeighbor(2));
				assertEquals(at3, stereo0D.getNeighbor(3));
		}
		
		@Test
		void testCreateNewTetrahedralStereo0D_4() {
				JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at0 = new JniInchiAtom("H", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("H", 0.0,