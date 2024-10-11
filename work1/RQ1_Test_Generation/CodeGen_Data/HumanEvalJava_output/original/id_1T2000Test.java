// SeparateParenGroupsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SeparateParenGroups}.
* It contains one unit test case for the {@link SeparateParenGroups#separateParenGroups(String)} method.
*/
class SeparateParenGroupsTest {
/**
		* @throws IllegalStateException
		*/
		@Test
    public void testSeparateParenGroups() {
        final String s = "();";
        final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        assertNotNull(result);
        assertEquals(3, result.size());
        System.out.println(result);
        check(result, s.length()+1);
    }
		/**
		* Test case: String "()()"
		* @throws IllegalStateException
		*/
    @Test
    public void testSimple() {
        final String s = "()";
        final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        assertNotNull(result);
        assertEquals(4, result.size());
        check(result, s.length());
    }
		/**
		* No output.
		*
		* @throws IllegalStateException
		*/
    @Test
    public void testEmpty() {
        final String s = "()";
        final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        assertEmpty(result);
    }
		/**
		* Check number of output string matches given number of inputs.
		*
		* @throws IllegalStateException
		*/
    @Test
    public void testNoResult() {
        final String s = "()()()";
		final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        assertEmpty(result);
    }

		/**
		* Check output string matches expected number of strings given input strings
		*
		* @throws IllegalStateException
		*/
    @Test
    public void testValidInputs() {
        final String s = "[()()]()()()()()()()()()()()()()]";
        final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        assertEquals(4, result.size());
        check(result, s.length()+1);
    }

		/**
		* Check list of invalid input strings from separater groups
		*
		* @throws ArrayIndexOutOfBoundsException
		* 	The list of invalid input strings contains an invalid input string.
		*/
    @Test
    public void testInvalidInputs() {
        final String s = "[()()()()]()()();()()()()()()();()()...]";
		final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        final List<String> invalid = new ArrayList<>();
        invalid.addAll(result);
        assertFalse(invalid.isEmpty());
    }

		/**
		* Ensure correct number of output strings outputting strings from separater groups.
		*/
    @Test
    public void testOutputGroups() {
        final String s = "()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()();()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()()();()()()()()();()()()()()()();()()()()()()()()()()()();()()();()()()()()()()()()();()()()();()();()();()()";
        final List<String> result = new SeparateParenGroups().separateParenGroups(s);
        check(result, s.length()+1);
    }
}
