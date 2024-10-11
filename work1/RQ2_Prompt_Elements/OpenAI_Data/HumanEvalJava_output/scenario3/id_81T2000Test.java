// NumericalLetterGradeTest.java
package scenario3;

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
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(4.0, 3, 1.7, 2, 3.5));
				assertEquals(List.of("A+", "B", "C-", "C", "A-"), result);
			}

			@Test
			void testNumericalLetterGrade2() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(1.2));
				assertEquals(List.of("D+"), result);
			}

			@Test
			void testNumericalLetterGrade3() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(0.5));
				assertEquals(List.of("D-"), result);
			}

			@Test
			void testNumericalLetterGrade4() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(0.0));
				assertEquals(List.of("E"), result);
			}

			@Test
			void testNumericalLetterGrade5() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(1, 0.3, 1.5, 2.8, 3.3));
				assertEquals(List.of("D", "D-", "C-", "B", "B+"), result);
			}

			@Test
			void testNumericalLetterGrade6() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(0, 0.7));
				assertEquals(List.of("E", "D-"), result);
			}

			@Test
			void testNumericalLetterGrade7() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0));
				assertEquals(List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E"), result);
			}

			@Test
			void testNumericalLetterGrade8() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0, 2.9, 2.8, 2.7, 2.6, 2.5, 2.4, 2.3, 2.2, 2.1, 2.0, 1.9, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2, 0.1, 0.0));
				assertEquals(List.of("A", "A", "A", "A-", "A-", "A-", "B+", "B+", "B+", "B", "B", "B", "B-", "B-", "B-", "C+", "C+", "C+", "C", "C", "C", "C-", "C-", "C-", "D+", "D+", "D+", "D", "D", "D", "D-", "D-", "D-", "E", "E", "E", "E", "E", "E", "E", "E", "E"), result);
			}

			@Test
			void testNumericalLetterGrade9() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0, 2.9, 2.8, 2.7, 2.6, 2.5, 2.4, 2.3, 2.2, 2.1, 2.0, 1.9, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2, 0.1, 0.0));
				assertEquals(List.of("A", "A", "A", "A-", "A-", "A-", "B+", "B+", "B+", "B", "B", "B", "B-", "B-", "B-", "C+", "C+", "C+", "C", "C", "C", "C-", "C-", "C-", "D+", "D+", "D+", "D", "D", "D", "D-", "D-", "D-", "E", "E", "E", "E", "E", "E", "E", "E", "E"), result);
			}

			@Test
			void testNumericalLetterGrade10() {
				List<String> result = NumericalLetterGrade.numericalLetterGrade(List.of(3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0, 2.9, 2.8, 2.7, 2.6, 2.5, 2.4, 2.3, 2.2, 2.1, 2.0, 1.9, 1.8, 1.7, 1.6, 1.5, 1.4, 1.3, 1.2, 1.1, 1.0, 0.9, 0.8, 0.7, 0.6, 0.5, 0.4, 0.3, 0.2, 0.1, 0.0));
				assertEquals(List.of("A", "A", "A", "A-", "A-", "A-", "B+", "B+", "B+", "B", "B", "B", "B-", "B-", "B-", "C+", "C+", "C+", "C", "C", "C", "C-", "C-", "C-", "D+", "D+", "D+", "D", "D", "D", "D-", "D-", "D-", "E", "E", "E", "E", "E", "E", "E", "E", "E"), result);
			}
}