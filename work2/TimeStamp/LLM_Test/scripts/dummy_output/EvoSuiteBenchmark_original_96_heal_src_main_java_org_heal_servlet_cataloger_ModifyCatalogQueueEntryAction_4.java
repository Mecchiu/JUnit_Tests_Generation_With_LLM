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
     * Tests the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
     */
    @Test
    void actionRequiresLogin() {
        final Long queueId = 1L;
        final String sourceLocation = FileLocator.classPathResource("/metadata/" + queueId + "/sourceLocation");
        final String destinationLocation = FileLocator.classPathResource("/metadata/" + queueId + "/destinationLocation");
        assertThrows(IllegalArgumentException.class, () -> {
            assertDoesNotThrow(() -> this.actionRequiresLogin());
        });
        AuthenticationTools.setUsername(AuthenticationTools.SERVLET_PATH, "admin");
        try {
            assertDoesNotThrow(() -> this.actionRequiresLogin());
        } finally {
            AuthenticationTools.removeUser();
        }
    }
    
    /**
    * Uploads the specified file in the specified metadata queue directory, and returns with the metadata
    * that is created.
    */
	@Test
	public void doesActionWriteInMetadataQueue() {
        FileOutputStream fos = new FileOutputStream(FileLocator.classPathResource("/metadata/" + getMetadataItem()));
        fos.write(new byte[0]);
        fos.close();
        long metadataQueueId = this.action().perform(ServerServlet.REQUEST, ServerServlet.RESPONSE);
        System.out.println("Metadata Queue ID: " + metadataQueueId);
        fos = new FileOutputStream(FileLocator.classPathResource("/metadata/" + getMetadataItem()));
        fos.write(new byte[0]);
        fos.close();
        fos = new FileOutputStream(FileLocator.classPathResource("/metadata/" + getMetadataItem()));
        fos.write(new byte[0]);
        fos.close();
		
        QueueDAO queueDAO = QueueDAO.getInstance();
        System.out.println("Metadata Queue size: " + queueDAO.getAllMetadata().size());
        ShortMetadataBean newShortMetadata = new ShortMetadataBean();
        for (int i = 0; i < queueDAO.getCurrentMetadata().size(); i++) {
            QueueDAO.getInstance().addMetadataBean(queueDAO.getCurrentMetadata().get(i), newShortMetadata);
        }
        this.action().perform(ServerServlet.REQUEST, ServerServlet.RESPONSE);
        System.out.println("Metadata Queue size after update: " + queueDAO.getAllMetadata().size());
        newShortMetadata = QueueDAO.getInstance().getMetadataBean(queueId, "shortMetadata");
        assertDoesNotThrow(() -> QueueDAO.getInstance().validateMetadataQueue(queueId, newShortMetadata));
        assertDoesNotThrow(() -> QueueDAO.getInstance().deleteMetadataBean(queueId, "shortMetadata"));
        assertDoesNotThrow(() -> QueueDAO.getInstance().removeMetadataBean(queueId, newShortMetadata));
            
	}
    
    /**
    * Returns the currently configured instance of {@link MetadataDAO} to be used for creating the specified
    * item.
    *
    * @return
    */
    private MetadataDAO getMetadataItem(){
        return MetadataDAO.getInstance();
    }
    
    private void addShortMetadata(File sourceLocation) throws IOException, SQLException {
        System.out.println("Adding short metadata: " + sourceLocation);
        FileInputStream fis = new FileInputStream(sourceLocation);
        ShortMetadataBean shortMetadata = new ShortMetadataBean();
        fis.read(shortMetadata.getByteArray());
        fis.close();
        fis = new FileInputStream(FileLocator.classPathResource(sourceLocation));
        System.out.println("Reading from: " + sourceLocation);
        shortMetadata.parse(fis);
        long currentQueueId = QueueDAO.getInstance().getCurrentMetadata().hashCode();
        getMetadataItem().addMetadataBean(currentQueueId, shortMetadata);
    }

    /**
    * @return
    * @throws SQLException
    * @throws IOException
    */
    private void removeMetadataFor(File destination) throws SQLException, IOException {
        queueDAO = QueueDAO.getInstance();
        queueDAO.getMetadataBean(destination).removeMetadataBean(queueDAO.getCurrentMetadata().peek().getMetadataQueue(), queueDAO.getMetadataBean("shortMetadata"));
    }
}