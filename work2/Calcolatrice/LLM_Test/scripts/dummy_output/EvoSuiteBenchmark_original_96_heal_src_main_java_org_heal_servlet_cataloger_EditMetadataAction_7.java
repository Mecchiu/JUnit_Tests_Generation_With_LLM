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
     * @return <code>true</code>
     */
    private boolean requireLogin() {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password) {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2) {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2, String username3) {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2, String username3, String username4) {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2, String username3, String username4, String username5) {
        return true;
    }
    
    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2, String username3, String username4, String username5, String username6) {
        return true;
    }

    /**
     * @return <code>true</code>
     */
    private boolean requireLogin(String username, String password, String username2, String username3, String username4, String username5, String username6, String username7) {
        return true;
    }

    /**
     * test for a successful edit of complete metadata {@link CompleteMetadataBean}
     * which is defined by {@link CompleteMetadataBean#getCompleteMetadata()} set
     * to a list of {@link ContributorBean}s and a map {@link TargetUserGroupBean#getAllUsers()}
     */
    @Test
    public void editCompleteMetadataTest() throws ClassNotFoundException, SQLException, IOException {
        System.out.println("editCompleteMetadataTest");
        
		CompleteMetadataBean bean = new CompleteMetadataBean();

}
}