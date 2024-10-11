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
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {

	/**
	* Test case 1 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_1() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = null;
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 2 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_2() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 3 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_3() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 4 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_4() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 5 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_5() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 6 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_6() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBean.packageURL);
		assertTrue(downloadQueueBean.packageModifiedSinceFileCreated);
		assertEquals(1, downloadQueueBean.packageFormat);
	}
	
	/**
	* Test case 7 for method clearPackageFileSettings.
	* The test case aims to test the method under the following conditions:
	* packageFileLocation is not null.
	* It should pass the test.
	*/
	@Test
	public void testClearPackageFileSettings_7() {
		// Arrange:
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		downloadQueueBean.packageFileLocation = "C:\\Users\\user\\Desktop\\test.txt";
		downloadQueueBean.packageURL = "http://www.google.com";
		downloadQueueBean.packageModifiedSinceFileCreated = true;
		downloadQueueBean.packageFormat = 1;
		
		// Act:
		boolean result = downloadQueueBean.clearPackageFileSettings();
		
		// Assert:
		assertTrue(result);
		assertNull(downloadQueueBean.packageFileLocation);
		assertEquals("http://www.google.com", downloadQueueBe