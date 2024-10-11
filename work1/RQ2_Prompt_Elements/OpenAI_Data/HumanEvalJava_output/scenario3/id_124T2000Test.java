// ValidDateTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains ten unit test cases for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {
	@Test
			void testValidDate() {
				// Test case 1
				String date1 = "03-11-2000";
				Boolean result1 = ValidDate.validDate(date1);
				assertTrue(result1);
				
				// Test case 2
				String date2 = "15-01-2012";
				Boolean result2 = ValidDate.validDate(date2);
				assertFalse(result2);
				
				// Test case 3
				String date3 = "04-0-2040";
				Boolean result3 = ValidDate.validDate(date3);
				assertFalse(result3);
				
				// Test case 4
				String date4 = "06-04-2020";
				Boolean result4 = ValidDate.validDate(date4);
				assertTrue(result4);
				
				// Test case 5
				String date5 = "06/04/2020";
				Boolean result5 = ValidDate.validDate(date5);
				assertFalse(result5);
				
				// Test case 6
				String date6 = "01-01-2007";
				Boolean result6 = ValidDate.validDate(date6);
				assertTrue(result6);
				
				// Test case 7
				String date7 = "03-32-2011";
				Boolean result7 = ValidDate.validDate(date7);
				assertFalse(result7);
				
				// Test case 8
				String date8 = "";
				Boolean result8 = ValidDate.validDate(date8);
				assertFalse(result8);
				
				// Test case 9
				String date9 = "04-31-3000";
				Boolean result9 = ValidDate.validDate(date9);
				assertFalse(result9);
				
				// Test case 10
				String date10 = "06-06-2005";
				Boolean result10 = ValidDate.validDate(date10);
				assertTrue(result10);
			}
}
