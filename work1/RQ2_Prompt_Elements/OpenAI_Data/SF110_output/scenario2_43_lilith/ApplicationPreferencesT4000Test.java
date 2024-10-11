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
		public void testGetMD5_NullInputStream() {
				byte[] result = ApplicationPreferences.getMD5(null);
				assertNull(result);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream is empty.
		*/
		@Test
		public void testGetMD5_EmptyInputStream() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[0]));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xD4, result[0]);
				assertEquals(0x1D, result[1]);
				assertEquals(0x8C, result[2]);
				assertEquals(0xD9, result[3]);
				assertEquals(0x8F, result[4]);
				assertEquals(0x00, result[5]);
				assertEquals(0xB2, result[6]);
				assertEquals(0x04, result[7]);
				assertEquals(0xE9, result[8]);
				assertEquals(0x80, result[9]);
				assertEquals(0x09, result[10]);
				assertEquals(0x98, result[11]);
				assertEquals(0xEC, result[12]);
				assertEquals(0xF8, result[13]);
				assertEquals(0x42, result[14]);
				assertEquals(0x7E, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x01}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream2() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x02}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream3() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x03}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream4() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x04}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream5() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x05}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream6() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x06}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream7() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x07}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream8() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x08}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEquals(0xD3, result[2]);
				assertEquals(0xD7, result[3]);
				assertEquals(0x61, result[4]);
				assertEquals(0x92, result[5]);
				assertEquals(0xE4, result[6]);
				assertEquals(0x00, result[7]);
				assertEquals(0x7D, result[8]);
				assertEquals(0xFB, result[9]);
				assertEquals(0x49, result[10]);
				assertEquals(0x6C, result[11]);
				assertEquals(0xCA, result[12]);
				assertEquals(0x67, result[13]);
				assertEquals(0xE1, result[14]);
				assertEquals(0x3B, result[15]);
		}
		
		/**
		* Test case for {@link ApplicationPreferences#getMD5(InputStream)} method.
		* It tests the case when the input stream contains a single byte.
		*/
		@Test
		public void testGetMD5_SingleByteInputStream9() {
				byte[] result = ApplicationPreferences.getMD5(new ByteArrayInputStream(new byte[] {0x09}));
				assertNotNull(result);
				assertEquals(16, result.length);
				assertEquals(0xC3, result[0]);
				assertEquals(0xFC, result[1]);
				assertEqu