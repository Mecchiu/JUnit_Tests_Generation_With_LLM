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

	/**
	 * Removes all entries from the queue
	 */
	@Test
	void removeAllFromQueue() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertNoneNull("should not remove from queue object", obj.removeQueue());
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#isQueuedAlready(String)} method
	 */
	@Test
	void isQueuedAlreadyTest() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertTrue("isQueuedNotAlready should return true", obj.isQueuedAlready("id"));
		assertFalse("isQueuedNotAlready should return false", obj.isQueuedAlready("id-2"));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#isQueuedAlready(String, String, boolean)}   method
	 */
	@Test
	void isQueuedAlreadyWithStringStringBooleanTest() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertTrue("isQueuedNotAlready should return true", obj.isQueuedAlready("id", "file",  (byte)5));
		assertFalse("isQueuedNotAlready should return false", obj.isQueuedAlready("id", "file",  0));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#isQueuedAlready(String, String, boolean)}   method (2)
	 */
	@Test
	void isQueuedAlreadyWithStringStringBooleanTest2() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertFalse("isQueuedNotAlready should return false", obj.isQueuedAlready("id", "file", (byte)5));
		assertTrue("isQueuedNotAlready should return true", obj.isQueuedAlready("id", "file",  (byte)5));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#addToQueue(String)} method
	 */
	@Test
	void addToQueuTest() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertFalse("addQueueNotQueued should be false", obj.addToQueue("id"));
		assertFalse("addQueueNotQueued should be false", obj.addToQueue("1"));
		assertTrue("addQueueNotQueued should return true", obj.addToQueue("2"));
		assertFalse("addQueueNotQueued should be true", obj.addToQueue("id-2"));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#addToQueue(String, byte)} method
	 */
	@Test
	void addToQueuTestWithByte() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertFalse("addQueueNotQueued should be false", obj.addToQueue("id", (byte)5));
		assertFalse("addQueueNotQueued should be false", obj.addToQueue("1", (byte)5));
		assertTrue("addQueueNotQueued should return true", obj.addToQueue("2", (byte)5));
		assertFalse("addQueueNotQueued should be true", obj.addToQueue("id-2", (byte)5));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#addToQueue(String, String)} method
	 * with both a null and a null id.
	 */
	@Test
	void addToQueueNullIdNull() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertFalse("id-null should be false", obj.addToQueue("1", (String)null));
		assertFalse("id-null should be false", obj.addToQueue("2", (String)null));
	}
	
	/**
	 * Tests the {@link DownloadQueueBean#containsContentPID()} method
	 */
	@Test
	void containsContentPID() {
		DownloadQueueBean obj = new DownloadQueueBean();
		assertFalse("should not contain empty content id", obj.containsContentPID());
	}

