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
		
    @Test
    public void test1() {
        //System.out.println("test1. Name: " + Application.getProductName());
        assertEquals(Application.getProductName(), "HttpAnalyzerAppTest");
        HttpAnalyzerApp.configureWindow(new MyWindow());
        assertNotNull(HttpAnalyzerApp.getApplication());
        assertEquals(SingleFrameApplication.SUCCESS,
                     HttpAnalyzerApp.getApplication().startup());
    }
}