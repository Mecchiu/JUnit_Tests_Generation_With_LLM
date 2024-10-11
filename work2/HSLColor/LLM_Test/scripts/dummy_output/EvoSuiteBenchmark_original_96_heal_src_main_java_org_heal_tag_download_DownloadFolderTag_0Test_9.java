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
		
    private final String filename = "DownloadFolderTags.txt";
    private final String shortMetadataContent = 
	"download: file-1_file_8.jpg v2_v2 0.0.0\n" +
				"description: This description is stored in a file with a different name than the one in the other test file.\n" +
				"file-1_file_9.jpg v2_v2 0.0.0\n" +
				"description: This description is stored in a different file with the same name as the file in the first test file.\n"+
				"file-2_file_10.jpg v2_v2 0.0.0\n" +
				"description: This description is stored in a different file with the same name as the file in the second test file.\n" +
				"file-3_file_11.jpg v2_v2 0.0.0\n" +
				"description: This description is stored in a different file with the same name as the file in the third test file.\n"+
				"";

    /**
     * Test to ensure that an {@linkplain DownloadQueueBean.TagBean} implements the necessary interface.
     */
    @Test
    void fileBeanExistsTest1() {
        String queueName = "queue1";
        DownloadQueueBean queueBean = FileLocator.getSystemBean(queueName);
        assertNotNull("Queue object is null for queue named " + queueName, queueBean);
}
}