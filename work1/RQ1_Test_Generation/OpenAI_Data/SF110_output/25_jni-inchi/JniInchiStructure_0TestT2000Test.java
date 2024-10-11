// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {

		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_0() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				assertEquals(1, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_1() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(2, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
				assertEquals(atom, structure.getAtom(1));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_2() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(3, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
				assertEquals(atom, structure.getAtom(1));
				assertEquals(atom, structure.getAtom(2));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_3() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(4, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
				assertEquals(atom, structure.getAtom(1));
				assertEquals(atom, structure.getAtom(2));
				assertEquals(atom, structure.getAtom(3));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_4() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(5, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
				assertEquals(atom, structure.getAtom(1));
				assertEquals(atom, structure.getAtom(2));
				assertEquals(atom, structure.getAtom(3));
				assertEquals(atom, structure.getAtom(4));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_5() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(6, structure.getNumAtoms());
				assertEquals(0, structure.getNumBonds());
				assertEquals(0, structure.getNumStereo0D());
				assertEquals(atom, structure.getAtom(0));
				assertEquals(atom, structure.getAtom(1));
				assertEquals(atom, structure.getAtom(2));
				assertEquals(atom, structure.getAtom(3));
				assertEquals(atom, structure.getAtom(4));
				assertEquals(atom, structure.getAtom(5));
		}
		
		/**
		 * Test case for {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
		 * 
		 * @throws Exception
		 */
		@Test
		void testAddAtom_6() throws Exception {
				JniInchiAtom atom = new JniInchiAtom("C");
				JniInchiStructure structure = new JniInchiStructure();
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				structure.addAtom(atom);
				assertEquals(7, structure.getNumAtoms());
				assertEquals(0, structure.getNum