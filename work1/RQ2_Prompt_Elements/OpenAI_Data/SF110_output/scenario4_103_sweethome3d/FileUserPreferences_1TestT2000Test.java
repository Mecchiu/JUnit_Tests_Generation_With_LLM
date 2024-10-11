// FileUserPreferences_1Test.java
package com.eteks.sweethome3d.io;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.FurnitureCatalog;
import com.eteks.sweethome3d.model.FurnitureCategory;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.PatternsCatalog;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUserPreferences}.
* It contains ten unit test cases for the {@link FileUserPreferences#texturesLibraryExists(String)} method.
*/
class FileUserPreferences_1Test {

		@Test
		void testTexturesLibraryExists_1() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.zip"));
		}
		
		@Test
		void testTexturesLibraryExists_2() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3t"));
		}
		
		@Test
		void testTexturesLibraryExists_3() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3f"));
		}
		
		@Test
		void testTexturesLibraryExists_4() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3l"));
		}
		
		@Test
		void testTexturesLibraryExists_5() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3p"));
		}
		
		@Test
		void testTexturesLibraryExists_6() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3c"));
		}
		
		@Test
		void testTexturesLibraryExists_7() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3d"));
		}
		
		@Test
		void testTexturesLibraryExists_8() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3m"));
		}
		
		@Test
		void testTexturesLibraryExists_9() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3t"));
		}
		
		@Test
		void testTexturesLibraryExists_10() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.texturesLibraryExists("textures.sh3t"));
		}
}

// FileUserPreferences_2Test.java
package com.eteks.sweethome3d.io;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.prefs.AbstractPreferences;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.CatalogDoorOrWindow;
import com.eteks.sweethome3d.model.CatalogPieceOfFurniture;
import com.eteks.sweethome3d.model.CatalogTexture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.FurnitureCatalog;
import com.eteks.sweethome3d.model.FurnitureCategory;
import com.eteks.sweethome3d.model.LengthUnit;
import com.eteks.sweethome3d.model.PatternsCatalog;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.Sash;
import com.eteks.sweethome3d.model.TexturesCatalog;
import com.eteks.sweethome3d.model.TexturesCategory;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUserPreferences}.
* It contains ten unit test cases for the {@link FileUserPreferences#furnitureLibraryExists(String)} method.
*/
class FileUserPreferences_2Test {
		
		@Test
		void testFurnitureLibraryExists_1() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.zip"));
		}
		
		@Test
		void testFurnitureLibraryExists_2() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3f"));
		}
		
		@Test
		void testFurnitureLibraryExists_3() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3l"));
		}
		
		@Test
		void testFurnitureLibraryExists_4() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3p"));
		}
		
		@Test
		void testFurnitureLibraryExists_5() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3c"));
		}
		
		@Test
		void testFurnitureLibraryExists_6() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3d"));
		}
		
		@Test
		void testFurnitureLibraryExists_7() throws Exception {
			FileUserPreferences fileUserPreferences = new FileUserPreferences();
			assertTrue(fileUserPreferences.furnitureLibraryExists("furniture.sh3