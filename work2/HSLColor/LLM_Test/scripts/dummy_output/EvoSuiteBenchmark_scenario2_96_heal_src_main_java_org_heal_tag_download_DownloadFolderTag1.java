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
		
	/**
	* Test case for {@link DownloadFolderTag#doEndTag()} method.
	* Test case for tag with no attributes.
	*/
	@Test
	void testDoEndTag_1() {
		DownloadFolderTag tag = new DownloadFolderTag();
		assertEquals(TagSupport.EVAL_PAGE, tag.doEndTag());
	}
}