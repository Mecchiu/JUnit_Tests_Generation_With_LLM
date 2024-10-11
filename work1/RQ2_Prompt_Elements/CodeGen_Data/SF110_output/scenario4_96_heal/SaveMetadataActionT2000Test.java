// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {

	/**
	 * @return <code>true</code>
	 */
	@Test
	public void actionRequiresLogin_mustReturnTrue_false_ifUserDoesNotHaveSystemAccess() throws PermissionException {
		saveMetadata(null, null, null, null);
		assertFalse(actionRequiresLogin());
	}

	/**
	 * @return <code>true</code>
	 */
	@Test
	public void actionRequiresLogin_mustReturnTrue_false_ifUserDoesNotHaveSystemAccess() throws PermissionException {
		saveMetadata(new MetametadataIdentifierBean("metametadataID", "metametadata", "", ""));
		assertFalse(actionRequiresLogin());
	}

	/**
	 * @return <code>true</code>
	 */
	@Test
	public void actionRequiresLogin_mustReturnTrue_false_ifUserDoesNotHaveSystemAccess() throws PermissionException {
		saveMetadata(new MetametadataIdentifierBean("metametadataID", "metametadata", "", ""));
		assertFalse(actionRequiresLogin());
	}

	/**
	 * @return <code>true</code>
	 */
	@Test
	public void actionRequiresLogin_mustReturnTrue_false_ifUserDoesNotHaveSystemAccess_andHasCustomAuthorization() throws SQLException, PermissionException, IOException {
		MetametadataBean mb = new MetametadataContributorBean("mbeanID", "mbean", "", null);
		mb.setIdentifier(new MetametadataIdentifierBean(mb.getIdentifierType(), "mbeanid", "", ""));
		mb.setAuthorizable(false);
		mb.setAuthorization(Authorization.COPY_TO_ALL);
		mb = new MetametadataIdentifierBean(mb.getIdentifierType(), "mbeanID", "", "");
		
		// First, remove all the authorization
		// If the user has "Custom" authorization, we can't save
		// mb because that would be the only way to make it "copied" and
		// get more authorizable metadata
		//assertAuthorizationNotAppearingForAnyMbean(mb);
		
		String mb_id = mb.getIdentifier().getID();
		RequestDispatcher rd_mbean = request.createDispatch("javax.sql.DataSource", "GET_ALL_METADATA", rd_);
		rd_mbean.forward(request, response);
		
		CompleteMetadataBean mmb = new CompleteMetadataBean(); 
		mmb.setMetametadata(mb);
		saveMetadata(mmb);
		checkMetadataContainsAllMbeans(mb.getMetametadata());
		
		// Now make sure the old authorizer cannot copy mbeans
		assertThrowAuthorization(mb.getIdentifier(), Authorization.COPY_TO_ALL);
		
		// First, remove it
		Iterator<Iterable<MetametadataIdentifierBean>> itrs = mb.getMetametadata().iterator();
		while (itrs.hasNext()) {
			itrs.next();
			itrs.remove();
		}
		
		assertThrowAuthorization(mb.getIdentifier(), Authorization.COPY_TO_ALL);
		
		System.out.println("Copied metadata for mbean " + mb_id + ".");
		mmb.setIdentifier(mb.getIdentifier());
		saveMetadata(mmb);
		checkMetadataContainsAllMbeans(mb.getMetametadata());
		
	}
	
	/**
	 * @return <code>true</code>
	 */
	private boolean assertAuthorizationNotAppearingForAnyMbean(CompleteMetadataBean mbe) {
		boolean found = false;
		Iterator<Iterable<MetametadataIdentifierBean>> itrs = mbe.getMetametadata().iterator();
		while (!found && itrs.hasNext()) {
			itrs.next();
			itrs.remove();
		}
		return found;
	}

	/**
	 * Check if the given metadata container also contains <code>'Metametadata.containsMetadata(Metametadata.IDENTIFIER)'</code> method
	 *
	 * @param mb the complete metadata
	 * @throws PermissionException if the metadata container doesn't contain metadata of identifier 'Identifier'
	 * @throws SQLException
	 * @throws ClassCast