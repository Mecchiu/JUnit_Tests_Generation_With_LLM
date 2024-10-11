// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {
		
	@Test
	public void test() {
		DownloadQueueBean bean = new DownloadQueueBean();
		assertEquals("Count", 0, bean.getNumEntries());
		bean.clearPackageFileSettings();
		assertEquals("Count", 0, bean.getNumEntries());
		File testFile = new File("/tmp/DownloadQueueBean_1Test__.txt");
		Collection collection = new TreeSet();
		try (FileOutputStream fos = new FileOutputStream(testFile)) {
			while (collection.size() < 120) {
				collection
						.add(CollectionTools.mapListToObj(bean.getContentIds(), "content id"));
			}
		}
		assertEquals("Size is", 120, collection.size());
		bean.clearPackageFileSettings();
		assertEquals("Size is", 0, collection.size());
		collection
				.add(CollectionTools.mapListToObj(bean.getContentIds(), "content id"));
		assertEquals("Size is", 120, collection.size());
		collection = new TreeSet();
		collection
				.add(CollectionTools.mapListToObj(bean.getContentIds(), "content id"));
		collection.removeAll(collection);
		assertNull("Remove all does not return null", collection);
	}
		
}