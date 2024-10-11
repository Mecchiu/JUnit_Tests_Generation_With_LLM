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
     * Logger used throughout the tests.
     */
    private static Logger logger = LoggerFactory.getLogger(ApplicationPreferencesTest.class);

    @Test
    void getMD5() {
        File testdir = new File("../");
        File xml = new File(testdir, "preferences.xml");
        // Create XML document structure.
        Document doc = createDocument("preferences.xml");
        assertEquals("The created element should be one of class <?xml version =\"1.0\"?>.", XMLDoc.getElementText(doc, "xmlns:xsi"), XMLDoc.getElementText(Doc.asDocument(doc), "xsi:type"));
        assertTrue("The created element should not be one of class <?xml version =\"1.0\"?>.",!doc.getElementsByTagName("preferences").getItem(1).getNodeValue().equals("<preferences />"));
        // Add user preferences to preferences.xml
        PreferenceUserPreferences prefs = new PreferenceUserPreferences();
        prefs.set("user1", "value1");
        prefs.set("user2", "value2");
}
}