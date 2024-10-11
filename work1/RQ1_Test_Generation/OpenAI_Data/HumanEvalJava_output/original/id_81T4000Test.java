// NumericalLetterGradeTest.java
package original;

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
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(3);
		grades.add(1.7);
		grades.add(2);
		grades.add(3.5);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("B");
		expected.add("C-");
		expected.add("C");
		expected.add("A-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade2() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(1.2);
		List<String> expected = new ArrayList<String>();
		expected.add("D+");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade3() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(0.5);
		List<String> expected = new ArrayList<String>();
		expected.add("D-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade4() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade5() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(1);
		grades.add(0.3);
		grades.add(1.5);
		grades.add(2.8);
		grades.add(3.3);
		List<String> expected = new ArrayList<String>();
		expected.add("D");
		expected.add("D-");
		expected.add("C-");
		expected.add("B");
		expected.add("B+");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade6() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(0);
		grades.add(0.7);
		List<String> expected = new ArrayList<String>();
		expected.add("E");
		expected.add("D-");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade7() {
		List<Number> grades = new ArrayList<Number>();
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
		expected.add("E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade8() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(0.3);
		grades.add(0.7);
		grades.add(1.0);
		grades.add(1.3);
		grades.add(1.7);
		grades.add(2.0);
		grades.add(2.3);
		grades.add(2.7);
		grades.add(3.0);
		grades.add(3.3);
		grades.add(3.7);
		List<String> expected = new ArrayList<String>();
		expected.add("D-");
		expected.add("D");
		expected.add("D+");
		expected.add("C-");
		expected.add("C");
		expected.add("C+");
		expected.add("B-");
		expected.add("B");
		expected.add("B+");
		expected.add("A-");
		expected.add("A");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade9() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		grades.add(0.0);
		List<String> expected = new ArrayList<String>();
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		expected.add("E");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
	
	/**
	* Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
	* It tests the method with a list of grades.
	*/
	@Test
	void testNumericalLetterGrade10() {
		List<Number> grades = new ArrayList<Number>();
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		grades.add(4.0);
		List<String> expected = new ArrayList<String>();
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		expected.add("A+");
		assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
	}
}