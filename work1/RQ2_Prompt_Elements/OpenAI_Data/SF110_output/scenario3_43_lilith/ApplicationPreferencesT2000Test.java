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

	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is null.
	 */
	@Test
	void testGetMD5_NullInputStream() {
		InputStream input = null;
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is empty.
	 */
	@Test
	void testGetMD5_EmptyInputStream() {
		InputStream input = new ByteArrayInputStream(new byte[0]);
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNotNull(result);
		assertEquals(16, result.length);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
		assertEquals(0, result[11]);
		assertEquals(0, result[12]);
		assertEquals(0, result[13]);
		assertEquals(0, result[14]);
		assertEquals(0, result[15]);
	}
	
	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is not empty.
	 */
	@Test
	void testGetMD5_NotEmptyInputStream() {
		InputStream input = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16});
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNotNull(result);
		assertEquals(16, result.length);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
		assertEquals(0, result[11]);
		assertEquals(0, result[12]);
		assertEquals(0, result[13]);
		assertEquals(0, result[14]);
		assertEquals(0, result[15]);
	}
	
	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is not empty.
	 */
	@Test
	void testGetMD5_NotEmptyInputStream2() {
		InputStream input = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32});
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNotNull(result);
		assertEquals(16, result.length);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
		assertEquals(0, result[11]);
		assertEquals(0, result[12]);
		assertEquals(0, result[13]);
		assertEquals(0, result[14]);
		assertEquals(0, result[15]);
	}
	
	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is not empty.
	 */
	@Test
	void testGetMD5_NotEmptyInputStream3() {
		InputStream input = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64});
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNotNull(result);
		assertEquals(16, result.length);
		assertEquals(0, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
		assertEquals(0, result[11]);
		assertEquals(0, result[12]);
		assertEquals(0, result[13]);
		assertEquals(0, result[14]);
		assertEquals(0, result[15]);
	}
	
	/**
	 * Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
	 * It tests the case when the input stream is not empty.
	 */
	@Test
	void testGetMD5_NotEmptyInputStream4() {
		InputStream input = new ByteArrayInputStream(new byte[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128});
		byte[] result = ApplicationPreferences.getMD5(input);
		assertNot