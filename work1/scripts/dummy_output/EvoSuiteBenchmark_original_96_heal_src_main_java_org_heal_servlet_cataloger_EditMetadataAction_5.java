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
		Map<String, String> map = new HashMap<>();
		MetadataDAO metadataDAO = null;
	private void testPermissions(boolean actionRequiresLogin, int access, int revision){
		assertEquals("Incorrect actionRequired attribute value", actionRequiresLogin,
		                Boolean.parseBoolean(map.get("metadataDAORequiresLogin")));
		assertEquals("Incorrect access attribute value", access,
		                Integer.parseInt(map.get("metadataDAOValue")));
		assertEquals("Incorrect revision attribute value", revision,
		                Integer.parseInt(map.get("metadataDAOValue")));
	}

	@Test
	void editMetadataActionMustReturnCorrectResponseIfActionRequiresLogin() throws SQLException, IOException, ServletException {
		// setup
		final VCardBean vCardData = new VCardBean();
		vCardData.addAuthor("test-user");
		final TargetUserGroupBean tag = new TargetUserGroupBean();
		tag.addMember(new ContributorBean());
		tag.addMember(new CopyrightHolderBean());
		final TaggingDTO taggingDTO = new TaggingDTO(new HashMap<>());
		metadataDAO = new MetadataDAO(taggingDTO, new VCardBean());

		// perform
}
}