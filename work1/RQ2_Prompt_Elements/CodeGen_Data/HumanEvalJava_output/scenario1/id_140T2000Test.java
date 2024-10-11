// FixSpacesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
// FixSpaces.java
package scenario1;

class FixSpaces {

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
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains one unit test case for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		
	private final FixSpacesFixer test_fixer = new FixSpacesFixer();
	
	@Test
    public void test_fixSpaces() {
        String input = "Hello, this is a testing string";
        String output = test_fixer.fixSpaces(input);

        assertEquals("output for empty String", "Hello", output);
        assertEquals("output for empty String", "this is a testing string", output);
        assertEquals("output for non-empty String", "this is a testing string", test_fixer.fixSpaces(input + "!"));
    }
	
	@Test
	public void test_fixSpaces_is_not_supported() {
		assertEquals("Not supported error", false, test_fixer.fixSpaces(String.valueOf(99)).equals("99"));
	}
}
