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
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Number> grades = new ArrayList<Number>();
				List<String> expected = new ArrayList<String>();
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(1.2);
				List<String> expected = new ArrayList<String>();
				expected.add("D+");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList2() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(0.5);
				List<String> expected = new ArrayList<String>();
				expected.add("D-");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList3() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(0.0);
				List<String> expected = new ArrayList<String>();
				expected.add("E");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList4() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(1.0);
				List<String> expected = new ArrayList<String>();
				expected.add("D+");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList5() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(0.7);
				List<String> expected = new ArrayList<String>();
				expected.add("D-");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList6() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(0.3);
				List<String> expected = new ArrayList<String>();
				expected.add("D-");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList7() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(1.5);
				List<String> expected = new ArrayList<String>();
				expected.add("C-");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList8() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(2.8);
				List<String> expected = new ArrayList<String>();
				expected.add("B");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList9() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(3.3);
				List<String> expected = new ArrayList<String>();
				expected.add("B+");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the method {@link NumericalLetterGrade#numericalLetterGrade(List)}.
			* It tests the case when the input list contains only one element.
			*/
			@Test
			void testOneElementList10() {
				List<Number> grades = new ArrayList<Number>();
				grades.add(4.0);
				List<String> expected = new ArrayList<String>();
				expected.add("A+");
				List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
				assertEquals(expected, actual);
			}
}
