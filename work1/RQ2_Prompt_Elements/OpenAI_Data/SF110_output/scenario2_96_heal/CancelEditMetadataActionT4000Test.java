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
* Test class of {@link EditMetadataAction}.
* It contains ten unit test cases for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
		
	/**
	* Test case for {@link EditMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertFalse(editMetadataAction.actionRequiresLogin());
	}
}

// SaveMetadataAction.java
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
 * A simple {@link Action} which saves a metadata to the database.
 */
public class SaveMetadataAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// SaveMetadataActionTest.java
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
* Test class of {@link SaveMetadataAction}.
* It contains ten unit test cases for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {
		
	/**
	* Test case for {@link SaveMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		SaveMetadataAction saveMetadataAction = new SaveMetadataAction();
		assertFalse(saveMetadataAction.actionRequiresLogin());
	}
}

// SearchMetadataAction.java
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
 * A simple {@link Action} which searches for metadata in the database.
 */
public class SearchMetadataAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// SearchMetadataActionTest.java
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
* Test class of {@link SearchMetadataAction}.
* It contains ten unit test cases for the {@link SearchMetadataAction#actionRequiresLogin()} method.
*/
class SearchMetadataActionTest {
		
	/**
	* Test case for {@link SearchMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		SearchMetadataAction searchMetadataAction = new SearchMetadataAction();
		assertFalse(searchMetadataAction.actionRequiresLogin());
	}
}

// ShowMetadataAction.java
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
 * A simple {@link Action} which shows a metadata from the database.
 */
public class ShowMetadataAction implements Action {

    /**
     * @return <code>false</code>
     */
    public boolean actionRequiresLogin() {
        return false;
    }
}

// ShowMetadataActionTest.java
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
* Test class of {@link ShowMetadataAction}.
* It contains ten unit test cases for the {@link ShowMetadataAction#actionRequiresLogin()} method.
*/
class ShowMetadataActionTest {
		
	/**
	* Test case for {@link ShowMetadataAction#actionRequiresLogin()} method.
	* It tests if the method returns <code>false</code>.
	*/
	@Test
	void testActionRequiresLogin() {
		ShowMetadataAction showMetadataAction = new ShowMetadataAction();
		assertFalse(showMetadataAction.actionRequiresLogin());
	}
}

// ShowMetadataServlet.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
