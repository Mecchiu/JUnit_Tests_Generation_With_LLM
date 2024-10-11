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

	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only one grade.
	*/
	@Test
	void testNumericalLetterGrade_OneGrade() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only two grades.
	*/
	@Test
	void testNumericalLetterGrade_TwoGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only three grades.
	*/
	@Test
	void testNumericalLetterGrade_ThreeGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only four grades.
	*/
	@Test
	void testNumericalLetterGrade_FourGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only five grades.
	*/
	@Test
	void testNumericalLetterGrade_FiveGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only six grades.
	*/
	@Test
	void testNumericalLetterGrade_SixGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only seven grades.
	*/
	@Test
	void testNumericalLetterGrade_SevenGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only eight grades.
	*/
	@Test
	void testNumericalLetterGrade_EightGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only nine grades.
	*/
	@Test
	void testNumericalLetterGrade_NineGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades that contains only ten grades.
	*/
	@Test
	void testNumericalLetterGrade_TenGrades() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3.0);
		grades.add(2.0);
		grades.add(1.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B+");
		expected.add("C+");
		expected.add("D+");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
}