// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		private final JniInchiStructure testStructure;

		private final int i;

		/**
		 * Creates {@link JniInchiStructureStructure} object.
		 *
		 * @param i
		 *     Index of atom to return.
		 * @param testStructure  JniInchiStructure we want the test to evaluate
		*/
		public JniInchiStructure_3Test(final int i, final JniInchiStructure testStructure) {
			this.i = i;
			this.testStructure = testStructure;
		}

		/**
		 * Returns atom from structure.
		 *
		 * @return
		 */
		public JniInchiAtom getAtom() {
			return testStructure.getAtom0(i);
		}
	}