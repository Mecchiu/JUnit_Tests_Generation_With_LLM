// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
/*	private static Properties getTestProperties() {
	    Properties testProperties = new Properties();
	    testProperties.put("testkey", "testValue");
	    return testProperties;
    }*/
	
	@Test
	public void loadPreference() {
        HttpAnalyzerView MainView = new HttpAnalyzerView("", ""); 
		assertEquals(MainView.preference, MainView.getPreference(), "MainView.getPreference value is not set");
	}
	
	@Test
    public void loadPreferenceFile() {
        HttpAnalyzerView MainView = new HttpAnalyzerView("./preferences.properties", ""); 
		assertEquals(MainView.preference, MainView.getPreference(), "MainView.getPreference value is not set");
    }

}