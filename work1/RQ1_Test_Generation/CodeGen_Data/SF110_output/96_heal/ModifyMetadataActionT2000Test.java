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
// ModifyMetadataAction.java
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

/**
 * <p>An {@link Action} that saves the metadata from a form into
 * the session's {@link CompleteMetadataBean} by mapping {@link MetadataModifier}s
 * to forms.  The {@link MetadataModifier} which matches the form determines
 * the next {@link Action} to execute.</p>
 *
 * <p>The mapping is currently defined as:</p>
 *
 * <ul><li>'metadata' : {@link MetadataRecordModifier}
 * <li>'contextURL' : {@link ContextURLRecordModifier}
 * <li>'contributor' : {@link ContributorRecordModifier}
 * <li>'copyrightHolder' : {@link CopyrightHolderRecordModifier}
 * <li>'controlledVocabulary' : {@link ControlledVocabularyRecordModifier}
 * <li>'requirement' : {@link RequirementRecordModifier}
 * </ul>
 */
public class ModifyMetadataAction implements Action {

    private final Map modifierMap;

    public ModifyMetadataAction() {
        // Initializes the action map
        Map modifierMap = new HashMap();
        modifierMap.put("metadata", new MetadataRecordModifier());
        modifierMap.put("contextURL", new ContextURLRecordModifier());
        modifierMap.put("contributor", new ContributorRecordModifier());
        modifierMap.put("copyrightHolder", new CopyrightHolderRecordModifier());
        modifierMap.put("controlledVocabulary", new ControlledVocabularyRecordModifier());
        modifierMap.put("requirement", new RequirementRecordModifier());
        modifierMap.put("relation", new RelationRecordModifier());
        modifierMap.put("metametadataIdentifier", new MetametadataIdentifierRecordModifier());
        modifierMap.put("metametadataContributor", new MetametadataContributorRecordModifier());
        // This guarantees that the action map will not be modified after initialization
        this.modifierMap = Collections.unmodifiableMap(modifierMap);
    }

    /**
     * <p>This perform method uses the <code>"type"</code> parameter to save the
     * metadata modifications from the <code>request</code> in the
     * {@link CompleteMetadataBean} that is in the session.  If the type or
     * <code>CompleteMetadataBean</code> doesn't exist, the <code>response</code> is
     * redirected to an error page.</o>
     *
     * <p>When a valid type and a <code>CompleteMetadataBean</code> is available
     * in the session, this method uses the appropriate {@link MetadataModifier}
     * to save the motifications to the metadata and to perform the subsequent
     * {@link Action}.</p>
     */
    public void perform(HttpServlet servlet, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (!AuthenticationTools.isCataloger(request)) {
            // The user does not have the access to view this page
            // so we go no further, and redirect them to an access denied page
            // TODO instead of hardcoding page locations, this should be in config files somewhere
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        final String modifierKey = request.getParameter("type");
        final CompleteMetadataBean cmb = (CompleteMetadataBean) request.getSession().getAttribute("metadata");
        if (null == cmb ||!modifierMap.containsKey(modifierKey)) {
            // Not enough information in the form and/or session to process this request
            response.sendRedirect("/error/accessDenied.jsp");
            return;
        }
        final MetadataModifier modifier = (MetadataModifier) modifierMap.get(modifierKey);
        modifier.updateMetadata(cmb, request);
        Action nextAction = modifier.getNextAction(request);
        nextAction.perform(servlet, request, response);
    }

    /**
     * @return <code>true</code>
     */
    public boolean actionRequiresLogin() {
        return true;
    }
}

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
		private final Map modifierMap;

			/**
			 * <p>Constructs an instance of {@link ModifyMetadataActionTest} with the name
			 * of the class and to which the {@link ModifyMetadataAction} it must use.
			 * 
			 * <p>The name is the type of the <code>CatalogingTest</code> class to which the
			 * ModicateMetadataAction must be applied.</p>
			 * 
			 * @param catalog
			 */
	ModifyMetadataActionTest(Class<?> catalog) {
		this.modifierMap =
			new HashMap<String, Map<String,?>>();
		Map<String, Object> properties = catalog.getProperties();
		for (Map.Entry<String, Object> property : properties.entrySet()) {
			String propertyKey = property.getKey();
			Map<String,?> valueMapping = (Map)property.getValue();
			this.modifierMap.put(catalog.getSimpleName() + '.' + propertyKey, valueMapping);
		}
	}

	@Test
	void testNoParameterMappings() throws ServletException, IOException {
		Action action = ModifyMetadataAction.instance();
		StringBuilder cb = new StringBuilder(512);
		cb.append("&type=modifyMetadata");
		String nextAction = action.getNextAction(null);
		Map<String,?> params =
			Collections.singletonMap("type", cb.toString()).getEntry(nextAction);
		assertFalse("next action contains parameters", params == null);
		ParameterMappingActionParams paramMappingAction = (ParameterMappingActionParams) params.get("type");
		assertTrue(paramMappingAction.getActionNeeded(nextAction).equals(this.modifyMetadataAction));
		assertTrue("hasNextAction does not return null", paramMappingAction.hasNextAction());
		Action nextAction1 = paramMappingAction.getNextAction(nextAction);
		assertNull(nextAction1);
		Map<String, Object> cb2 = new HashMap<String, Object>();
		Map<String,?> paramMapping1 =
			Collections.singletonMap("type", cb2).getEntry("modifyMetadata");
		assertNull("hasNextAction returns first parameter", paramMapping1.get("nextAction"));

		// The test action should not return the parameters and never be executed after
		// it and should return the first parameter
		action = nextAction1;
		cb = new StringBuilder(512);
		cb.append("&type=modifyMetadata");