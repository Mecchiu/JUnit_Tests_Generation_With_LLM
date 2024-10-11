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
     * Test if the checksum functions are returning the same result.
     */
    @Test
    public void testGetMD5() {
        byte[] checksum = getMD5(HttpStatus.OK.getInputStream());
        final String result = new String(checksum);
        assertTrue("MD5 of HttpStatus object returned 0x" + result, HttpStatus.md5(result)!= 0);
    }
    
    /**
     * Test if the checksum functions are returning the same result.
     */
    @Test
    public void testGetMD5_inputStream() {
        byte[] checksum = getMD5(HttpStatus.OK.getInputStream());
        final String result = new String(checksum);
        assertTrue("MD5 of HttpStatus object returned 0x" + result, HttpStatus.md5(result)!= 0);
    }
    
    /**
     * Test if the MD5 checksum functions are returning the same object.
     * A {@link PersistentTableColumnModel} must be configured on the table.
     */
    @Test
    public void testGetMD5ByColumn() {
        final PersistentTableColumnModel pm = Lilith.table("TestModel");
        final String column = "MyColumn";
        final Set<PersistentTableColumnModel> columnModels = Collections.singleton(pm);
        final Map<PersistentTableColumnModel, Set<PersistentTableColumnModel>> cache = new HashMap<>(columnModels);
        cache.remove(pm);
        assertNotEquals("", getMD5(HttpStatus.OK.getInputStream()));
        assertNotEquals("", getMD5(HttpStatus.OK.getInputStream()));
        assertEquals("", getMD5(HttpStatus.OK.getInputStream()));
        assertNotEquals("", getMD5(HttpStatus.OK.getInputStream()));
        cache.put(pm, new HashSet<>());
        assertNotEquals("", getMD5(HttpStatus.OK.getInputStream()));
    }
    
    @Test
    public void testGetMD5ByPropertyMap() {
        final Properties properties = new Properties(System.getProperties());
        properties.