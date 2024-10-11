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
    public void testLoadPreferenceFromString() {
        HttpPreference pref = new HttpPreference();
        String str = "name";
        String res = pref.loadPreference(null, str, "note");
        assertEquals(str, res);
        
        String str2 = "http";
        res = pref.loadPreference(new HttpAnalyzerView(0).getAnalyser(), str2, null);
        assertEquals("http", res);
    }

    @Test
    public void testLoadPreferenceFromProperties() {
        HttpPreference pref = new HttpPreference();
        Properties prop = new Properties();
        prop.setProperty("p1", "value1");
        prop.setProperty("p2", "value2");
        prop.setProperty("p3", "value3");
        prop.setProperty("p4", "value4");
        prop.setProperty("p5", "value5");
        prop.setProperty("p6", "value6");

        String str = pref.loadPreference(null, new HttpAnalyzerView(0).getAnalyser(), prop);
        assertEquals("value1", str);

        str = pref.loadPreference(null, new HttpAnalyzerView(0).getAnalyser(), prop);
        assertEquals("value2", str);

        str = pref.loadPreference(null, new HttpAnalyzerView(0).getAnalyser(), prop);
        assertEquals("value3", str);

        str = pref.loadPreference(null, new HttpAnalyzerView(0).getAnalyser(), prop);
        assertEquals("value4", str);

        str = pref.loadPreference(new JFrame(), null, prop);
        assertEquals("value5", str);
    }

}