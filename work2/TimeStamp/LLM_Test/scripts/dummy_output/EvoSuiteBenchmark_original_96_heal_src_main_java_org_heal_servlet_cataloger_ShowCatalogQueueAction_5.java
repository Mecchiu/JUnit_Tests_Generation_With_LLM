// ShowCatalogQueueActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowCatalogQueueAction}.
* It contains one unit test case for the {@link ShowCatalogQueueAction#actionRequiresLogin()} method.
*/
class ShowCatalogQueueActionTest {
		Action action = new ShowCatalogQueueAction();
		String login_url = getLoginURL("/cataloger/ShowCatalogQueueAction.do");
	@Test
void loginRequired();

	@Test
void return_json();

	@Test
void returnEmptyCatalogDAO();

	@Test
void noItems();

	@Test
void listRequestedItem();

	@Test
void requestWithValidItem();

	@Test
void noValidItem();

	@Test
void itemNotFound();

}