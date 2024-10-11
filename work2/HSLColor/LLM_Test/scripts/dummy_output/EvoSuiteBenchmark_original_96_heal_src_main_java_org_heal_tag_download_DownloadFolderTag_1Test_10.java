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
		private static final String BASE_URL = "/heal/download/";

	/**
	 * Unit tests of {@link DownloadFolderTag#doEndTag()} in this class.
	 */
	@Test
	public void testDoEndTag() {
		DownloadFolderTag tag = new DownloadFolderTag();

		assertEquals(UNKNOWN, tag.getDownloadFolderType());

		// Do this to ensure that the next tags value is set.
		tag.setDownloadFolderType((Integer) null);
		assertEquals(UNKNOWN, tag.getDownloadFolderType());
		assertEquals(UNKNOWN, tag.getDownloadFolderType());

		tag.setDownloadQueue((DownloadQueueBean) null);
		assertNull(tag.getDownloadQueue());
		assertEquals(unavailable, tag.getDownloadFolderType());

		tag.setShortMetadata((ShortMetadataBean) null);
		assertNull(tag.getShortMetadata());
		assertEquals(unavailable, tag.getDownloadFolderType());

		tag.setDownloadQueue(null);
		assertNull(tag.getDownloadQueue());
		assertEquals(unavailable, tag.getDownloadFolderType());

		tag.setShortMetadata(new ShortMetadataBean(0l,
                new ShortMetadataBean(0l, 0l, null),
                new ShortMetadataBean(0l, null, null),
                0l));
		assertNull(tag.getShortMetadata());
		assertEquals(unavailable, tag.getDownloadFolderType());

		tag.setDownloadQueue(null);
		assertNull(tag.getDownloadQueue());
		assertEquals(unknown, tag.getDownloadFolderType());
	}

	@Test
	public void testAttributeValues() {
		long dq = 500;

		assertEquals(unknown,
				DownloadQueueBean.getDownloadQueue(dq));
		assertNull(DownloadQueueBean.getDownloadQueue((Long) null));

		assertEquals(unavailable,
				DownloadQueueBean.getDownloadQueue(0));
		assertNull(DownloadQueueBean.getDownloadQueue((Long) null));

		assertEquals(unknown,
				FileLocator.getFileDownloadQueue(BASE_URL));
		assertNull(FileLocator.getFileDownloadQueue(BASE_URL + "_" + BaseDirectoryTag.ROOT));
		assertNull(FileLocator.getFileDownloadQueue(BASE_URL + ".root"));

		assertEquals(unknown,
				FileLocator.getFileDownloadQueue(BASE_URL + "/files.root"));
		assertNull(FileLocator.getFileDownloadQueue(BASE_URL + "/files.root/"));
	}
}