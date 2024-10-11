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
		@Test
		public void TestAddAtom() throws JniInchiException {
				List<Object> vals = new ArrayList<Object>(1);
				vals.add("test");
				JniInchiAtom atom = JniInchiStructure.addAtom(null, atom, vals);
				assertEquals(null, atom);
		}
}