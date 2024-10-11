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

	/** Test the action */
	@Test
	void action() {
		// Prepare
		CancelEditMetadataAction.cancelAndUpdate = new CancelEditMetadataAction.CancelEditMetadataAction();
		CancelEditMetadataAction.cancelAndUpdate.setSession(new HttpSession());
		CancelEditMetadataAction.cancelAndUpdate.setRequestReceived(true);

		// Run
		CancelEditMetadataAction.action();

		// Verify test
		assertCanceledOrStill();
			
	}
	
	/**
	 * Make sure it's still not canceled
	 */
	public void assertCanceledOrStill() {
		final String msg = "" //
			+ "The original request is marked as canceled or still being processed in the tests"
				+ ", which are called only by this unit test class.\n"
			+ "It is expected this test class will be called only if the flag can be set.";
				
			assertFalse("It should not be canceled!", CancelEditMetadataAction.cancelAndUpdate.isCanceled("request"));
			
			assertFalse("The original request must not be canceled nor still being processed in the tests", CancelEditMetadataAction.cancelAndUpdate.isCanceled(null));
			assertTrue("The original request should be canceled!", CancelEditMetadataAction.cancelAndUpdate.isCanceled(new HttpServletRequest()));
			assertFalse("The original request should not be canceled anymore!", CancelEditMetadataAction.cancelAndUpdate.isCanceled(new HttpServletRequest()));
			
			assertFalse("The action should not be canceled anymore!", CancelEditMetadataAction.cancelAndUpdate.isCanceled(new HttpServletRequest()));
			
			assertTrue("The action must be canceled or still being processed in the tests", CancelEditMetadataAction.cancelAndUpdate.isCanceled(new HttpServletRequest()));
			assertFalse("The action must not be canceled nor still being processed in the tests", CancelEditMetadataAction.cancelAndUpdate.isCanceled(new HttpServletRequest()));
			
			assertFalse("It must not be canceled because the action requires the login", CancelEditMetadataAction.actionRequiresLogin());
			
			assertTrue("It must be canceled because the action is not requiring the login", CancelEditMetadataAction.actionRequiresLogin());

	}

	/**
	 * CancelEditMetadataAction.CancelAndUpdate tests.
	 * It checks the original request which was canceled or still being processed in the unit tests.
	 * It ensures that the flag as set is canceled or still being processed
		 * under the normal conditions.
		 * But does not assert it is canceled and still being processed or canceled.
	*/
		@Test
	void cancelAndUpdate() {
			final HttpServletRequest request = new HttpServletRequest();

			// Check the flag is not canceled or still be processed
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled anymore or still being processed
			assertFalse(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// Check the flag is canceled or still being processed
			assertFalse(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled anymore or still being processed
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled even in the unit tests
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled and still being processed or not canceled anymore
			assertFalse(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled also in unit tests
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// Flag has been cleared
			assertFalse(request.isRequestedSessionIdValid());

			final HttpSession ses = request.getSession(true);

			// Unset the flag so the request should be discarded
			CancelEditMetadataAction.request = null;

			// Check the flag is canceled or still being processed
			assertFalse(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled anymore or still being processed or canceled
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled and still being processed or not canceled anymore
			assertFalse(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// No need to check the flag is canceled also in unit tests
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

			// Flag has been cleared
			assertFalse(request.isRequestedSessionIdValid());

			// Finally, the flag is set to just to check if this is the case
			assertTrue(CancelEditMetadataAction.cancelAndUpdate.isCanceledOrStill());

		}
	
}

