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
	public void testHasRequiredPrivileges() {
		assertFalse(AuthorizationTools.hasPrivilege(null, PrivilegeTypes.EDIT_METADATA));
		assertFalse(AuthorizationTools.hasPrivilege(new Object(), PrivilegeTypes.EDIT_METADATA));
	}
	
	@Test
	public void testGetRequiredPrivileges() {
		// No required privileges
		List<String> vcardPrivs = new ContributorBean().getRequiredPrivileges();
		assertTrue(vcardPrivs, vcardPrivs.isEmpty());
		
		// Authenticated, requires login
		AuthUserInfo authUser = new AuthUserInfo(System.getProperty("user.name"));
		List<String> authPrivs = authUser.getRequiredPrivileges();
		assertTrue(authPrivs, authPrivs.isEmpty());
		
		// Authorized, requires login
		AuthUserInfo user = new AuthUserInfo(System.getProperty("user.name"));
		List<String> userPrivs = user.getRequiredPrivileges();
		assertFalse(authPrivs, userPrivs.isEmpty());
	}

	@Test
	public void testGetContainsCompleteMetadata() {
		new ContributorBean().getContainsCompleteMetadata();
		assertTrue(new ContributorBean().getContainsCompleteMetadata());
	}
	
	@Test
	public void testGetListOfCompleteMetadata() {
		final CompleteMetadataBean completeMetadata = new ContributorBean().getListOfCompleteMetadata();
		assertFalse(completeMetadata.isEmpty());
		Iterator it = completeMetadata.iterator();
		assertTrue(it.hasNext());
		CompleteMetadataBean currCompleteMetadata = (CompleteMetadataBean)it.next();
		assertEquals(1, currCompleteMetadata.size());
		String lastCompleteMetadata = currCompleteMetadata.getLastFullKey();
		assertEquals("Last Full Key", lastCompleteMetadata);
		assertNotNull(currCompleteMetadata.getLastFullMetadata());
		assertNull(currCompleteMetadata.getLastMapping());
		assertEquals("Last Key", currCompleteMetadata.getLastKey());

	}

	@Test
	public void testGetAllMetadata() {
		List<HashMap<String, String>> data = new ContributorBean().getListOfCompleteMetadata();
		assertFalse(data, data.isEmpty());

		Iterator<HashMap<String, String>> it = data.iterator();
		HashMap<String, String> currMetadata = it.next();
		HashMap<String, String> lastMetadata = currMetadata.get("Last Key");
		assertNotNull(lastMetadata);
		assertNotNull(lastMetadata.get("Last Full Key"));
		
		assertTrue(it.hasNext());
		currMetadata = it.next();
		lastMetadata = currMetadata.get("Last Full Key");
		assertNotNull(lastMetadata);
		assertTrue(it.hasNext());
		currMetadata = it.next();
		lastMetadata = currMetadata.get("Last Full Key");
		assertNotNull(lastMetadata);

		assertTrue(it.hasNext());
		currMetadata = it.next();
		lastMetadata = currMetadata.get("Last Full Key");
		assertNotNull(lastMetadata);
		assertNotNull(lastMetadata.get("Last Full Key"));
	}

    @Test
    public void testHasNextPage() {
        List<HashMap<String, String>> data = new ContributorBean().getListOfCompleteMetadata();
        Iterator<HashMap<String, String>> it = data.iterator();

        int currPage = 0;
}
}