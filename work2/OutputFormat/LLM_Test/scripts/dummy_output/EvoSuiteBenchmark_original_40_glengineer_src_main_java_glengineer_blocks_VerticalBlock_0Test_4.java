// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {
		/**
		* Test of extractSequentialSubblocks with a random character from the Scheme.
		*/
		@Test
        public void test1() {
        String testString = "aabbbbca";
        System.out.println("Starting CharTable test");
                VerticalBlockVLM charTable = new VerticalBlockVLM(Character.getUnicodeBlock(testString));

        List<VWord> verticalLines = verticalBlockWithoutDeterminingVLR(charTable);

        assertEquals(1, verticalLines.size());
        assertNotNull(verticalLines.get(0));

        verticalBlockWithoutDeterminingVLR(charTable);
        assertEquals(1, verticalLines.size());
        assertNotNull(verticalLines.get(0));

        verticalBlockWithoutDeterminingVLR(charTable);

        assertEquals(1, verticalLines.size());
}
}