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
		 * Unit test case to check the doEndTag method of the {@link
		 * DownloadQueueBean} tag.
		 */
        @Test
    
    public void testDoEndTag_1() {
        DownloadQueueBean dq = new DownloadQueueBean();
        Long download_id = new Long(1l);
        FileLocator f = new FileLocator();
        ShortMetadataBean short_meta = new ShortMetadataBean();
        ShortMetadataBean full_meta = new ShortMetadataBean();
        
        assertFalse(FileLocator.existsAnyFile());
        
        dq.retrieveShortMetadata(sh);
        
        assertNotNull(dq);
        assertEquals(true, FileLocator.existsAnyFile());
        // Check that the new download_id is the same as before
		assertEquals(download_id,
				FileLocator.getLastContentId(dq.getContentCache().getContentId(
						FileLocator.extendingToStartOfName(f.getURL(
						FileLocator.getFileString(f.getURL(download_id),
						"/")).getPath()
	                    )).getId())
		);
        
        dq.addDownloadWithContent("", FileLocator.getFileString(f.getURL(
        		download_id)).getName(), FileLocator.getFileString(f
        		.getURL(download_id)).getContent(), "", file_length, sh
        );
        dq.addDownloadWithLocation("", f.getURL("temp"), f.getFileID(), file_length);
        dq.addDownloadToContentMetadataMap("");
        
        assertEquals(1, dq
               .getContentMetadataMap()
               .size());
        
        dq.retrieveShortMetadata(short_meta);
        
        assertNotNull(dq);
        assertEquals(true, FileLocator.existsAnyFile());
        long expected_id = FileLocator.getLastContentId(new Long(
                FileLocator.getFileString(f.getURL(download_id)).getId())
                );
        long expected_id_with_checksum = FileLocator.getLastContentId(new Long(
                f.getFileID().getId()));
        assertEquals(expected_id,
                FileLocator.getLastContentId(dq.getContentCache().getContentId(
                new Long(file_length).getId())));
        short_meta.setSHAval1("ABCDEF");
        dq.retrieveShortMetadata(full_meta);
        assertEquals(expected_id_with_checksum,
                FileLocator.getLastContentId(
                        dq.getContentCache().getContentId(
                        new Long(new ShortMetadataBean("ABCDEF", "1S").getId())
                ).getId()));
        dq.retrieveShortMetadata(short_meta);
        assertEquals(expected_id,
                FileLocator.getLastContentId(
                        dq.getContentCache().getContentId(
                        new Long(file_length + 3).getId())
                ).getId());
        
	}
}



