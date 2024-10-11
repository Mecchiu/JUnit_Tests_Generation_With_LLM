// OperatingSystem_0Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_0Test {
		
    @Test
    void testLinux() {
        assertTrue(OperatingSystem.isLinux());
    }
	
	@Test
	void testWindows() {
		assertFalse(OperatingSystem.isWindows());
	}
	
	@Test
	void testMacOSX() {
		assertFalse(OperatingSystem.isMacOSX());
	}
	
	@Test
	void testMacOSXLeopardOrSuperior() {
		assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());
	}
	
	@Test
	public void testCreateTempFolder() throws IOException {
		assertNotNull(OperatingSystem.createTemporaryFile(new String[] {""}, new String[] {".tmp"}));
	}
	
	@Test
	public void testGetDefaultTemporaryFolder() {
		assertNotNull(OperatingSystem.getDefaultTemporaryFolder(true));
	}
	
	/* @Test
	public void testGetDefaultApplicationFolder() {
		assertNotNull(OperatingSystem.getDefaultApplicationFolder(true));
	}
	*/
	
	@Test
	public void testUpdateAndDeleteTempFile() {
		assertTrue(OperatingSystem.createTemporaryFile(new String[] {""}, new String[] {".tmp"}).exists());
		
		final File defaultTempFile = OperatingSystem.createTemporaryFile(new String[] {""}, new String[] {".tmp"});
		final File deleteTempFile = OperatingSystem.createTemporaryFile(new String[] {""}, new String[] {".tmp"});
		
		final Timer stopTimer = new Timer();
		final TimerTask stopTask = new StopTask();
		
		final Timer startTimer = new Timer();
		final TimerTask startTask = new StartTask();
		
		stopTask.execute();
		stopTask.cancel();
		
		startTask.execute();
		startTask.cancel();
		
		stopTimer.schedule(stopTask, 100);
		startTimer.schedule(startTask, 0);
		
		try {
			FileUtils.deleteFile(defaultTempFile);
			assertTrue(defaultTempFile.exists());
		} catch (Exception e) {
			throw new AssertionError("Expected success; however exception thrown: " + e);
		}
		
		try {
			FileUtils.deleteFile(deleteTempFile);
			fail("Expected exception not thrown.");
			
		} catch (Exception e) {
			assertTrue(OperatingSystem.isLinux());
		}

		File[] files = OperatingSystem.getDefaultTemporaryFolder(true).listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File f) {
				return f.getName().startsWith(".tmp");
			}
								
		});
		assertEquals(1, files.length);
				
		stopTask.cancel();
		startTask.cancel();
		
	}
	
	// TimerTask class for the stop task
	private class StopTask implements Runnable {
		
		@Override
		public void run() {
			System.out.println("The timer has passed.");
		}
		
	}
	
	// TimerTask class for the start task
	private class StartTask implements Runnable {
		
		@Override
		public void run() {
			System.out.println("The timer has passed.");
		}
		
	}
	
}