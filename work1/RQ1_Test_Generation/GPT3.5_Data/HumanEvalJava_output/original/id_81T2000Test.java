```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class NumericalLetterGradeTest {

    @Test
    void testNumericalLetterGrade() {
        List<Number> grades1 = new ArrayList<>();
        grades1.add(4.0);
        grades1.add(3);
        grades1.add(1.7);
        grades1.add(2.0);
        grades1.add(3.5);
        assertEquals(List.of("A+", "B", "C-", "C", "A-"), NumericalLetterGrade.numericalLetterGrade(grades1));

        List<Number> grades2 = new ArrayList<>();
        grades2.add(1.2);
        assertEquals(List.of("D+"), NumericalLetterGrade.numericalLetterGrade(grades2));

        List<Number> grades3 = new ArrayList<>();
        grades3.add(0.5);
        assertEquals(List.of("D-"), NumericalLetterGrade.numericalLetterGrade(grades3));

        List<Number> grades4 = new ArrayList<>();
        grades4.add(0.0);
        assertEquals(List.of("E"), NumericalLetterGrade.numericalLetterGrade(grades4));

        List<Number> grades5 = new ArrayList<>();
        grades5.add(1);
        grades5.add(0.3);
        grades5.add(1.5);
        grades5.add(2.8);
        grades5.add(3.3);
        assertEquals(List.of("D", "D-", "C-", "B", "B+"), NumericalLetterGrade.numericalLetterGrade(grades5));

        List<Number> grades6 = new ArrayList<>();
        grades6.add(0);
        grades6.add(0.7);
        assertEquals(List.of("E", "D-"), NumericalLetterGrade.numericalLetterGrade(grades6));
    }
}
```
