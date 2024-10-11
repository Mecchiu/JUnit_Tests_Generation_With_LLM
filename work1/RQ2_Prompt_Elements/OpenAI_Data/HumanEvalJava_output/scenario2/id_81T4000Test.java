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
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only one element.
	*/
	@Test
	void testNumericalLetterGrade_OneElement() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only two elements.
	*/
	@Test
	void testNumericalLetterGrade_TwoElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only three elements.
	*/
	@Test
	void testNumericalLetterGrade_ThreeElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only four elements.
	*/
	@Test
	void testNumericalLetterGrade_FourElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only five elements.
	*/
	@Test
	void testNumericalLetterGrade_FiveElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only six elements.
	*/
	@Test
	void testNumericalLetterGrade_SixElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		grades.add(1.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		expected.add("D+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only seven elements.
	*/
	@Test
	void testNumericalLetterGrade_SevenElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		grades.add(1.0);
		grades.add(0.5);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		expected.add("D+");
		expected.add("D-");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only eight elements.
	*/
	@Test
	void testNumericalLetterGrade_EightElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		grades.add(1.0);
		grades.add(0.5);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		expected.add("D+");
		expected.add("D-");
		expected.add("E");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only nine elements.
	*/
	@Test
	void testNumericalLetterGrade_NineElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		grades.add(1.0);
		grades.add(0.5);
		grades.add(0.0);
		grades.add(4.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		expected.add("D+");
		expected.add("D-");
		expected.add("E");
		expected.add("A+");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the case when the input list contains only ten elements.
	*/
	@Test
	void testNumericalLetterGrade_TenElements() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(3.5);
		grades.add(3.0);
		grades.add(2.5);
		grades.add(2.0);
		grades.add(1.5);
		grades.add(1.0);
		grades.add(0.5);
		grades.add(0.0);
		grades.add(4.0);
		grades.add(3.7);
		List<String> expected = new ArrayList<String>();
		expected.add("A-");
		expected.add("B+");
		expected.add("B-");
		expected.add("C+");
		expected.add("C-");
		expected.add("D+");
		expected.add("D-");
		expected.add("E");
		expected.add("A+");
		expected.add("A");
		List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
		assertEquals(expected, actual);
	}
}