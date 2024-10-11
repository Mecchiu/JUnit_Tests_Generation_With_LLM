// OperatingSystem_1Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {

  @Test
	public void checkOperatingSystemTest1() {
    File originalApplicationManifest;
    try {
      File applicationManifestSubFolder = FileManager.findFolder("ApplicationManifest", 'F');
      originalApplicationManifest = FileManager.findResource("ApplicationManifest", applicationManifestSubFolder);
    } catch (IOException e) {
      fail("Can't find applicationManifest in folder " + (fileToString(applicationManifestSubFolder)));
    }
    
    File temporaryDirectory;
    try {
      temporaryDirectory = FileManager.findTempFile("", 'M');
    } catch (IOException e) {
      fail("Can't find temporary directory " + (fileToString(temporaryDirectory)));
    }
    
    try {
      File temporaryFolder = FileManager.findTempFile("", 'F');
    } catch (IOException e) {
      fail("Can't find temporary folder  \"" + (fileToString(temporaryFolder)) + "\"");
    }
		
        File applicationFile = new File("/Volumes/Applications/Appleseed 3.0");
		
      assertTrue(FileManager.isFileOrDir(applicationFile));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/LinkedModules")));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/Resources")));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/Frameworks")));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/MacOS")));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/Caches")));
      assertTrue(FileManager.isFileOrDir(new File(applicationFile + "/Contents/Libraries")));
      
      File subFolder = new File(applicationFile.getParentFile(), "Contents/Frameworks");
      assertTrue(FileManager.isFileOrDir(subFolder));
      assertTrue(FileManager.isFileOrDir(new File(subFolder + "/Contents/Info.plist")));
      assertTrue(FileManager.isFileOrDir(new File(temporaryDirectory + "/Contents/Frameworks/PkgConfig")));
      assertTrue(FileManager.isFileOrDir(new File(temporaryDirectory + "/Contents/Frameworks/PkgConfig.bundle/" + UUID.randomUUID().toString())));
      
      File managerDirectory = new File("/Volumes/Applications/Application Support");
      File root, folder;
      try {
        managerDirectory.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.getAbsolutePath().endsWith((".jar") + File.separator)) {
                  folder = pathname;
                }
                return true;
            }
        });
      } catch (IOException e) {
        fail("Directory does not exist:" + (managerDirectory!= null? managerDirectory.getCanonicalPath() : "null"));
      }}
		
  @Test
  public void checkOperatingSystemTest2() {
    Path path = new Path(originalApplicationManifest.getCanonicalPath());
    File currentTempFile = null;

    try {
      FileManager.setTempFile(path);
    } catch (IOException e) {
      System.out.println("Error while setting application manifest path");
    }

    try {
      FileManager.recycleTempFile();
    } catch (IOException e) {
      System.out.println("Error while recycling temporary directory");
    }

    // This method should be called only once on the program execution
    assertTrue(isLinux());

  }

	@Test
	public void checkOperatingSystemTest3() {
		String originalApplicationManifestFile = UUID.randomUUID().toString() + ".manifest";
		ResourceBundle resourceBundle = ResourceBundle
				.getBundle("/Volumes/Library/Application Support/Appleseed 3.0/org.appleseed.devel/ApplicationManifest.properties");

		File originalApplicationManifest = new File(originalApplicationManifestFile);
		File actualDefaultApplicationManifest = FileManager.findResource("ApplicationManifest",
				originalApplicationManifest.getParentFile());

		assertEquals(originalApplicationManifest.getCanonicalPath(),
				actualDefaultApplicationManifest.getCanonicalPath());

		String newDirectory;
		try {
			new Directory(resourceBundle, "newPath");
		} catch (IOException e) {
			fail("Can't setup directory " + (