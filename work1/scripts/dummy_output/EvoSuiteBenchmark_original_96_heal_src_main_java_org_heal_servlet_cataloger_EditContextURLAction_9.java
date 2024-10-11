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
		
    @Test
    public void test() throws IOException, ServletException, InterruptedException {
        
        // Get URL to be edited.
        final String originalURLString = "http://bob.com/test";
        final ContextURLBean testURLBean = new CompleteMetadataBean(new CompleteMetadataBean(originalURLString, null), null);
        
        // Setup test servlet instance.
		final EditContextURLAction servlet = new EditContextURLAction();

        // Setup request.
		final HttpServletRequest request = new BasicHttpServletRequest(new HttpServletRequestWrapper() {
            public RequestDispatcher getRequestDispatcher(String requestPath) {
                return servlet.getRequestDispatcher(requestPath);
            }

            public String getServletPath() {
                return "/WEB-INF/cataloger";
            }
        });
        
        // Setup response (no error).
        final HttpServletResponse response = new BasicHttpServletResponse();
        
        // Run test.
		final String result = servlet.actionRequiresLogin(request, response);

        // Test result.
        assertEquals(originalURLString, result);
    }
    

    @Test
    public void testWithDifferentCase() throws IOException, ServletException {
        
        // Get URL to be edited.
        final String originalURLString = "http://Bob.COM/test";
        final ContextURLBean testURLBean = new CompleteMetadataBean(new CompleteMetadataBean(originalURLString, null), null);
        
        // Setup test servlet instance.
		final EditContextURLAction servlet = new EditContextURLAction();

        // Setup request.
		final HttpServletRequest request = new BasicHttpServletRequest(new HttpServletRequestWrapper() {
            public RequestDispatcher getRequestDispatcher(String requestPath) {
                return servlet.getRequestDispatcher(requestPath);
            }

            public String getServletPath() {
                return "/WEB-INF/cataloger";
            }
        });
        
        // Setup response (no error).
        final HttpServletResponse response = new BasicHttpServletResponse();
        
        // Run test.
		final String result = servlet.actionRequiresLogin(request, response);

        // Test result.
        assertEquals(originalURLString, result);
    }
}