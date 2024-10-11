// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains one unit test case for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {
		
	/**
	 * This method is to create and show the main menu of the application.
	 */
	@Test
	void mainFrame() {
		IntuitiveTest.main(new String[0]);
	}

	/**
	 * This method is to set-up the needed attributes and parameters.
	 */
	@Test
	void attributesAndParameters() {
		IntuitiveTest.setup(new String[]{1, 2, 3});
	}
	
	/**
	 * This method is to perform the tests in "Test case main()".
	 */
	@Test
	void test() {
		IntuitiveTest.test();
	}

}