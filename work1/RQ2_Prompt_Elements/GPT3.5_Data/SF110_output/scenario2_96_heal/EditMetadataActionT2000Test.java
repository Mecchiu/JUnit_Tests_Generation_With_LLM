// EditMetadataAction.java
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

/**
 * An {@link org.heal.servlet.Action Action} used to edit metadata
 * records.
 *
 * @author Brad Schaefer (<A HREF="mailto:schaefer@lib.med.utah.edu">schaefer@lib.med.utah.edu</A>)
 * @version 1.0
 */
public class EditMetadataAction implements Action {

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

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
* It contains ten unit test cases for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
	
	@Test
	void testActionRequiresLogin() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertTrue(editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginFalse() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertFalse(editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginNull() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertNotNull(editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginNotNull() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertNull(editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginEquals() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertEquals(true, editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginNotEquals() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertNotEquals(false, editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginSame() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertSame(true, editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginNotSame() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertNotSame(false, editMetadataAction.actionRequiresLogin());
	}
	
	@Test
	void testActionRequiresLoginInstanceOf() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertTrue(editMetadataAction.actionRequiresLogin() instanceof Boolean);
	}
	
	@Test
	void testActionRequiresLoginNotInstanceOf() {
		EditMetadataAction editMetadataAction = new EditMetadataAction();
		assertFalse(editMetadataAction.actionRequiresLogin() instanceof String);
	}
}