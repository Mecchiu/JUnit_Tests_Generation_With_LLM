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
private static final String TEST_FILE_NAME = "test.txt";

		private static final String TEST_FILE_CONTENT = "This is a test file.";

		private static final String TEST_FILE_MD5 = "0f8fad5b19373c2f8f00b204e9800998";

		private static final String TEST_FILE_NAME_2 = "test2.txt";

		private static final String TEST_FILE_CONTENT_2 = "This is another test file.";

		private static final String TEST_FILE_MD5_2 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_3 = "test3.txt";

		private static final String TEST_FILE_CONTENT_3 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_3 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_4 = "test4.txt";

		private static final String TEST_FILE_CONTENT_4 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_4 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_5 = "test5.txt";

		private static final String TEST_FILE_CONTENT_5 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_5 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_6 = "test6.txt";

		private static final String TEST_FILE_CONTENT_6 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_6 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_7 = "test7.txt";

		private static final String TEST_FILE_CONTENT_7 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_7 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_8 = "test8.txt";

		private static final String TEST_FILE_CONTENT_8 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_8 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_9 = "test9.txt";

		private static final String TEST_FILE_CONTENT_9 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_9 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_10 = "test10.txt";

		private static final String TEST_FILE_CONTENT_10 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_10 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_11 = "test11.txt";

		private static final String TEST_FILE_CONTENT_11 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_11 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_12 = "test12.txt";

		private static final String TEST_FILE_CONTENT_12 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_12 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_13 = "test13.txt";

		private static final String TEST_FILE_CONTENT_13 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_13 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_14 = "test14.txt";

		private static final String TEST_FILE_CONTENT_14 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_14 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_15 = "test15.txt";

		private static final String TEST_FILE_CONTENT_15 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_15 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_16 = "test16.txt";

		private static final String TEST_FILE_CONTENT_16 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_16 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_17 = "test17.txt";

		private static final String TEST_FILE_CONTENT_17 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_17 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_18 = "test18.txt";

		private static final String TEST_FILE_CONTENT_18 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_18 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_19 = "test19.txt";

		private static final String TEST_FILE_CONTENT_19 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_19 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_20 = "test20.txt";

		private static final String TEST_FILE_CONTENT_20 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_20 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_21 = "test21.txt";

		private static final String TEST_FILE_CONTENT_21 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_21 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_22 = "test22.txt";

		private static final String TEST_FILE_CONTENT_22 = "This is yet another test file.";

		private static final String TEST_FILE_MD5_22 = "c8f1e7b00e04c3fd1fba9d0f0098fa0c";

		private static final String TEST_FILE_NAME_23 = "test23.txt";

		private static final String TEST_FILE_CONTENT_23 = "This is yet another test file.";

		private static final String TEST_FILE_MD