// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
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
* Test class of {@link EditContributorAction}.
* It contains one unit test case for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {

	/**
* @throws ServletException
*/
	@Test
	public void test() throws ServletException {

		String basePath = EditContributorAction.class.getProtectionDomain().getCodeSource().getLocation().toString() + "/";
		
		HttpServlet servlet = EditContributorActionNew.servlet(basePath);
		TestUtils.validate(servlet);
		
	} 
}