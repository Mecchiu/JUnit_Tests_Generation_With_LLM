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
	* It tests the case when the package file settings are not null.
	*/
	@Test
	public void testClearPackageFileSettings_1() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("");
		downloadQueueBean.packageURL = "";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = -1;
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are null.
	*/
	@Test
	public void testClearPackageFileSettings_2() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are not null.
	*/
	@Test
	public void testClearPackageFileSettings_3() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("");
		downloadQueueBean.packageURL = "";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = -1;
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are null.
	*/
	@Test
	public void testClearPackageFileSettings_4() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are not null.
	*/
	@Test
	public void testClearPackageFileSettings_5() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("");
		downloadQueueBean.packageURL = "";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = -1;
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are null.
	*/
	@Test
	public void testClearPackageFileSettings_6() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are not null.
	*/
	@Test
	public void testClearPackageFileSettings_7() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("");
		downloadQueueBean.packageURL = "";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = -1;
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are null.
	*/
	@Test
	public void testClearPackageFileSettings_8() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are not null.
	*/
	@Test
	public void testClearPackageFileSettings_9() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = new File("");
		downloadQueueBean.packageURL = "";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = -1;
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
	
	/**
	* Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	* It tests the case when the package file settings are null.
	*/
	@Test
	public void testClearPackageFileSettings_10() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		boolean result = downloadQueueBean.clearPackageFileSettings();
		assertTrue(result);
	}
}