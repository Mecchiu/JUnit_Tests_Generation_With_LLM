// Here is the source code for JWBF_1Test.java

package net.sourceforge.jwbf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JWBF}.
 * It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
 */
class JWBF_1Test {

    @Test
    void testGetPartId() {
        // Test case 1
        String partId = JWBF.getPartId(JWBF.class);
        assertEquals("jwbf-core", partId);

        // Test case 2
        partId = JWBF.getPartId(JWBF_1Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 3
        partId = JWBF.getPartId(JWBF_2Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 4
        partId = JWBF.getPartId(JWBF_3Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 5
        partId = JWBF.getPartId(JWBF_4Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 6
        partId = JWBF.getPartId(JWBF_5Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 7
        partId = JWBF.getPartId(JWBF_6Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 8
        partId = JWBF.getPartId(JWBF_7Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 9
        partId = JWBF.getPartId(JWBF_8Test.class);
        assertEquals("jwbf-core", partId);

        // Test case 10
        partId = JWBF.getPartId(JWBF_9Test.class);
        assertEquals("jwbf-core", partId);
    }
}