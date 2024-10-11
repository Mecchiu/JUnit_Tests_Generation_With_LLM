// NumericalLetterGradeTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {
			/**
			* Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
			* It tests the method with a list of GPAs.
			*/
			@Test
			void testNumericalLetterGrade() {
						List<Number> grades = new ArrayList<Number>();
						grades.add(4.0);
						grades.add(3.7);
						grades.add(3.3);
						grades.add(3.0);
						grades.add(2.7);
						grades.add(2.3);
						grades.add(2.0);
						grades.add(1.7);
						grades.add(1.3);
						grades.add(1.0);
						grades.add(0.7);
						grades.add(0.0);
						List<String> expected = new ArrayList<String>();
						expected.add("A+");
						expected.add("A");
						expected.add("A-");
						expected.add("B+");
						expected.add("B");
						expected.add("B-");
						expected.add("C+");
						expected.add("C");
						expected.add("C-");
						expected.add("D+");
						expected.add("D");
						expected.add("D-");
						List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
						assertEquals(expected, actual);
			}
}