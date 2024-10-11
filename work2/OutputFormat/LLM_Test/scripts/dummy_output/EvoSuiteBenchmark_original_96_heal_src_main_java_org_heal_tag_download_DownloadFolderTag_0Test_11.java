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
		
	@Test
	public void testTag() {

		DownloadFolderTag tag;
		tag = new DownloadFolderTag();
		tag.setDownloadQueue(null);
		tag.setShortMetadata(null);
		tag.setDownloadFolderType(UNKNOWN);
		tag.setDownloadQueue(new DownloadQueueBean("/var/www/my/sub/my/files", 30));
		tag.setDownloadQueue(new DownloadQueueBean("/var/www/my/sub/my/files", 24));
		tag.setDownloadQueue(new DownloadQueueBean("DownloadQueueBean.downloadQueue=true", 15));

		tag.doStartTag();

		assertEquals("Expected no download and no short metadata.",
				UNKNOWN,
				tag.getDownloadFolderType());

		tag.doEndTag();

		// Should not return this yet


		assertEquals(
				"Expected no download and no short metadata.",
				UNKNOWN,
				tag.getDownloadFolderType());

		tag.resetTag();

	}
}
*/