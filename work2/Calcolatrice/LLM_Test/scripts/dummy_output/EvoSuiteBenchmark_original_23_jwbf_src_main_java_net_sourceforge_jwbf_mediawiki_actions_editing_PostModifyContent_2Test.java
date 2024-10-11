java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * Test class of {@link PostModifyContent}.
 * It contains ten unit test cases for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
 */
class PostModifyContent_2Test {

    @Test
    void testIsIntersectionEmpty_BothSetsNull() {
        assertTrue(PostModifyContent.isIntersectionEmpty(null, null));
    }

    @Test
    void testIsIntersectionEmpty_FirstSetNull() {
        Set<String> setA = null;
        Set<String> setB = new HashSet<>();
        setB.add("A");
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_SecondSetNull() {
        Set<String> setA = new HashSet<>();
        setA.add("A");
        Set<String> setB = null;
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_NoIntersection() {
        Set<String> setA = new HashSet<>();
        setA.add("A");
        Set<String> setB = new HashSet<>();
        setB.add("B");
        assertTrue(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_IntersectionNotEmpty() {
        Set<String> setA = new HashSet<>();
        setA.add("A");
        setA.add("B");
        Set<String> setB = new HashSet<>();
        setB.add("B");
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_FirstSetEmpty() {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        setB.add("A");
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_SecondSetEmpty() {
        Set<String> setA = new HashSet<>();
        setA.add("A");
        Set<String> setB = new HashSet<>();
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_BothSetsEmpty() {
        Set<String> setA = new HashSet<>();
        Set<String> setB = new HashSet<>();
        assertTrue(PostModifyContent.isIntersectionEmpty(setA, setB));
    }

    @Test
    void testIsIntersectionEmpty_SameElements() {
        Set<String> setA = new HashSet<>();
        setA.add("A");
        Set<String> setB = new HashSet<>();
        setB.add("A");
        assertFalse(PostModifyContent.isIntersectionEmpty(setA, setB));
    }
}
