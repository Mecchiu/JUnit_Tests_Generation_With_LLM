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
		
	@Test
    public void testGetDefaultApplicationFolder() throws IOException, MissingResourceException, AccessControlException {
		String subFolderName = "com.eteks.sweethome3d";
		// test if application folder exists
		String subFolderPath = new File("/Applications/" + subFolderName).getAbsolutePath();
		File fileApplicationFolder = new File(subFolderPath);
		assertTrue(fileApplicationFolder.exists(), "Application folder not exists");
		// test if subfolder is correct
		assertEquals(subFolderNodeName, subFolderName, subFolderPath);
	}
	
	
	@Test
    public void testGetDefaultHome() throws IOException, RuntimeException {
		String homeFolderName = "home";
		// test it can return home object
		Home home = OperatingSystem.getHome(homeFolderName);
		assertNotNull(home, "Home is null");
		// test if the current home matches the passed one
		assertInstanceOf(Home.class, home, "Failed to find home of the passed one");
		// test if home exists
		assertTrue(!home.getHome().equals(""), "Home folder is empty");
		// test if home and home folder are correct
		assertEquals(homeFolderName, home.getHomeName(), homeFolderName);
		assertTrue(!home.getHome().equals(home), "home matches home name");		
		// test create a new home with specified folder name
		Home homeWithFolderName = new Home(homeFolderName);
		assertNotNull(homeWithFolderName, "Home is null");
		assertEquals(homeWithFolderName.getHomeName(), homeFolderName, "home folder name is wrong");
		//test if home and home folder are correct
		assertEquals(homeFolderName, homeWithFolderName.getHomeName(), homeFolderName);
		// test the home folder is created
		assertTrue(!homeWithFolderName.getHome().equals(""), "home folder not created yet");
		// test if it can be deleted with the home
		assertTrue(Executor.isExecuting(home), "Failed to delete home folder");
		// wait for the timer end
		Timer timer = new Timer();
			
		final Home homeAfterTimer = new Home(home.getHome(), home.getHomeName(), UUID.randomUUID().toString());
			
		assertTrue(Executor.isExecuting(homeAfterTimer), "Failed to delete home folder");
		timer.schedule(new TimerTask() {

			@Override
            public void run() {			
				Executor.delete(home);
			}
		}, 1000, 10800);
		// wait for a while for the home deleted
		assertTrue(Executor.isExecuting(home), "Failed to delete home folder");
		
		// test the home is deleted
		assertFalse(Home.isHomeFolder(home), "home folder has existed");
		
	}
	
	
	@Test
    public void testGetDefaultTemporaryFolder(){
		
		String subFolderName = "temporary";
		// test if the default temporary folder exists
		File folder = new File("/Users/UserName/TemporaryFolder" + subFolderName);
		assertTrue(folder.exists(), "Temporary folder not exists");
		// test if we can create a new folder
		String folderContent = "my name" + File.separator + File.separator;
		File folderFile = new File(folder.getAbsolutePath() + File.separator + subFolderName);
		assertTrue(folderFile.exists(), "Temporary folder is empty");
		// test if it can create a new folder
		assertTrue(new File(folderFile.getAbsolutePath() + File.separator + subFolderName).mkdir(), "Folder folder is created");
	}
	
	private <T> File getInstanceOf(Class<T> clazz, File file){
		return ((FileManager)System.getSecurityManager().getClassContext().getClassLoader()).getFile(clazz.getName()).createTempFile(null, file.getName());
	}

	private static class MyTimer extends Timer {

    	private String timerName;

}
}