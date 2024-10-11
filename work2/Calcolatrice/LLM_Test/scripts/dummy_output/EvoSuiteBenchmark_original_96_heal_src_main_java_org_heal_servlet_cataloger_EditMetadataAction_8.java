// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.VCardBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditMetadataAction}.
* It contains one unit test case for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
		/**
		 * @return <code>true</code>
		 */
		public boolean actionRequired() {
			return true;
		}

		/**
		 * @return <code>true</code>, which is expected for a edit action. This causes no action to be performed.
		 */
		public boolean editDisabled() {
			return false;
		}
									
		/**
		 * Test of getAuthorBean method, of class <code>EditMetadataAction</code>
		 * for
		 * <code>editDisabled</code>
		 */
		@Test
		public void testGetAuthorBean() {
			//System.out.println("getAuthorBean"); breakPoint();		
			assertNull(EditMetadataAction.getAuthorBean());			
		}	
	
		/**
		 * Test of getContributorBean method, of class <code>EditMetadataAction</code>
		 * for
		 * <code>editDisabled</code>
		 */
		@Test
		public void testGetContributorBean() {
			//System.out.println("getContributorBean"); breakPoint();		
			List<ContributorBean> a = EditMetadataAction.getContributorBean();
			assertFalse("getContributorBean must return empty list."+a.size(), a.isEmpty());			
		}
		
		/**
		 * Test of getCompleteBean method, of class <code>EditMetadataAction</code>
		 * for
		 * <code>editDisabled</code>
		 */
		@Test
		public void testGetCompleteBean() {
			CompleteMetadataBean a = EditMetadataAction.getCompleteBean();
			assertNull(EditMetadataAction.getCompleteBean());
			assertTrue(EditMetadataAction.getCompleteBean()!= null);
			
		}
		
		/**
		 * Test of getAuthorHolder method, of class <code>EditMetadataAction</code>
		 * for
		 * <code>editDisabled</code>
		 */
		@Test
		public void testGetAuthorHolder() {
			AuthorHolder a = EditMetadataAction.getAuthorHolder();
			assertNull(EditMetadataAction.getAuthorHolder());
			assertTrue(EditMetadataAction.getAuthorHolder()!= null);
			
		}
		
		/**
		 * Test of getDateOfCreation method, of class <code>EditMetadataAction</code>
		 * for
		 * all
		 * <code>editDisabled</code>
		 */
		@Test
		public void testGetDateOfCreation() {
			VCardBean a = null;
			assertNull(EditMetadataAction.getDateOfCreation());
			a = new VCardBean();
			a.setCreatedBy("Seth");
			a.setFirstName("Jeff");
			List<CompleteMetadataBean> list = EditMetadataAction.getCompleteBean("1", false);
			assertFalse("getCompleteBean()", list.isEmpty());
			Iterator<CompleteMetadataBean> iterator = list.iterator();
			assertTrue("getCompleteBean()", iterator.hasNext());
			CompleteMetadataBean mb = iterator.next();
			CompleteMetadataBean result = EditMetadataAction.getCompleteBean("1", true);
			assertNull(EditMetadataAction.getCompleteBean());
			assertEquals(EditMetadataAction.getDateOfCreation(), result);
			
			Iterator<TargetUserGroupBean> it = a.getTargets().iterator();
			Iterator<TCombineTargetUserBean> itt = result.getTargets().iterator();
}
}