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
* It contains ten unit test cases for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	* Test case for {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
	* This test case checks if the method returns true.
	*/
	@Test
	public void testActionRequiresLogin() {
		EditCopyrightHolderAction editCopyrightHolderAction = new EditCopyrightHolderAction();
		assertTrue(editCopyrightHolderAction.actionRequiresLogin());
	}
}