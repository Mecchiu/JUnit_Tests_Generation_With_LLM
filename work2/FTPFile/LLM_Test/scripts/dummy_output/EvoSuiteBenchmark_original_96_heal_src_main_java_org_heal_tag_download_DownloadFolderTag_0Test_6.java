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
		
	/**
	 * A unit test case that should test the parsing of a
	 * {@link DownloadQueueBean} object.
	 */
	@Test
	void test() {
		DownloadQueueBean q = new DownloadQueueBean();
		
		assertNotNull( FileLocator.get(q, "java:/org.apache.taglibs.http.HttpTag", (String) null).getContentAsText());
		assertFalse( FileLocator.get(q, "java:/org.apache.taglibs.http.HttpTag", (String) null).isEncodingDisabled());
		
	}
	
}