// ClientProperties_0Test.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientProperties_0Test {

		private static final Logger logger = Logger.getLogger(ClientProperties_0Test.class);
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_0() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("server");
				assertEquals("localhost", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_1() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("port");
				assertEquals("1234", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_2() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("user");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_3() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("password");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_4() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("language");
				assertEquals("en", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_5() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("lookandfeel");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_6() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("logging");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_7() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("logfile");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_8() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("logfile_maxsize");
				assertEquals("", result);
		}
		
		/**
		* Test case for {@link ClientProperties#getProperty(String)} method.
		* It checks if the method returns the correct value for the given element.
		*/
		@Test
		void testGetProperty_9() {
				ClientProperties clientProperties = new ClientProperties("fubarman_properties.xml");
				String result = clientProperties.getProperty("logfile_maxbackup");
				assertEquals("", result);
		}
}</code>



I am using the following build.gradle file:


<code>plugins {
    id 'java'
    id 'application'
    id 'org.openjfx.javafxplugin' version '0.0.8'
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit', version: '4.12'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-engine', version: '5.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-params', version: '5.6.2'
    testCompile group: 'org.junit.vintage', name: 'junit-vintage-engine', version: '5.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-launcher', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-runner', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-suite-api', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-engine', version: '1.6.2'
    testCompile group: 'org.junit.platform', name: 'junit-platform-commons', version: '1.6.2'
    testCompile group: 'org.junit.jupiter', name: 'junit-jupiter-api', version: '5.6.2'
    testCompile group: 'org.j