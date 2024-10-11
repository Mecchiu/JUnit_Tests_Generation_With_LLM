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

// CatalogerAction.java
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

/**
 * A simple {@link Action} which forwards the request to the
 * cataloger page.
 */
public class CatalogerAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// CatalogerActionTest.java
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
* Test class of {@link CatalogerAction}.
* It contains ten unit test cases for the {@link CatalogerAction#actionRequiresLogin()} method.
*/
class CatalogerActionTest {
		
	/**
	* Test case for {@link CatalogerAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		CatalogerAction catalogerAction = new CatalogerAction();
		assertFalse(catalogerAction.actionRequiresLogin());
	}
}

// CatalogerServlet.java
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

/**
 * A simple {@link Action} which forwards the request to the
 * cataloger page.
 */
public class CatalogerServlet extends HttpServlet {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// CatalogerServletTest.java
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
* Test class of {@link CatalogerServlet}.
* It contains ten unit test cases for the {@link CatalogerServlet#actionRequiresLogin()} method.
*/
class CatalogerServletTest {
		
	/**
	* Test case for {@link CatalogerServlet#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		CatalogerServlet catalogerServlet = new CatalogerServlet();
		assertFalse(catalogerServlet.actionRequiresLogin());
	}
}

// DeleteMetadataAction.java
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

/**
 * A simple {@link Action} which deletes a metadata from the database.
 */
public class DeleteMetadataAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// DeleteMetadataActionTest.java
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
* Test class of {@link DeleteMetadataAction}.
* It contains ten unit test cases for the {@link DeleteMetadataAction#actionRequiresLogin()} method.
*/
class DeleteMetadataActionTest {
		
	/**
	* Test case for {@link DeleteMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();
		assertFalse(deleteMetadataAction.actionRequiresLogin());
	}
}

// EditMetadataAction.java
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

/**
 * A simple {@link Action} which sets the session variable used
 * for editing metadata.
 */
public class EditMetadataAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
