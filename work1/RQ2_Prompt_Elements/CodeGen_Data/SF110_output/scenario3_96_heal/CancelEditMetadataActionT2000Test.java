// CancelEditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CancelEditMetadataAction}.
* It contains one unit test case for the {@link CancelEditMetadataAction#actionRequiresLogin()} method.
*/
class CancelEditMetadataActionTest {

	@Test
    void testActionRequiresLogin() throws Exception {
    	assertFalse(CancelEditMetadataAction.actionRequiresLogin());
    }

    
    @Test
    void testAction() throws Exception {
    	
       //
       // Set-Up Test Class.
       //

       // Set-Up Test Class.
       //
		/*
		Object response = null;
		try {
			response = RequestDispatcher
				.getInstance("/Cat")
				.forward(RequestDispatcher.getRequestDispatcher("/Cat.jsp"), request);
			fail();
		}
		catch (Exception e) {
			// This is OK. We'll exit here.
		}

		*/


    	//
	    // A simple GET Request without parameters.
	    //
	    HttpServletRequest request = null;

	    try {
			request = RequestDispatcher
				.getInstance("/Cat")
				.forward(null, request);
			fail();
		}
		catch (Exception e) {
			// This is OK. We'll exit here.
		}

		
			//
		// A simple get Request with multiple parameters.
	    //
		String[] params = {"Cat", "1", "1", "1", ""};

		HttpServletRequest request = null;

		try {
			request = RequestDispatcher
				.getInstance("/Cat")
				.forward(request, params);
			fail();
		}
		catch (Exception e) {
			// This is OK. We'll exit here.
		}

		//
		// A simple get Request containing an empty string. This should fail, as
		// this should return a 401.
	    //
		String[] params = {"Cat", "", ""};

		request = RequestDispatcher
			.getInstance("/Cat")
			.forward(request, this.params);


		//
		// This should also fail, as a null value for the Parameter Map.
		//
		request = RequestDispatcher
			.getInstance("/Cat")
			.forward(request, null);

		//
		// Set-Up Test Class.
		//
	    //
        // Set-Up Test Class.
        //
		HttpServletResponse response = null;

        try {
			response = RequestDispatcher
				.getInstance("/Cat")
				.forward(response, request);
			fail();
		}
		catch (ServletException e) {
			// This is OK. We'll exit here.
		}
        catch (IOException e) {
        	fail("An IOException should have occurred");
        }
        
		/**
		 * Test successful access to catalog.
		 */
		HttpServletResponse response = null;
	    try {
			response = RequestDispatcher
				.getInstance("/catalogcatalog")
				.forward(null, request);
			fail();
		}
		catch (Exception e) {
		    // This is OK. We'll exit here.
		}

		/**
		 * Test successful access to catalog.
		 */
		try {
			response = RequestDispatcher
				.getInstance("/catalogcatalog")
				.forward(null, request);
		}
		catch (ServletException e) {
			// This is OK. We'll exit here.
		}
	}

			private String params[];
}
