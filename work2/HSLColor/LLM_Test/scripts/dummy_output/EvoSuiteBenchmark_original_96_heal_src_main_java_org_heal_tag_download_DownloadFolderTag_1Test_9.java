// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {
		/**
		 * Tests the behavior of the constructor.
		 *
		 * @throws Exception if an unexpected exception occurs.
		 */
		@Test
		public void getDownloadFolderType() throws Exception {

			DownloadQueueBean downloadQueue = new DownloadQueueBean(
			    // The default is UNKNOWN which means "the queue is unavailable"
					  DownloadQueueBean.FAVORITE,
                    ShortMetadataBean.RELEVANT_METADATA_LOCATION );

			DownloadFolderTag tester = new DownloadFolderTag();
			int downloadFolder = tester.getDownloadFolderType();
			assertEquals("Unexpected value of download folder type.",
					DownloadQueueBean.FAVORITE, downloadFolder);

			ShortMetadataBean shortMetadata1 = tester.getShortMetadata();
			assertNull("Tag is not null.", shortMetadata1);
		}

		/**
		 * Tests the behavior of getShortMetadata.
		 *
		 * @throws Exception if an unexpected exception occurs.
		 */
		@Test
		public void getShortMetadata() throws Exception {

			ShortMetadataBean shortMetadata1 = new ShortMetadataBean();
			assertNull("Tag is not null.", shortMetadata1);

			this.shortMetadata = this.buildShortMetadataBean();
			assertEquals("Tag is not equal.",
				this.shortMetadata, shortMetadata1);

			ShortMetadataBean shortMetadata2 = new ShortMetadataBean();
			shortMetadata2.setContentMetadata("test");
			assertEquals("Content does not match.",
				shortMetadata1, shortMetadata2);

			DownloadQueueBean downloadQueue = new DownloadQueueBean(
				// The default is UNKNOWN which means "the queue is unavailable"
				   ShortMetadataBean.RELEVANT_METADATA_LOCATION, shortMetadata1
				);
			assertEquals("DownloadQueueBean's shortMetadata returns incorrect short metadata.",
				shortMetadata1, downloadQueue.getShortMetadata());
		}

		/**
		 * Tests the behavior of buildShortMetadataBean.
		 *
		 * @throws Exception the exception
		 */
		private void makeTestException() throws Exception {
			ShortMetadataBean shortMetadata = new ShortMetadataBean();

			shortMetadata.setContentMetadata("test");

			assertThrows(RuntimeException.class, () -> {
				new FileLocator(this.shortMetadata.getContentMetadataVersion(),
					this.shortMetadata.getContentLocation());
			});
		}

		private ShortMetadataBean buildShortMetadataBean() {
			return new ShortMetadataBean(ShortMetadataBean.RELEVANT_METADATA_1);
		}

        private String getContentMetadata() {
            return "test";
        }

		private void makeTestException() throws Exception {
			try {
				new FileLocator(getContentMetadata(), (String) null);
				fail("The method should have thrown an exception. ");
			} catch (IllegalArgumentException ex) {
				assertTrue("Message missing.",
					"When content metadata was <string> NULL</string> it should have been <URL>http://example.com/1.html</URL>.");
			}
			this.shortMetadata = this.buildShortMetadataBean();
		}
}