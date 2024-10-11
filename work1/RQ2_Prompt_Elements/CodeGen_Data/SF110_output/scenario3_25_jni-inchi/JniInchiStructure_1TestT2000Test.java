// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {
public JniInchiStructure_1Test() { }


	/**
	 * Tests addBond method of {@link JniInchiStructure}.
	 */
	@Test
	public final void testAddBond() {
		JniInchiStructure.init();

		JniInchiStructure.addBond(JniInchiBond.MASS);
		assertTrue(JniInchiBond.mass.addition.equalsIgnoreCase("MASS"));

		JniInchiBond.addBond(JniInchiBond.INCHI_HEIGHT);

		List<JniInchiBond> inchiBonds = new ArrayList<>();
		List<JniInchiBond> inchiBonds2 = new ArrayList<>();
		JniInchiBond.addBond(inchiBonds2);
		JniInchiBond.addBond(inchiBonds2);
		assertTrue(inchiBonds.equalsIgnoreCase(jniPep.jniDotInchiBonds().get(0)),
          "Incorrect Inchi Bonds!");
		List<JniInchiBond> inchiBonds3 = new ArrayList<>();
		JniInchiBond.addBond(inchiBonds3);
		jniPep.jniInchiBonds().add(inchiBonds2);
		JniInchiBond.addBond(jniPep.jniDotInchiBonds().get(0));
		assertTrue(jniPep.jniInchiBonds().add(jniPep.jniDotInchiBonds().get(2))==jniPep.jniDotInchiBonds().get(1),
          "Incorrect Inchi Bonds!");
	}


	/**
	 * The test suite for {@link JniInchiStructure} class.
	 * It should be a suite with tests for {@link JniInchiStructure#addBond(JniInchiBond)} and
	 * {@link JniInchiStructure#addBond(JniInchiBond)} methods.
	 */
	@Test
	public final void testSuite() {
		assertEquals(
			"Incorrect Inchi Bond!",
			jniPep.jniMolToMols().get(0).bond(jniPep.jniDotMolToChain_.get(0)),
			"Incorrect Inchi Bond!");
		assertEquals(
			"Incorrect Inchi Bond!",
			jniPep.jniMolToMols().get(0).bond(jniPep.jniDotMolToChain_.get(1)),
			"Incorrect Inchi Bond!");
	}
}
