// SBMLFilterTest.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains ten unit test cases for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilterTest {

	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the correct
	 * file extension and the correct header.
	 */
	@Test
	public void testAccept_CorrectFileExtensionAndHeader() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the correct
	 * file extension but the wrong header.
	 */
	@Test
	public void testAccept_CorrectFileExtensionWrongHeader() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012_wrong_header.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the wrong
	 * file extension but the correct header.
	 */
	@Test
	public void testAccept_WrongFileExtensionCorrectHeader() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012_wrong_extension.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the wrong
	 * file extension and the wrong header.
	 */
	@Test
	public void testAccept_WrongFileExtensionAndHeader() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000012_wrong_extension_and_header.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the correct
	 * file extension and the correct header.
	 */
	@Test
	public void testAccept_CorrectFileExtensionAndHeader2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = true;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the correct
	 * file extension but the wrong header.
	 */
	@Test
	public void testAccept_CorrectFileExtensionWrongHeader2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013_wrong_header.xml");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the wrong
	 * file extension but the correct header.
	 */
	@Test
	public void testAccept_WrongFileExtensionCorrectHeader2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013_wrong_extension.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of accept method, of class SBMLFilter.
	 * This test case tests the accept method with a file that has the wrong
	 * file extension and the wrong header.
	 */
	@Test
	public void testAccept_WrongFileExtensionAndHeader2() {
		System.out.println("accept");
		File file = new File("test/data/sbml/BIOMD0000000013_wrong_extension_and_header.txt");
		SBMLFilter instance = new SBMLFilter();
		boolean expResult = false;
		boolean result = instance.accept(file);
		assertEquals(expResult, result);
	}
	
}