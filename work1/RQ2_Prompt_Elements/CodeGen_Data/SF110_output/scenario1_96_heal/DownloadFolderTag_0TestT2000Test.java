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
// DownloadFolderTag.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * A tag which is basically acts as a container for attributes which
 * nested tags will utilize.
 *
 * @version 1.0
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 * @see org.heal.tag.download.DownloadFolderActionTag
 */
public class DownloadFolderTag extends TagSupport {

    public int doStartTag() {
        FileLocator locator = (FileLocator) pageContext.getServletContext().getAttribute("healFileLocator");
        if ("web page".equals(shortMetadata.getFormat().toLowerCase()) ||!shortMetadata.getLocation().toLowerCase().startsWith(locator.getServerBaseURL())) {
            if ("image".equals(shortMetadata.getFormat().toLowerCase())) {
                downloadFolderType = REMOTE_IMAGE;
            } else {
                downloadFolderType = UNAVAILABLE;
            }
        } else if (downloadQueue.isQueuedAlready(shortMetadata.getMetadataId())) {
            downloadFolderType = REMOVE;
        } else {
            downloadFolderType = ADD;
        }
        return TagSupport.EVAL_BODY_INCLUDE;
    }
}

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
		public DownloadFolderTag_0Test() {
			// Test constructor.
		}

		@Test
		public void testTag() throws Exception {
			shortMetadata.setLocation("somelocation");
            Thread.currentThread().sleep(300);
			DownloadQueueBean queue = DownloadQueueBean.createWithoutStartingServer(7, true);
			shortMetadata.setDownloadQueue(queue);
			shortMetadata.setFormat("txt");
			shortMetadata.setLocation("somelocation");
			shortMetadata.setLastUpdated("2010-05-24T15:57:42Z");
            Thread.currentThread().sleep(300);
			ShortMetadataBean newMetadata = FileLocator.createFrom(queue, new ByteArrayInputStream("Some new content".getBytes()), DownloadQueueBean.BLANK);
            assertNotNull("Some new content (should be available)", newMetadata);
			assertTrue("Download queue should not be queued yet",!queue.isQueuedAlready(newMetadata.getMetadataId()));

			DownloadFolderTag tag = new DownloadFolderTag();
			tag.setShortMetadata(shortMetadata);

			TagSupport.EVAL_BODY_INCLUDE(tag, null);
			//System.err.println(newMetadata);
			assertEquals(shortMetadata, newMetadata);
			assertNull(tag.getPagePath("/whatever"));
		}
        FileLocator f = new FileLocator("filelocator");
        assertTrue("filelocator returned unexpected value", f==null || f.path().compareTo("filelocator")<0);
        
		FileLocator.CUSTOM_EXTENSIONS_PATTERN = "*.png";
		
        TagSupport.CUSTOM_EXTENSIONS_PATTERN = "*.htm";
}
