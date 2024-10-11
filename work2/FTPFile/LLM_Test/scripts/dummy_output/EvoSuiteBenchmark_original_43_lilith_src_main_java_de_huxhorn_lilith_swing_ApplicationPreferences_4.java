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
		private final Set<PropertyChangedListener> propertyChangeListeners = Collections.synchronizedSet(new HashSet<>(0));
	
	/**
	* Constructor.
	*/
	public ApplicationPreferencesTest() {
		
		String testConfDir = new File(Lilith.getPath("conf")).getAbsolutePath();
		
		List<File> tests = new ArrayList<>();
		tests.addAll(Arrays.asList(new File(testConfDir + File.separator + "tests.properties")));
		
		List<File> testsWithExtensions = new ArrayList<>();
		testsWithExtensions.addAll(Arrays.asList(new File(testConfDir + File.separator + "tests.properties")));
//		testsWithExtensions.add(new File(testConfDir + File.separator + "tests.properties")); //test file with empty extension
		
		for (int i = 0; i < tests.size(); i++) {
			File testEntry = tests.get(i);
			File testProperties = new File(testEntry.getParent(), "tests.properties");
			testsWithExtensions.add(new File(testProperties.getParent(), "tests_" + testProperties.getName().toLowerCase().replace('.', '_')));
//			testsWithExtensions.add(new File(testEntry.getParent() + File.separator + "tests_" + testEntry.getName().toLowerCase().replace('.', '_'))); //test file with modified extension
		}
		
		List<File> testsWithHash = new ArrayList<>();
		testsWithHash.addAll(Arrays.asList(new File(testConfDir + File.separator + "hash")));
		
		for (int i = 0; i < tests.size(); i++) {
			File testEntry = tests.get(i);
			File testProperties = new File(testEntry.getParent(), "tests.properties");
			testsWithHash.add(new File(testEntry.getParent() + File.separator + "tests_" + testEntry.getName().toLowerCase().replace('.', '_')));
//			testsWithHash.add(new File(testEntry.getParent() + File.separator +  "tests_" + testEntry.getName().toLowerCase().replace('.', '_'))); //test file with modified extension
		}
		
}
}