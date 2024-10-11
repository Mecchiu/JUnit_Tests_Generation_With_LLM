// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {
		/**
		* Constructor.
		*/
    public SimpleCharStream_0Test() {
    }

    /**
     * Method to initialize the object with.
     * @throws java.io.IOException if an IOException occurs.
     */
    @Test
    public void test_0() throws java.io.IOException {

        SimpleCharStream stream = new C99Chars();
        char c;

        // Initialization

        String source = "\n\n\n## The above description\n\n\n\n\n##\n\n";
        assertTrue("Expected end of input", stream.BeginToken());

        int i;
        int j;
        int k;

        // Try to read

        for (i = 0; i <= source.length(); i++) {
            source = source.substring(0, i) + "\n";
            c = (char) ((source.charAt(i) - '\u0001'));
            j = i;
            k = -1;

            for (; k < 1; k++) {
                try {
                    c = stream.Get(c);
                } catch (java.io.IOException e) {
                    // Failed
                    assertTrue(e.getMessage()!= null);
                }
            }

            if (k == 1)
                assertEquals("Failed to consume a single character", c, (char) ((source.charAt(i) - '\u0001')));
            else if (k == 2)
                assertEquals("Failed to consume two characters", i + 1, k);
            else
                assertTrue("Failed to consume " + k + " characters", false);
        }

        // Try to read a character.

}
}