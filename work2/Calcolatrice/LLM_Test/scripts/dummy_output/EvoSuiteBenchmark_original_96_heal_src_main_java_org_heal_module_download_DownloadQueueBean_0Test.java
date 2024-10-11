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
	 * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}.
	 * The test method expects to access it as a public field.
	 * The parameter is not a property in case changes to package url
	 * and format (and thus is not a method of {@link DownloadQueueBean.DownloadQueueBean}), thus the parameter
	 * is expected to be a string;
	 * @throws Exception
	 */
	@Test
	public void testForcletheQueueContents() throws Exception {
		String packageFileLocation = "C:\\TempFile";
		String packageURL = "jar:.\\jar.pom";
		
		TreeSet contentIds = new TreeSet();
		contentIds.add(DownloadServicesBean.FILECONTENT_MAIN);
		packageFileLocation = packageFileLocation + ".";

		//set up the test object
}
}