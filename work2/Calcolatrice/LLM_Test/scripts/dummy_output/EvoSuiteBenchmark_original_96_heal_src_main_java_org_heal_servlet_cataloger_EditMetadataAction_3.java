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
    * Tests {@link EditMetadataAction#actionRequiresLogin() actionRequiresLogin()}
     * which must return <code>true</code>.
     * We can't know which user will see their new vcard yet, so we can't compare the results.
    */
    @Test
    public void testRequiresLoginForAllUsers() {

        // The value of "contributor" will always be the same.
        // TODO: test can we make this different
        List contributors = MetadataDAO.getInstance().getContributors();
        assertEquals("Mister", contributors.get(0).getFirstName());
        assertEquals("Mister", authenticator.getUser().getFirstName());
    
    }
 
    /**
    * Tests {@link EditMetadataAction#actionRequiresLogin() actionRequiresLogin()}.
    * In this version we can check that we only see the contributions in the list of Contributors
    * (i.e. we never see any other user except himself)
    * @throws SQLException
    *          Thrown if a database exception occurred.
    */
    @Test
    public void testOnlyContributorsOfTheSameKind1() throws SQLException {

        // Test we are only showing the contributions to our own users
        // (if we see them, we should return false, but if we do not, don't)
        Iterator contributors = MetadataDAO.getInstance().getContributors();
        assertFalse("User "+authenticator.getUser().getName()+" cannot see himself.", contributors.hasNext());
        // Test we can't show any user who isn't a contributor of our users:
        // this happens because the data has been changed
        contributors = MetadataDAO.getInstance().getContributors();
        boolean found = false;
        while (contributors.hasNext()) {
            ContributorBean otherContributorBean = (ContributorBean) contributors.next();
            if (otherContributorBean.getUser().getName().equalsIgnoreCase(authenticator.getUser().getName())) {
                found = true;
                break;
            }
        }
        assertTrue("The user '"+authenticator.getUser().getName()+"' cannot show anyone?", found);
    }

    /**
     * Tests {@link EditMetadataAction#actionRequiresLogin() actionRequiresLogin()}
     * with a list of the vcard-added users.
     */
    @Test
    public void testListOfUsers() {

        // Check that we only see the "Mister" user as a contributor of our users
        // (i.e. we don't see that we also see him in the list, like the "Mister"
        // user would have had)
        contributor = authenticator.getUser();
        assertTrue("The user "+contributor.getName()+" cannot show anyone.", contributor.getFirstName().equalsIgnoreCase("Mister"));
        HashMap contributors = new HashMap();
        contributors.put("Mister", authenticator);
        contributor = authenticator.getUser();
        assertTrue("The user "+contributor.getName()+" cannot see themselves.", contributor.getFirstName().equalsIgnoreCase("Mister"));
        
    }
 
    /////////////////////////////////////////////////////////////
     
    private ContributorBean authenticator;
    private ContributorBean contributor;
    private VCardBean vcard;
    private HashMap contributors;
    
     
    private void prepareData(AuthenticationTools authenticationTools) throws SQLException {
    	
        VCardBean vcard = VCardBean.createVCard();
        vcard.setFirstName("Mister");
        vcard.setLastName("Mister");
        ((CompleteMetadataBean) vcard).setCopyrightYear("2013");

        vcard.setEmail("mister2@gmail.com");
        authenticator = new ContributorBean("Mister", "", vcard);

        vcard.setEmail("mister3@gmail.com");
        contributor = new ContributorBean("Mister", authenticationTools, vcard);

        vcard.setEmail("contributor@gmail.com");
        contributors = new HashMap();
        contributors.put("Mister", authenticator);
        contributors.put("Mister2", contributor);
        vcard.setEmail("contributor@gmail.com");
        vcard.setEmail("contributor2@gmail.com");
        vcard.setLastName("Contrib");
        vcard.setFirstName("Contrib");
        vcard.setFirstName("Contrib");
 
    }
 
    /*
    * Run this test from a web application.
    */
    public static void main(String[] args) throws ServletException, IOException {

        // Create a servlet and set up a TestServlet.
        TestServlet testservlet = new TestServlet();
        ServletConfig config = new ServletConfig(testservlet);
        config.setServlet(new TestServlet());
 
        // Create an instance of a Tomcat web server to start the web app running in.
        // It uses 3 different servers, each serving 1,4 or 5. 1. the Tomcat server for all the users, 2. the 4 in the 1.
 
        //
}
}