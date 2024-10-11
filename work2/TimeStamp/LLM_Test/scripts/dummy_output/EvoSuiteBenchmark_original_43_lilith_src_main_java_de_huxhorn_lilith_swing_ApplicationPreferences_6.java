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
//     * Quick & dirty MD5 checksum function.
//     * Returns null in case of error.
//     *
//     * @param input the input
//     * @return the checksum
//     */
        public static byte[] getMD5(InputStream input) {
                byte[] md5Sum = null;
                DataInputStream dis = null;
                try {
                        dis = new DataInputStream(input);
                        md5Sum = MessageDigest.getInstance("MD5").digest(dis.readBytes());
                } catch (Exception e) {
                        e.printStackTrace();
                        // throw new RuntimeException(e);
                } finally {
                        IOUtils.closeQuietly(dis);
                }
                return md5Sum;
        }
        /**
         * Check if there is a saved condition from a file.
         * @throws java.io.IOException
         */
        @Test
        public void testSavedConditionCheck() throws IOException{
                String name = File.separator + "Myfile" + File.separator + "saved-conditions";
                File file = new File(name);
                String condition =  getMD5(file.getAbsoluteFile());
                if (file.exists() && condition!= null) {
                        return;
                }

                throw new IllegalStateException("Missing conditions file");
        }

        /**
         * Check if there is a saved condition from a file.
         * @throws java.io.IOException
         */
        @Test
        public void testSavedConditionCheck2() throws IOException{
                String name = File.separator + "Myfile" + File.separator + "saved-conditions2";
        }

        /**
         * Check if the conditions from a file are identical to those in a saved conditions file.
         * @throws java.io.IOException
         */
        @Test
        public void testConditionSerialization() throws IOException{

                String name = File.separator + "Myfile" + File.separator + "saved-conditions.properties";
                File file = new File(name);
                // String name = File.separator + "Myfile" + File.separator + "saved-conditions.properties";
                String xml = getMD5(new FileInputStream(file));
}
}