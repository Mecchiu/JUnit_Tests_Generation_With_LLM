// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
private static final String TEST_STRING = "123456789";
		
		@Test
		void testCreateNewDoublebondStereo0D() {
			assertEquals(JniInchiStereo0D.createNewDoublebondStereo0D(null, null, new JniInchiAtom(TEST_STRING), null, null), null);
		}
}
