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
		static Properties TEST_SERVER_INFO = new Properties();
		static JFrame PREFERENCE_WINDOW = new JFrame();
		
		/**
		*  Loads configuration from the system properties
		*  Then calls {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} for each of them in order
		*  and sets values.
		*/
		public void loadPreference(HttpAnalyzerView analyseview, JFrame parentFrame) {
			loadConfigFromGlobalProps();
			saveConfigToGlobalProps();
			loadPreference(parentFrame, analyseview);
		}
		
		public void loadConfigFromGlobalProps() {
			Properties p = HttpUtil.getGlobalProfProps();
			TEST_SERVER_INFO.put("server", p.getProperty("serverUrl"));
			TEST_SERVER_INFO.put("username", p.getProperty("serverUsername"));
			TEST_SERVER_INFO.put("password", p.getProperty("serverPassword"));
		}
		
		public void loadConfigToGlobalProps() {
			Properties p = HttpUtil.getProfProps();
			TEST_SERVER_INFO.put("server", p.getProperty("serverUrl"));
			TEST_SERVER_INFO.put("username", p.getProperty("serverUsername"));
			TEST_SERVER_INFO.put("password", p.getProperty("serverPassword"));
		}
		
		/**
		*  Get server information from the system properties
		*  Then calls method getInstance.
		*/
		public static HttpPreference getInstance() {
			HttpPreference instance = new HttpPreference();
			instance.loadConfigFromGlobalProps();
			return instance;
		}
		
		/**
		*  Get server information from the configuration properties file
		*  Then calls method getInstance.
		*/
		public static HttpPreference getInstance(String fileKey) {
			return getInstance();
		}
		
		/**
		*  Get server information from the configuration properties file
		*  Then calls method getInstance.
		*  Tries to read a property value that is not defined in the system properties
		*  if no value could be read, the value from the system properties is returned.
		*/
		public static HttpPreference getInstance(Properties props) {
			HttpPreference instance = null;
			String key = null;
			try {
				if (props!= null) {
					key = props.getProperty(fileKey);
					assertNotNull("No " + fileKey + " in system properties. Is defined in class HttpPreference?", key);
					instance = getInstance();
					instance.loadConfigFromGlobalPrmProps(props);
				}
			} catch (Exception e) {
				throw new RuntimeException("Unable to read default value for server information from file: " + fileKey, e);
			}
			return instance;
		}
		
		/**
		*  Get server information from the configuration properties file
		*  Then calls method getInstance.
		*  Returns null if the value of file key was not defined in the system properties.
		*/
		public static HttpPreference getInstance(Properties props) {
			HttpPreference instance = null;
			String key = null;
			try {
				if (props!= null) {
					key = props.getProperty(fileKey);
					assertNotNull("No " + fileKey + " in system properties. Is defined in class HttpPreference?", key);
					instance = getInstance();
					instance.loadConfigFromGlobalProps(props);
				}
			} catch (Exception e) {
				throw new RuntimeException("Unable to read default value for server information from class HttpPreference", e);
			}
			return instance;
		}
}