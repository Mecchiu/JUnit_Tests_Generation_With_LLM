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
		public static final String TEST_FILE = "/net/sf/jniinchi/JniInchiStructure_5Test.java";
		private final JNIInchiStructure s = new JNIInchiStructure();

		@Test
		public void getStereo0D() {
			assertEquals(0, s.getStereo0D(0));
		}
}