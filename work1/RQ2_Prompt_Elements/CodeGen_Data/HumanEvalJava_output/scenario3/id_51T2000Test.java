// RemoveVowelsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

		 /**
     * Constructors for all class tests.
     */
    public RemoveVowelsTest(){};
			
		 /**
		* Empty test suite run with dummy output file.
		*
		* > removeVowels("")
		* true
		* > removeVowels("\n")
		* true
		*/
		@Test
		 public void removeVowels_empty() {
		  String expected = StringUtil.EMPTY;
		    
		    boolean result = RemoveVowels.removeVowels(expected);
		    
		    assertTrue("False", result);
		    
		    result = CheckResult.FAILURE;
		    String resultString = expected + " - " + result.getMessage(); 
		    assertEquals(expected, resultString, result);
		}
		
		 /**
	    * Test the {@link RemoveVowels#removeVowels(String)} method.
	    */
		@Test
		 public void removeVowels_removeTestFile() {
		 
			String text = "hello\nbye";
			
			RemoveVowels result = new RemoveVowels();
			
			CheckResult resultCheck = result.removeVowels(text);
			
			assertTrue("resultCheck.getMessage() = " + 
		       		"resultCheck.getMessage()",
		        	  result.isSuccess());

			assertTrue("resultCheck.isSuccess()", resultCheck.isSuccess());

		}
		
		 /**
         * Empty test suite run without dummy output file.
         *
         * > removeVowels(text)
         * true
         * > removeVowels(text)\ntrue
         * > removeVowels(text)\ntrue\nfalse
         */
		@Test
		 public void removeVowels_without_output_file() {
		 
			String text = "hello\nbye";

			RemoveVowels result = new RemoveVowels();
			
	    CheckResult resultCheck = result.removeVowels(text);
			
			assertTrue("resultCheck.getMessage() = " + 
				    "resultCheck.getMessage(), resultCheck.isSuccess()",
		        	  result.isSuccess());

			assertTrue("resultCheck.getMessage() == null", resultCheck.getMessage() == null);

		}
		
		 /**
		 * Test the {@link RemoveVowels#removeVowels(String)} method with all required parameters.
	    */
		@Test
		 public void removeVowels_removeTestFile_with_file() {
		 
			String text = "hello\nbye";
			
			RemoveVowels result = new RemoveVowels();
			
	    CheckResult resultCheck = result.removeVowels(text, null);

        String expected;
		if(resultCheck.isFailure())  {
            expected = resultCheck.getMessage() + " - ";
        } else {
            expected = text + " - ";
        }
		
	    assertEquals("getMessage()", expected, resultCheck.getMessage());
		}
		
		 /**
		 * Test the {@link RemoveVowels#removeVowels(String)} method with invalid name parameter.
	    */
		@Test (expected = IllegalArgumentException.class) 
		 public void  removeVowels_removeTestFile_with_nonExistParameter() {
		 
			String text = "hello\nbye";
			
			new RemoveVowels();
		}
	}


