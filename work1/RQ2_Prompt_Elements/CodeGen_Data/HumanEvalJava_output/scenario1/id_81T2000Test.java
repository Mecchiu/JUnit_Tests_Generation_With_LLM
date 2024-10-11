// NumericalLetterGradeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains one unit test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {


	// Constructors
	
	/**
	* Standard Constructor
		* It initializes fields with their required values.
	*/
    @Test
    void initialize( ) {
        System.out.println( "Standard Constructor : calling NumericalLetterGradeTest.initialize()...");
        assertNotNull( "Returned value is null.", new NumericalLetterGrade() );
        assertEquals( "Returned value is not a NumericalLetterGrade.", -1, new NumericalLetterGrade().getIndex() );
        System.out.println( "numericalLetterGradeTest.initialize() : PASSED." );
    }

    /**
	* Constructor
		* It initializes fields with their required values.
	* @param grades a list of values corresponding to the fields of type {@link List}
	*/
    public NumericalLetterGradeTest( List<Number> grades ) {
        System.out.println("New NumericalLetterGradeTest instance created in constructor.");
        
        assertNotNull( "Grade list is not set.", grades  );
        assertTrue( "Grade list is empty.",  grades.size() > 0 );
        
        System.out.println("Enter the index of the grade to be checked.");
        try {
            assertTrue( "Index not yet set.", grades.get(0).intValue()!= -1 );
        } catch (IndexOutOfBoundsException e) {
            fail("Index out of bounds exception not thrown.");
        }
        
        this.index = new Integer(grades.get(0).intValue());

        System.out.println("Enter the list of grades to grade one.", grades );
        assertEquals( "Index not already set.", null, grades.get( 0 ) );
        
   }

	private int index;

	/**
	* Returns the Index
	* @return returns the value found at the index position.
	*/
    public Integer getIndex( ) {
        return index;
    }

	/**
	* Returns a shallow copy of this instance.
	* @return a copy of this instance.
	*/
    public NumericalLetterGradeTest copy( ) {
        System.out.println( "Copy constructor  : calling NumericalLetterGradeTest.copy() ... " );
        
        NumericalLetterGrade copy = null;
        
        try {
            copy = (NumericalLetterGrade) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace( );
        }
        
        System.out.println("NumericalLetterGradeTest.copy() : PASSED." );
        return copy.NumericalLetterGrade( index );
    }

	/**
	 * It tests the getter and setter methods of class {@link NumericalLetterGrade}.
	 * The unit test cases for these methods call is {@link NumericalLetterGradeTest#initialize(List)} and
	 * {@link NumericalLetterGradeTest#numericalLetterGrade(List)} respectively.
	 */
    @Test
    void testGetAndSet( ) {
        System.out.println( "NumericalLetterGradeTest : calling testGetAndSet()..." );
        
        NumericalLetterGrade test = this.NumericalLetterGradeTest.copy( );
        
        assertNotNull( "Test getter is null.", test.getIndex( ) );
        
        System.out.println( "test.getIndex() : PASSED." );
        
        System.out.println( "NumericalLetterGradeTest : calling testGetAndSet()..." );
        test.numericalLetterGrade( new ArrayList<Number>() );
        assertNotNull( "Test setter is null.", test.getIndex( ) );
        
        System.out.println( "test.getIndex() : PASSED." );
        
        System.out.println( "NumericalLetterGradeTest : exiting test." );
    }
}
