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
		
	@Test
	public void testPermissions() throws Exception {

    // Get user
    UserBean user = AuthenticationTools.getCurrentUser().getUser();
		
    // Create new contributor
    ContributorBean contributor = new ContributorBean();
    map(contributor, "email", "foo@example.com", "", "");
		
    // Check that admin user can perform action
    CollectionBean collection = new CollectionBean();
    map(collection, "name", "collection", "", "");
		
    // Check that only admin can edit metadata
    Map<String, Object> editableMetadata = new HashMap<String, Object>();
    editableMetadata.put("username", "username"); ///< Must not be null
    List<String> editableMetadataPerms = asList(new String[] { "edit", "modify", "del", "delete" });
    Map<String, Object> editableMetadataRole = new HashMap<String, Object>(); /// < Note: not set when no edit permissions
		
    // Set metadata admin permissions
    setMembers(editMetadataMetadataPerms, "admin");
    editMetadataDAO.setEditableMetadataPermissionsRole(editMetadataRole);
        

        
		

		// 1. Verify that admin cannot edit metadata
		assertTrue(user.canPerformAction(EditMetadataAction.class, editMetadataMetadataRole)); 

		// 2. Check that the metadata is not edited
		assertFalse(hasMetadata());
		
		// 3. Set edit access to user
		reloadAdmin(new ContributorBean());
		
		// 4. Login
		assertTrue(user.canPerformAction(EditMetadataAction.class, editMetadataMetadataRole)); 
		
		// 5. Check that a new user can edit the metadata
		assertTrue(user.canPerformAction(EditMetadataAction.class, editMetadataMetadataRole));       

		// 6. Check that a new user can remove a metadata
		assertTrue(user.canPerformAction(EditMetadataAction.class, editMetadataMetadataRole));       

		// 7. Check that a new user cannot edit metadata
		assertFalse(user.canPerformAction(EditMetadataAction.class, editMetadataMetadataRole));       
		
		// 8. Check that the rights have been removed
		assertFalse(hasNoCollectionRights());
		assertFalse(hasMetadataNoOwner());
		assertFalse(hasNoContributorRight());
		assertFalse(hasCanModifyUserRight());
		assertFalse(hasCanModifyCollectionRight());
	}

	// Get collection user
	private ContributorBean getContributorBean() {
		return new ContributorBean();
	}

	// Creates new collection and returns the collection
	private CollectionBean createNewCollection() {
		return new CollectionBean();
	}

	// Reload all metadata
	private void reloadAdmin(ContributorBean contributor) throws IOException, UserException, SQLException {
			
    // Construct a VCardBean
    CollectionBean collection = getContributorBean().getCollection();
    VCardBean vcard = new VCardBean();
    List<VCardBean> vCards = vCard.getVCards();
    List<String> authors = asList(contributor.getKeywords());
    vCards.addAll(asList(contributor.getFullName()));
    for (Iterator<VCardBean> iterator = vCards.iterator(); iterator.hasNext();) {
        VCardBean vCardBean = iterator.next();
        vCards.add(0, new VCardBean(contributor.getFirstName(), contributorsGroupId(contributor.getFirstName()), contributorsGroupId(contributor.getLastName()), vCardBean.getValue(), contributorsGroupId(contributor.getEmail()), contributorsGroupId(contributor.getFullName()), contributorsGroupId(contributor.getInstitutionalGroup()), contributorsGroupId(contributor.getSecondaryGroup())));
		}
    collection.setName(contributor.getFullName());
    collection.setAccess(contributor.getAccess());
    collection.setOwner(contributor.getFullName());
    collection.setInstitutionalId("institutionalId");    
    collection.setInstitutionalGroup(contributor.getInstitutionalGroup());
    collection.setAuthor(authors);
		collection.setCollectionRole(contributor.getCollectionGroupId());
    return collection;
	}

	// Get the metadata user from the collection
	private ContributorBean getMetadataUser(CollectionBean collection) throws UserException, SQLException {
		
		// 1. Add a contributor
    ContributorBean contributor = ContributorBean.newContributor();
		
    // Set the contributor's collection role to owner of the collection
    contributor.setCollectionGroupId(collection.getInstitutionalId());
		
    // Set the first contributor's role
    contributor.setRole(contributor.getRole()[0]);
    
    return contributor;
	}
       
	// Has the metadata exist?
	private boolean hasMetadata() throws SQLException {    
		
//    // Get metadata with user role
//    ContributorBean contributor = ContributorBean.
}
}