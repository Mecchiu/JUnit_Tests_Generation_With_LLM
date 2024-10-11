// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {

	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcdecadeCADE"));
		assertEquals(1, CountDistinctCharacters.countDistinctCharacters("aaaaAAAAaaaa"));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("Jerry jERRY JeRRRY"));
	}
}

// CountDistinctCharacters.java
package scenario3;

class CountDistinctCharacters {

    /**
     * Given a string, find out how many distinct characters (regardless of case)  it consists  of.
     *
     * > countDistinctCharacters("xyzXYZ")
     * 3
     * > countDistinctCharacters("Jerry")
     * 4
     * > countDistinctCharacters("")
     * 0
     * > countDistinctCharacters("abcde")
     * 5
     * > countDistinctCharacters("abcdecadeCADE")
     * 5
     * > countDistinctCharacters("aaaaAAAAaaaa")
     * 1
     * > countDistinctCharacters("Jerry jERRY JeRRRY")
     * 5
     */
    public static int countDistinctCharacters(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (string.indexOf(c) == i) {
                count++;
            }
        }
        return count;
    }
}

// CountDistinctCharactersTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains ten unit test cases for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
		
	@Test
	void testCountDistinctCharacters() {
		assertEquals(3, CountDistinctCharacters.countDistinctCharacters("xyzXYZ"));
		assertEquals(4, CountDistinctCharacters.countDistinctCharacters("Jerry"));
		assertEquals(0, CountDistinctCharacters.countDistinctCharacters(""));
		assertEquals(5, CountDistinctCharacters.countDistinctCharacters("abcde"));
		