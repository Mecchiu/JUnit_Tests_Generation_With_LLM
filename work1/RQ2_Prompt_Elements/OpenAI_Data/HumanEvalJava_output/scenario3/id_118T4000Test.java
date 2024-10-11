// GetClosestVowelTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {

	@Test
	void testGetClosestVowel() {
		assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
		assertEquals("u", GetClosestVowel.getClosestVowel("full"));
		assertEquals("", GetClosestVowel.getClosestVowel("easy"));
		assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
		assertEquals("", GetClosestVowel.getClosestVowel("ali"));
		assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
		assertEquals("o", GetClosestVowel.getClosestVowel("most"));
		assertEquals("", GetClosestVowel.getClosestVowel("ab"));
		assertEquals("", GetClosestVowel.getClosestVowel("ba"));
		assertEquals("", GetClosestVowel.getClosestVowel("quick"));
		assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
		assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
		assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
	}
}
```

## Scenario 4

```java
// GetClosestVowel.java
package scenario4;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("ba")
     * ""
     * > getClosestVowel("quick")
     * ""
     * > getClosestVowel("anime")
     * "i"
     * > getClosestVowel("Asia")
     * ""
     * > getClosestVowel("Above")
     * "o"
     */
    public static String getClosestVowel(String word) {
    }
}

// GetClosestVowelTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
	@Test
	void testGetClosestVowel() {
		assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
		assertEquals("u", GetClosestVowel.getClosestVowel("full"));
		assertEquals("", GetClosestVowel.getClosestVowel("easy"));
		assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
		assertEquals("", GetClosestVowel.getClosestVowel("ali"));
		assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
		assertEquals("o", GetClosestVowel.getClosestVowel("most"));
		assertEquals("", GetClosestVowel.getClosestVowel("ab"));
		assertEquals("", GetClosestVowel.getClosestVowel("ba"));
		assertEquals("", GetClosestVowel.getClosestVowel("quick"));
		assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
		assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
		assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
	}
}
```

## Scenario 5

```java
// GetClosestVowel.java
package scenario5;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("ba")
     * ""
     * > getClosestVowel("quick")
     * ""
     * > getClosestVowel("anime")
     * "i"
     * > getClosestVowel("Asia")
     * ""
     * > getClosestVowel("Above")
     * "o"
     */
    public static String getClosestVowel(String word) {
    }
}

// GetClosestVowelTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
	@Test
	void testGetClosestVowel() {
		assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
		assertEquals("u", GetClosestVowel.getClosestVowel("full"));
		assertEquals("", GetClosestVowel.getClosestVowel("easy"));
		assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
		assertEquals("", GetClosestVowel.getClosestVowel("ali"));
		assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
		assertEquals("o", GetClosestVowel.getClosestVowel("most"));
		assertEquals("", GetClosestVowel.getClosestVowel("ab"));
		assertEquals("", GetClosestVowel.getClosestVowel("ba"));
		assertEquals("", GetClosestVowel.getClosestVowel("quick"));
		assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
		assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
		assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
	}
}
```

## Scenario 6

```java
// GetClosestVowel.java
package scenario6;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("ba")
     * ""
     * > getClosestVowel("quick")
     * ""
     * > getClosestVowel("anime")
     * "i"
     * > getClosestVowel("Asia")
     * ""
     * > getClosestVowel("Above")
     * "o"
     */
    public static String getClosestVowel(String word) {
    }
}

// GetClosestVowelTest.java
package scenario6;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
	@Test
	void testGetClosestVowel() {
		assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
		assertEquals("u", GetClosestVowel.getClosestVowel("full"));
		assertEquals("", GetClosestVowel.getClosestVowel("easy"));
		assertEquals("", GetClosestVowel.getClosestVowel("eAsy"));
		assertEquals("", GetClosestVowel.getClosestVowel("ali"));
		assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
		assertEquals("o", GetClosestVowel.getClosestVowel("most"));
		assertEquals("", GetClosestVowel.getClosestVowel("ab"));
		assertEquals("", GetClosestVowel.getClosestVowel("ba"));
		assertEquals("", GetClosestVowel.getClosestVowel("quick"));
		assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
		assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
		assertEquals("o", GetClosestVowel.getClosestVowel("Above"));
	}
}
```

## Scenario 7

```java
// GetClosestVowel.java
package scenario7;

class GetClosestVowel {

    /**
     * You are given a word. Your task is to find the closest vowel that stands between
     * two consonants from the right side of the word (case sensitive).
     *
     * Vowels in the beginning and ending doesn't count. Return empty string if you didn't
     * find any vowel met the above condition.
     *
     * You may assume that the given string contains English letter only.
     *
     * Example:
     * getClosestVowel("yogurt") ==> "u"
     * getClosestVowel("FULL") ==> "U"
     * getClosestVowel("quick") ==> ""
     * getClosestVowel("ab") ==> ""
     *
     * > getClosestVowel("yogurt")
     * "u"
     * > getClosestVowel("full")
     * "u"
     * > getClosestVowel("easy")
     * ""
     * > getClosestVowel("eAsy")
     * ""
     * > getClosestVowel("ali")
     * ""
     * > getClosestVowel("bad")
     * "a"
     * > getClosestVowel("most")
     * "o"
     * > getClosestVowel("ab")
     * ""
     * > getClosestVowel("ba")
     * ""
     * > getClosestVowel("quick")
     * ""
     * > getClosestVowel("anime")
     * "i"
     * > getClosestVowel("Asia")
     * ""
     * > getClosestVowel("Above")
     * "o"
     */
    public static String getClosestVowel(String word) {
    }
}

// GetClosestVowelTest.java
package scenario7;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
	@Test
	void testGetClosestVowel()