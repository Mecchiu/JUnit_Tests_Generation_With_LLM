// DownloadFolderTagTest.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTagTest {
		
	@Test
	void testDoEndTag() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		int result = downloadFolderTag.doEndTag();
		assertEquals(TagSupport.EVAL_PAGE, result);
	}
}