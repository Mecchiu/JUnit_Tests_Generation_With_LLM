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
		/**
		 * The {@link org.junit.runner.JUnitCore} instance used by unit test cases for this class.
		 */
        @Test
        public void actionRequiresLogin() throws Exception {
                            // Load the module catalog

            final Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("module.name", "");
            parameters.put("metadata.type", "");
            final List<Exception> exceptions = new List<Exception>();
            assertFalse(AuthenticationTools.actionRequiresLogin(parameters, exceptions));
			assertTrue(exceptions.isEmpty());

                        // Build the module name

            final Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("module.name", "CompleteMetadataMod");
            parameters.put("metadata.type", "complete");
            exceptions.clear();
            assertFalse(AuthenticationTools.actionRequiresLogin(parameters, exceptions));
			assertNotNull(exceptions);
			assertEquals(1, exceptions.size());
			Object o = exceptions.get(0).getTarget().getFirstChild();
			assertTrue(o instanceof String);
			assertEquals("Module name not correctly specified", "");
			
			
                        // Build the parameter map
            final Map<String, String> parameters = new HashMap<String, String>();
            parameters.put("metadata.type", "complete");
            parameters.put("library.authoring_method", "");
            parameters.put("library.library_name", "");
            parameters.put("library.library_type", "free-colic");
            parameters.put("library.title", "");
            parameters.put("library.volume_count", "");
            parameters.put("library.year", "");
            parameters.put("library.license", "");
            parameters.put("library.date", "");
            parameters.put("library.authoring_method", "");
            parameters.put("library.authors", "");
            parameters.put("library.description", "");
            parameters.put("library.license", "");
            parameters.put("library.publisher", "");
            parameters.put("library.author_count", "");
            parameters.put("library.is_public", "");
            parameters.put("library.is_published", "");
            parameters.put("library.is_draft", "");
            exceptions.clear();
            assertFalse(AuthenticationTools.actionRequiresLogin(parameters, exceptions));
			assertNotNull(exceptions);
			assertEquals(3, exceptions.size());
			o = exceptions.get(0).getTarget().getFirstChild();
			assertTrue(o instanceof String);
			assertEquals("Library title not correctly set", "complete-library");
			o = exceptions.get(1).getTarget().getFirstChild();
			assertTrue(o instanceof String);
			assertEquals("Invalid parameter Library Title", "");
			o = exceptions.get(2).getTarget().getFirstChild();
			assertTrue(o instanceof String);
			assertEquals("Invalid parameter Library Description", "Complete metadata with no description or no data is an invalid type.");
		}
}