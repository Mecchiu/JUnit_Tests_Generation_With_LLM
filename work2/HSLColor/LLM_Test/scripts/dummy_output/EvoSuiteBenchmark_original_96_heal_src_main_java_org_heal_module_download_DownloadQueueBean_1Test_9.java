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
		* Create a unit test with the desired test case arguments.
		*/
		static
		{
				// set the URL of the package file to be downloaded
				final String PACKAGE_FILE_LOCATION = "package";

				// set the maximum size of the package in gigabytes
				final int MAX_PACKAGE_SIZE_GB = 10;

				// set any of the constants specified in the
				// interface {@link org.heal.module.DownloadServices}
				// to be used in this class.
				// This should also set any constants for the constants
				// defined in the interface package.
				final DownloadServicesBean[] SCHEME_SUPPORTED
						=  { new DownloadServicesBean_1(PACKAGE_FILE_LOCATION,
												   MAX_PACKAGE_SIZE_GB)};
				// new DownloadServicesBean_1(PACKAGE_FILE_LOCATION,
				// MAX_PACKAGE_SIZE_GB);
		}

		/**
		* Tests if all parameters set for the package file settings
		* and are empty, and the queue is empty.
		*/
		@Test
		public void testIsQueueEmpty() {
				final Collection<String> contentIds = new TreeSet<>();


				// set the set of content identifiers to be created for
				// this package file
				contentIds.add(new String(DownloadServicesBean_1.PACKAGE_FILE_LOCATION));

				// set the expected result
				boolean value = DownloadQueueBean.isQueueEmpty(contentIds);

				// call the protected method, and ensure that the method
				// returns the correct value
				assertTrue(value);
		}

		/**
		* Tests that clearing the queue for a package is not performed
		* if the queue is empty.
		*/
		@Test
		public void testClearingIsQueueNotPerformed() {
				// set the set of content identifiers to be created for
				// this package file
				Collection<String> contentIds;


				contentIds = new TreeSet<>();

				// set the expected result
				contentIds.add(new String(DownloadServicesBean_1.PACKAGE_FILE_LOCATION));

				// set the set of content identifiers to be created for
				// this package file
				contentIds.add(new String(DownloadServicesBean_1.PACKAGE_FILE_LOCATION));

				final Collection<String> packageFileContentIds = new TreeSet<>();

				// set the set of content identifiers to not have been created
				packageFileContentIds.add(new String(ContentID.PACKAGE_FILE));

				// set the expected result
				packageFileContentIds.add(new String(DownloadServiceBean.PACKAGE_FILE_LOCATION));

				// call the protected method, and ensure that we do not
				// invoke the setter or removeFromQueue because
				// of the lack of a return value in this case
				final Collection<String> expectedResult = new TreeSet<>();
				assertNotNull(expectedResult);

				expectedResult.addAll(packageFileContentIds);
				expectedResult.addAll(contentIds);

				// call the protected method, and ensure that it returns
				// the set of expected return value
				assertNotNull(expectedResult);
		}
}