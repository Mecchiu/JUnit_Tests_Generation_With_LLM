// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {

	@Test
	public void test() {
		List<JniInchiStereo0D> l = new ArrayList<>();
        stereoList.add(new JniInchiStereo0D(0, 0));
        parity("stereo0D");
        l.add(new JniInchiStereo0D(1, 0));
        assertEquals(parity("stereo0D"), new JniInchiStereo0D(1, 0));
        l.add(new JniInchiStereo0D(0, 1));
        assertEquals(parity("stereo0D"), new JniInchiStereo0D(0, 1));
	}
        
		@Test
	public void testList() {
        List<JnuInchiStereo0D> l1 = addStereo0D(new JniInchiStereo0D(0, 0));
        List<JnuInchiStereo0D> l2 = addStereo0D(new JnuInchiStereo0D(0, 0));
		assertEquals(2, l1.size());
		assertEquals(2, l2.size());
		assertEquals(parity("stereo0D"), l1.get(0));
		assertEquals(parity("stereo0D"), l2.get(0));
		assertEquals(parity("stereo0D"), l1.get(1));
		assertEquals(parity("stereo0D"), l2.get(1));
	}
}