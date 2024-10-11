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
		
	public String[] getTestParameterList() {
		return new String[0]; // no test parameter
	}
	/**
     * Validates the correctness of action with a Context URL.
     */
	void testCase(HttpServlet servlet, HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
        // Setup the expected values for the request.
        CompleteMetadataBean mdc = new CompleteMetadataBean(); // create new md

        ContextURLBean curl = new ContextURLBean(request.getResourceURL().getPath());
        mdc.setContextUrl(curl); // add current path to the end of the expected Context URL
        mdc.setServerURL("http://localhost:8080/MetadataServer");
        mdc.setLocale("en");

        final Long firstContextAddition = mdc.init(); // call only once

        // Perform the action.
        String[] parameters = getTestParameterList();
        String[] args = { "testContextEdit" };

		// Note: Use an anonymous HTTP servlet (such as @Action) here in
		// order to use standard HttpServletRequest as the target for the request.

        Action a = new EditContextURLAction(args);

        try {
            a.setMetadata(mdc);
        	assertTrue(true);
        } catch (ServletException e) {
            assertEquals(404, e.getErrorCode());
            String msg = "ERROR: The testContextEdit call failed!";
            if (a.actionRequiresLogin())
                        msg += ". "+e.getCause().toString();
            else
                    msg += ". "+e.getLocalizedMessage().toString();
            setResponseContent(response, msg);
        }

        assertEquals(firstContextAddition, mdc.getFirstContextAddition());
    }

	@Test
    public void testContextEdit()
            throws
            IOException,
            ServletException,
            Exception {
            HttpServlet servlet = createServlet(EditContextURLAction.class);
            HttpServletRequest request = createRequest(servlet, "/MetadataServer/MetadataServer/Metadata2.xml", "/MetadataServer/MetadataServer/Metadata2.xml");

            request.setSession(createSession(request, true));

            testCase(servlet, request,
                    createResponse(200, "Content-Type: application/xml"));
    }

  /**
    * Creates a HttpServletRequest for test purposes.
    */
	HttpServletRequest createRequest(HttpServlet servlet, String path, String fileName) {
        HttpServletRequest request = new HttpServletRequest();

        request.setRequestURI("http://localhost:8080/MetadataServer/MetadataServer?fileName=" + fileName);
        request.setSession(createSession(request, true));

        RequestDispatcher rd = request.getRequestDispatcher(RequestDispatcher.FORWARD_SLASH + path);

        rd.include(request, "/metadata");
        return request;
    }

  /**
	 * Creates a HttpServletResponse for test purposes.
	 */
	HttpServletResponse createResponse(int status, String mimeType) throws IOException {
		HttpServletResponse response = new HttpServletResponse();

		response.setContentType(mimeType);
		response.setStatus(status);

		return response;
	}

	HttpServlet createServlet(Class<?> c) throws ServletException {
		HttpServlet servlet = null;

		try {
			ClassLoader ccl = c.getClassLoader();
            servlet = (HttpServlet) ccl.loadClass(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (servlet!= null) {
            servlet.init(new MockServletConfig());
        } else {
            throw new Exception("Servlet for testing cannot be loaded - Class: "+c.getName());
        }

		return servlet;
	}

	RequestDispatcher createDispatcher(HttpServletRequest request, String path) throws IOException {
		return (RequestDispatcher) request.getContext().getAttribute("DISPATCHER");
	}

	Session createSession(HttpServletRequest request, boolean isRequestForLogin) {
        SessionImpl session = new SessionImpl(request);
        session.setIsRequestForLogin(isRequestForLogin);
        return session;
    }

}