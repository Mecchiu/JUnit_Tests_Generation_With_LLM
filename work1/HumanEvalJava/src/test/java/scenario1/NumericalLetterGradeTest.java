// NumericalLetterGradeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {
			// Test case 1: Test the method with an empty list
    @Test
    void testNumericalLetterGradeEmptyList() {
        List<Number> grades = new ArrayList<Number>();
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test the method with a list of one element
    @Test
    void testNumericalLetterGradeOneElement() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
    }

    // Test case 3: Test the method with a list of two elements
    @Test
    void testNumericalLetterGradeTwoElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
    }

    // Test case 4: Test the method with a list of three elements
    @Test
    void testNumericalLetterGradeThreeElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
    }

    // Test case 5: Test the method with a list of four elements
    @Test
    void testNumericalLetterGradeFourElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
    }

    // Test case 6: Test the method with a list of five elements
    @Test
    void testNumericalLetterGradeFiveElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        grades.add(4.0);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
        assertEquals("A+", result.get(4));
    }

    // Test case 7: Test the method with a list of six elements
    @Test
    void testNumericalLetterGradeSixElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        grades.add(4.0);
        grades.add(3.0);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
        assertEquals("A+", result.get(4));
        assertEquals("B", result.get(5));
    }

    // Test case 8: Test the method with a list of seven elements
    @Test
    void testNumericalLetterGradeSevenElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
        assertEquals("A+", result.get(4));
        assertEquals("B", result.get(5));
        assertEquals("C+", result.get(6));
    }

    // Test case 9: Test the method with a list of eight elements
    @Test
    void testNumericalLetterGradeEightElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
        assertEquals("A+", result.get(4));
        assertEquals("B", result.get(5));
        assertEquals("C+", result.get(6));
        assertEquals("D+", result.get(7));
    }

    // Test case 10: Test the method with a list of nine elements
    @Test
    void testNumericalLetterGradeNineElements() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(3.5);
        grades.add(2.5);
        grades.add(1.5);
        grades.add(0.5);
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        List<String> result = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals("A", result.get(0));
        assertEquals("C", result.get(1));
        assertEquals("D", result.get(2));
        assertEquals("E", result.get(3));
        assertEquals("A+", result.get(4));
        assertEquals("B", result.get(5));
        assertEquals("C+", result.get(6));
        assertEquals("D+", result.get(7));
        assertEquals("E", result.get(8));
    }
}