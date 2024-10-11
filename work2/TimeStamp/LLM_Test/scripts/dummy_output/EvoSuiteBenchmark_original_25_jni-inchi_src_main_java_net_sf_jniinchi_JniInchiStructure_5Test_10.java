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
		
    @Test
    void testGetStereo() {
        JniInchiStructure structure = new JniInchiStructure();
        List<Pair> result = structure.getStereo(1).getPairs();
        assertEquals(true, result.contains(new Pair(0, 1)));
    }

    @Test
    void testPairs() {
        JniInchiStructure structure = new JniInchiStructure();
        List<Pair> result = structure.getStereo(1).getPairs();
        assertEquals(2, result.size());
        List<Pair> expected = new ArrayList<>();
        expected.add(new Pair(0, 1));
        expected.add(new Pair(0, 2));
        assertTrue(result.containsAll(expected));
    }
	
}