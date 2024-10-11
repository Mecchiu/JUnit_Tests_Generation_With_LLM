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
    void getDefaultApplicationFolder() throws IOException {
    		File application = OperatingSystem.getDefaultApplicationFolder();
    		assertNotNull(application);
    		assertTrue(application.exists());
    		
			/* Check if user's folder exists from System property */
    		String prefix = OperatingSystem.getSystemProperty("applications.subs");
    		File appfile = new File(application, prefix);
    		assertNotNull(appfile);
    		assertTrue(appfile.exists());
    	
			/* Remove file from folder and check if user's folder is deleted */
    		String suffix = ".log";
	        File fileApp = new File(application, suffix);
    		assertFalse(fileApp.exists());
    }

    @Test
    void getDefaultApplicationFolder() throws IOException {
        deleteTemporaryFiles();
        
        File application = OperatingSystem.getDefaultApplicationFolder();
        assertNotNull(application);
        assertTrue(application.exists());
    }

    @Test
    void getDefaultTemporaryFolder() throws IOException {

    }

    @Test
    void createTemporaryFile() throws IOException {
    		// Create temporary file with name
    		String temp = UUID.randomUUID().toString();
    		String prefix = OperatingSystem.getSystemProperty("temporary.subs");
    		File tempdir = new File(TemporaryFile.getTempFolder(), prefix);
    		assertNotNull(tempdir);
    		File f = File.createTempFile("temp", ".tmp", tempdir);
    		assertNotNull(f);
    		assertTrue(f!= null);
    		try {
	    		Thread.sleep(100);
	    		assertTrue(f.delete());
    		} catch (IOException e) {
    			assertTrue(e instanceof IllegalStateException);
    		}
    		try {
	    		int a = 1000;
	    		/*
	    			File f = File.createTempFile(temp, "a", f);
	    			assertNotNull(f);
	    			assertTrue(f.delete());
	    		*/
    		} catch (NullPointerException | IOException e) {
    			fail();
    		}
    		try {
    			int a = 1000;
				/*
	    			File f = File.createTempFile(temp, ".a", f);
	    			assertNotNull(f);
	    			assertTrue(f.delete());
	    		*/
    		} catch (IOException e) {
    			fail();
    		}
    		try {
    			if(f.exists())
				{
    				assertTrue(fileExists(f));
                }else
                {
                    assertFalse(f.exists());
                }
            } catch (IOException e) {
                fail();
            }
    }

    /**
     * This method is executed only once.
     */
    private void checkTimerExpired() throws IOException {
    		if (Timer.activeCount() == 0) {
    			return;
    		}\
    		assertTrue(Timer.activeCount() > 0);
    }

    /**
     * This method has a 1% chance of throwing exception.
     */
    private boolean fileExists(File f) throws IOException {
		try {
			FileManager.getInstance().getFileContent(f.getPath());
		}
		catch (IOException e) {
			return true;
		}
		return false;
    }

}