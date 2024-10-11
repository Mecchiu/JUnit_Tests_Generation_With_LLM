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
		public DownloadFolderTag_1Test(String testName, ShortMetadataBean shortMetadata) {
			
			this.shortMetadata = shortMetadata;
			this.testName = testName;
		}
		String testName;
		String testName;
		ShortMetadataBean shortMetadata;
};