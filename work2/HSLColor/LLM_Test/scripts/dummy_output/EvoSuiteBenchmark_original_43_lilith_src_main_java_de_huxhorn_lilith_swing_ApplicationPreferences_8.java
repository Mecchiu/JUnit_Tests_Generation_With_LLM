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
	 * Checks the state of a key-value pair.
	 */
	public static class MDPair {
		private static String key;
		private static String value;
		
		/**
		 * Constructs a key-value pair.
		 * @param key the key
		 * @param value the value
		 */
		public MDPair(String key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public String getKey() { return key; }
		public String getValue() { return value; }
	}
	
	/**
	 * Checks the state of a list of key-value pairs.
	 */
	public static class MDPairs {
		private static MDPair a;
		private static MDPair b;
		
		/**
		 * Constructs a list of key-value pairs.
		 * @param a the first key-value pair
		 * @param b the second key-value pair
		 */
		public MDPairs(MDPair a, MDPair b) {
			this.a = a;
			this.b = b;
		}
		
		public MDPair getA() { return a; }
		public MDPair getB() { return b; }
	}
	
	/**
	 * Represents the state of a {@link SavedCondition}'s key-value pair.
	 * The key-value pair contains the actual value and the expression.
	 */
	public interface SaveableMDPair {
		
		/**
		 * Gets the actual value.
		 * @return the value
		 * @throws IOException if not possible to serialize the current value
		 */
		public String getValue() throws IOException;
		
		/**
		 * Gets the value as {@link List}.
		 * @return the value as a list
		 * @throws IOException if not possible to serialize the list values
		 */
		public List<?> getValueAsList();
		
	}
	
	/**
	 * Represents the state of a {@link SavedCondition}'s key-value pair.
	 * The key-value pair contains the actual expression.
	 */
	public interface LoadableMDPair {
		
		/**
		 * Sets the value.
		 * @param value the value
		 */
		public void setExpr(String expr);
		
		/**
		 * Gets the value.
		 * @return the value
		 */
		public String getExpr();
		
	}
	
	/**
	 * Represents the state of a new {@link SavedCondition}'s key-value pair.
	 * @see SavedCondition
	 */
	public interface SavedConditionFactory {
		public SavedCondition newCondition();
	}
	
	/**
	 * Represents the state of a persistable list of {@link SavedCondition}'s key-value pair.
	 * It contains the actual values and the keys that change between two evaluations.
	 * @see SavedCondition
	 */
	public interface PersistentListMDPair {
		public List<?> getValue();
	}
}