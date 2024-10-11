// DownloadQueueBeanTest.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBeanTest {

	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(-1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(-1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(-1, downloadQueueBean.packageFormat);
	}
}

// DownloadQueueBeanTest.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBeanTest {
		
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(-1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(-1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFileLocation is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageFileLocation_null_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageFileLocation);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageURL is set to null.
	*/
	@Test
	void testClearPackageFileSettings_packageURL_null_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertNull(downloadQueueBean.packageURL);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageModifiedSinceFileCreated is set to true.
	*/
	@Test
	void testClearPackageFileSettings_packageModifiedSinceFileCreated_true_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("test");
		downloadQueueBean.packageURL = "test";
		downloadQueueBean.packageModifiedSinceFileCreated = false;
		downloadQueueBean.packageFormat = 0;
		downloadQueueBean.clearPackageFileSettings();
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* This test case checks if the packageFormat is set to -1.
	*/
	@Test
	void testClearPackageFileSettings_packageFormat_minusOne_3() {
		DownloadQueueBean downloadQueue