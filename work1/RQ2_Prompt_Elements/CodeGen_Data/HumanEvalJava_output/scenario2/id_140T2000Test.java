// FixSpacesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
// FixSpaces.java
package scenario2;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) =='') {
                end += 1;
            } else {
                if (end - start > 2) {
                    new_text += "-" + text.charAt(i);
                } else if (end - start > 0) {
                    new_text += "_".repeat(end - start) + text.charAt(i);
                } else {
                    new_text += text.charAt(i);
                }
                start = i + 1;
                end = i + 1;
            }
            i += 1;
        }
        if (end - start > 2) {
            new_text += "-";
        } else if (end - start > 0) {
            new_text += "_";
        }
        return new_text;
    }
}

// FixSpacesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		@Test
		public void test2() {
                assertEquals("-".repeat(0) + "_-", fixSpaces("-"));
                assertEquals(null, fixSpaces(""));
                assertEquals(null, fixSpaces(" "));
                assertEquals(null, fixSpaces("-"));
                assertEquals("", fixSpaces("-"));
                assertEquals("", fixSpaces(""));
        }
		
}
