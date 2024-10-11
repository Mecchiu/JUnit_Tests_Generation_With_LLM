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
    
    @Test
    void testNumericalLetterGradeWithEmptyList() {
        List<Number> grades = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithOneGrade() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.5);
        List<String> expected = new ArrayList<>();
        expected.add("A-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithMultipleGrades() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.2);
        grades.add(2.8);
        grades.add(4.0);
        grades.add(1.5);
        List<String> expected = new ArrayList<>();
        expected.add("B-");
        expected.add("B");
        expected.add("A+");
        expected.add("D");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesAbove4() {
        List<Number> grades = new ArrayList<>();
        grades.add(4.0);
        grades.add(4.0);
        grades.add(4.0);
        List<String> expected = new ArrayList<>();
        expected.add("A+");
        expected.add("A+");
        expected.add("A+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesBelow1() {
        List<Number> grades = new ArrayList<>();
        grades.add(0.5);
        grades.add(0.0);
        grades.add(0.7);
        List<String> expected = new ArrayList<>();
        expected.add("E");
        expected.add("E");
        expected.add("D-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesBetween1And2() {
        List<Number> grades = new ArrayList<>();
        grades.add(1.5);
        grades.add(1.7);
        grades.add(1.3);
        List<String> expected = new ArrayList<>();
        expected.add("D");
        expected.add("D+");
        expected.add("D-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesBetween2And3() {
        List<Number> grades = new ArrayList<>();
        grades.add(2.5);
        grades.add(2.7);
        grades.add(2.3);
        List<String> expected = new ArrayList<>();
        expected.add("C");
        expected.add("C+");
        expected.add("C-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesBetween3And4() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.5);
        grades.add(3.7);
        grades.add(3.3);
        List<String> expected = new ArrayList<>();
        expected.add("A-");
        expected.add("A");
        expected.add("A-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesEqualTo3() {
        List<Number> grades = new ArrayList<>();
        grades.add(3.0);
        grades.add(3.0);
        grades.add(3.0);
        List<String> expected = new ArrayList<>();
        expected.add("B+");
        expected.add("B+");
        expected.add("B+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNumericalLetterGradeWithAllGradesEqualTo2() {
        List<Number> grades = new ArrayList<>();
        grades.add(2.0);
        grades.add(2.0);
        grades.add(2.0);
        List<String> expected = new ArrayList<>();
        expected.add("C+");
        expected.add("C+");
        expected.add("C+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
}