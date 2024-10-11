// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {
		
	@Test
	void testCountUpper() {
		assertEquals(0, CountUpper.countUpper("abcdefg"));
		assertEquals(0, CountUpper.countUpper("dBBE"));
		assertEquals(0, CountUpper.countUpper(""));
		assertEquals(2, CountUpper.countUpper("EEEE"));
		assertEquals(1, CountUpper.countUpper("aBCdEf"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
		assertEquals(0, CountUpper.countUpper("aBCdEfG"));
	}
}

// CountUpper.java
package scenario3;

class CountUpper {

    /**
     * * Given a string s, count the number of uppercase vowels in even indices.
     *
     * For example:
     * countUpper('aBCdEf') returns 1
     * countUpper('abcdefg') returns 0
     * countUpper('dBBE') returns 0
     *
     * > countUpper("abcdefg")
     * 0
     * > countUpper("dBBE")
     * 0
     * > countUpper("")
     * 0
     * > countUpper("EEEE")
     * 2
     */
    public static int countUpper(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0 && Character.isUpperCase(s.charAt