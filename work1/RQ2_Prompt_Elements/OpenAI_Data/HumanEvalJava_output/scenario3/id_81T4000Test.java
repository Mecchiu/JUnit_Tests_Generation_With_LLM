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
		List<Number> grades = List.of(4.0, 3, 1.7, 2, 3.5);
		List<String> expected = List.of("A+", "B", "C-", "C", "A-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade2() {
		List<Number> grades = List.of(1.2);
		List<String> expected = List.of("D+");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade3() {
		List<Number> grades = List.of(0.5);
		List<String> expected = List.of("D-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade4() {
		List<Number> grades = List.of(0.0);
		List<String> expected = List.of("E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade5() {
		List<Number> grades = List.of(1, 0.3, 1.5, 2.8, 3.3);
		List<String> expected = List.of("D", "D-", "C-", "B", "B+");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade6() {
		List<Number> grades = List.of(0, 0.7);
		List<String> expected = List.of("E", "D-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade7() {
		List<Number> grades = List.of(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0);
		List<String> expected = List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade8() {
		List<Number> grades = List.of(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0);
		List<String> expected = List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade9() {
		List<Number> grades = List.of(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0);
		List<String> expected = List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E", "E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	@Test
	void testNumericalLetterGrade10() {
		List<Number> grades = List.of(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0, 0.0, 0.0, 0.0);
		List<String> expected = List.of("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E", "E", "E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
}