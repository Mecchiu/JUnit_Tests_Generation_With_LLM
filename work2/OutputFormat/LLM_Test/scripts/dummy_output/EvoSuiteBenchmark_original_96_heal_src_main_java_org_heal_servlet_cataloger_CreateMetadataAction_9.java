// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {
		private CreateMetadataAction action;
		private Map<String, String> parameters;
		private boolean createOnly;
		
		public CreateMetadataActionTest() {
			this.createOnly = true;
			this.action = new CreateMetadataAction();
		}
		
		/*
		 * @testActionRequiresLogin method will throw exception if user is not user
		 * or admin.
		 */
		@Test
		public void actionRequiresLogin_invalidUser() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, null);
			assertEquals(1, params.size());

			assertTrue(
					params.containsKey("login")
			); // the only thing we have to check is the username
			assertEquals(AuthenticationTools.getCurrentUserId(), params.get("login"));
		}
		
		/*
		 * The test for this action method will throw exception if the user does not exist.
		 */
		@Test
		public void actionRequiresLogin_userNotExist() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, null);
			assertEquals(1, params.size());
			assertTrue(
					params.containsKey("login")
			); // the only thing we have to check is the username
			assertEquals(AuthenticationTools.getCurrentUserId(), params.get("login"));
			try {
				this.action.processRequest(req, params);
				fail(
						"The action should have failed. " +
						"The user does not exist. \n" +
						"Please check the login entry in your request or the log in step of the action. \n\r" 
				);
			} catch (Exception e) {
				// pass
			}
		}
		
		@Test
		public void actionRequiresLogin_noneRequiredParameter() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, null);
			assertEquals(params.size(), 1);
			assertTrue(params.containsKey("id"));
			assertTrue(params.containsKey("code"));
		}
		
		@Test
		public void actionRequiresLogin_additionalArguments_noParam() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, params());
			assertEquals(params.size(), 0);
		}
		
		@Test
		public void actionRequiresLogin_additionalArguments_oneParam() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, params());
			final String id = (String)params.get("id");
			final String code = (String)params.get("code");


			assertTrue(params.containsKey("loggedin"));
			assertTrue(params.containsKey("code"));
			assertTrue(params.containsKey("login"));
			assertTrue(params.containsKey("id"));
		}

		@Test
		public void actionRequiresLogin_additionalArguments_listOfNames() throws Exception {
			createOnly = false;
			final HttpServletRequest req = request("POST", null, null);
			final Map params = this.action.processRequest(req, params());
			final String id = (String)params.get("id");
			final String code = (String)params.get("code");


			assertTrue(params.containsKey("loggedin"));
			assertTrue(params.containsKey("code"));
			assertTrue(params.containsKey("id"));
			assertTrue(params.containsKey("loggedin"));
			assertEquals(new String[] {"code", "login", id, "code"}, params.keySet().toArray());

			assertTrue(params.containsKey("loggedin"));
			assertEquals(true, params.get("loggedin"));
			assertTrue(params.containsKey("loggedin"));
			assertEquals(true, params.get("loggedin"));
		}
		
		private Object request(String action_method, Object... args) throws Exception {
			Map methodParameters = new HashMap();
			methodParameters.put("action_method", action_method);
			if (args!= null) {
				for (int index = 1; index < args.length; ++index) {
					methodParameters.put(args[index].toString(), args[index]);
				}
			}
			final Map params = new HashMap();
			params.put("create_only", createOnly);
}
}