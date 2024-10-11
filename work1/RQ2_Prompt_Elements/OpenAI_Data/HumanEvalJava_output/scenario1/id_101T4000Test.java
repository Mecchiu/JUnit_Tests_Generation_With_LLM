// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

	@Test
	void testWordsString_1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_2() {
		List<Object> expected = Arrays.asList("Hello");
		List<Object> actual = WordsString.wordsString("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_3() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_4() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello,World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_5() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_6() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_7() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_8() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_9() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_10() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, , ");
		assertEquals(expected, actual);
	}
}

// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		
	@Test
	void testWordsString_1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_2() {
		List<Object> expected = Arrays.asList("Hello");
		List<Object> actual = WordsString.wordsString("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_3() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_4() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello,World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_5() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_6() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_7() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_8() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_9() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_10() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, , ");
		assertEquals(expected, actual);
	}
}

// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		
	@Test
	void testWordsString_1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_2() {
		List<Object> expected = Arrays.asList("Hello");
		List<Object> actual = WordsString.wordsString("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_3() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_4() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello,World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_5() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_6() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_7() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_8() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_9() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_10() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, , ");
		assertEquals(expected, actual);
	}
}

// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		
	@Test
	void testWordsString_1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_2() {
		List<Object> expected = Arrays.asList("Hello");
		List<Object> actual = WordsString.wordsString("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_3() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_4() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello,World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_5() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_6() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_7() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_8() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_9() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_10() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, , ");
		assertEquals(expected, actual);
	}
}

// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		
	@Test
	void testWordsString_1() {
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = WordsString.wordsString("");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_2() {
		List<Object> expected = Arrays.asList("Hello");
		List<Object> actual = WordsString.wordsString("Hello");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_3() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_4() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello,World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_5() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_6() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_7() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_8() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_9() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, ,");
		assertEquals(expected, actual);
	}
	
	@Test
	void testWordsString_10() {
		List<Object> expected = Arrays.asList("Hello", "World");
		List<Object> actual = WordsString.wordsString("Hello, World, , ");
		assertEquals(expected, actual);
	}
}

// WordsStringTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains ten unit test cases for