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
		 * Test case for {@link Main#getTestMolecule()}.
		 * @throws JniInchiException
		 */
		@Test
		public void testGetTestMolecule() throws JniInchiException {
				JniInchiStructure molecule = Main.getTestMolecule();
				assertNotNull(molecule);
				assertEquals(3, molecule.getNumAtoms());
				assertEquals(2, molecule.getNumBonds());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				assertEquals(1, molecule.getNumStereo0D());
				assertEquals(1, molecule.getNumStereo1D());
				assertEquals(0, molecule.getNumStereo2D());
				assertEquals(0, molecule.getNumStereo3D());
				assertEquals(0, molecule.getNumStereo());
				