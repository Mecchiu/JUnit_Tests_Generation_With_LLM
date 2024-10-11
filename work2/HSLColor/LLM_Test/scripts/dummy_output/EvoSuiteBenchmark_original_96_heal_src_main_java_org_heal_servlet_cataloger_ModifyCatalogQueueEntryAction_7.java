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
		// @Test
    public void testModifyCatalogQueueEntryActionRequiresLogin() throws Exception{
        String catalogLocation = FileLocator.getAbsolutePath("/catalogServer/catalogDir/catalogFile");
        String queueID = FileLocator.getAbsolutePath("/catalogServer/catalogQueueFile");

        assertTrue("Unable to locate catalog file", catalogLocation.length() > 0);
        assertTrue("Unable to locate catalog queue file", queueID.length() > 0);

        new File(FileLocator.getAbsolutePath("/catalogServer")).mkdirs();

        String tempQueueLocation = FileLocator.getAbsolutePath("/catalogServer/tempCatalogQueueFile");
        String tempQueueID = FileLocator.getAbsolutePath("/catalogServer/tempCatalogQueueFile");

        System.out.println(tempQueueLocation);
        new File(tempQueueLocation).mkdir();

        File tempCatalogFile = new File(FileLocator.getRelativePath(catalogLocation, "catalogFile"));

        assertTrue("Unable to locate catalog", tempCatalogFile.exists());

        new File(FileLocator.getAbsolutePath("/catalogServer")).delete();

        new File(FileLocator.getAbsolutePath("/catalogServer/catalogFile")).delete();

        // Add request header value
        String key = "Authorization";
        System.out.println("key is " + key);

        AuthenticationTools.setAuthValues(key, "");
        HttpServlet response = new ModifyCatalogQueueEntryAction("catalogQueueRequest");

        // Set to non-default login/password
        String login = "admin";
        String userPassword = "admin";

		response.doPost(new Request(catalogLocation, catalogID), "text/plain", userPassword, login, catalogLocation);

        // Get response object
        assertFalse("Unable to find the catalog!", (new File(catalogLocation)).exists());

        // Delete request header value
        key = "Authorization";
        System.out.println("key is " + key);

        AuthenticationTools.removeAuthValues(key, login, userPassword, catalogLocation);
        response = new ModifyCatalogQueueEntryAction("catalogQueueRequest");

        // Ensure we deleted the header value
        assertFalse("Unable to find the catalog!", (new File(catalogLocation)).exists());

        // Delete temporary catalog file (delete it)
        tempCatalogFile.delete();

        // Set to default - should fail since temp catalog is now empty
        key = "Authorization";
        System.out.println("key is " + key);
        AuthenticationTools.setAuthValues(key, "");
        error("Unable to find the catalog");

        // Set to default - should succeed
        response.doPost(new Request(catalogLocation, catalogID), "text/plain", userPassword, login, catalogLocation);

        // Delete catalog before testing again
        new File(catalogLocation).delete();
        
        // Set to default - should fail since catalog can't be read
        key = "Authorization";
        System.out.println("key is " + key);
        AuthenticationTools.setAuthValues(key, "");
        error("Unable to find the catalog");

        // Set to default - should succeed
        response.doPost(new Request(catalogLocation, catalogID), "text/plain", userPassword, login, catalogLocation);

        // Delete temporary catalog file (delete it)
        tempCatalogFile.delete();

        // Set to default - should succeed
        response.doPost(new Request(catalogLocation, catalogID), "text/plain", userPassword, login, catalogLocation);

        assertFalse("Unable to remove user from catalog.", (new File(catalogLocation)).exists());
    }

	public void clearDatabase() {

        MetadataDAO dao = new MetadataDAO();

        // Delete catalog
        String catalogLocation = FileLocator.getAbsolutePath("/catalogServer/catalogDir/catalogFile");
        new File(catalogLocation).delete();

        // Delete queue
        String queueLocation = FileLocator.getAbsolutePath("/catalogServer/catalogQueueFile");
        new File(queueLocation).delete();        
    }

}