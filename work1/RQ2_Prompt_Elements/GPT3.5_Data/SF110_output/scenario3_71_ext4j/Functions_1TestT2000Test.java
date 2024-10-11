// Functions_1Test.java
package net.sourceforge.ext4j.taglib.tag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {

    @Test
    void testAddS() {
        assertEquals("James'", Functions.addS("James"));
        assertEquals("Daniel's", Functions.addS("Daniel"));
        assertEquals("John's", Functions.addS("John"));
        assertEquals("Mary's", Functions.addS("Mary"));
        assertEquals("Luc's", Functions.addS("Luc"));
        assertEquals("Anna's", Functions.addS("Anna"));
        assertEquals("David's", Functions.addS("David"));
        assertEquals("Sarah's", Functions.addS("Sarah"));
        assertEquals("Michael's", Functions.addS("Michael"));
        assertEquals("Emily's", Functions.addS("Emily"));
    }
}