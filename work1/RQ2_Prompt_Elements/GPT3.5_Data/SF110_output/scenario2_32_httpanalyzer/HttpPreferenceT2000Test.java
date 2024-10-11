// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
    
    @Test
    void testLoadPreference() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        String notes = httpPreference.loadPreference(mainView, parentFrame);
        assertNotNull(notes);
    }
    
    @Test
    void testLoadPreferenceMergeInfoCheckBox() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.mergeInfoCheckBox.isSelected());
    }
    
    @Test
    void testLoadPreferenceProxyNoneRadioButton() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.proxyNoneRadioButton.isSelected());
    }
    
    @Test
    void testLoadPreferenceProxyHttpRadioButton() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        Properties properties = new Properties();
        properties.setProperty("httpanalyzer.options.proxytype", "Http");
        HttpFileUtils fileUtil = new HttpFileUtils();
        fileUtil.savePreferenceToFile(properties, parentFrame);
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.proxyHttpRadioButton.isSelected());
    }
    
    @Test
    void testLoadPreferenceProxySocksRadioButton() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        Properties properties = new Properties();
        properties.setProperty("httpanalyzer.options.proxytype", "Socks");
        HttpFileUtils fileUtil = new HttpFileUtils();
        fileUtil.savePreferenceToFile(properties, parentFrame);
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.proxySocksRadioButton.isSelected());
    }
    
    @Test
    void testLoadPreferenceProxyField() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        Properties properties = new Properties();
        properties.setProperty("httpanalyzer.options.proxy", "localhost:8080");
        HttpFileUtils fileUtil = new HttpFileUtils();
        fileUtil.savePreferenceToFile(properties, parentFrame);
        httpPreference.loadPreference(mainView, parentFrame);
        assertEquals("localhost:8080", mainView.proxyField.getText());
    }
    
    @Test
    void testLoadPreferenceProxyAuthCheckBox() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.proxyAuthCheckBox.isSelected());
    }
    
    @Test
    void testLoadPreferenceProxyUserTextField() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        Properties properties = new Properties();
        properties.setProperty("httpanalyzer.options.proxyuser", "user");
        HttpFileUtils fileUtil = new HttpFileUtils();
        fileUtil.savePreferenceToFile(properties, parentFrame);
        httpPreference.loadPreference(mainView, parentFrame);
        assertEquals("user", mainView.proxyUserTextField.getText());
    }
    
    @Test
    void testLoadPreferenceProxyPassPasswordField() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        Properties properties = new Properties();
        properties.setProperty("httpanalyzer.options.proxypassword", "password");
        HttpFileUtils fileUtil = new HttpFileUtils();
        fileUtil.savePreferenceToFile(properties, parentFrame);
        httpPreference.loadPreference(mainView, parentFrame);
        assertEquals("password", new String(mainView.proxyPassPasswordField.getPassword()));
    }
    
    @Test
    void testLoadPreferenceHttpVersionComboBox() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        httpPreference.loadPreference(mainView, parentFrame);
        assertEquals(0, mainView.httpVersionComboBox.getSelectedIndex());
    }
    
    @Test
    void testLoadPreferenceHttpAuthCheckBox() {
        HttpAnalyzerView mainView = new HttpAnalyzerView();
        JFrame parentFrame = new JFrame();
        HttpPreference httpPreference = new HttpPreference();
        httpPreference.loadPreference(mainView, parentFrame);
        assertTrue(mainView.httpAuthCheckBox.isSelected());
    }
}