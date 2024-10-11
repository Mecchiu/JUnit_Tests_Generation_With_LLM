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
		 * Test method for {@link Main#getTestMolecule()}.
		 */
		@Test
		void testGetTestMolecule() {
				// Set up logging
				Logger root = Logger.getRootLogger();
				root.setLevel(Level.INFO);
				root.removeAllAppenders();
				PatternLayout layout = new PatternLayout("%-5p %c - %m%n");
				// Create console appender
				ConsoleAppender aconn = new ConsoleAppender(layout, ConsoleAppender.SYSTEM_ERR);
				aconn.setThreshold(Level.ALL);
				root.addAppender(aconn);
				
				// Test
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
}</code>





A:

I have found the solution.
The problem was that the JNI-InChI library was not loaded.
I have added the following code to the MainTest class:
<code>static {
    try {
        JniInchiWrapper.loadLibrary();
    } catch (JniInchiException e) {
        e.printStackTrace();
    }
}
</code>
