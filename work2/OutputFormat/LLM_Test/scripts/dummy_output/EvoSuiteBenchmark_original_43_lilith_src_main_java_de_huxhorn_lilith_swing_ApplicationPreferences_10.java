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
		private static final Logger LOG = LoggerFactory.getLogger(ApplicationPreferencesTest.class);
		
	/** Simple test case for file access */
	//    @Test
	//    public void fileReadTest(){
	//        assertTrue(true);
	//    }
	@Test
	public void loadConditionTest(){
		LOG.info("loadConditionTest");
		Preferences prefs = LilithConfiguration.getInstance().getPreferences();
		Condition temp = null;
		try (DataInputStream stream = new DataInputStream(new FileInputStream("test1.conf"))) {
		temp = HttpStatus.check(HtmlStatusConverter.process(stream))
			.orElse(CANT_CHECK);
		}
		catch (FileNotFoundException e) {
			LOG.error("File not found exception", e);
		}
		catch (LilithConfigurationError e) {
			LOG.error("Lilith configuration error", e);
		}
		Map<String, Condition> conditionsInMap = FilterFileHelper.processConditions(prefs.asMap(),
			e -> new Condition(e));
		List<Condition> listConditions = conditionsInMap.values().stream().filter(c -> {
				try {
					return c.isActive(null);
				} catch (LilithConfigurationError e) {
					LOG.error("Error message", e);
					return false;
				}
			}).collect(Collectors.toList());
		
		assertEquals(1, listConditions.size());
		assertEquals(temp,"active");
		
	}
}