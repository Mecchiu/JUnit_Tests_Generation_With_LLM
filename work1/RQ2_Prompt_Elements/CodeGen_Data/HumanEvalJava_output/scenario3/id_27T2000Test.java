// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains one unit test case for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

	@Test
	public void flipCaseTest(){
		// arrange
		String testString = "Hello";

		// assert
		String flippedTestString = flipCase(testString);
		assertNotNull(flippedTestString);
		assertTrue(flippedTestString.indexOf("hELLO") < 0);
		assertTrue(flippedTestString.indexOf("ELHI") >= 0);
		
		// act
		String flippedTestString2 = flipCase(testString);
		
		// assert
		assertEquals("hELLO", flippedTestString2);	
	}

	
	/**
	 * Test class of {@link FlipCase#flipCase(String)} method.
	*/
	class FlipCaseTestBase {

		
		@Test
		public void flipCaseTestBase() {
		}
		
	}
	
	@Test
	public void flipCaseTestMethodBase() {
		// arrange
		FlipCaseTestTestBase testTestBase = new FlipCaseTestBase();

		// assert
		testTestBase.flipCaseTestBase();
	}
	
}

// FlipCaseTest.java