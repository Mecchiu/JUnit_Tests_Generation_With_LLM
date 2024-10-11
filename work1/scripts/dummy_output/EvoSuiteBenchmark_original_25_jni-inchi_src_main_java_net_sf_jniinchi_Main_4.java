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
* It contains one unit test case for the {@link Main#getTestMolecule()} method.
*/
class MainTest {
		
	/**
	 * Test for {@link Main#getTestMolecule()}.
	 */
	@Test
	void getTestMolecule() {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7};
        
		String[] hex = "{ABCDE, ";
		
        Main.getTestMolecule(bytes, 1, hex);
	}
	
	/**
	 * Test for {@link Main#getTestMolecule()}.
	 */
	@Test
	void testgetTestMolecule() {
        byte[] bytes = {1, 2, 3, 4, 5, 6, 7};
        String[] hex = "{ABCDEF1, ";
        Main.getTestMolecule(bytes, 1, hex);
	}
		
	@Test
	void testNull() {
		Main.getTestMolecule(null, null, null);
	}
	
}