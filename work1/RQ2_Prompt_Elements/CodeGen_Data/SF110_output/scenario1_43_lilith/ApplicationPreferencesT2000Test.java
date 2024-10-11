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
     * Application preferences tests.
     */
    @Test
    public void testGetMD5() {
        final Properties prop = new Properties();
        prop.put("A", "value");
        prop.put("b", "B");
        prop.put("c", "C");
        PropPrefUtil.addProperties(prop);

        final Map<String, Object> prefs = new HashMap<>();
        prefs.put("A", "value");
        prefs.put("b", "B");
        prefs.put("c", "C");
        assertFalse(ApplicationPreferences.getMD5(prefs) == null);
    }

//
//   @Ignore("not applicable")
//   @Ignore("not applicable")
//   @Ignore("not applicable")
//   @Ignore("not applicable")
    @Test
    public void testPrecomputeHash() throws MalformedURLException {
        
        final long start = System.currentTimeMillis();

        // create test properties
        final Properties properties = new Properties();
        properties.put("a", "value");
        properties.put("a_b", "value");
        properties.put("a_b__b", "value");
        properties.put("a_b___b_c_d", "value");
        properties.put("a_c", "value");
        properties.put("b", "value");
        properties.put("c", "value");
        
        assertFalse(ApplicationPreferences.precomputeHash(properties) == null);
        
        final long stop = System.currentTimeMillis();

        final long time = stop - start;

        // verify properties
        assertEquals(0, properties.get("a"));
        assertFalse(properties.get("a_b") == null);
        assertTrue(properties.get("a_b_c_d") == null);

        verifyComparison(properties, 0);
        
        // test properties
        properties.put("a", "somevalue");
        properties.remove("a_b");
        assertEquals("somevalue", ApplicationPreferences.precomputeHash(properties));
        
        properties.put("a_b_b_c", "somevalue");
        assertEquals("somevalue", ApplicationPreferences.precomputeHash(properties));
        
        properties.remove("b");
        assertFalse(ApplicationPreferences.pre