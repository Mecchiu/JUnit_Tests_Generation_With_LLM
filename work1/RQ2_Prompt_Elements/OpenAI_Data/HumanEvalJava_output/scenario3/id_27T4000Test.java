// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
		
	@Test
	void testFlipCase() {
		assertEquals("hELLO", FlipCase.flipCase("Hello"));
		assertEquals("", FlipCase.flipCase(""));
		assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
		assertEquals("tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS", FlipCase.flipCase("These violent delights have violent ends"));
		assertEquals("", FlipCase.flipCase(null));
		assertEquals("", FlipCase.flipCase(" "));
		assertEquals("", FlipCase.flipCase("  "));
		assertEquals("", FlipCase.flipCase("   "));
		assertEquals("", FlipCase.flipCase("    "));
		assertEquals("", FlipCase.flipCase("     "));
	}
}

// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have