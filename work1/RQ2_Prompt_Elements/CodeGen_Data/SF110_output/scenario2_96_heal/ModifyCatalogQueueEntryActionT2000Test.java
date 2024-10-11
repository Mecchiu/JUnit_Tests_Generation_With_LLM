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
		public void testActionSuccess() throws Exception {
				doTest(this.getClass().getClassLoader(),
						this.getClass().getClassLoader(),
						"deleteMetadata.jsp",
						new File[]{null},
						true);
				
				doTest(FileLocator.class.getClassLoader(),
						FileLocator.class.getClassLoader(),
						"deleteMetadata.jsp",
						new File[]{null},
						false);
				
		}
					
		@Test
		public void testActionDisallowLogin() throws Exception {
			doTryTests();
		}
		
		@Test
		public void testCsrfExempted() throws Exception {
			doTryCsrfExemptedTests();
			
			doTryCsrfExemptedTests();
		}
	
		private void doTryExemptedTests() throws ServletException, IOException {
			doTryTests(this.getClass().getClassLoader(),
						this.getClass().getClassLoader(),
						null,
						"createQueueEntry.jsp",
						new File[]{null});
		}
	
		private void doTryTests(
				ClassLoader ccl,
				ClassLoader crl,
				File baseDir,
				String jspFile,
				File[] expected)
					throws ServletException, IOException {

			FileInputStream fis = null;
			FileOutputStream fos = null;
			FileInputStream cis = null;
			FileOutputStream cos = null;
			
			try {
				fis = FileLocator.findFileStream("", ccl, null);
				fos = FileLocator.findOutputStream("", fis);
				cis = FileLocator.findInputStream("", crl, fis);
				cs = FileLocator.findInputStream("", crl, fos);
					
				fis.close();
				fos.close();
				cis.close();
				cs.close();
					
				File f = new File(baseDir, expected.length + 4);
				
				File loc = FileLocator.findLocator(f, jspFile);
				loc = (f.equals(loc))? loc : null;
				if (loc!= null) {
					loc.delete();
				}
				
				// this is not strictly strictly necessary but works.
				fis = FileLocator.findFileStream("", ccl, "createMetadata.jsp");
				fos = FileLocator.findOutputStream("", fis);
				cis = FileLocator.findInputStream("", crl, fis);
				cs = FileLocator.findInputStream("", crl, fos);
					
				fis.close();
				fos.close();
				cis.close();
				cs.close();
					
				MetadataDAO mdDAO = null;
					
				try {
					mdDAO = (MetadataDAO) crl.loadClass(MetadataDAO.class.getName()).newInstance();
				} catch (Throwable t) {
					fail("Load of MetadataDAO failed.");
				}
				
				try {
					fis = FileLocator.findFileStream("", ccl, null);
					fos = FileLocator.findOutputStream("", fis);
					cis = FileLocator.findInputStream("", crl, fis);
					cs = FileLocator.findInputStream("", crl, fos);
					
				} catch (Throwable t) {
					if (t instanceof SQLException) {
						fail("Failed to create metadata.jsp with SQLException.");
					} else if (!(t instanceof ClassNotFoundException)) {
						fail("Failed to create metadata.jsp with other exceptions.");
					}
				}
				
				assertTrue(f.exists());
				
				long size = f.length();
				assertTrue(size == expected.length);
					
				QueueDAO q = new QueueDAO();
					
				QueueDAO.clear();
					
				try {
					fis.close();
					fos.close();
					cis.close();
					cs.close();
					File f2 = FileLocator.findLocator(loc, expected[0]);
					
					assertTrue(f2.exists());
					fis = FileLocator.findInputStream("", f2);
					fos = FileLocator.findOutputStream("", fis);
					cis = FileLocator.findInputStream("", crl, fis);
				} catch (Throwable t) {
					if (t instanceof SQLException) {
						fail("Failed to read " + expected[0] + ".jsp with SQLException.");
					} else if (!(t instanceof ClassNotFoundException)) {
						fail("Failed to read " + expected[0] + ".jsp with other exceptions.");
					}
				}
				
				assertTrue(loc!= null);
				
				String metadata = MetadataDAO.get().readMetadata(f);
				short metadataserialized = ShortMetadataBean.deserialize(metadata);
				assertTrue(metadataserialized!= null);
					
					// Now test that the item was serialized and not tampered with
					assertEquals("Incorrect shortSerialized", ShortMetadataBean.serialize(metadataserialized), metadataserialized);
