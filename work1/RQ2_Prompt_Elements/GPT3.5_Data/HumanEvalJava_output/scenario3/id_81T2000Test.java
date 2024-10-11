// NumericalLetterGrade.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class NumericalLetterGrade {

    /**
     * It is the last week of the semester and the teacher has to give the grades
     * to students. The teacher has been making her own algorithm for grading.
     * The only problem is, she has lost the code she used for grading.
     * She has given you a list of GPAs for some students and you have to write
     * a function that can output a list of letter grades using the following table:
     * GPA       |    Letter grade
     * 4.0                A+
     * > 3.7                A
     * > 3.3                A-
     * > 3.0                B+
     * > 2.7                B
     * > 2.3                B-
     * > 2.0                C+
     * > 1.7                C
     * > 1.3                C-
     * > 1.0                D+
     * > 0.7                D
     * > 0.0                D-
     * 0.0                E
     *
     * Example:
     * numericalLetterGrade([4.0, 3, 1.7, 2, 3.5]) ==> ['A+', 'B', 'C-', 'C', 'A-']
     *
     * > numericalLetterGrade([4.0, 3, 1.7, 2, 3.5])
     * ["A+", "B", "C-", "C", "A-"]
     * > numericalLetterGrade([1.2])
     * ["D+"]
     * > numericalLetterGrade([0.5])
     * ["D-"]
     * > numericalLetterGrade([0.0])
     * ["E"]
     * > numericalLetterGrade([1, 0.3, 1.5, 2.8, 3.3])
     * ["D", "D-", "C-", "B", "B+"]
     * > numericalLetterGrade([0, 0.7])
     * ["E", "D-"]
     */
    public static List<String> numericalLetterGrade(List<Number> grades) {
        List<String> letterGrades = new ArrayList<>();
        for (Number grade : grades) {
            if (grade.doubleValue() == 4.0) {
                letterGrades.add("A+");
            } else if (grade.doubleValue() > 3.7) {
                letterGrades.add("A");
            } else if (grade.doubleValue() > 3.3) {
                letterGrades.add("A-");
            } else if (grade.doubleValue() > 3.0) {
                letterGrades.add("B+");
            } else if (grade.doubleValue() > 2.7) {
                letterGrades.add("B");
            } else if (grade.doubleValue() > 2.3) {
                letterGrades.add("B-");
            } else if (grade.doubleValue() > 2.0) {
                letterGrades.add("C+");
            } else if (grade.doubleValue() > 1.7) {
                letterGrades.add("C");
            } else if (grade.doubleValue() > 1.3) {
                letterGrades.add("C-");
            } else if (grade.doubleValue() > 1.0) {
                letterGrades.add("D+");
            } else if (grade.doubleValue() > 0.7) {
                letterGrades.add("D");
            } else if (grade.doubleValue() > 0.0) {
                letterGrades.add("D-");
            } else {
                letterGrades.add("E");
            }
        }
        return letterGrades;
    }
}

// NumericalLetterGradeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {
    
    @Test
    void testNumericalLetterGrade() {
        List<Number> grades1 = Arrays.asList(4.0, 3, 1.7, 2, 3.5);
        List<String> expected1 = Arrays.asList("A+", "B", "C-", "C", "A-");
        assertEquals(expected1, NumericalLetterGrade.numericalLetterGrade(grades1));
        
        List<Number> grades2 = Arrays.asList(1.2);
        List<String> expected2 = Arrays.asList("D+");
        assertEquals(expected2, NumericalLetterGrade.numericalLetterGrade(grades2));
        
        List<Number> grades3 = Arrays.asList(0.5);
        List<String> expected3 = Arrays.asList("D-");
        assertEquals(expected3, NumericalLetterGrade.numericalLetterGrade(grades3));
        
        List<Number> grades4 = Arrays.asList(0.0);
        List<String> expected4 = Arrays.asList("E");
        assertEquals(expected4, NumericalLetterGrade.numericalLetterGrade(grades4));
        
        List<Number> grades5 = Arrays.asList(1, 0.3, 1.5, 2.8, 3.3);
        List<String> expected5 = Arrays.asList("D", "D-", "C-", "B", "B+");
        assertEquals(expected5, NumericalLetterGrade.numericalLetterGrade(grades5));
        
        List<Number> grades6 = Arrays.asList(0, 0.7);
        List<String> expected6 = Arrays.asList("E", "D-");
        assertEquals(expected6, NumericalLetterGrade.numericalLetterGrade(grades6));
        
        List<Number> grades7 = Arrays.asList(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0);
        List<String> expected7 = Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E");
        assertEquals(expected7, NumericalLetterGrade.numericalLetterGrade(grades7));
        
        List<Number> grades8 = Arrays.asList(3.85, 2.95, 1.75, 0.85);
        List<String> expected8 = Arrays.asList("A", "B-", "C", "D+");
        assertEquals(expected8, NumericalLetterGrade.numericalLetterGrade(grades8));
        
        List<Number> grades9 = Arrays.asList(3.95, 3.85, 3.75, 3.65, 3.55, 3.45, 3.35, 3.25, 3.15, 3.05, 2.95, 2.85, 2.75, 2.65, 2.55, 2.45, 2.35, 2.25, 2.15, 2.05, 1.95, 1.85, 1.75, 1.65, 1.55, 1.45, 1.35, 1.25, 1.15, 1.05, 0.95, 0.85, 0.75, 0.65, 0.55, 0.45, 0.35, 0.25, 0.15, 0.05);
        List<String> expected9 = Arrays.asList("A+", "A+", "A+", "A+", "A", "A", "A", "A-", "A-", "A-", "A-", "B+", "B+", "B+", "B", "B", "B-", "B-", "B-", "C+", "C+", "C+", "C", "C", "C-", "C-", "C-", "D+", "D+", "D+", "D", "D", "D-", "D-", "D-", "E", "E", "E", "E", "E");
        assertEquals(expected9, NumericalLetterGrade.numericalLetterGrade(grades9));
        
        List<Number> grades10 = Arrays.asList(4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 