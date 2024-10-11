// ShowApprovalQueueActionTest.java
package org.heal.servlet.approver;

import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ShowApprovalQueueAction}.
* It contains one unit test case for the {@link ShowApprovalQueueAction#actionRequiresLogin()} method.
*/
class ShowApprovalQueueActionTest {
private final static String REQUEST_URI =
			"/org/heal/servlet/actions/ShowApprovalQueueActionTest/ShowApprovalQueueAction";

	private final static String INVOKE_USER_ID_PARAM = "InvokeUserId";

	private final static String INVOKE_USER_ID_PARAM_2 = "InjectUserId";

	private final static String INVOKE_USER_ID = "user_id";

	private final static String INVOKE_PASSWORD_PARAM = "InjectPassword";

	private final static String INVOKE_PASSWORD = "password";

	private final static String PASSPHRASE_PARAM = "passphrase";

	private final static String PASSPHRASE = "passphrase_for_this_test";

	private final static String PASSPHRASE_2 = "password_for_this_test";

	private final static String ACTION_NAME = "ShowApprovalQueueAction";

	// Test the action's implementation

			private void testAction(AuthenticationTools authent) throws Exception {
				RequestDispatcher rd =
					// create a TestActionDispatcher
					ActionUtilsTest.createRequestDispatcher(REQUEST_URI, TestActionDispatcher.class,
															  ActionUtilsTest.PAGE_PATH_PARAM, TestActionDispatcher.PAGE_DISPATCHER_MAPPING_REQUIRED_PARAM, authent);

				TestActionDispatcher dispatcher = (TestActionDispatcher)rd;

				List<Object> params = this.getParams();
				assertEquals(params == null? 0 : params.size(), 1);

				assertEquals(params.get(0), InjectUserIdParam);
				assertEquals(params.get(1), InvokeUserIdParam);
				assertEquals(params.get(2), InvokePasswordParam);
				assertEquals(params.get(3), PASSPHRASE_PARAM);
				assertEquals(params.get(4), PASSPHRASE_2);
				assertEquals(params.get(5), ACTION_NAME);
				assertEquals(params.get(6), INVOKE_USER_ID);

                                assertNotNull(dispatcher.getCalledUser());
                                assertEquals(1, dispatcher.receivedUser());

				this.verify(dispatcher);
			}

			private void verifyParam(int pos, Object val) {
				assertEquals(
						params.get(pos).toString(),
						String.valueOf(val));
			}

			private void verifyParam(int pos, SecurityTools.Params params) {
				assertEquals(
						params.get(pos).toString(),
						params.getValue(0).toString());
			}

			private void verifyParam(int i, HttpServletRequest req) throws ServletException,
													   IOException {
				verifyParam(i,
					req.getParameter(AuthenticationTools.PARAM_INVOKE_USER_ID,
										null));
			}

/*
					private List<Object> getParams() throws ServletException,
															  IOException {
						List<Object> params = new LinkedList<>();

						verifyParam(0, params);

						return params;
					}
*/

				private String getParam(int n) throws IOException {
					return (String)params.get(n);
				}

				private int getParam(int i) throws IOException, ServletException {
					return Integer.parseInt(getParam(i));
				}

				private void assertEquals(String expectedValue, String actualValue) {
					assertEquals(expectedValue, actualValue);
				}
	}

	/**
	 * Create a {@link ShowApprovalQueueAction} from the given {@link HttpServletRequest}.
	 *
	 * @param req The servlet request to get the parameters from.
     * @return The resulting {@link ShowApprovalQueueAction} instance.
	 * @throws ServletException If the parameters couldn't be read.
	 * @throws IOException If a problem occurred.
	 */
	private ShowApprovalQueueAction createAction(HttpServletRequest req) throws ServletException, IOException,
			Exception, InterruptedException {
		final QueueDAO queueDao = QueueDAO.getInstance();

			return (ShowApprovalQueueAction)queueDao.getAction(queueDao.getQueueActionName(req.getParameter(ACTION_NAME)));
	}

	// Test the {@link ShowApprovalQueue action}

	@Test
	public void testRequiresLogin() throws ServletException, IOException {
		this.testAction(AuthenticationTools.createEmptyAuthentication());
	}

	@Test
	public void testActionSuccessfulInvoke() throws ServletException, IOException {
		final QueueDAO queueDao = QueueDAO.getInstance();

			final ShowApprovalQueueAction action = this.createAction(new HttpServletRequest() {
				@Override
				public String getMethod() {
					return "GET";
				}
				@Override
				public String getActionName() {
					return "ShowApprovalQueueAction";
				}
				@Override
				public String getPathInfo() {
					return "";
				}
				@Override
				public String getRequestURI() {
					return REQUEST_URI;
				}
				@Override
				public String getQueryString() {
					return "";
				}
				@Override
				public String getParameter(String name) {
					return getURIParameter("org.heal.servlet.actions", name, false);
				}
				@Override
				public String getURIParameters() {
					return "";
				}
				@Override
				public String getEncodedURL() {
					return "";
				}
				@Override
				public String getRemoteUser() {
					return null;
				}
				@Override
				public String getUserInfo() {
					return null;
				}
				@Override
				public int getUserId() throws ServletException, IOException {
					throw new ServletException("UNAVAILABLE USER!!!");
				}
				@Override
				public Object getSessionAttribute(String name) {
					throw new ServletException("UNAVAILABLE USER!!!");
				}
				private String getURIParameter(String name, String defaultValue) {
					return getQuery