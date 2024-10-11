// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains one unit test case for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		public void testActionRequiresLogin() {
			try {
				CompleteMetadataBean.setAuthentication(AuthenticationTools.createNewAuthentication("test", "User"));
				Action action = Action.createAction("test");
				action.setServlet(new ActionServletA("test"));
				ServletContext context = new ModifyMetadataAction().createRequestContext();
				assertNotNull(context);
				assertNotNull(context.getHttpContext());
				assertEquals("actionRequiresLogin", context.getActionID());
				String type =
				"contextURL";
				CompleteMetadataBean.addContextual(Collections.singletonMap(type, context));
				assertNotNull(CompleteMetadataBean.getInstance());
				assertArrayEquals(
					new String[] {"Requested action",
									"type",
								"contextURL"},
					CompleteMetadataBean.getInstance().getActionList(type));
                assertEquals(type,
				new String[] {"Request",
						 "contextURL",
							 "modifierMap"});
				assertArrayEquals(CompleteMetadataBean.getInstance().getKeyMetadata(),
					CompleteMetadataBean.getInstance().getKeyMetadata(type));
			} catch (ServletException | IOException e) {
				fail(e.getMessage());
			}
		}

		public void testActionRequiresLogin2() {
			// Nothing to test for this instance
		}

		public void testActionRequiresLogin3() {
			CompleteMetadataBean.addContextual(Collections.singletonMap(CompleteMetadataBean.METADATA_KEY_REQUIRED, true));
			CompleteMetadataBean.addContextual(Collections.singletonMap(CompleteMetadataBean.METADATA_KEY_CONTRIBUTOR, true));
			CompleteMetadataBean.addContextual(Collections.singletonMap(CompleteMetadataBean.METADATA_KEY_TREAT, true));
			try {
				CompleteMetadataBean.addAction(new ModifyMetadataAction());
				// Invalid request
				CompleteMetadataBean.getInstance();
				fail("Should have caught invalid request");
			} catch (ServletException | IOException e) {
				assertEquals("actionRequiresLogin", e.getMessage());
			}
		}

		public void testContextURL() {
				CompleteMetadataBean.addContextual(Collections.singletonMap("request", "ContextURL"));
				CompleteMetadataBean.addAction(new ModifyMetadataAction());
				assertEquals("ContextURL",
				CompleteMetadataBean.getInstance().getContextURL());
		}
		
		
}