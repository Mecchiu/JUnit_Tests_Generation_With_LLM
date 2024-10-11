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
		/**
		 * @return <code>true</code> if the {@link EditMetadataAction#actionRequiresLogin()} method
		 * returns <code>true</code> for the corresponding case; <code>false</code> otherwise
		*/
		public static boolean shouldBeRun();
		synchronized public static void sleep(int ms) {
			try {
				Thread.sleep(ms);
			} catch(Exception e) {
			}
		}

    /**
     * @test editMetadata Action requiresLogin()
     */
    @Test
    public void action_hasNoLoginOrAuthorization() throws SQLException {
        String testSubject = EditMetadataAction.class.getName() + "/EditMetadataAction.hasNoLoginOrAuthorization();";
        boolean shouldFail = (EditMetadataAction.shouldBeRun() == false);
        
        final String testCaseSubject = "EditMetadataAction.hasNoLoginOrAuthorization()";

        EditMetadataAction.sleep(1000);

        assertFalse("EditMetadataAction.hasNoLoginOrAuthorization() should result in login/authorization " + shouldFail, shouldFail);
        
        RequestDispatcher rd = request.getRequestDispatcher(testCaseSubject);
        assertNotNull(rd);
        try {
            rd.forward(request, response);
        } catch(ServletException e) {
            fail("An error occurred forwarding the expected request, while the test case does not expect one");
        }
        
        EditMetadataAction.sleep(1000);
        
        assertFalse("Should not have attempted to execute an unsuccessful action or throw an error, but failed unexpectedly", shouldFail);
    }
   
	/**
	 * Constructor for this class.
	 */
	public EditMetadataActionTest() {
	}
	
	private EditMetadataActionTest() {
	}

}