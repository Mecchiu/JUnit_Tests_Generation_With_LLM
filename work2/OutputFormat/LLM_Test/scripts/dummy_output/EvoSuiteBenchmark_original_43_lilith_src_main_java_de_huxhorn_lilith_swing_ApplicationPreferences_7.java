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
		private ApplicationPreferences app;
		private Map<String, String> testProperties;
		private PersistentTableColumnModel persistenceModel = null;

	Runnable runAfterStart = new Runnable() {
        public void run() {
        }
    };

	@Test
	void testGetMD5( ) throws IOException {
		try {
			app = new ApplicationPreferences();
			testPropeties = null;
			PersistentTableColumnModel newModel = app.getMD5( );
			assertNotNull( testPropeties );
			assertEquals( mockTable( ), newModel );
		} catch( Exception e ) {
			fail( e.getMessage( ) );
		}
	}

	/**
	* Create a mock table.
	*
	* A {@link PersistentTableColumnModel} that contains one entry for each value and a {@link ColorScheme}.
	*/
	private PersistentTableColumnModel mockTable( ) {
		// We are creating an instance of PersistentTableColumnModel which is a table column model for the test.
		persistenceModel = new PersistentTableColumnModel( "test" );
		persistenceModel.setColorScheme( new ColorScheme( ) );

		return persistenceModel;
	}
	
	@Test
	void testSave( ) throws BackingStoreException {
		// We are about to run the runAfterStart method.
		app.setRunAfterStart( runAfterStart );

		// An entry for testProperty with a value.
		persistenceModel.addPersistentProperty( createPersistentProperty( "testProperty", "val" ) );

		// The property that is persisted.
		String md5BeforeSave;

		// The hash for the md5 has changed.
		md5BeforeSave = getMD5( );
		
		saveChanges( ).saveToFile( "/path/to/testfile" );
		
		// The new hash can be retrieved.
		String md5AfterSave;
		
		// Verify if a md5 is present in the persistencies
		md5AfterSave = getMD5( );

		assertNotNull( md5BeforeSave );
		assertNotNull( md5AfterSave );
		assertFalse( md5AfterSave.contains( md5BeforeSave ) );
		
		PersistentTableColumnModel newModel = new PersistentTableColumnModel( "new" );
		newModel.setColorScheme( persistenceModel.getColorScheme( ) );

		File f = new File( "/path/to/testfile" );
		newModel.addPersistentProperty( createPersistentProperty( "newProperty", f.getPath( ) ) );

		// The new properties can be retrieved.
		String md5AfterNew;
		
		// Verify if a new property has been updated, not even if it is read-only.
		md5AfterNew = getMD5( );
		
		// The new properties can be removed too.
		newModel.removePersistentProperty( createPersistentProperty( "newProperty", "newValue" ) );
		
		assertNotNull( md5BeforeSave );
		assertNotNull( md5AfterSave );
}
}