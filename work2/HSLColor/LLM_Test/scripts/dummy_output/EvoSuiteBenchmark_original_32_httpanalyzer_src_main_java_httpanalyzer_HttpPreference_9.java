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
		
    @Test
    public void testLoadPreference() {
        HttpAnalyzerView analyseView = new HttpAnalyzerView();
        Properties props = new Properties();
        props.put("http.preference.hostname", "www.google.com");
        props.put("http.preference.notes", "Some note");
	    HttpAnalyzerViewAnalyze analyzeViewResult = HttpAnalyzerViewAnalyze.doAnalyze(String.class, props);
        String notes = analyzeViewResult.getNotesFromView();
        
        // Compare values
        assertEquals("Some note", notes);

		// Change values to test result
        String newString = "www.google.com";
        props.put("http.preference.notes", newString);
        props.put("http.preference.hostname", newString);
        analyzeViewResult = HttpAnalyzerViewAnalyze.doAnalyze(String.class, props);
        notes = analyzeViewResult.getNotesFromView();
        assertEquals("Some note", notes);
    }
}


// JUnit