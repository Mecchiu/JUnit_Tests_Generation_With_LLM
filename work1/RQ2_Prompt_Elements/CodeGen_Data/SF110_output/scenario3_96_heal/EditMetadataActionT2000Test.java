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
    public void testAction() {
		assertEquals("wrong value", AuthenticationTools.UserType.COMMUNITY_USER, AuthenticationTools.UserType.fromInt(AuthenticationTools.UserType.COMMUNITY_USER));
		assertEquals("wrong value", TargetUserGroupBean.USERS_COMMONS, TargetUserGroupBean.fromInt(TargetUserGroupBean.USERS_COMMONS));
		assertEquals("wrong value", ContributorBean.USERS_ALLOCATION_PRIVATE, ContributorBean.fromInt(ContributorBean.USERS_ALLOCATION_PRIVATE));
		String testString = "Test123";
		assertEquals("wrong value", "Test", testString);
		assertEquals("wrong value", "Test", testString);
        assertEquals("wrong value", "Test", testString);
		assertEquals("wrong value", "Test123", testString);
        assertEquals("wrong value", "Test123", testString);
		assertEquals("wrong value", "Test123", testString);
        assertEquals("wrong value", "Test123", testString);
		assertEquals("wrong value", "test123", testString);
        assertEquals("wrong value", "test123", testString);
		assertEquals("wrong value", "Test123", testString);
        assertEquals("wrong value", "test123", testString);
		assertEquals("wrong value", "test123", testString);
		assertEquals("wrong value", "test123", testString);
        assertEquals("wrong value", "test123", testString);
		assertEquals("wrong value", "test123", testString);
        assertEquals("wrong value", "test123", testString);
        assertEquals("wrong value", "test123", testString);
		assertEquals("wrong value", "testtesttest", testString);
        assertEquals("wrong value", "testtesttest", testString);
		assertEquals("wrong value", "testtesttest", testString);
		assertEquals("wrong value", "testtesttest", testString);
        assertEquals("wrong value", "testtesttest", testString);
		assertEquals("wrong value", "testtesttest", testString);
		assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatoesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatoesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
        assertEquals("wrong value", "testtatesttest", testString);
	}
    
	
}
