// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
	}
	
	@Test
	void testSingleOccurrence() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
	}
	
	@Test
	void testNoOccurrence() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
	}
	
	@Test
	void testSubstringLongerThanString() {
		assertEquals(0, HowManyTimes.howManyTimes("john doe", "john doe jane"));
	}
	
	@Test
	void testSubstringEqualToString() {
		assertEquals(1, HowManyTimes.howManyTimes("john doe", "john doe"));
	}
}

// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
		
	@Test
	void testEmptyString() {
		assertEquals(0, HowManyTimes.howManyTimes("", "a"));
	}
	
	@Test
	void testSingleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
	}
	
	@Test
	void testDoubleChar() {
		assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
	}
	
	@Test
	void testEmptySubstring() {
		assertEquals(0, HowManyTimes.howManyTimes("", "x"));
	}
	
	@Test
	void testSingleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
	}
	
	@Test
	void testDoubleCharSubstring() {
		assertEquals(4, HowManyTimes.howManyTimes("cacacacac",