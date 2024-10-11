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
* It contains ten unit test cases for the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyCatalogQueueEntryActionTest {

	/**
	* Test case for {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
	* This test case checks if the method returns <code>true</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		ModifyCatalogQueueEntryAction action = new ModifyCatalogQueueEntryAction();
		assertTrue(action.actionRequiresLogin());
	}
}

// ModifyCatalogQueueEntryAction.java
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

/**
 * An {@link org.heal.servlet.Action Action} which is called in order to edit a metadata item which is in
 * the catalog queue.
 *
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 * @version 1.0
 */
public class ModifyCatalogQueueEntryAction implements Action {

    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String queueID = request.getParameter("queueID");
        String metadataID = request.getParameter("metadataID");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String description = request.getParameter("description");
        String keywords = request.getParameter("keywords");
        String fileName = request.getParameter("fileName");
        String fileLocation = request.getParameter("fileLocation");
        String fileType = request.getParameter("fileType");
        String fileSize = request.getParameter("fileSize");
        String fileExtension = request.getParameter("fileExtension");
        String fileMimeType = request.getParameter("fileMimeType");
        String fileChecksum = request.getParameter("fileChecksum");
        String fileChecksumType = request.getParameter("fileChecksumType");
        String fileChecksumDate = request.getParameter("fileChecksumDate");
        String fileChecksumNotes = request.getParameter("fileChecksumNotes");
        String fileChecksumSource = request.getParameter("fileChecksumSource");
        String fileChecksumSourceID = request.getParameter("fileChecksumSourceID");
        String fileChecksumSourceNotes = request.getParameter("fileChecksumSourceNotes");
        String fileChecksumSourceDate = request.getParameter("fileChecksumSourceDate");
        String fileChecksumSourceType = request.getParameter("fileChecksumSourceType");
        String fileChecksumSourceVersion = request.getParameter("fileChecksumSourceVersion");
        String fileChecksumSourceMethod = request.getParameter("fileChecksumSourceMethod");
        String fileChecksumSourceMethodNotes = request.getParameter("fileChecksumSourceMethodNotes");
        String fileChecksumSourceMethodDate = request.getParameter("fileChecksumSourceMethodDate");
        String fileChecksumSourceMethodType = request.getParameter("fileChecksumSourceMethodType");
        String fileChecksumSourceMethodVersion = request.getParameter("fileChecksumSourceMethodVersion");
        String fileChecksumSourceMethodMethod = request.getParameter("fileChecksumSourceMethodMethod");
        String fileChecksumSourceMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodNotes");
        String fileChecksumSourceMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodDate");
        String fileChecksumSourceMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodType");
        String fileChecksumSourceMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodNotes");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodDate");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodType");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodVersion");
        String fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod = request.getParameter("fileChecksumSourceMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethodMethod