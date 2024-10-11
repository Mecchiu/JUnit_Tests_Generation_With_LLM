// DownloadFolderTag_0Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {
		/** Test method for {@link DownloadFolderTag#doStartTag()}. */
		@Test
		public void testDoStartTag() {
				FileLocator localFile = FileLocator.createFileLocator(new File(FileLocator.LOCAL_DIR,
								FileLocator.DIR_TAG + '/' + "DownloadFolderTag_0Test"));
				if (!localFile.exists()) {
						fail("Locator not created");
				}
				DownloadFolderTag _Tag = new DownloadFolderTag();
				TagSupport _TagParent = _Tag.doStartTag();
				assertThat(_TagParent instanceof DownloadFolderTag);
		}

		/** Test method for {@link DownloadFolderTag#doEndTag()}. */
		@Test
		public void testDoEndTag() {
				DownloadFolderTag _Tag = new DownloadFolderTag();
				TagSupport _TagParent = _Tag.doEndTag();
				assertThat(_TagParent instanceof TagSupport);
		}
}