// OperatingSystemTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsWindows() {
		assertTrue(OperatingSystem.isWindows());
	}
}

// ResourceURLContent.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Content read from a URL.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {
    private final String resourceName;

    /**
     * Creates a content from a resource name.
     */
    public ResourceURLContent(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Returns the URL of the resource.
     */
    @Override
    public URL getURL() {
        return getClass().getResource(this.resourceName);
    }
}

// ResourceURLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#getURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(ResourceURLContent.getURL(), "http://www.eteks.com/sweethome3d/");
	}
}

// TemporaryURLContent.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Content read from a temporary file.
 * @author Emmanuel Puybaret
 */
public class TemporaryURLContent extends URLContent {
    private final File temporaryFile;

    /**
     * Creates a content from a temporary file.
     */
    public TemporaryURLContent(File temporaryFile) {
        this.temporaryFile = temporaryFile;
    }

    /**
     * Returns the URL of the temporary file.
     */
    @Override
    public URL getURL() {
        try {
            return this.temporaryFile.toURI().toURL();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Returns the temporary file.
     */
    public File getTemporaryFile() {
        return this.temporaryFile;
    }
}

// TemporaryURLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemporaryURLContent}.
* It contains ten unit test cases for the {@link TemporaryURLContent#getURL()} method.
*/
class TemporaryURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(TemporaryURLContent.getURL(), "http://www.eteks.com/sweethome3d/");
	}
}

// URLContent.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Content read from a URL.
 * @author Emmanuel Puybaret
 */
public abstract class URLContent implements Content {
    private URL url;
    private URLConnection connection;
    private InputStream inputStream;

    /**
     * Returns the URL of this content.
     */
    public abstract URL getURL() throws IOException;

    /**
     * Returns the input stream of this content.
     */
    @Override
    public InputStream openStream() throws IOException {
        this.url = getURL();
        this.connection = this.url.openConnection();
        this.inputStream = this.connection.getInputStream();
        return this.inputStream;
    }

    /**
     * Returns the name of this content.
     */
    @Override
    public String getName() {
        String name = this.url.getFile();
        int slashIndex = name.lastIndexOf('/');
        if (slashIndex != -1) {
            name = name.substring(slashIndex + 1);
        }
        return name;
    }

    /**
     * Returns the size in bytes of this content.
     */
    @Override
    public long getSize() {
        return this.connection.getContentLength();
    }

    /**
     * Returns the content type of this content.
     */
    @Override
    public String getContentType() {
        return this.connection.getContentType();
    }

    /**
     * Returns the last modification date of this content.
     */
    @Override
    public long getLastModified() {
        return this.connection.getLastModified();
    }

    /**
     * Returns the attributes of this content.
     */
    @Override
    public Map<String, List<String>> getAttributes() {
        return this.connection.getHeaderFields();
    }

    /**
     * Closes the input stream of this content.
     */
    @Override
    public void close() throws IOException {
        if (this.inputStream != null) {
            this.inputStream.close();
        }
    }
}

// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io