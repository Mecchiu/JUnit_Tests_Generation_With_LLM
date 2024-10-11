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
		 * Tests that the method {@link DownloadFolderTag#doStartTag()} returns {@link #UNAVAILABLE
		 * DownloadQueueBean.DEFAULT} when no attributes specified.
		 */
  @Test
    public void testStartTagUNAVAILABLE() {
        
        DownloadQueueBean tag = new DownloadQueueBean();
        tag.setUrl(FileLocator.getServer());
        try {
            tag.doStartTag();
            fail("Exception expected for doStartTag(). Unexpected success result.");
        } catch (RuntimeException e) {
            
        }
			assertEquals("Unexpected value for downloadFolderType of download folder tag",
                        DownloadQueue.DEFAULT.getDownloadQueue(),
                        tag.getDownloadQueue());
			assertEquals("Unexpected value for shortMetadata of download folder tag",
                        Long.valueOf(ShortMetadataBean.DEFAULT.getMetadata()),
                        tag.getShortMetadata());
			assertEquals("Unexpected value for getDownloadQueue() of download folder tag",
                        Short.valueOf("DEFAULT_SEARCH"),
                        tag.getDownloadQueue());
		}

		/**
		 * Tests that the method {@link DownloadFolderTag#doStartTag()} returns {@link #ADD} when 
        * the attributes specify a download folder to add a file.
		 */
    @Test
    public void testAttachFile_1_ADD() {
        
        DownloadQueueBean tag = new DownloadQueueBean();
        DownloadQueueBean tag_1 = new DownloadQueueBean();
        
        tag.setUrl(FileLocator.getServerApi("testFiles/unavailA1.txt"));
        tag_1.setUrl(FileLocator.getServerApi("testFiles/unavailA2.txt"));
        
        tag.doStartTag();
        tag_1.doStartTag();
        
        int result = tag.getDownloadQueue().addFile(tag_1.getUrl(), tag_1.getShortMetadata().getMetadata());
        
        assertEquals("Unexpected value for downloadQueue of download folder tag",
                0,
                tag.getDownloadQueue().getDownloadQueue());
		assertEquals("Unexpected value for shortMetadata of download folder tag",
                        Short.valueOf(ShortMetadataBean.DEFAULT.getMetadata()),
                        tag.getShortMetadata());
		assertEquals("Unexpected value for getDownloadQueue() of download folder tag",
                        Short.valueOf("DEFAULT_SEARCH_FAILED"),
                        tag.getDownloadQueue());
		assertEquals("Unexpected value for downloadFolderType of download folder tag",
                DownloadQueueBean.ADD,
                tag.getDownloadFolderType());
		assertFalse("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getShortMetadata().isErrorTag()));
		assertTrue("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getDownloadFolderType() == ADD));
        assertFalse("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getShortMetadata().isErrorTag()));

        result = tag.getDownloadQueue().removeFile(tag_1.getUrl(), tag_1.getShortMetadata().getMetadata());
        assertEquals("Unexpected value for downloadQueue of download folder tag",
                0,
                tag.getDownloadQueue().getDownloadQueue());
		assertEquals("Unexpected value for shortMetadata of download folder tag",
                        Short.valueOf(ShortMetadataBean.DEFAULT.getMetadata()),
                        tag.getShortMetadata());
		assertEquals("Unexpected value for getDownloadQueue() of download folder tag",
                Short.valueOf("DEFAULT_SEARCH_FAILED"),
                tag.getDownloadQueue());
		assertFalse("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getShortMetadata().isErrorTag()));
		assertFalse("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getDownloadFolderType() == ADD));
		assertTrue("Unexpected value for isErrorTag attribute of download folder tag",
                (tag.getShortMetadata().isErrorTag()));
    }

		/**
		 * Tests that the method {@link DownloadFolderTag#doStartTag()} returns {@link #UNAVAILABLE} when not
        * any attributes specified.
		 */
    @Test
    public void testAttachFile_2() {
        
        DownloadQueueBean tag = new DownloadQueueBean();
        DownloadQueueBean tag_1 = new DownloadQueueBean();
        
        tag.setUrl(FileLocator.getServerApi("testFiles/unavailA1.txt"));
        tag.setUrl(FileLocator.getServerApi("testFiles/unk2.txt"));
        
        tag_1.setUrl(FileLocator.getServerApi("testFiles/unavailA2.txt"));
        
        tag.doStartTag();
        tag_1.doStartTag();
        
        tag.getDownloadQueue().addFile(tag.getUrl(), tag.getShortMetadata().getMetadata());
}
}