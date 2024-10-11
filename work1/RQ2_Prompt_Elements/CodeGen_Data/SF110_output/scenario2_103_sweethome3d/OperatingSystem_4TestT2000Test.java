// OperatingSystem_4Test.java
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
* It contains one unit test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {

    /**
     * Testing default Application folder.
     * @throws IOException
     * @throws MissingResourceException
     */
	@Test
	public void defaultApplicationInCurrentUserFolder() throws IOException, MissingResourceException {
		String defaultApplication1 = getDefaultApplicationFolder().getCanonicalPath();
		Thread.currentThread().sleep(500);
		assertNotNull(defaultApplication1);
	}

	// OperatingSystem_5Test.java
	/**
	* Testing application folder.
	* <p>It should be found inside a user application folder which, if it is created by other users, should be there.</p> 
	* @throws IOException
	* @throws MissingResourceException
	*/
	@Test
	public void applicationFolder() throws IOException, MissingResourceException {
		File applicationFolder = getDefaultApplicationFolder();
		assertNotNull(applicationFolder);
		assertEquals(new File(applicationFolder.getAbsolutePath()).exists(), true);
	}
	// OperatingSystem_6Test.java
	/**
	* Testing operating system property.
	* <p>It should be created and accessible to all users.</p> 
	* @throws MissingResourceException
	*/
	@Test
	public void operatingSystemProperty() throws MissingResourceException {
		String osName = System.getProperty("os.name");

		assertNotNull(osName);
	}
	// OperatingSystem_7Test.java
    /**
     * Testing operating system property that is overridden by user.
     * <p>It should be created and accessible to all users.</p> 
     * @throws IOException
     * @throws MissingResourceException
     */
	@Test
	public void operatingSystemPropertyOverriddenByUser() throws IOException, MissingResourceException {
		String osName = System.getProperty("user.dir");
		String userSettingOnOS = System.getProperty("user.dir.home");
		
		File file = new File(osName);
		file.setReadable(true);
		file.setWritable(true);
		assertEquals(new File(userSettingOnOS).getCanonicalPath(), new File(file.getAbsolutePath()).getCanonicalPath());
	}
	// OperatingSystem_8Test.java
	/**
	* Testing operating system property that is not overridden by user.
	* <p>It should also be overridable by the operating system default property.</p> 
	* @throws IOException
	* @throws MissingResourceException
	*/
	@Test
	public void operatingSystemPropertyNotOverriddByUser() throws IOException, MissingResourceException {
		String osName = System.getProperty("user.dir");
		// This should be overridable by the operating system default property.
		File file = new File(osName);
		file.setReadable(true);
		file.setWritable(true);
		assertEquals(new File(new File(OS_NAME_DEFAULT_PROPERTY).getCanonicalPath()).getCanonicalPath(), new File(file.getAbsolutePath()).getCanonicalPath());
	}
	// OperatingSystem_9Test.java
	/**
	* Testing operating system property that is overridden by an operating system property containing the name user.
	* <p>It should also be overridable by the operating system default property.</p> 
	* @throws IOException
	* @throws MissingResourceException
	*/
	@Test
	public void operatingSystemPropertyOverriddenByOneOfUser() throws IOException, MissingResourceException {
		String osName = System.getProperty("user.dir");
		String userSettingOnOS = System.getProperty("user.dir.user");
		
		File file = new File(osName);
		file.setReadable(true);
		file.setWritable(true);
		assertEquals(new File(userSettingOnOS).getCanonicalPath(), new File(file.getAbsolutePath()).getCanonicalPath());
	}
	// OperatingSystem_10Test.java
	/**
	* Testing overriding of operating system property that is not overridden by user.
	* <p>It should be overridable by the operating system default property.</p> 
	* @throws IOException
	* @throws MissingResourceException
	*/
	@Test
	public void operatingSystemPropertyNotOverriddByUser() throws IOException, MissingResourceException {
		String osName = System.getProperty("user.dir");
		// This should be overridable by the operating system default property.
		File file = new File(osName);
		file.setReadable(true);
		file.setWritable(true);
		assertEquals(new File(OS_NAME_DEFAULT_PROPERTY).getCanonicalPath(), new File(file.getAbsolutePath()).getCanonicalPath());
	}
	// OperatingSystem_11Test.java
	/**
	* Testing overriding of operating system property that is not overridden by user.
	* <p>It should not be overridden by the operating system default property.</p> 
	* @throws IOException
	* @throws MissingResourceException
	*/
	@Test
	public void operatingSystemPropertyNotOverriddByUser() throws IOException, MissingResourceException {
		String osName = System.getProperty("user.dir");
		// This should not be overridden by the operating system default property.
		File file = new File(osName);
		file.setReadable(true);
		file.setWritable(true);
		assertEquals(new File(new File(System.getProperty("user.dir.user"))).getCanonicalPath(), new File(file.getAbsolutePath()).getCanonicalPath());
	}
	
}