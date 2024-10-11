// JniInchiStereo0D_2Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_2Test {

		@Test
		void testCreateNewDoublebondStereo0D_1() {
			JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
			assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
			assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
			assertEquals(INCHI_PARITY.NONE, stereo.getDisconnectedParity());
			assertEquals(null, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		@Test
		void testCreateNewDoublebondStereo0D_2() {
			JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
			assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
			assertEquals(INCHI_PARITY.ODD, stereo.getParity());
			assertEquals(INCHI_PARITY.NONE, stereo.getDisconnectedParity());
			assertEquals(null, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		@Test
		void testCreateNewDoublebondStereo0D_3() {
			JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
			assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
			assertEquals(INCHI_PARITY.UNKNOWN, stereo.getParity());
			assertEquals(INCHI_PARITY.NONE, stereo.getDisconnectedParity());
			assertEquals(null, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		@Test
		void testCreateNewDoublebondStereo0D_4() {
			JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.NONE);
			assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
			assertEquals(INCHI_PARITY.NONE, stereo.getParity());
			assertEquals(INCHI_PARITY.NONE, stereo.getDisconnectedParity());
			assertEquals(null, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		@Test
		void testCreateNewDoublebondStereo0D_5() {
			JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNSPECIFIED);
			assertEquals(INCHI_STEREOTYPE.DOUBLEBOND, stereo.getStereoType());
			assertEquals(INCHI_PARITY.UNSPECIFIED, stereo.getParity());
			assertEquals(INCHI_PARITY.NONE, stereo.getDisconnectedParity());
			assertEquals(null, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(