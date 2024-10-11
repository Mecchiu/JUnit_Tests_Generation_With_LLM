// DownloadQueueBean_4Test.java
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
class DownloadQueueBean_4Test {

	/**
	* Test case 1 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_1() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 2 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFileLocation("packageFileLocation");
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 3 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is not null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageURL("packageURL");
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 4 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is false, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_4() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFileCreated();
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 5 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is 0.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_5() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFormat(0);
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 6 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null, packageURL is not null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_6() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFileLocation("packageFileLocation");
		downloadQueueBean.setPackageURL("packageURL");
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 7 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null, packageURL is null, packageModifiedSinceFileCreated is false, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_7() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFileLocation("packageFileLocation");
		downloadQueueBean.setPackageFileCreated();
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 8 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is not null, packageModifiedSinceFileCreated is false, packageFormat is -1.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_8() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageURL("packageURL");
		downloadQueueBean.setPackageFileCreated();
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 9 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is 0.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_9() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFormat(0);
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
	
	/**
	* Test case 10 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null, packageURL is not null, packageModifiedSinceFileCreated is false, packageFormat is 0.
	* The expected result is:
	* packageFileLocation is null, packageURL is null, packageModifiedSinceFileCreated is true, packageFormat is -1.
	*/
	@Test
	public void testClearPackageFileSettings_10() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.setPackageFileLocation("packageFileLocation");
		downloadQueueBean.setPackageURL("packageURL");
		downloadQueueBean.setPackageFormat(0);
		downloadQueueBean.setPackageFileCreated();
		downloadQueueBean.clearPackageFileSettings();
		assertEquals(null, downloadQueueBean.getPackageFileLocation());
		assertEquals(null, downloadQueueBean.getPackageURL());
		assertEquals(true, downloadQueueBean.isPackageModified());
		assertEquals(-1, downloadQueueBean.getPackageFormat());
	}
}