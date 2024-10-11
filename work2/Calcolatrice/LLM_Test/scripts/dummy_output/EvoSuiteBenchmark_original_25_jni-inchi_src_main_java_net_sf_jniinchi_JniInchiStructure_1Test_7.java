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
		
		/**
		 * Tests {@link JniInchiStructure#addBond(JniInchiBond)} method.
		 */
	@Test
		public void test001() {

                List<JniInchiBond> bondList = new ArrayList<>();
		bondList.add(new JniInchiBond(JniInchiType.BOND_EQUAL, JniInchiType.BOND_EQUAL.name(), JniInchiType.BOND_EQUAL.name()));
		final JniInchiStructure newStructure = new JniInchiStructure();
		newStructure.addBond(new JniInchiBond(JniInchiType.BOND_EQUAL, JniInchiType.BOND_EQUAL.name()));
		assertEquals(bondList, newStructure.getBonds());
		}
}