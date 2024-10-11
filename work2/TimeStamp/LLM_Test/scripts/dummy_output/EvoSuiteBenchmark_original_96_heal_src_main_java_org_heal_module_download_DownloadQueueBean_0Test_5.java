// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {
		
	@Test
	void test() {
		DownloadQueueBean tester = new DownloadQueueBean();
		assertTrue(tester.removeAllFromQueue());
		assertFalse(tester.addToQueue("one test"));
		assertTrue(tester.addToQueue("two tests"));
		assertFalse(tester.isQueueEmpty());
	}

}
// DownloadQueueBean_0.java