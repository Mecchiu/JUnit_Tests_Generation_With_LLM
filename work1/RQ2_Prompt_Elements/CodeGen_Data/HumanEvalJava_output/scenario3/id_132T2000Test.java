// IsNestedTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains one unit test case for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

    //// Constructor.
    public IsNestedTest() {
    }

	
	/**
	 * Test for null as an argument to the "isNested function".
	 */
	@Test
	public final void test_null(){
		boolean outcome = IsNested.isNested((String) null);
		assertFalse("Null argument was not returned.".equals(outcome), 
		            outcome);
	}
	
	
	/**
	 * Test for "true".
	 */
	@Test
	public final void test_true(){
		boolean outcome = IsNested.isNested("true");
		assertTrue("Expected true instead of '"+"true".toString()+"'.".equals(outcome), 
		            outcome);
	}
	
	
	/**
	 * Test for "false".
	 */
	@Test
	public final void test_false(){
		boolean outcome = IsNested.isNested("false");
		assertFalse("Expected true instead of 'true'.\n"+
		           String+".isNested('false').", 
		            outcome);
	}
	
	
	/** 
	 * Test for "isNested("1")".
	 * It is the case where the returned value is "true".
	 */
	@Test
	public final void test_isNested_1() {
		boolean outcome = IsNested.isNested("1");
		assertTrue("Expected true return value.", outcome);
	}
	
	
	/**
	 * Test for "isNested("2")".
	 * It is the case where the returned value is "false".
	 */
	@Test
	public final void test_isNested_2() {
		boolean outcome = IsNested.isNested("2");
		assertFalse("Expected false return value.", outcome);
	}
	
	
	/**
	 * Test for "isNested("3")".
	 * It returns "false" for a function returning "true".
	 */
	@Test
	public final void test_isNested_3() {
		//Return a function expecting a Boolean as the return parameter.
		Boolean outcome = IsNested.isNested("3");
		assertTrue("Return value should be 'True', but instead was 'False'.".equals(outcome), 
		            outcome);
	}
	
	
	/**
	 * Test for "isNested("4")".
	 * It returns "true" for the function returning "true".
	 */
	@Test
	public final void test_isNested_4() {
		//Return a function expecting a Boolean as the return parameter.
		Boolean outcome = IsNested.isNested("4");
		assertTrue("Return value should be 'True', but instead was 'False'.".equals(outcome), 
	 		        outcome);
	}
	

	
	/**
	 * Test for "isNested("5")".
	 * It is the case where the returned value is null.
	 * The call should not return true for NULL.
	 */
	@Test
	public final void test_isNested_5() {
		boolean outcome = IsNested.isNested(null);
		assertTrue("Return value should be 'True', but instead it returned null.", 
				outcome);
	}



}
