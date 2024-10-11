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
    * Test the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
    * It tests the return of whether or not an appropriate user is allowed to modify a metadata item which is in
    * the catalog queue.
    *
    * @throws ServletException an error occurred trying to create the test case environment.
    * @throws IOException an error occurred during the writing to the log file.
    */
    @Test
    public void testGetLoginRequired() throws ServletException, IOException {
        AuthenticationTools
               .testPermissions("catalog queue", new Object[]{"admin", "modify-metadata"});
    }
    /**
    * Tests to assert that the necessary parameters are passed to the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
    * @throws ServletException an error occurred trying to create the test case environment.
    * @throws IOException an error occurred during the writing to the log file.
    */
    @Test
    public void testPassRequiredParameters() throws ServletException, IOException {
        QueueDAO
               .getInstance()
               .initDefaultCatalog()
               .setMaxMessagesToQueueAsInt(
                        new String[]{"5000", "5",
                                 "6", "7",
                                 "8", "9"
                        });
        QueueDAO.getInstance()
               .saveQueuedRecord("MetadataItem");
        QueueDAO.getInstance()
               .saveQueuedRecord("MetadataItem");
        QueueDAO.getInstance()
               .saveQueuedRecord("MetadataItem");

        AuthenticationTools.authenticate("admin","admin", null);
        QueuedRecordBean recordBean = QueuedRecordBean.createInstance();
		QueueDAO.getInstance().deleteQueuedRecord(recordBean);
        AuthenticationTools.authenticate("admin","modify-metadata","modify-metadata");
        
        QueueDAO.getInstance().deleteQueuedRecord(recordBean);
        
	FileOutputStream fos = new FileOutputStream(
			FileLocator.getTestDataDirectory() + File.separator
			+ "files\tmetadata-file-1.log");
        FileLocator.closeStdStreamsOpen(fos) ;
        fos.close();

        QueueDAO.getInstance()
               .getMaxMessagesFromQueueAsInt()
               .setMaxMessagesToQueueAsInt([
                        "500", "501", "502", "503",
                        "505", "506", "507", "508", "509", "510"
                ]);
        QueueDAO.getInstance().getMaxMessagesFromQueueAsInt()
               .setMaxMessagesToQueueAsInt([
                        "5000", "5",
                        "5", "6",
                        "5", "7",
                        "5", "8",
                        "5", "9"
                ]);
        QueueDAO.getInstance()
               .getMaxMessagesFromQueueAsInt()
               .setMaxMessagesToQueueAsInt([
                        "5000", "5",
                        "5", "6",
                        "5", "7",
                        "5", "8",
                        "5", "9"
                ]);
        QueueDAO.getInstance()
               .getMaxMessagesFromQueueAsInt()
               .setMaxMessagesToQueueAsInt([
                        "5000", "5",
                        "5", "6",
                        "5", "7",
                        "5", "8",
                        "5", "9"
                ]);
        QueuedRecordBean recordBean1 = QueuedRecordBean.createInstance();
        QueueDAO.getInstance().saveQueueEntry(recordBean1);
        Thread.sleep(5);
        QueueDAO.getInstance().saveQueueEntry(recordBean1);
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 5000));
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 501));
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));
        Thread.sleep(5);
        QueueDAO.getInstance()
           .getQueueEntries()
           .add(QueueEntry.createInstance("MetadataItem", 502));


        HttpServletRequest
               .getRequest()
               .getParameterMap()
               .values()
               .stream()
               .map(param -> "{}"