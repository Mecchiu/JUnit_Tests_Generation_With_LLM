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
		
		
    public static class TestContextURL implements CompleteMetadataBean {
        private final String contextURL;
        private final String contextName;
        private ContextURLBean contextURLBean;
			
        /* (non-Javadoc)
         * @see  javax.ws.rs.core.CompositeMetadata#toMetadataValue()
         */
        public String toMetadataValue() {
        	return contextURLBean.getName()+"#"+contextURLBean.getContextUrl();
        }

        /**
         * @return the context URL used as context.
         */
        public String getContextURL() {
        	return contextURL;
        }
        
        
        /**
         * @return the name of the Context.
         */
        public String getContextName() {
        	return contextName;
        }
        
        
        /**
         * @return the context URL for the contextName specified.
         */
        public String getContextUrl() {
        	return contextURLBean.getContextUrl();
        }
    }
	
	@Test
	public void testEditContextURL_noChange() throws Exception {
		
		CompleteMetadataBean context = new CompleteMetadataBean();
		context.setTitle("testEditContextURL_noChange()");
		context.setName("testEditContextURL_noChange()");
		context.setCreatedDate(System.currentTimeMillis());
		
		
		RequestDispatcher testDispatcher = servletContext.getRequestDispatcher("/testEditContextURL_noChange.jsp");
		testDispatcher.forward(request, response);
		
	}
	
	@Test
	public void testEditContextURL_change() throws Exception {
		
		TestContextURL context = new TestContextURL();
		context.setContextUrl("http://a");
		context.setContextName("another");
		
		CompleteMetadataBean newContext = new CompleteMetadataBean();
		newContext.setTitle("testEditContextURL_change()");
		newContext.setName("testEditContextURL_change()");
		newContext.setCreatedDate(System.currentTimeMillis());
		
		context.setContextURLBean(newContext);
		
		
		RequestDispatcher testDispatcher = servletContext.getRequestDispatcher("/testEditContextURL_change.jsp");
		testDispatcher.forward(request, response);
			
	}

}