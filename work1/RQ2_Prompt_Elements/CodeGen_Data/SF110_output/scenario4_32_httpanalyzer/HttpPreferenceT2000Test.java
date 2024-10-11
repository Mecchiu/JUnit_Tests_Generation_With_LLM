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

    /**
     * Test method {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)}.
     */
    @Test
    void testLoadPreference() {
        HttpAnalyzerServiceFactory.setConfigurationFilePath("/etc/HttpPreference.properties");
        HttpAnalyzerServiceFactory.setContextualUserId(123L);
        HttpAnalyzerServiceFactory.registerInstance(HttpAnalyzerServiceFactory.STANDARD_USER_ID, HttpAnalyzerServiceFactory.STANDARD_USER_USERNAME, HttpAnalyzerServiceFactory.STANDARD_USER_PASSWORD, "", "", "");

        //Get values from work form and set properties
        HttpStatView analyseView = MainViewTest.createAnalyseView();
        String notes = MainViewTest.readAnalysedFile();
        
        //Get values from work form and set properties
        Properties props = new Properties();
        System.setProperty("http.user", "userID");
        System.setProperty("http.username", "username");
        System.setProperty("http.password", "password");
        props.setProperty("http.context.user.id", HttpAnalyzerServiceFactory.STANDARD_USER_ID.toString());
        props.setProperty("http.context.user.username", HttpAnalyzerServiceFactory.STANDARD_USER_USERNAME.toString());
        props.setProperty("http.context.user.password", HttpAnalyzerServiceFactory.STANDARD_USER_PASSWORD.toString());

        //Get values from work form and set properties

        //Get values from work form and set properties
        props.setProperty("http.host", "http://localhost:7010");
        props.setProperty("http.port", "7010");
        props.setProperty("http.debug", "false");
        props.setProperty("http.context.logging", JFrame.class.getName());
        props.setProperty("http.context.logging.name", "http");

        //Get values from work form and set properties
        props.setProperty("http.timeout", "1000");
        props.setProperty("http.transport.timeout", "60000");    //10 mins (s)
        props.setProperty("http.transport.cache.timeout", "0");      //10 mins (s)
        props.setProperty("http.retry.max", "3");       //3 retries
        props.setProperty("http.retry.delay", "300");    //10 seconds
        props.setProperty("http.retry.delay.global", "3000");  //30 seconds

        //Get values from work form and set properties
        props.setProperty("http.keepAlive", "true");
        props.setProperty("http.protocol.keepAlive", "true");
        props.setProperty("http.maxConnection.retryCount", "3");
        props.setProperty("http.connection.timeout", "900");
        props.setProperty("http.connection.keepAlive", "true");
        props.setProperty("http.connection.keepAlive.period", "1200000");
        props.setProperty("http.connection.timeouts", "2000");

        
        //Test values read with properties
        assertEquals(MainViewTest.readAnalysedFile("/etc/HttpPreference.properties"), notes);

        //Test values read from a file
        //loadFile will call loadValues and replace all property values with the values of the preferences
        String testFile = "/etc/HttpPreference.properties";
        loadFile(testFile, note, analyseView, props, mainView);
        assertEquals(MainViewTest.readAnalysedFile("/etc/HttpPreference.properties"), notes);        
    }
}
