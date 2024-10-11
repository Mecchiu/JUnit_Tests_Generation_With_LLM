// WordsStringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
// WordsString.java
package scenario3;

import java.util.List;

class WordsString {

    /**
     * * You will be given a string of words separated by commas or spaces. Your task is
     * to split the string into words and return an array of the words.
     *
     * For example:
     * wordsString("Hi, my name is John") == ["Hi", "my", "name", "is", "John"]
     * wordsString("One, two, three, four, five, six") == ["One", "two", "three", "four", "five", "six"]
     *
     * > wordsString("Hi, my name is John")
     * ["Hi", "my", "name", "is", "John"]
     * > wordsString("One, two, three, four, five, six")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("Hi, my name")
     * ["Hi", "my", "name"]
     * > wordsString("One,, two, three, four, five, six,")
     * ["One", "two", "three", "four", "five", "six"]
     * > wordsString("")
     * []
     * > wordsString("ahmed    , gamal")
     * ["ahmed", "gamal"]
     */
    public static List<Object> wordsString(String s) {
    }
}

// WordsStringTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {
		private Vocabulary vocabulary = VocabularyMother.getVocabulary();

		@Test
		public void testWordsString() {
			assertEquals("",vocabulary.getEmptyString());
			assertEquals("  ",vocabulary.getString("  "));
			assertNull(vocabulary.getString("hi, my name is"));
			assertTrue(vocabulary.getString("One, two, three, four, five, six").isEmpty());
			assertEquals("",vocabulary.getString("Hi, my name is"));
			assertEquals("",vocabulary.getString("my.name"));
		}

		@Test
		public void testConcat() {
			assertEquals("",vocabulary.getConcat(""));
			assertEquals("  ",vocabulary.getConcat("  "));
			assertEquals(" ",vocabulary.getConcat(" "));
			assertEquals(" ",vocabulary.getConcat("   "));
		}

		@Test
		public void testWordsString2() {
			assertEquals("a.b.c.d.e.f.g.h.i.j.k.e.g.h.j.k.k.i.l.j.k.k.l.l.m.n.o.p.i.p.t.s.t.z.s.p.s.t.w.s.v.w.b.k.b.l.m.n.o.p.p.v",vocabulary.getConcat("a.b.c.d.e.f.g.h.i.j.k.e.g.h.j.k.k.i.l.j.k.k.l.l.m.n.o.p.i.p.t.s.v.w.b.k.b.l.m.n.o.p.p.v").deleteAllWords());
		}
}


// WordString.java
