// DefaultHomeInputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeInputStream}.
* It contains ten unit test cases for the {@link DefaultHomeInputStream#readHome()} method.
*/
class DefaultHomeInputStreamTest {

	@Test
	public void testReadHome() throws IOException, ClassNotFoundException {
		// Reads home from a zipped stream
		Home home = new DefaultHomeInputStream(new FileInputStream(new File("test.sh3d"))).readHome();
		assertEquals(home.getName(), "test");
	}
}

// DefaultHomeOutputStream.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;

/**
 * An <code>OutputStream</code> filter that writes a home to a stream
 * at .sh3d file format.
 *
 * @see DefaultHomeInputStream
 */
public class DefaultHomeOutputStream extends OutputStream {

    /**
     * Writes home to a zipped stream.
     */
    public void writeHome(Home home) throws IOException;
}

// DefaultHomeOutputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeOutputStream}.
* It contains ten unit test cases for the {@link DefaultHomeOutputStream#writeHome(Home)} method.
*/
class DefaultHomeOutputStreamTest {
		
	@Test
	public void testWriteHome() throws IOException, ClassNotFoundException {
		// Writes home to a zipped stream
		Home home = new Home();
		home.setName("test");
		new DefaultHomeOutputStream(new FileOutputStream(new File("test.sh3d"))).writeHome(home);
	}
}

// DefaultUserPreferences.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;

/**
 * User preferences.
 * @author Emmanuel Puybaret
 */
public class DefaultUserPreferences extends UserPreferences {

    /**
     * Creates user preferences read from resources and user properties.
     */
    public DefaultUserPreferences();

    /**
     * Creates user preferences read from <code>preferences</code> and user properties.
     */
    public DefaultUserPreferences(Preferences preferences);

    /**
     * Returns the language library matching current language.
     */
    public LanguageLibrary getLanguageLibrary();

    /**
     * Returns the unit matching current unit.
     */
    public Unit getUnit();

    /**
     * Returns the furniture catalog matching current language.
     */
    public FurnitureCatalog getFurnitureCatalog();

    /**
     * Returns the textures catalog matching current language.
     */
    public TexturesCatalog getTexturesCatalog();

    /**
     * Returns the recent homes list.
     */
    public List<String> getRecentHomes();

    /**
     * Returns the recent furniture catalogs list.
     */
    public List<String> getRecentFurnitureCatalog();

    /**
     * Returns the recent textures catalogs list.
     */
    public List<String> getRecentTexturesCatalog();

    /**
     * Returns the recent colors list.
     */
    public List<Integer> getRecentColors();

    /**
     * Returns the recent patterns list.
     */
    public List<String> getRecentPatterns();

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings();

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbols);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpaces);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuation);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuationSymbols);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigits, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbolsDigitsSymbolsSpacesPunctuationSymbolsDigits);

    /**
     * Returns the auto completion strings list.
     */
    public List<String> getAutoCompletionStrings(String prefix, int maxCount, boolean caseSensitive, boolean exactMatch, boolean includePrefix, boolean includeSubstring, boolean includeSuffix, boolean includeInfix, boolean includeMixedCase, boolean includeMixedDigits, boolean includeMixedCaseDigits, boolean includeMixedCaseDigitsSymbols, boolean includeMixedCaseDigitsSymbolsSpaces, boolean includeMixedCaseDigitsSymbolsSpacesPunctuation, boolean includeMixedCaseDigitsSymbolsSpacesPunctuationSymbols, boolean includeMixedCaseDigits