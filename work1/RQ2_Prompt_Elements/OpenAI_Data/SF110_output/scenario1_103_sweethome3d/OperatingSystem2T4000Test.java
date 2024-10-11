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
* It contains ten unit test cases for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsMacOSX() {
		assertTrue(OperatingSystem.isMacOSX());
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
import com.eteks.sweethome3d.model.Content;

/**
 * Content that references a resource.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent implements Content {
  private final String resourceName;

  /**
   * Creates a content object that references a resource.
   * @param resourceName the name of the resource.
   */
  public ResourceURLContent(String resourceName) {
    this.resourceName = resourceName;
  }

  /**
   * Returns the name of the resource.
   */
  public String getResourceName() {
    return this.resourceName;
  }

  /**
   * Returns <code>true</code>.
   */
  public boolean isJAREntry() {
    return true;
  }

  /**
   * Returns <code>null</code>.
   */
  public String getJAREntryName() {
    return null;
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getURL() {
    return getClass().getResource(this.resourceName);
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL() {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarFile jarFile) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12,
                                     java.util.jar.JarFile jarFile13) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12,
                                     java.util.jar.JarFile jarFile13,
                                     java.util.jar.JarFile jarFile14) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12,
                                     java.util.jar.JarFile jarFile13,
                                     java.util.jar.JarFile jarFile14,
                                     java.util.jar.JarFile jarFile15) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12,
                                     java.util.jar.JarFile jarFile13,
                                     java.util.jar.JarFile jarFile14,
                                     java.util.jar.JarFile jarFile15,
                                     java.util.jar.JarFile jarFile16) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,
                                     java.util.jar.JarFile jarFile7,
                                     java.util.jar.JarFile jarFile8,
                                     java.util.jar.JarFile jarFile9,
                                     java.util.jar.JarFile jarFile10,
                                     java.util.jar.JarFile jarFile11,
                                     java.util.jar.JarFile jarFile12,
                                     java.util.jar.JarFile jarFile13,
                                     java.util.jar.JarFile jarFile14,
                                     java.util.jar.JarFile jarFile15,
                                     java.util.jar.JarFile jarFile16,
                                     java.util.jar.JarFile jarFile17) {
    return getURL();
  }

  /**
   * Returns the URL of the resource.
   */
  public java.net.URL getJAREntryURL(String entryName,
                                     java.util.jar.JarEntry jarEntry,
                                     java.util.jar.JarFile jarFile,
                                     java.util.jar.JarFile jarFile2,
                                     java.util.jar.JarFile jarFile3,
                                     java.util.jar.JarFile jarFile4,
                                     java.util.jar.JarFile jarFile5,
                                     java.util.jar.JarFile jarFile6,