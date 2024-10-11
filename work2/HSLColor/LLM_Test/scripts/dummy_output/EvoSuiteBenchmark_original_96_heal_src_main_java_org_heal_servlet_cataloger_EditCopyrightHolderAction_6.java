// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		@Test
		public void testActions() throws ServletException {
				assertNotNull(System.getProperty("org.heal.module.metadata"));
				assertNotNull(System.getProperty("org.heal.module.metadata.copyrightHolders"));
				EditCopyrightHolderAction cah = new EditCopyrightHolderAction();
				assertNotNull(cah.getAction());
				assertTrue(cah.actionRequiresLogin());
				final CompleteMetadataBean mbean = cah.getMetadata();
				assertNotNull(mbean);
				if (mbean == null) {
					assertNull(cah.getMetadata());
					assertTrue(0 == cah.getMetadata().getAuthorityId());
					assertTrue(0 == cah.getMetadata().getCopyrightHolders().size());
					return;
				}
				assertNotNull(mbean);
				Iterator iter = mbean.getCopyrightHolders().iterator();
				CopyrightHolderBean cbh;
				while (iter.hasNext()) {
					cbh = (CopyrightHolderBean) iter.next();
					if (cbh.getCopyrightHolder().equals("copyrightHolder1")) {
						assertTrue(0 == cbh.getCopyrightHolder().equals("copyrightHolder1"));
						assertFalse(0 == cbh.getCopyrightHolder().equals("copyrightHolder2"));
						assertEquals(cbh.getAuthorityId(), "copyrightHolder1");
						assertEquals(cbh.getCompleteMetadata(), mbean);
						assertTrue(mbean.getAuthorityId() > cbh.getAuthorityId());
						assertEquals(mbean.getCopyrightHolders(), cbh.getCopyrightHolderList());
						System.out.println("cah.getMetadata() is: " + mbean.getMetadata());
						System.out.println("cbh is " + cbh + " cah.getMetadata() is " + cbh.getMetadata());
						assertEquals(mbean.getMetadata(), cbh.getMetadata());
						assertTrue(mbean.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						assertEquals(cbh.getCompleteMetadata(), mbean);
					} else if (cbh.getCopyrightHolder().equals("copyrightHolder2")) {
						assertTrue(cbh.getCopyrightHolder().equals("copyrightHole1"));
						assertFalse(cbh.getCopyrightHolder().equals("copyrightHole2"));
						assertEquals(cbh.getAuthorityId(), "copyrightHolder1");
						assertEquals(cbh.getCompleteMetadata(), mbean);
						assertFalse(mbean.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						assertEquals(mbean, cbh.getMetadata());
						assertTrue(mbean.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						assertNotNull(cbh);
						System.out.println("possible cbh is: " + cbh);
						if ((cbh.getCompleteMetadata() == null) || (cbh.getCompleteMetadata().getAuthorityId() == null)) {
							assertFalse(cbh.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
							assertFalse(cbh.getCompleteMetadata().compareTo(mbean.getCompleteMetadata()) == 0);
						} else {
							assertFalse(cbh.getCompleteMetadata().compareTo(mbean.getCompleteMetadata()) == 0);
						}
					} else {
						assertTrue(cbh.getCopyrightHolder().equals("copyrightHole1"));
						assertTrue(cbh.getCopyrightHolder().equals("copyrightHole2"));
						System.out.println(" cbh is " + cbh);
						assertEquals(cbh.getAuthorityId(), "copyrightHole1");
						assertTrue(cbh.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						assertNotNull(cbh);
						if (cbh.getCompleteMetadata().getAuthorityId()!= cbh.getAuthorityId()) {
							assertFalse(cbh.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						} else {
							assertEquals(cbh.getAuthorityId(), cbh.getAuthorityId());
							System.out.println(" pb is " + cbh.getCompleteMetadata());
							System.out.println("cah2 is " + cbh.getCompleteMetadata());
						}
						Iterator iter2 = cbh.getCopyrightHolderList().iterator();
						Iterator iter2new = cbh.getCopyrightHolderList().iterator();
						while (iter2.hasNext()) {
							assertTrue(iter2.next().equals(iter2new.next()));
						}
						assertTrue(cbh.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						assertNotNull(cbh);
						if (cbh.getCompleteMetadata().getAuthorityId()!= cbh.getAuthorityId()) {
							assertFalse(cbh.getCompleteMetadata().compareTo(cbh.getCompleteMetadata()) == 0);
						} else {
							assertEquals(cbh.getAuthorityId(), cbh.getAuthorityId());
							System.out.println("pb is " + cbh.getCompleteMetadata());
							System.out.println("pbe is " + cbh.getCompleteMetadata());
						}
					}
				}
		}
}