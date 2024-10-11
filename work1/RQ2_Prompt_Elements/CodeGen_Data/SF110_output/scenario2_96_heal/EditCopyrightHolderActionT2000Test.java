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
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {

	static final String USERNAME = "joe";

	static final String PUBLISHER = "Molly";

	static final String BOB = "bob";

	/**
	* Executes the EditCopyrightHolderAction that is called by the user
	*/
	@Test
    void executeTest() {
        final CopyrightHolderBean copyrightHolderBean = new CompleteMetadataBean();
        final BasicCopyrightHolder basicCopyrightHolder = new BasicCopyrightHolder(username, PUBLISHER);
        final boolean basicCopyrightHolderFound =  basicCopyrightHolder.isFound();
        assertTrue("basicCopyrightHolder not found by " + USERNAME, basicCopyrightHolderFound);

        final String basicCopyrightHolderText = basicCopyrightHolder.getFullName();
        final String expectedCopyrightHolderText = "Molly " + PUBLISHER + "\n";

        assertEquals("expected copyright holder text", expectedCopyrightHolderText, basicCopyrightHolderText);
	}

    /**
* Executes the EditCopyrightHolderAction that is called by the user
*/
	@Test
    void executeTest_withRequestDispatcher() throws Exception {
        requestDispatcherRequestTest(USERNAME, PUBLISHER, BOB, true);
    }

    /**
* Executes the EditCopyrightHolderAction that is called by the user
*/
    @Test
    void executeTest_withoutRequestDispatcher() throws Exception {
        requestDispatcherRequestTest(USERNAME, PUBLISHER, BOB, false);
    }

    /**
* Makes and Executes an action that relies on an existing copyright holder.
*/
    private void requestDispatcherRequestTest(String username, 
                                              String publisher, String bob, boolean isFound) 
        throws Exception{
        
        final CopyrightHolderBean copyrightHolderBean = new CompleteMetadataBean();
        final BasicCopyrightHolder basicCopyrightHolder = new BasicCopyrightHolder(username, publisher);
        final boolean basicCopyrightHolderFound =  basicCopyrightHolder.isFound();
        assertTrue("basicCopyrightHolder not found by " + username, basicCopyrightHolderFound);

        final CopyrightHolderBean baseAuthorizationHolderBean = new CompleteMetadataBean();
        baseAuthorizationHolderBean.load(com.dotmarketing.beans.INode.class,username);
        
        final CopyrightHolderBean copyHolderBean = basicCopyrightHolder.copy(baseAuthorizationHolderBean);
        assertEquals("copied",username,bob);
        bob = copyHolderBean.getFullName();
        assertEquals("copied",username,bob);

        final Object[] metadataActions = new Object[2];
        metadataActions[0] = new EditCopyrightHolderAction();
        metadataActions[1] = new EditCopyrightHolderAction();
        final String[] pathData = new String[] {
            "/WEB-INF/catalog-data",
            "/WEB-INF/jsp",
            "/WEB-INF/catalog/edits/copyrightHolder[2]/[0]",
            "/WEB-INF/catalog/copyrightHolder[7]",
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]",
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]",
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]",
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]",
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[2]", 
            "/WEB-INF/catalog/copyrightHolder[7]", 
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog/copyrightHolder[7]/[0]",
            "/WEB-INF/catalog/copyrightHolder[2]/[0]", 
            "/WEB-INF/catalog