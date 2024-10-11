// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {

		/**
		 * Test case 1 for method {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * @throws JniInchiException
		 */
		@Test
		void testCreateNewTetrahedralStereo0D_1() throws JniInchiException {
			JniInchiAtom atC = new JniInchiAtom("C");
			JniInchiAtom at0 = new JniInchiAtom("C");
			JniInchiAtom at1 = new JniInchiAtom("C");
			JniInchiAtom at2 = new JniInchiAtom("C");
			JniInchiAtom at3 = new JniInchiAtom("C");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
			assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
			assertEquals(INCHI_PARITY.EVEN, stereo.getParity());
			assertEquals(atC, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		/**
		 * Test case 2 for method {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * @throws JniInchiException
		 */
		@Test
		void testCreateNewTetrahedralStereo0D_2() throws JniInchiException {
			JniInchiAtom atC = new JniInchiAtom("C");
			JniInchiAtom at0 = new JniInchiAtom("C");
			JniInchiAtom at1 = new JniInchiAtom("C");
			JniInchiAtom at2 = new JniInchiAtom("C");
			JniInchiAtom at3 = new JniInchiAtom("C");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
			assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
			assertEquals(INCHI_PARITY.ODD, stereo.getParity());
			assertEquals(atC, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		/**
		 * Test case 3 for method {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * @throws JniInchiException
		 */
		@Test
		void testCreateNewTetrahedralStereo0D_3() throws JniInchiException {
			JniInchiAtom atC = new JniInchiAtom("C");
			JniInchiAtom at0 = new JniInchiAtom("C");
			JniInchiAtom at1 = new JniInchiAtom("C");
			JniInchiAtom at2 = new JniInchiAtom("C");
			JniInchiAtom at3 = new JniInchiAtom("C");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
			assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
			assertEquals(INCHI_PARITY.UNKNOWN, stereo.getParity());
			assertEquals(atC, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		/**
		 * Test case 4 for method {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * @throws JniInchiException
		 */
		@Test
		void testCreateNewTetrahedralStereo0D_4() throws JniInchiException {
			JniInchiAtom atC = new JniInchiAtom("C");
			JniInchiAtom at0 = new JniInchiAtom("C");
			JniInchiAtom at1 = new JniInchiAtom("C");
			JniInchiAtom at2 = new JniInchiAtom("C");
			JniInchiAtom at3 = new JniInchiAtom("C");
			JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.NONE);
			assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, stereo.getStereoType());
			assertEquals(INCHI_PARITY.NONE, stereo.getParity());
			assertEquals(atC, stereo.getCentralAtom());
			assertEquals(at0, stereo.getNeighbor(0));
			assertEquals(at1, stereo.getNeighbor(1));
			assertEquals(at2, stereo.getNeighbor(2));
			assertEquals(at3, stereo.getNeighbor(3));
		}
		
		/**
		 * Test case 5 for method {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)}.
		 * @throws JniInchiException
		 */
		@Test
		void testCreateNewTetrahedralStereo0D_5() throws JniInchiException {
			JniInchiAtom atC = new JniInchiAtom("C");
			JniInchiAtom at0 = new JniInchiAtom("C");
			J