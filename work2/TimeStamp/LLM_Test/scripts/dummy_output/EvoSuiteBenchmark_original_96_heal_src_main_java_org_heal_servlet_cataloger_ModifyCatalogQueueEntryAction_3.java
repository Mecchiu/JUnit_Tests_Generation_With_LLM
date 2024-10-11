// ModifyCatalogQueueEntryActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.FileLocator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyCatalogQueueEntryAction}.
* It contains one unit test case for the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyCatalogQueueEntryActionTest {
		/**
		 * An empty queue with the metadata and a value for
		 * {@link HaldMetadataService#addMetadata(File) adding}.
		 */
        private static final QMItemWithMetadata
                ITEM_INITIAL =  new QueuedRecordBean("test_item_name", "test_queued", 0l, 2l, "santa", "salmono", "french", false);

        /**
        * A file that is a content encoded with gz-1+4, which is a zipped
        * value encoded in gz-16+5<br/>
        * <br/>
        *
        * <code>
        * /tmp/test.gz(1+, 4,"santa", "salmono", "french", false)
        * </code>
        *
        */
        private static final String RAW_FILE_CONTENT = "/tmp/test.gz(1+, 4," +
                                                      "salmono," +
                                                      "'french'," +
                                                      "false)";


  /**
     * Creates a dummy test class for file copying to a file location.
     */
    @Test
    public void testCopyFile() throws Exception {
        File f = FileLocator.getFile(ITEM_INITIAL.getSourceFile());
        copyFile(f, HaldMetadataService.DEFAULT_FILE_PATH);
        assertTrue("Should be a file",
                FileLocator.checkFile(HaldMetadataService.DEFAULT_FILE_PATH, f.getName()));
    }

	/**
	 * Sets up the test.
	 */
	@Test
	public void testCreateQueueEntry() throws SQLException,
			IOException {
	    HaldMetadataService.createMetadata(ITEM_INITIAL.getSourceFile(), new File(
	            FileLocator.getFile(RAW_FILE_CONTENT)));
   
	    queued.add(ITEM_INITIAL);
	    queuedDao.createQueue(queued);

	    assertNotNull("The queue should now exist",
			    queuedDao.getQueue(queued.key()));

	    addLong(queued.key(), "value", 1l);

	    List<QueuedRecordBean> listItem = this.queuedDao.getQueueList(queued.key());
	    assertEquals("The size of the queue should be 1",
			listItem.size(), 1);



	    QMItemWithMetadata itemFromFile = new QMItemWithMetadata();

	    File f = FileLocator.getFile(ITEM_INITIAL.getSourceFile());
	    itemFromFile.initializationFromMetadata(f);

        String expectedContent;

        expectedContent = createDummyContent();
        assertEquals("Should be the string that will be copied into the file",
                    expectedContent, itemFromFile.stringContent());



	    listItem = this.queuedDao.getQueueList(queued.key());

	    assertEquals("The size of the queue should be 1",
			listItem.size(), 1);

	    File f2 = FileLocator.getFile(ITEM_INITIAL.getSourceFile());

	    assertTrue("Should not be an empty queue",
			f2.isFile());


	    itemFromFile.finalizeMetadata();
	    itemFromFile.finalize();
	    itemFromFile.getInitialization();



	    // Verify that this item has the right values.
	    List<String> values = itemFromFile.values();
	    assertEquals("Wrong number of values",
			   values.size(), 2);

	    assertEquals("Wrong value 1",
			values.get(0),
			"santa");
	    assertEquals("Wrong value 2",
			values.get(1),
			"french");

	    QMItemWithMetadata itemFromFile2 = new QMItemWithMetadata();

	    f2 = FileLocator.getFile(ITEM_INITIAL.getSourceFile());
	    itemFromFile2.initializationFromMetadata(f2);

	    final File f3 = FileLocator.getFile("santa");
            String s3 = FileLocator.getFile("santas");

	    assertTrue("Should not be an empty queue",
			f3.isFile());

	    itemFromFile2.finalizeMetadata();


        assertEquals("Wrong number of values",
		    values.size(), 3);

        assertEquals("Wrong value 1",
			values.get(2),
			"salmono");
	    assertEquals("Wrong value 2",
		    values.get(1),
		    "french");

        queued.add(itemFromFile2);

        assertNotNull("Queue should now have a value",
                      queued.remove(itemFromFile2.getKey()));


	    List<QueuedRecordBean> listItem2 = this.queuedDao.getQueueList(queued.key());
}
}