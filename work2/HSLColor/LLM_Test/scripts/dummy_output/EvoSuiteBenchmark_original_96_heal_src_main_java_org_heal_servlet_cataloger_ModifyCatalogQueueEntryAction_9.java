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
     * Tests whether a catalog entry that has a new name and a new description is successfully updated in the database.
     * It is created in a directory specified in {@link FileLocator#catalogEntryDirectoryFile()}.
     * @throws SQLException
     */
    @Test
	public void testUpdateCatalogEntry() throws Exception {
		
		// Open catalog file
		String[] catalogs = FileLocator.catalogEntryDirectoryFile().list(false);
		assertEquals(1, catalogs.length);
		assertTrue(catalogs[0]!= "");
		// Create test catalog
		File catalogFile = FileLocator.getTestDirectoryFile();
		FileUtils.copyFile(catalogFile, new File(FileLocator.getTestDirectoryFile()));
		
		// Login and add new catalog
		String currentUserName = SessionTools.getCurrentUsername();
		session = new LoginServletTest("NewUser", currentUserName, "admin", "admin");
		
		MetadataDAO dao = new MetadataDAO();		
		
		// Create metadata set
		ShortMetadataBean existingShortMetadata = dao.newShortMetadata(ShortMetadataBeanTest.EXISTING_SHORT_METADATA);
		existingShortMetadata.setId(ShortMetadataBeanTest.NEW_ID);
		existingShortMetadata.addDescription(ShortMetadataBeanTest.NEW_DESCRIPTION);
		
		// Create long metadata set
		ShortMetadataBean newLongMetadata = new ShortMetadataBean();
		newLongMetadata.setId(LongMetadataBeanTest.NEW_ID);
		newLongMetadata.setDescription(LongMetadataBeanTest.NEW_DESCRIPTION);
		dao.addShortMetadata(newLongMetadata);
		
		// Add new metadata to catalog
		boolean addedMetadata = dao.addOldMetadata(existingShortMetadata);
		assertTrue(addedMetadata);
		
		QCATALOG_ENTRY_FILE.delete();
		
		// Add new metedata in catalog
		addedMetadata = dao.addNewMetadata(existingShortMetadata, false);
		assertTrue(addedMetadata);
		
		// Add in a new catalog and verify it's there
		String catalogDirectory = FileLocator.catalogEntryDirectoryFile().getParent();
		File catalogFile2 = new File(catalogDirectory + FileLocator.catalogEntryDirectoryFile());
		assertTrue(catalogFile2.isDirectory());
		dao.addNewMetadataList(new LongMetadataBean[] {newLongMetadata}, catalogDirectory);
		
		FileLocator.catalogEntryDirectoryFile().delete();
	}
	
	/**
	 * Tests whether a catalog entry that has a new name and a description is successfully updated in the database.
	 * It is created in a directory specified in {@link FileLocator#catalogEntryDirectoryFile()}.
	 * @throws SQLException
	 */
	@Test
	public void testCatEntryMetadata() throws Exception {
		
		// Open catalog file
		String[] catalogs = FileLocator.catalogEntryDirectoryFile().list(false);
		assertEquals(1, catalogs.length);
		assertTrue(catalogs[0]!= "");
		String catalogDir = FileLocator.getCatalogDirectoryName();
		File catalogFile = new File(catalogDir + FileLocator.getTestDirectoryFile());
		
		// Login and add new catalog
		String currentUserName = SessionTools.getCurrentUsername();
		session = new LoginServletTest("NewUser", currentUserName, "admin", "admin");
		
		MetadataDAO dao = new MetadataDAO();		
		
		// Create new catalog
		QCATALOG_ENTRY_FILE.delete();
		QCATALOG_ENTRY_FILE.create();
		
		// Create new metedata set
		DummyMetadataBean existingMetadata = dao.newDummyMetadata(DummyMetadataBeanTest.EXISTING_DUMMY_METADATA);
		existingMetadata.setMetaType(DummyMetadataBeanTest.NEW_METADATA_TYPE);
		existingMetadata.setMetaDescription(DummyMetadataBeanTest.NEW_DESCRIPTION);
		existingMetadata.setName(DummyMetadataBeanTest.NEW_NAME);
		dao.addNewMetadata(existingMetadata);
		
		// Add metadata to catalog
		DummyMetadataBean newMetadata = dao.addOldMetadata(existingMetadata);
		assertTrue(DummyMetadataBeanTest.NEW_TYPE.equals(newMetadata.getMetadataType()));
		assertTrue(DummyMetadataBeanTest.NEW_DESCRIPTION.equals(newMetadata.getDescription()));
		
		// Add in a new catalog and verify it's there
		String catalogDirectory = FileLocator.catalogEntryDirectoryFile().getParent();
		File catalogFile2 = new File(catalogDirectory + FileLocator.catalogEntryDirectoryFile());
		assertTrue(catalogFile2.isDirectory());
}
}