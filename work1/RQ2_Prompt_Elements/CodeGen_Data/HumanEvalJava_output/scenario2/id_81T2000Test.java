// NumericalLetterGradeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains one unit test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {

    /**
     * Generates list of all possible letters a+, a-, b+, b- and c+, c-
     */
    @Test
    public void numOfLetters() {
        List<Integer> allLetters = new ArrayList<>();
        allLetters.add(3); allLetters.add(2); allLetters.add(4);
        allLetters.add(8); allLetters.add(1); allLetters.add(0);
        
        List<Integer> expectedAnswer = new ArrayList<>();
        expectedAnswer.add(5); expectedAnswer.add(3); expectedAnswer.add(2);
        expectedAnswer.add(4); expectedAnswer.add(1); expectedAnswer.add(8);
        
        NumericalLetterGrade.numericalLetterGrade(allLetters);
        assertEquals(expectedAnswer, allLetters);
    }

}