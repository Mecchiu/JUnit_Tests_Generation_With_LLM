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
		
	/**
	 * Initialize the test.
	*/
	@Test
	void testInit() {
		Lilith.init();
	}
	
	/**
	 * Test case with a null input stream.
	*/
	@Test
	void testNullInput() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "null", "null", null, "null");
	}
	
	/**
	 * Test case with an input stream that ends with MD5.
	*/
	@Test
	void testMD5Output() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", "MD5", null, null);
	}
	
	/**
	 * Test case without MD5 input resource.
	*/
	@Test
	void testResourceNullInput() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "null", "MD5", "null", null);
	}
	
	/**
	 * Test case with output stream.
	*/
	@Test
	void testOutputStreamStream() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", "MD5", null, "null");
	}
	
	/**
	 * Test case with an input stream that ends with MD5 output stream.
	*/
	@Test
	void testMD5InputStream() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", "MD5", "null", "MD5");
	}
	
	/**
	 * Test case with MD5 output stream.
	*/
	@Test
	void testOutputStreamMD5() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", "MD5", null, "MD5");
	}
	
	/**
	 * Test case with input stream that ends with MD5 output stream.
	*/
	@Test
	void testMD5InputStreamMD5() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", "MD5", "MD5", "MD5");
	}
	
	 /**
	 * Test case with output stream.
	*/
	@Test
	void testOutputStream() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "", "", null, null);
	}
	
	 /**
	 * Test case with an input stream that Ends with MD5 output stream.
	*/
	@Test
	void testOutputStreamMD5() throws Exception {
		testSimpleCondition(Lilith.getApp().getMainWindow(), "Application", "MD5", null, null, "MD5");
	}
	
	/**
	 * Test case with output stream that ends with MD5 output stream.
	*/
	@Test
	public void testOutputStreamMD5OutputStream() throws Exception {
}
}