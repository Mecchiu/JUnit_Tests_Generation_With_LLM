// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {
public List<JniInchiAtom> testCase = new ArrayList<>();

		@Test
		public void testAtom() {
			assertEquals(addAtom(this.testCase.get(0)), this.testCase.get(0));
		}
}
