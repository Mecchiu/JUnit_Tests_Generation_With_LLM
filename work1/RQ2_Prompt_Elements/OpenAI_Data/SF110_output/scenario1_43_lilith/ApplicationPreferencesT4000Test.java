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
* It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {

		@Test
		void testGetMD5() {
				// test case 1
				InputStream input = null;
				byte[] result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 2
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								throw new IOException();
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 3
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return -1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 4
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 0;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 5
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 6
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 2;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 7
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 3;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 8
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 4;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 9
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 5;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 10
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 6;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
		}
}

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
* It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {
		
		@Test
		void testGetMD5() {
				// test case 1
				InputStream input = null;
				byte[] result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 2
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								throw new IOException();
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 3
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return -1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 4
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 0;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 5
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 6
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 2;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 7
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 3;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 8
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 4;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 9
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 5;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 10
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 6;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
		}
}

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
* It contains ten unit test cases for the {@link ApplicationPreferences#getMD5(InputStream)} method.
*/
class ApplicationPreferencesTest {
		
		@Test
		void testGetMD5() {
				// test case 1
				InputStream input = null;
				byte[] result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 2
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								throw new IOException();
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNull(result);
				
				// test case 3
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return -1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 4
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 0;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 5
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 1;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 6
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 2;
						}
				};
				result = ApplicationPreferences.getMD5(input);
				assertNotNull(result);
				
				// test case 7
				input = new InputStream() {
						@Override
						public int read() throws IOException {
								return 3;
						}
			