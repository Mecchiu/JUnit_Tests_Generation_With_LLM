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
	 * Empty constructor
	 * It constructs a {@link DownloadQueueBean_1Test} without any information.
	 * Always return true.
	 */
	public boolean isAllFieldSet() {
		return true;
	}
	/**
	 * Method which is to clear all package file content
	 * It's called from {@link #isAllFieldSet()} return false.
	 * Always return true.
	 */
	public boolean clearPackageFileSettings() {
		packageFileLocation = null;
		packageFile = null;
		packageModifiedSinceFileCreated = true;
		packageFormat = -1;
		return true;
	}
	/**
	 * Test method of {@link DownloadQueueBean} with a collection of files.
	 * It contains one unit test case for the
	 * {@link DownloadQueueBean#clearPackageFileSettings()} method.
	 *
	 * @see org.junit.jupiter.api.Assertions#assertEquals
	*/
	@Test
	public void testSetCollection() {
		DownloadQueueBean _dqq = new DownloadQueueBean_1();

		Collection<File> files = new TreeSet<File>();
		int numFound = 0;
		files.clear();
		files.add(new File("somewhere-that-does-not-exist.jpg"));
		files.add(new File("somewhere-that-does-not-exist.jpg"));
		files.add(new File("somewhere-that-does-not-exist.jpg"));
		files.add(new File("somewhere-that-does-not-exist.jpg"));
		files.add(new File("somewhere-that-does-not-exist.png"));
		files.add(new File("somewhere-that-does-not-exist.png"));

		do {
			numFound++;
			File f = ((File)files.remove(numFound));
			files.add(f);
			f = ((File)f.getParentFile());
		} while ( (f!= null) && files.size() < 100 );
		
		_dqq.packagePaths = files;
		_dqq.save();

		assertEquals(files.size(), _dqq.packagePaths.size());
	}
}
