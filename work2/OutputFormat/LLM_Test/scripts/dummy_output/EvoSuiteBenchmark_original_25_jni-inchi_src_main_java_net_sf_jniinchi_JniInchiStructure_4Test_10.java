// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		
    @Test
    void testGetBond() {
        // arrange
        final String name1 = "bond4test";
        final String name2 = "bond4test";
        final List<String> names = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            names.add(name1 + i);
        }

        // act
        final JniInchiBond bond4test = getBond(4);

        // assert
        assertTrue(names.containsAll(bond4test.getNames()));
    }
}