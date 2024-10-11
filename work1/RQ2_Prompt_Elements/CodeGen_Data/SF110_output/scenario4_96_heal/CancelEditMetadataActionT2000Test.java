// CancelEditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CancelEditMetadataAction}.
* It contains one unit test case for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {

    @Test
    public void testIsRunThrough() throws Exception {							
        Auths auths = AuthenticationTools.runAsyncAndGetAuthorization(
				      this.getClass().getResource("/../Auths.properties"));
		Auths.AuthorizationRequest authReq = Auths.getAuthorizationRequest(auths);
		CancelEditMetadataAction authAction = CancelEditMetadataAction.class;
		boolean result = authAction.actionRequiresLogin() && (authReq == authAction.getAuthRequest());
		assertTrue(result);
    }
}
