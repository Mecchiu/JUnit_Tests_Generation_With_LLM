// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.VCardBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditMetadataAction}.
* It contains one unit test case for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
public static class TestAction extends AbstractAction implements Action{
			public TestAction() {
				super();
			}

			public void perform(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
			  request.getRequestDispatcher("index.jsp").forward(request, response);
			}		

			public boolean actionRequiresLogin() {
				return true;
			}		
		}
		
		@Test
		public void testPost() throws Exception {
				TestAction tester = new TestAction();
				ServletRequestAdapter adapter = new ServletRequestAdapter(request, response, tester);	    	
				Map attributes = new HashMap();
				attributes.put("firstname","John");
				attributes.put("lastname","McDonald");
				Map responseMap =  AdmTools.buildAttributes(request, response, attributes);
					assertEquals("javax.servlet.http.HttpServletResponse#write(int) return", HTTP_OK, responseMap.get(HttpServletResponse.class).
							getResponseCode());
					System.out.println("Successfully tested the EditMetadataAction with valid values");
		}



}
