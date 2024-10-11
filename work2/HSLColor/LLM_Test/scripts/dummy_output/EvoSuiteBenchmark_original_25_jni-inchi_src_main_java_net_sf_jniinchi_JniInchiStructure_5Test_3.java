// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		
	List<InchiChromatographySpec> chromatographySpecs;
	
	TestStereo0DStructureStereo0D0D structure;
	
	public JniInchiStructure_5Test() {
		chromatographySpecs  = new ArrayList<InchiChromatographySpec>();
		structure = new TestStereo0DStructureStereo0D0D(1,2,3);
	}
	
	/**
	 * Checks if the stereo parity is 0x0A.
	 */
	@Test
	public void checkParity0A() {
		assertEquals("Chromatography", getStereo0D(0).getChromatographySpecName());
	}
	
	@Test
	public void checkParity0B() {
		assertEquals("Chromatographic", getStereo0D(1).getChromatographySpecName());
	}
	
	/**
	 * Gets the stereo 0D structure for an empty structure.
	 *
	 * @return
	 */
	@Test
	public void getEmpty() {
		assertEmpty(getStereo0D(0));
	}

	/**
	 * Gets the stereo 0D structure.
	 *
	 * @return
	 */
	private JniInchiStereo0D getStereo0D(final int i) {
		return new JniInchiStereo0D();
	}

	/**
     * Does something to be inited.
     */
	private void test() {
		// set structure's parameters
}
}