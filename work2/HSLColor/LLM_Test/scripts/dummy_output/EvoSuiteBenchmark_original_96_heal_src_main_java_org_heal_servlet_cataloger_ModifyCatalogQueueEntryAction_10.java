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
		 * Tests what occurs when an attempted request to the catalogs queue does nothing.
		 *
		 * @throws ServletException
		 */
    @Test
    public void testNoOp() throws ServletException {
        AuthenticationTools.login();
        Action action = new ModifyCatalogQueueEntryAction();
        String fileContent = action.doPost(Integer.toString(0), "fileContent");
        assertEquals("", fileContent);
    }

		/**
		 * Tests what occurs when a target location is a destination and a source has been created
		 * using its path.
		 */
    @Test
    public void testSimple() throws ServletException, IOException {
        FileLocator.makeTemp(
                        "heal/static/config/catalog1/" +
                        "1.0/metadataTest1/src/main/java/org/heal/module/catalog/QueueManager_catalog2_jsp.java",
                        fileContent -> {
                            assertArrayEquals(
                                    "",
                                    fileContent.getBytes());
                        }
                        );

        FileLocator.makeTemp(
                        FileLocator.RESOURCE_PREFIX +
                        "catalog1/" +
                        "1.0/" +
                        "metadataTest1/" +
                        "src/" +
                        "org/heal/module/catalog/QueueManager_catalog2_jsp.java"
                        +
                        FileLocator.FILEEXTENSION_JSP
                       ,
                        filePath -> {
                            File file = new File(filePath);
                            assertTrue(file.isFile());
                            File out = new File(FileLocator.OUTPUTDIR + FileLocator.FILELOCATOR_CATALOG);
                            assert(out.isDirectory());
                            if (out!= file)
                            {
                                assertTrue(out.isDirectory());
                            }
                        },
                        "This does not succeed."
                        );

    }

		/**
		 * Tests changing a file location to a new location.
		 *
		 * @throws IOException
		 */
    @Test
    public void testMoveFile() throws IOException {
}
}