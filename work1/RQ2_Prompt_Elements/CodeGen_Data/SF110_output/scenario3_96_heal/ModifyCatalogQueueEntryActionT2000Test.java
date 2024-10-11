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
			* Test method for {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()}. 
			* This method tests if a required login key is provided and, if so, it throws an exception.
			*/
		@Test
		public final void testActionRequiresLoginWithRequiredKey() {
					
			final File temp = File.createTempFile("Temp", "txt");
			final FileOutputStream out = new FileOutputStream(temp);
			final FileChannel in = new FileInputStream(temp.getAbsolutePath());
			(new FileLocator()).read(in,out);			
			in.close();
			assertFalse(AuthenticationTools.hasRequiredLoginKey());
		}
		
		/**
		* Test method for {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()}. 
		* This method tests if a required login was provided on a login page, the user could be logged in using that key
		*/
		@Test
		public final void testActionRequiresLoginWithGivenKey() {
			
			final File temp = File.createTempFile("Temp", "txt");
			final FileOutputStream out = new FileOutputStream(temp);
			final FileChannel in = new FileInputStream(temp.getAbsolutePath());
			(new FileLocator()).read(in,out);			
			in.close();
			final String login = AuthenticationTools.hasRequiredLoginKey()? "/catalog/addNewMetadata" : null;
			in.close();			
			final HttpServletRequest req = new JSPBuilder().build(login);
			
			try {
				final ModifyCatalogQueueEntryAction action = new ModifyCatalogQueueEntryAction();
				
				boolean failed = false;
				try {
					action.doPost(req); /* call the action servlet */
				} catch (final ServletException|Exception e) {
					failed = true;
				}
				assertTrue(failed);	
				
			} catch (final Exception e) {
				assertEquals(401,e.getErrorCode());
			
				// expected this cause, the metadata bean gets removed after the modifies are added
				final Long modifiedTimestamp = new Long(temp.lastModified());
				final Long metadataKey = new Long(temp.hashCode());
									
				final String logMessage = "ModifyCatalogQueueEntryAction did not throw UnsupportedOperationException for requiredLoginKey.";
				final HttpServletResponse res = new HttpServletResponse();
				res.setStatus(403);
				res.setContentType("text/html;charset=utf-8");
				res.addHeader("Content-Type", "text/html;charset=utf-8");
				res.addHeader("Cache-Control","no-cache");
				res.sendError(403,logMessage);
			
				try {
					FileOutputStream out = new FileOutputStream(temp);
					(new FileLocator()).read(in,out);			
					in.close();
					
					final File catalog = File.createTempFile("catalog", null);
					(new FileLocator()).write(catalog.getAbsolutePath());
					try {
					in.close();
					out.close();
					} catch (final IOException e) {
						fail("unable to write expected stream");
					}
				} catch (final SQLException e) {
					fail("unable to write expected stream");
				}
			}
		}
				
}
