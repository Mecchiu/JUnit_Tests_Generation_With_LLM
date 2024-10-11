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
         * A convenient static getter for the application instance.
         * @return the instance of HttpAnalyzerApp
         */
        public static Application getApplication();

        /**
         * A convenient method to create a new instance of a test case.
         * @return a new instance of a test case.
         */
        public static HttpAnalyzerAppTest newInstance();
        
}