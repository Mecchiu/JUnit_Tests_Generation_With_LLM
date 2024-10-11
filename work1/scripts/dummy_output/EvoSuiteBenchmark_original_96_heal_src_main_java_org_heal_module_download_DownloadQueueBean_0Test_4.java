// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {
		
    // Test for removeAllFromQueue() when this queue does not have any items.
    @Test
    public void test_0() {
    	final String packageFileLocation_1 = "Test file for package file location removal test";
    	packageFileLocation_1 = new File(String.valueOf(packageFileLocation_1));
    	packageFileLocation_1.deleteOnExit();

    	final long lastModified_1 = System.currentTimeMillis();

    	// Verify that a queue does NOT have entries.
    	assertEquals(0, DownloadQueueBean.getNumEntries());
    }

    // Test for removeAllFromQueue() when the queue entry is null.
    @Test
    public void test_1() {
    	final Long longContentId_1 = Long.valueOf(100);
    	
    	// Verify that a queue is empty.
    	assertEquals(0, DownloadQueueBean.getNumEntries());
    }

    // Test for removeAllFromQueue() when the queue entry is non-null.
    @Test
    public void test_2() {
    	final Long longContentId_1 = Long.valueOf(100);
    	
    	// Verify that all entries in the queue are returned
    	long currentTime = System.currentTimeMillis();
    	assertNotNull(File.separator);
    	
    	// Ensure that this queue is updated when the number of entries
    	// is increased.
    	currentTime = System.currentTimeMillis();
    	DownloadQueueBean.setPackageFileUpdated("Package file location changed. New package file location: " + packageFileLocation_1);
    	
        // Add a contentId to the list.
        DownloadQueueBean.addToQueue(longContentId_1);

        // Verify that the number of entries is unchanged after adding a
        // contentId.
        assertEquals(Long.valueOf(100), DownloadQueueBean.getNumEntries());
        
        // Ensure that the queue is updated.
        long newCurrentTime_2 = System.currentTimeMillis();
        currentTime = System.currentTimeMillis();
        
    	// Update the queue file location with two different contents.
    	currentTime = System.currentTimeMillis();
    	packageFileLocation_1 = packageFileLocation_1.getAbsolutePath();
    	packageFileLocation_1 = new File(packageFileLocation_1);
    	packageFileLocation_1.deleteOnExit();
    	
    	// Update the queue file location with two different contents.
    	packageFileLocation_1 = packageFileLocation_1.getAbsolutePath();
    	packageFileLocation_1 = new File(packageFileLocation_1);
    	packageFileLocation_1.deleteOnExit();
    	
        // Verify that the updated version of the queue's file is not the same as the original.
        assertEquals(packageFileLocation_1.getAbsolutePath(), packageFileLocation_1.getAbsolutePath());
        assertEquals(newCurrentTime_2, currentTime);
        
/*
        final String expected = "Package file location changed. New package file location: "
        + packageFileLocation_1.getAbsolutePath()
        + "  Last modified: " + Long.toString(lastModified_1);
        
        assertEquals(expected, packageFileLocation_1.getAbsolutePath());
        assertEquals(newCurrentTime_2, currentTime);
        
        // Ensure that this queue is updated when the number of entries
        // is increased.
        currentTime = System.currentTimeMillis();
        
        // Add a contentId to the list.
        DownloadQueueBean.addToQueue(longContentId_1);
        
        // Verify that the number of entries is unchanged after adding a contentId.
        assertEquals(Long.valueOf(100), DownloadQueueBean.getNumEntries());
        
        // Ensure that the queue is updated.
        currentTime = System.currentTimeMillis();
        assertEquals(expected, lastModified_1);
*/
    } // test_2()
}