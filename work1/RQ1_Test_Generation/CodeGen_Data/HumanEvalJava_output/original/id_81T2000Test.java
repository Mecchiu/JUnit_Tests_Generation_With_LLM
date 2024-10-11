// NumericalLetterGradeTest.java
package original;

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
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 1.
		 */
		 public void checkReturnValueEqualToGivenListOfGPA() {
				List<Number> gradesAsList = new ArrayList<>();
				numericalLetterGrade(gradesAsList);
				assertEquals(1, gradesAsList.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 2.
		 */
		 public void checkReturnValueEqualToGivenListOfGPAs3() {
				List<Number> gradesATwo = new ArrayList<>();
				gradesATwo.add(4.0);
				gradesATwo.add(3.7);
				gradesATwo.add(3.3);
				numericalLetterGrade(gradesATwo);
				assertEquals(2, gradesATwo.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 4.
		 */
		 public void checkReturnValueEqualToGivenListOfGPAInTheMiddleOfTheList() {
				List<Number> gradesAFour = new ArrayList<>();
				gradesAFour.add(4.0);
				gradesAFour.add(3.7);
				gradesAFour.add(3.3);
				gradesAFour.add(2.0);
				numericalLetterGrade(gradesAFour);
				assertEquals(4, gradesAFour.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 1.
		 */
		 public void checkReturnValueEqualToGivenListOfGPAsInTheEnd() {
				List<Number> gradesAOne = new ArrayList<>();
				gradesAOne.add(1.2);
				gradesAOne.add(1.5);
				gradesAOne.add(1.3);
				gradesAOne.add(0.8);
				numericalLetterGrade(gradesAOne);
				assertEquals(1, gradesAOne.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 10.
		 */
		 public void checkReturnValueEqualToGivenListOfGPAInTheMiddleOfTheListAtTheBeginning() {
				List<Number> gradesASix = new ArrayList<>();
				gradesASix.add(4.0);
				gradesASix.add(3.7);
				gradesASix.add(3.3);
				gradesASix.add(2.0);
				gradesASix.add(1.0);
				numericalLetterGrade(gradesASix);
				assertEquals(6, gradesASix.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 1.
		 */
		 public void checkReturnValueEqualToGivenListOfGPAInTheBeginningOfTheList() {
				List<Number> gradesATwo = new ArrayList<>();
				gradesATwo.add(4.0);
				gradesATwo.add(3.7);
				gradesATwo.add(3.3);
				gradesATwo.add(2.0);
				numericalLetterGrade(gradesATwo);
				assertEquals(2, gradesATwo.size());
		 }
		 /**
		 * Method for checking the return value of the method {@link NumericalLetterGrade#numericalLetterGrade(List)}
		 * for a list of GPAs having a GPA of length 10.
		 */
		 public void checkReturnValueEqualToTheEndOfTheList() {
				List<Number> gradesTwoFour = new ArrayList<>();
				gradesTwoFour.add(2.0);
				gradeList(gradesTwoFour);
				assertEqu