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
	 * It tests the case when the package file is not set.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_1() {
		DownloadQueueBean bean = new DownloadQueueBean();
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_2() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_3() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_4() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_5() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set and the package file is set again.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_6() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set and the package file is set again and the last modified date is set again.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_7() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set and the package file is set again and the last modified date is set again and the package url is set again.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_8() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set and the package file is set again and the last modified date is set again and the package url is set again and the queue is set again.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_9() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		assertTrue(bean.clearPackageFileSettings());
	}
	
	/**
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 * It tests the case when the package file is set and the last modified date is set and the package url is set and the queue is set and the package file is set again and the last modified date is set again and the package url is set again and the queue is set again and the package file is set again.
	 * Expected result: true.
	 */
	@Test
	void testClearPackageFileSettings_10() {
		DownloadQueueBean bean = new DownloadQueueBean();
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		bean.setLastModified(System.currentTimeMillis());
		bean.setPackageUrl("http://test.com/test.zip");
		bean.setQueue(new TreeSet<String>());
		bean.setPackageFile(new File("test.zip"));
		assertTrue(bean.clearPackageFileSettings());