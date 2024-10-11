// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {
		private final HttpServlet servlet;
        private final HttpServletRequest request;
        private final HttpServletResponse response;
        private final QueueDAO queue;

			/**
     * Constructor for {@link SaveMetadataActionTest}.
     *
     * @param servlet The {@link HttpServlet} instance
     * @param request The {@link HttpServletRequest} instance
     * @param response The {@link HttpServletResponse} instance
     * @param queue The {@link QueueDAO} instance which should be used to create the contexts
     */
    public SaveMetadataActionTest(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response, QueueDAO queue) {
                this.servlet = servlet;
                this.request = request;
                this.response = response;
                this.queue = queue;
    }
    /**
     * Tests {@link SaveMetadataAction#actionRequiresLogin()}
     */
    @Test
    public void testActionRequiresLogin() throws Exception {
        final RequestDispatcher dispatcher = request.getRequestDispatcher("/metadata/savecontext.do");
        final Action action = servlet.getAction("/metadata/savecontext.do");



        assertNotNull(action);
    }

    /**
     * Tests
     */
    @Test
    public void testRequestIsNotNull()throws Exception{
        QueueDAO queue = this.queue;

        assertNotNull(request);
        assertNotNull(response);
        assertNull(servlet);
        assertNotNull(metadataDAO);
        assertNotNull(catalogerDAO);
        assertNotNull(queue);
    }

    /**
     * Tests saving an empty {@link CompleteMetadataBean} to the
     * {@link DeleteMetadataAction#metadataDAO} that is a DAO.
     *
     * @throws Exception a problem is thrown when performing the operation
     */
    @Test
    public void testNullCompleteMetadataBean() throws Exception {
        final DeleteMetadataAction deleteAction = new DeleteMetadataAction();
        final CompleteMetadataBean deleteMetadataBean = null;

        deleteMetadataBean = deleteAction.action(deleteAction.metadataDAO, deleteMetadataBean);

        assertNotNull(deleteMetadataBean);
        assertNotNull(deleteAction);
        assertNotNull(metadataDAO);
    }

    /**
     * Tests saving the given {@link CompleteMetadataBean} to the
     * {@link DeleteMetadataAction#metadataDAO} that is a DAO.
     *
     * @throws Exception a problem is thrown when performing the operation
     */
    @Test
    public void testNullCompleteMetadataBean2() throws Exception {
        final CompleteMetadataBean cmBean = new CompleteMetadataBean();
        cmBean.setId(null);
        cmBean.setRevision(-3);
        final CompleteMetadataBean cmBean2 = null;

        final DeleteMetadataAction deleteMetadataAction = new DeleteMetadataAction();

        deleteMetadataAction.addMetadataBean(cmBean2);
        final CompleteMetadataBean deleteMetadata = deleteMetadataAction.action(deleteMetadataDAO, cmBean);

        assertNotNull(deleteMetadata);
        assertNotNull(deleteMetadataAction);
        assertNotNull(deleteMetadataDAO);
    }

    /**
     * Tests that if a context-URL has been provided then it is updated to an empty string
     * regardless of the value in the database.
     *
     * @throws Exception a problem is thrown when performing the operation
     */
    @Test
    public void testUpdateEmptyContextURL() throws Exception {

        contextURLBean(new ContextURLBean(), "", "");

        metadataDAO.updateMetadataContextURL("", "");

        final CompleteMetadataBean getMetadataMetadataBean = metadataDAO.getMetadata(CompleteMetadataBean.class);

        assertNull(getMetadataMetadataBean);

        try {
            metadataDAO.getMetadata(MetametadataIdentifierBean.class);
            fail("Failure expected for updating an empty contextURL");
        } catch (final SQLException sqle) {
            // pass
        }
    }



}