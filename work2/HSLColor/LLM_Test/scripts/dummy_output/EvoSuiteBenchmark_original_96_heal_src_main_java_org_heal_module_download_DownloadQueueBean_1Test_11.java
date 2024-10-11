// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {
		/**
		 * Tests that the clearPackageFileSettings() method clears all of the
		 * settings.
		 */
    @Test
    public void clearPackageFileSettings() {
        DownloadQueueBean bean = new DownloadQueueBean();
        // create a file we will store the contents of
        File file = new File(new File("."),".apk"+System.currentTimeMillis());
        String contents = getContents();
        bean.setPackageFileLocation(file.getAbsolutePath());
        bean.setPackageURL(file.getAbsolutePath());
        bean.setPackageFormat(2);
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageURL());
        assertNull(bean.getPackageFormat());
    }

    /**
		  * Test that the clearPackageFileSettings() method throws an Exception if
		  * any metadata entries are provided that match zero or more metadata
		  * keys or no metadata key.
		   */
    @Test
    public void clearPackageFileSettingsWithContainingMdKeys() {
        DownloadQueueBean bean = new DownloadQueueBean();
        // create a file we will store the contents of
        File file = new File(new File("."),".apk"+System.currentTimeMillis());
        String contents = getContents();
        bean.setPackageFileLocation(file.getAbsolutePath());
        bean.setPackageURL(file.getAbsolutePath());
        bean.setPackageFormat(2);
        bean.clearPackageFileSettings();

        try {
            bean.clearPackageFileSettings(new Object[]{"mdkey1","mdkey2","mdkey3"});
            fail("Expected IllegalArgumentException with mdkey1 and mdkey2, " + "but got nothing");
        } catch(IllegalArgumentException e) {}
    }

    /**
		 * Test that the getPackageFileLocation() method returns the path to the file
		 * specified in the parameter list, else throws {@link java.io.FileNotFoundException}.
		 */
    @Test
    public void getPackageFileLocation() {
        DownloadQueueBean bean = new DownloadQueueBean();
        // create a file we will store the contents of
        assertTrue("The package file location has not yet been set.", bean.getPackageFileLocation() == null);
        File file = new File(new File("."),".apk"+System.currentTimeMillis());
        String contents = getContents();
        bean.setPackageFileLocation(file.getAbsolutePath());
        bean.setPackageURL(file.getAbsolutePath());
        bean.setPackageFormat(2);
        String location = bean.getPackageFileLocation();
        assertTrue("getPackageFileLocation() should return the path to the package file."+" In " + location, location!= null && location.endsWith(file.getPath()));
        // if file is null or empty, this method should throw a FileNotFoundException
        try {
            bean.getPackageFileLocation();
            fail("Expected FileNotFoundException, got nothing.");
        } catch (FileNotFoundException e) {
        }
    }
    //------------------------- Public Methods -------------------------//
    
    /**
 		* Returns the contents file for this queue.
		* This file is used as a test of the {@link DownloadQueueBean#getContents()}
		* method for testcases that use a different path.
		*/
    public String getContents() {
        return getContents(new File("."));
    }
    
    public String getContents(File f) {
        String contents = "";
        // clear the contents 
        try {
            System.clearProperty("org.apache.cordova.exec.display_name");
        }    
        catch (Exception e) {}
        
        // get the contents using readFile
        try {
            processContents(new File(f.getAbsolutePath()).getAbsolutePath());
        }
        catch (Exception e) {}

        // return contents to the caller
        return contents;
    }

}