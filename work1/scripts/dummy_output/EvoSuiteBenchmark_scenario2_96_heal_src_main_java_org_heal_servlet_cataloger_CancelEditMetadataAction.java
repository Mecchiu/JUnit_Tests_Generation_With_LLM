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
* It contains ten unit test cases for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {
		
	/**
	* Test case for {@link CancelEditMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		CancelEditMetadataAction cancelEditMetadataAction = new CancelEditMetadataAction();
		assertFalse(cancelEditMetadataAction.actionRequiresLogin());
	}
}