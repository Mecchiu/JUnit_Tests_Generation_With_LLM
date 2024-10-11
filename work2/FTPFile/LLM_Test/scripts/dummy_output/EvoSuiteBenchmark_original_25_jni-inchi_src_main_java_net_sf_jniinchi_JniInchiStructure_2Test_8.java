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
    public void tests()  throws Exception {
	assertEquals(new ArrayList<JniInchiStereo0D>(), 0D.addStereo0D(null));
	assertEquals(new ArrayList<JniInchiStereo0D>(), null.addStereo0D(0D));
    }
}