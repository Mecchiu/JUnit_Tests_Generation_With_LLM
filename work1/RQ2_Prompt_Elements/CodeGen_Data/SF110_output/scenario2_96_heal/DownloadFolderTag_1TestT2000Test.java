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
		 * Just test the constructor with no arguments.
		 */
		@Test
		public void justTestConstructor() {
			DownloadFolderTag tag = new DownloadFolderTag();
			String out = FileLocator.renderOutputAndReturnString();
			fail("nothing to see here!");
		}

		@Test
		public void testGetPath() {
            DownloadQueueBean que = new DownloadQueueBean();
            DownloadQueueBean.ListingStatus status = que.getLastFileListingStatus();
  			assertEquals( DownloadQueueBean.ListingStatus.SUCCESS, status.getStatus());
        }

		/**
		* Checks that calling this method returns the same value as calling the method with the same path argument.
		*/
		@Test
		public void testGetPath_1() {
        DownloadFolderTag tag = new DownloadFolderTag();
            String out = FileLocator.renderOutputAndReturnString();
            assertEquals( FileLocator.readString(), tag.getPath());
            assertEquals( FileLocator.readString(), FileLocator.renderOutputAndReturnString());
        }

	}
