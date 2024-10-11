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
		
	private final Logger log = LoggerFactory.getLogger(ApplicationPreferences.class);
	
    @Test
    void getMD5() throws FileNotFoundException {
        // Get some values
        
        // Create some values
        String value = "test123456";
        String encodedValue = encodingUTF8(value);
        
        // Get the MD5 in different chunks for different values
        String[] chunks = new String[]{"123456789"};
        byte[] bytes = getMD5(new CharsetEncoder(Charset.forName("UTF-8")));
        assertNotNull(encodedValue);
        assertNotNull(bytes);
        assertNotNull(chunks);
       
        // Write out the actual value
		new PropertyChangeSupport(ApplicationPreferencesTest.class).propertyChange(new PropertyChangeEvent(ApplicationPreferencesTest.class, "value", value, encodedValue));
        
        // Compare it to the value from another one
		final String actualMD5 = getMD5(new CharsetEncoder(Charset.forName("UTF-8")));
		String actualChunks = new String(convertStringToChunks(encodedValue));
		assertEquals(chunks.length+1, actualChunks.length());
		assertArrayEquals(expectedHash(chunks), actualChunks.toUpperCase().trim());
	}
	
	@Test
    void setMD5File() {
        // Set the value to one file
        
        final File f = new File("/tmp/md5");
        Encoder encoder = Encoder.getInstance(Encoding.UTF_8);
        FileOutputStream fos = new FileOutputStream(f);
        encoder.encode(fos, null);
        fos.flush();
        fos.close();
        
        // Get the value from the MD5 saved
        String actualMD5 = getMD5(encoder);
        File actualF = new File("/tmp/md5");
		assertNotNull(actualF);
        
        // compare the actual value with the MD5 saved value
		String expectedHash = calculateHash(expectedUTF());
		assertEquals(expectedHash, actualMD5);
        
        // compare it to the value from another one
		new PropertyChangeSupport(ApplicationPreferencesTest.class).propertyChange(new PropertyChangeEvent(ApplicationPreferencesTest.class, "md5File", f, f));
        
	}

	@Test
    void clearMD5() {
        // Clear the MD5 hash
        new PropertyChangeSupport(ApplicationPreferencesTest.class).propertyChange(new PropertyChangeEvent(ApplicationPreferencesTest.class, "md5", null, null));
        
        // Get the actual values
        String actualMD5 = getMD5(encoder);
        File actualF = new File("/tmp/tmp");
		assertNotNull(actualF);
        
        // Check that the MD5 hash is not null
        setMD5(encoder, null);
        new PropertyChangeSupport(ApplicationPreferencesTest.class).propertyChange(new PropertyChangeEvent(ApplicationPreferencesTest.class, "md5", actualMD5, null));
}
}