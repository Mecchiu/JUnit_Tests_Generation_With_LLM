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
		private static final String INLINE_PRE = "<p><span class=\"filename\"></span>&nbsp;</p>";

		private static final String INLINE_POST = "<p>&nbsp;<span class=\"filename\"></span></p>";

		private static final String INLINE_PRE_2 = "<p>(<span class=\"filename\"></span>&nbsp;</p>);";

		private static final String INLINE_POST_2 = "<p>(<span class=\"filename\"></span>&nbsp;</p>);";


    @Test
    public void testDoEndTag_shouldNotBeAbleToUseInlineTags() throws Exception {
        DownloadQueueBean downloadQueue =  new DownloadQueueBean();

        String content = "<div>" + INLINE_PRE + INLINE_POST_2 + INLINE_PRE_2 + " </div>";
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(downloadQueue);
        tag.setShortMetadata(new ShortMetadataBean());
        tag.doStartTag();
        tag.resetTag();
    }
}