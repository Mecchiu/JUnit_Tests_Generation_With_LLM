// PluckTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains one unit test case for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
// Pluck.java
package scenario1;

import java.util.ArrayList;
import java.util.List;

class Pluck {

    public static List<Object> pluck(List<Object> arr) {
        List<Object> result = new ArrayList<Object>();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                int value = (Integer) arr.get(i);
                if (value % 2 == 0 && value < min) {
                    min = value;
                    index = i;
                }
            }
        }
        if (index!= -1) {
            result.add(min);
            result.add(index);
        }
        return result;
    }
}

// PluckTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains one unit test case for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
		
		/**
		 * Contains one unit test case for the {@link Pluck#pluck(List)} method.
		 * It contains a description of one test case.
		*/
		public static class PluckUnitTestCaseDesc extends PluckTest {

			/**
			 * Constructor of {@link #PluckUnitTestCaseDesc} class.
			 * It contains one unit test case for the {@link Pluck#pluck(List)} method.
			
			 * @param desc Description of one test case
			 */
			public PluckUnitTestCaseDesc(String desc) {
				super(desc);
			}

			/**
			 * Method {@link #testRun()} performs.
			 * It contains the expected assertions. Use in JUnit testing in derived classes.
			 *
			 * @return true if the testcase is passed; false otherwise.
			 */
			public boolean testRun() {

				return true;
			}
		}
		
		/**
		 * Contains one unit test case for the {@link Pluck#pluck(List)} method.
		 * It contains a description of one test case.
		*/
		public static class PluckUnitTests extends PluckTest {

			/**
			 * Constructor of {@link #PluckUnitTests} class.
			 * It contains one unit test case for the {@link Pluck#pluck(List)} method.
			 *  It contains expected description of one test case.
			
			 * @param desc Description of one test case
			 */
			public PluckUnitTests(String desc) {
				super(desc);
			}

			/**
			 * Method {@link #testRun()} performs.
			 * It contains the expected assertions. Use in JUnit testing in derived classes.
			 *
			 * @return true if the testcase is passed; false otherwise.
			 */
			public boolean testRun() {

				assertEquals("Invalid result of testRun()", expectedDesc, actualDesc);
				
				return true;
			}
		}
		
		/**
		 * Tests {@link Pluck#pluck(List)} method of {@link Pluck}.
		 *
		 */
	@Test
	   public void testPluck() {

				PluckUnitTestCaseDesc pluck = new PluckUnitTestCaseDesc("Pluck Unit");
				Pluck pluck1 = new Pluck();

				assertEquals("Invalid result of testPluck", pluck1.pluck(new ArrayList<Object>()).get(0), pluck.pluck(new ArrayList<Object>()).get(0));

		}
		
		/**
		 * Tests {@link Pluck#pluck(List)} method of {@link PluckUnitTests}.
		 *
		 */
		@Test
		public void testPluckUnit() {

				PluckUnitTests pluckUnit = new PluckUnitTests("Pluck Unit  ");

				assertEquals("Invalid result of testPluckUnit", pluckUnit.expectedDesc, actualDesc);
		}	
}