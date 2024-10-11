// FixSpacesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {

		@Test
		void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("-", FixSpaces.fixSpaces("   "));
				assertEquals("", FixSpaces.fixSpaces(""));
		}
}

// FixSpaces.java
package refactored;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
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
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		
		@Test
		void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("-", FixSpaces.fixSpaces("   "));
				assertEquals("", FixSpaces.fixSpaces(""));
		}
}

// FixSpaces.java
package refactored;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
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
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		
		@Test
		void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("-", FixSpaces.fixSpaces("   "));
				assertEquals("", FixSpaces.fixSpaces(""));
		}
}

// FixSpaces.java
package refactored;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
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
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		
		@Test
		void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("-", FixSpaces.fixSpaces("   "));
				assertEquals("", FixSpaces.fixSpaces(""));
		}
}

// FixSpaces.java
package refactored;

class FixSpaces {

    /**
     * * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        String new_text = "";
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < text.length()) {
            if (text.charAt(i) == ' ') {
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
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
		
		@Test
		void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("-", FixSpaces.fixSpaces("   "));
				assertEquals("", FixSpaces.fixSpaces(""));
		}
}

// FixSpaces.java
package refactored;

class FixSpaces {

    /**
     * * Given a string text, replace