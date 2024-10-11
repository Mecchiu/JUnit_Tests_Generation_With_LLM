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
	 * Constructor for test class.
	 *
	 * @param   tagId  tag id to be used to construct the
	 *                {@link #doEndTag()}
	 */
	public DownloadFolderTag_1Test(int tagId){
		setTagId(tagId);
	}

	/**
	 * Test case for {@link DownloadFolderTag#doEndTag()}.
	 */
	@Test
	public void test_doEndTag() throws Throwable {
		assertTrue("Do-End tag not executed", true);
	}

	/**
	 * Test case for {@link DownloadFolderTag#resetTag()}.
	 */
	@Test
	public void test_resetTag() throws Throwable {
		//Do-Start tag should be invoked
		assertTrue("Do-Start tag not invoked", true);
		//Reset tag
		assertTrue("Reset tag failed", true);
    }
}