// EditContextURLActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContextURLBean;
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
* Test class of {@link EditContextURLAction}.
* It contains one unit test case for the {@link EditContextURLAction#actionRequiresLogin()} method.
*/
class EditContextURLActionTest {

    EditContextURLAction(CompleteMetadataBean metadata) {
		//...
    }

	@Test
    public void testWithNonExistingContext() throws ServletException, IOException {
        // Given
        MetadataContextURLGenerator generator = new MetadataContextURLGenerator(metadata, "test");

        // When
        new EditContextURLAction(metadata);    
    }
    
    @Test
    public void testWithNonExistingContextExists() throws ServletException, IOException {
        // Given
        HttpServlet servlet = new EditContextURLAction(metadata);
        MetadataContextURLGenerator generator = new MetadataContextURLGenerator(metadata, "test");

        // When
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/edit.jsp");
        // Then
        assertTrue(!generator.isNonExistingContext(servlet.getRequest()),
                "The resource should not exist in the context.");
        assertTrue(!generator.isNonValidContext(servlet.getRequest()),
                "The resource should not exist in the context.");
    }

    @Test
    public void testWithNonExistingContextAndNotAdmin() throws ServletException, IOException {
        // Given
        HttpServlet servlet = new EditContextURLAction(metadata);

        // When/Then
        RequestDispatcher dispatcher = servlet.getServletContext().getRequestDispatcher("/edit.jsp");
        assertTrue(!generator.isNonExistingContext(servlet.getRequest()),
                "The resource should not exist in the context.");
        assertTrue(!generator.isNonValidContext(servlet.getRequest()),
                "The resource should not exist in the context.");
        assertTrue(!generator.isNonAdminRole(servlet.getServletRequest()),
                "The resource should not exist in the context.");

    }
}

/**
 *
 * 		 @author mnf
 *
 */
class EditContextURLActionTestImpl extends EditContextURLAction {

    public final static String BEAN_MESSAGE_KEY = "bean.message";
    
    public final static String BEAN_CONTENT_VARIABLE_NAME = "content." + BEAN_MESSAGE_KEY;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean actionRequiresLogin() {
        return true;
    }
 
    /**
     * {@inheritDoc}
     */
    @Override
    public void prepareBean(RequestDispatcher dispatcher) {
        // Set the content variables for this BEAN
        String content = BEAN_MESSAGE_KEY;
        ContextURLBean urlBean = (ContextURLBean) dispatcher.getRequest().getAttribute(ContextURLBean.CONTEXT_URL_ATTRIBUTE_NAME);
        
        // Set the content variable in the bean
        dispatcher.getRequest().setAttribute(BEAN_MESSAGE_KEY,content);
        dispatcher.getRequest().setAttribute("CONTENT_VARIABLE", BEAN_CONTENT_VARIABLE_NAME);
        
//        dispatcher.getRequest().setAttribute("PATH", "context." + CONTEXT_PATH_ATTRIBUTE_NAME);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void executeAction() {
//        ContextURLBean contextURLBean = (ContextURLBean) dispatcher.getRequest().getAttribute(ContextURLBean.CONTEXT_URL_ATTRIBUTE_NAME);
//
//        String context = contextURLBean.getContent();
//        assertTrue(context.startsWith(CONTENT_VARIABLE),
//                String.format("Expected <%s> to start with <%s>", BEAN_CONTENT_VARIABLE_NAME, CONTENT_VARIABLE));
        
//        String current = contextURLBean.getUrl();
//        assertTrue(!current.startsWith(BEAN_URL_ATTRIBUTE_NAME),
//                String.format("Expected <%s> to NOT start with <%s>", BEAN_URL_ATTRIBUTE_NAME, BEAN_URL_ATTRIBUTE_NAME));
    }
}
