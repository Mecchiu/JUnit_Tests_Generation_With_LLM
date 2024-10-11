// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

		/**
		* Test case 1.
		*
		* @throws Exception
		*/
		@Test
		void testGetTestMolecule1() throws Exception {
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(3).getBondType());
				assertEquals(INCHI_BOND_TYPE.DOUBLE, struct.getBond(4).getBondType());
				assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, struct.getBond(1).getStereoDefinition());
		}
		
		/**
		* Test case 2.
		*
		* @throws Exception
		*/
		@Test
		void testGetTestMolecule2() throws Exception {
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(3).getBondType());
				assertEquals(INCHI_BOND_TYPE.DOUBLE, struct.getBond(4).getBondType());
				assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, struct.getBond(1).getStereoDefinition());
		}
		
		/**
		* Test case 3.
		*
		* @throws Exception
		*/
		@Test
		void testGetTestMolecule3() throws Exception {
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(3).getBondType());
				assertEquals(INCHI_BOND_TYPE.DOUBLE, struct.getBond(4).getBondType());
				assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, struct.getBond(1).getStereoDefinition());
		}
		
		/**
		* Test case 4.
		*
		* @throws Exception
		*/
		@Test
		void testGetTestMolecule4() throws Exception {
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(3).getBondType());
				assertEquals(INCHI_BOND_TYPE.DOUBLE, struct.getBond(4).getBondType());
				assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, struct.getBond(1).getStereoDefinition());
		}
		
		/**
		* Test case 5.
		*
		* @throws Exception
		*/
		@Test
		void testGetTestMolecule5() throws Exception {
				JniInchiStructure struct = Main.getTestMolecule();
				assertEquals(6, struct.getNumAtoms());
				assertEquals(5, struct.getNumBonds());
				assertEquals(1, struct.getAtom(0).getImplicitH());
				assertEquals(2, struct.getAtom(2).getImplicitH());
				assertEquals(3, struct.getAtom(3).getImplicitH());
				assertEquals(1, struct.getAtom(4).getImplicitH());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(0).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(1).getBondType());
				assertEquals(INCHI_BOND_TYPE.SINGLE, struct.getBond(2).getBondType());
				assert