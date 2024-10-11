// Test class of SeparateParenGroups
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class SeparateParenGroupsTest {

    @Test
    void testSeparateParenGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("(())");
        expected.add("()");
        expected.add("()()");

        List<String> result = SeparateParenGroups.separateParenGroups("(())()()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsEmptyString() {
        List<String> expected = new ArrayList<>();

        List<String> result = SeparateParenGroups.separateParenGroups("");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsNoParentheses() {
        List<String> expected = new ArrayList<>();

        List<String> result = SeparateParenGroups.separateParenGroups("no parentheses here");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsSingleGroup() {
        List<String> expected = new ArrayList<>();
        expected.add("()");

        List<String> result = SeparateParenGroups.separateParenGroups("()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsMultipleGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        expected.add("()");

        List<String> result = SeparateParenGroups.separateParenGroups("()()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsNestedGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        expected.add("()()");

        List<String> result = SeparateParenGroups.separateParenGroups("(()())");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsUnbalancedGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");

        List<String> result = SeparateParenGroups.separateParenGroups("(()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsMultipleNestedGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        expected.add("()()");

        List<String> result = SeparateParenGroups.separateParenGroups("(()())()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsMultipleUnbalancedGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        expected.add("()");

        List<String> result = SeparateParenGroups.separateParenGroups("(()()");

        assertEquals(expected, result);
    }

    @Test
    void testSeparateParenGroupsMultipleNestedAndUnbalancedGroups() {
        List<String> expected = new ArrayList<>();
        expected.add("()");
        expected.add("()()");

        List<String> result = SeparateParenGroups.separateParenGroups("(()())()(");

        assertEquals(expected, result);
    }
}