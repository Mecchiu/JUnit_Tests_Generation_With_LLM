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
/*
		 * Test 1
		 */
		/**
		 * Empty test cases.
		 */
	@Test
	  public void emptyEq() {

		assertFalse(isWindows()? OperatingSystem.getWindowsName() : OperatingSystem.getOSName(), OperatingSystem.isWindows());
	}

	/*
	 * Test 2
	 */
	// Test with different windows names.
	@Test
	  public void windowsNameEqDifferent() {

		ResourceBundle messages1 = ResourceBundle.getBundle("messages_1");
		ResourceBundle messages2 = ResourceBundle.getBundle("messages_2");

		// empty message list
		assertNull(OperatingSystem.getWindowsName());

		// some messages in messages_1
		assertEquals("Win1", OperatingSystem.getWindowsName(messages1, OperatingSystem.getOSName()));
		assertEquals("Win2", OperatingSystem.getWindowsName(messages2, OperatingSystem.getOSName()));

		// some messages in messages_2
		assertEquals("Peg1", OperatingSystem.getWindowsName(messages1, "Peg1"));
		assertEquals("Peg2", OperatingSystem.getWindowsName(messages2, "Peg1"));

		// some messages in messages_2
		assertEquals("Mig1", OperatingSystem.getWindowsName(messages1, "Mig1"));
		assertEquals("Mig2", OperatingSystem.getWindowsName(messages2, "Mig1"));

	}

	/*
	* Test 3
	*/
	// Test with different operating systems.
	@Test
	  public void osEqDifferent() {

		String osName = OperatingSystem.isWindows()? "Win1" : "Mig1";

			// empty message list
			assertNull(OperatingSystem.getOsName(osName, OperatingSystem.getOSName()));

			// some messages in messages_1
			assertEquals("Mig1 (Windows)", OperatingSystem.getOsName(osName, "Mig1 (Windows"));
			assertEquals("Mig1 (Migain) (Windows)", OperatingSystem.getOsName(osName, "Mig1 (Migain) (Windows"));
			assertEquals("Mig1 (Osx) (Migain)", OperatingSystem.getOsName(osName, "Mig1 (Osx) (Migain"));
			assertEquals("Mig1 (Mac) (Migain)", OperatingSystem.getOsName(osName, "Mig1 (Mac) (Migain"));
			assertEquals("Mig1 (Unix) (Migain)", OperatingSystem.getOsName(osName, "Mig1 (Unix) (Migain"));

			// some messages in messages_2
			assertEquals("Peg1 (Windows)", OperatingSystem.getOsName(osName, "Peg1 (Windows"));
			assertEquals("Peg1 (Mac) (Migain)", OperatingSystem.getOsName(osName, "Peg1 (Mac) (Migain"));
			assertEquals("Peg1 (Osx) (Migain)", OperatingSystem.getOsName(osName, "Peg1 (Osx) (Migain"));
			assertEquals("Peg1 (Windows) (Migain)", OperatingSystem.getOsName(osName, "Peg1 (Windows) (Migain"));
			assertEquals("Peg1 (Mac) (Pegain)", OperatingSystem.getOsName(osName, "Peg1 (Mac) (Pegain"));
			assertEquals("Peg1 (Unix) (Pegain)", OperatingSystem.getOsName(osName, "Peg1 (Unix) (Pegain"));

			// some messages in messages_2
			assertEquals("Mig1 (Windows)", OperatingSystem.getOsName(osName, "Mig1 (Windows"));
			assertEquals("Mig1 (Mac) (Pegain)", OperatingSystem.getOsName(osName, "Mig1 (Mac) (Pegain"));
			assertEquals("Mig1 (Osx) (Pegain)", OperatingSystem.getOsName(osName, "Mig1 (Osx) (Pegain"));
			assertEquals("Mig1 (Windows) (Pegain)", OperatingSystem.getOsName(osName, "Mig1 (Windows) (Pegain"));
			assertEquals("Mig1 (Mac) (Migain)", OperatingSystem.getOsName(osName, "Mig1 (Mac) (Migain"));
			assertEquals("Mig1 (Unix) (Migain)", OperatingSystem.getOsName(osName, "Mig1 (Unix) (Migain"));
	}
	
	protected String getMatchingExtension(String target, Class<?> clazz) {
		String ext = "";
		if (target.isEmpty()) {
			return null;
		}
		String target_fileName = target.substring(0, target.lastIndexOf("."));
		String target_extension = target_fileName.substring(target_fileName.lastIndexOf(".") + 1);
		for (File aTarget_extension : FileManager.getInstance().listFiles(target_extension)) {
			PathTarget target_file = new PathTarget(target_fileName, aTarget_extension);
			if (PathTarget.getContentFile(target_file).toString().endsWith(target_extension)) {
				ext = target_extension;
			}
		}
		return ext;
	}
	
	/*
	 * Test 3
	 */
	// Testing getOSName().
	/**
	 * Test 1
	 */
	public void _GetOSName_1() {

		// empty message list
		assertNull(OperatingSystem.getOSName(OperatingSystem.getOSName(), OperatingSystem.getOSName()));

		// some messages in messages_1
		assertEquals("Mig1 (Windows)", OperatingSystem.getOSName(OperatingSystem.getOSName(), "Mig1 (Windows"));
		assertEquals("Peg2", OperatingSystem.getOSName(OperatingSystem.getOSName(), "Peg1"));
		assertEquals("Mig1 (Migain)", OperatingSystem.getOSName(OperatingSystem.getOSName(), "Mig1 (Migain"));
		assertEquals("Mig1 (Osx) (Migain)", OperatingSystem.getOSName(OperatingSystem.getOSName(), "Mig1 (Osx) (Migain"));
		assertEquals("Peg2 (Migain)", OperatingSystem.getOSName(OperatingSystem.getOSName(), "Peg1 (Migain"));
		assertEquals("Peg1 (Osx)", OperatingSystem.getOSName(OperatingSystem