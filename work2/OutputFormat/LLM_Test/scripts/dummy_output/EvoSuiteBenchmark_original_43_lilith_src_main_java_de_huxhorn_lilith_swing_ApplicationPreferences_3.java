// ApplicationPreferencesTest.java
package de.huxhorn.lilith.swing;

import de.huxhorn.lilith.Lilith;
import de.huxhorn.lilith.LilithSounds;
import de.huxhorn.lilith.data.access.HttpStatus;
import de.huxhorn.lilith.data.logging.LoggingEvent;
import de.huxhorn.lilith.swing.filefilters.GroovyConditionFileFilter;
import de.huxhorn.lilith.swing.preferences.SavedCondition;
import de.huxhorn.lilith.swing.table.ColorScheme;
import de.huxhorn.lilith.swing.table.model.PersistentTableColumnModel;
import de.huxhorn.sulky.conditions.Condition;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;
import java.beans.Encoder;
import java.beans.Expression;
import java.beans.PersistenceDelegate;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationPreferences}.
* It contains one unit test case for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {
		

    /** Logger for this class. */
    private final static Logger LOG = LoggerFactory.getLogger(ApplicationPreferencesTest.class);
    

    /**
     * JUnit {@link DataValidation}.
     */
    private final static class DataValidation {

        /** The properties. */
        private final Properties properties = new Properties();
        
        /** The file. */
        private String fileLocation;
        
        /** The validation. */
        private final int expectedValidity = 2000;
        
        
        /**
         * Creates the {@link DataValidation} with the contents of <code>properties</code>.
         *
         * @param properties the properties
         */
        DataValidation(final Properties properties) {
        	this.properties = properties;
        }
        
        /**
         * Gets the validation information.
         *
         * @return the validation
         */
        Map<String, Integer> getValidationInformation() {
            final Map<String, Integer> validationInformation = new HashMap<String, Integer>();
            
            validationInformation.put("test", HttpStatus.StatusOK.value);
            validationInformation.put("error", HttpStatus.StatusInternalServerError.value);
            
            return validationInformation;
        }
        
        /**
         * Adds to {@link Properties#setProperty(String, String)} the validation information.
         *
         * @param property  the property
         * @param value     the value
         */
        void addToValidationInformation(String property, String value) {
        	properties.setProperty(property, value);
        }
    }
    
    /**
     * Initializes the class.
     */
    public ApplicationPreferencesTest() {
        // empty constructor
    }
    
	/**
	 * Test reading file as XML
	 *
	 * @throws FileNotFoundException the file not found exception
	 */
	@Test
    public void testXMLAsFile() throws FileNotFoundException {
    	final Properties properties = new Properties();
    	properties.setProperty("key", "value1");
    	properties.setProperty("key2", "value2");
    	properties.setProperty("key3", "value3");
    	final String xml = new ApplicationPreferencesXMLGenerator(properties).getXMLFileContents();
    	assertEquals(properties.size(), xml.length());
    }
	
    /**
     * Test reading properties as XML
     *
     * @throws FileNotFoundException the file not found exception
     */
	@Test
    public void testXMLWithParametersAsFile() throws FileNotFoundException {
    	final Properties properties = new Properties();
    	properties.setProperty("key", "value1");
    	properties.setProperty("key2", "value2");
    	properties.setProperty("key3", "value3");
    	final String xml = new ApplicationPreferencesXMLGenerator(properties).getXMLElementContents();
    	assertEquals(properties.size(), xml.length());
    }
	
}