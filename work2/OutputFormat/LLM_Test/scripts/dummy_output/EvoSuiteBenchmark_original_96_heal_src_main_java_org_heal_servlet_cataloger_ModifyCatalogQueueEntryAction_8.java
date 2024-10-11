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
		
	@Test
	void testActionRequiresLoginWithNoParameters() throws SQLException, FileNotFoundException, IOException {
		String originalFileLocation = 
				FileLocator.getFile().getUniqueFileWithName("originals");
        assertNotNull(originalFileLocation);
		String destination = FileLocator.getFile().getUniqueFile();
        assertNotNull(destination);

		// create a dummy catalog
		String catalogLocation = 
				FileLocator.getFile().getUniqueFileWithName("catalog.json");
		assertNotNull(catalogLocation);
        File catalogFile = new File(catalogLocation);
        assertTrue(catalogFile.exists());

		// update the catalog
		FileInputStream catalogInputStream = new FileInputStream(catalogFile);
        CatalogsUtils.updateCatalog(catalogInputStream);

        // ensure that no catalog is created yet
        assertNull(new File(originalFileLocation));
        assertNotNull(new File(destination));
        
		// add a short record to the catalog
		ShortMetadataBean shortMetadataBean = new ShortMetadataBean("shortID1", "shortDescription1");
		shortMetadataBean = (ShortMetadataBean)MetadataDAO
				.create(shortMetadataBean);
		assertNotNull(shortMetadataBean);
		assertEquals("shortID1", shortMetadataBean.getShortID());
		assertEquals("short Description 1", shortMetadataBean.getShortDescription());

		// add and get record to the catalog
		long queuePosition1 = new Long(1);
		long queuePosition2 = new Long(2);
		QueuedRecordBean queuedRecordBean = new QueuedRecordBean(queuePosition1, queuePosition2);
		queuedRecordBean = (QueuedRecordBean)MetadataDAO
               .addMetadataToQueue(MetadataDAO.PUBLISHED, longToString(queuePosition1));
		assertNotNull(queuedRecordBean);
		assertEquals("original", longToString(queuePosition1));
		assertEquals("original description", longToString(queuePosition2));
		assertNotNull(queuedRecordBean);

        // ensure that the catalog is now empty
        assertEquals(0, new File(originalFileLocation).length());

        // check the catalog of the removed record
        assertDoesNotExist("nonexistent catalog", "originals");

		// add record with newer update
		catalogFile = new File(catalogLocation);
		int updateSize = catalogFile.length();
		FileOutputStream catalogOutputStream = new FileOutputStream(catalogFile);
        catalogOutputStream.write(longToStringBytes(queuePosition1).getBytes());
        catalogOutputStream.write(longToStringBytes(queuePosition2).getBytes());
        catalogOutputStream.close();

		// update the catalog
        CatalogsUtils.updateCatalog(catalogInputStream);

        // ensure that the catgalog is now empty
        assertEquals(updateSize, new File(originalFileLocation).length());
        
        // confirm update
        assertNotNull(new File(originalFileLocation).length());
	}

		// Add a record for modification which should cause an update
		// to be created for this record
		private String longToString(long value) {
            return ("{\"recordID\":\""
            								+ String.format("%010d", value)
            								+ "\","
            								+ "\"newRecordId\":\""
            								+ String.format("%010d", value)
            								+ "\","
            								+ "\"newID\":\""
            								+ String.format("%010d", value)
            								+ "\"}");
    	}
}