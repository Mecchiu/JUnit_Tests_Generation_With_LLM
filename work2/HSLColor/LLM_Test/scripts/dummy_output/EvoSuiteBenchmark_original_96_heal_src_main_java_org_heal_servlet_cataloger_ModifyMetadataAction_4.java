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
		// ****************************************************
		// Unit tests in this class.
		// ****************************************************

    @Test
    public void actionExecutesAction() throws Exception {
        Map userMap = ImmutableMap.of("contributor", Collections.singletonList("foo"));
        MetadataModifier modifier = new MetadataModifier();
        ModifyMetadataAction action = new ModifyMetadataAction();
        assertFalse(action.actionRequiresLogin());
        action.setModifierMap(userMap);
        action.setModifier(modifier);
        Action nextAction = action.actionExecutes(new HttpServletRequest(), new HttpServletResponse());
        assertTrue(nextAction instanceof AuthenticatedAction);
        AuthenticationTools.assertAccess(userMap, nextAction);
    }

    @Test
    public void modifierIsNotAffectedByUserNotLogin() throws Exception {
        Map userMap = ImmutableMap.of("notUser", Collections.singletonList("foo"));
        MetadataModifier modifier = new MetadataModifier();
        ModifyMetadataAction action = new ModifyMetadataAction();
        assertFalse(action.actionRequiresLogin());
        action.setModifierMap(userMap);
        action.setModifier(modifier);
        Action nextAction = action.actionExecutes(new HttpServletRequest(), new HttpServletResponse());
        assertTrue(nextAction instanceof AuthenticatedAction);
        AuthenticationTools.assertAccess(userMap, nextAction);
    }

    @Test
    public void actionExecutesActionToNullMetadataRecord() throws Exception {
        Map userMap = ImmutableMap.of("contributor", Collections.singletonList("foo"));
        MetadataModifier modifier = new MetadataModifier();
        ModifyMetadataAction action = new ModifyMetadataAction();
        action.setModifierMap(userMap);
        action.setModifier(modifier);
        action.setMetadataRecord(null);
        Action nextAction = action.actionExecutes(new HttpServletRequest(), new HttpServletResponse());
        assertTrue(nextAction instanceof AuthenticatedAction);
        AuthenticationTools.assertAccess(userMap, nextAction);
    }

    // ****************************************************
    // Test class under test.
		// ****************************************************

    private final CompleteMetadataBean completeMetadata;
    /* private final Map userMap; */
    private final Map userMap;
    private final Map<String, String> modifierMap;
	private final Map<String, MetadataModifier> modifierMapToTest;
	private final Map<String, String> modifedActions;
    private final Map<String, String> modifedModifier;

    public ModifyMetadataActionTest(CompleteMetadataBean completeMetadata, Map<String, String> userMap, Map<String, String> modifierMap, Map<String, String> modifedActions, Map<String, String> modifedModifier, Map<String, MetadataModifier> modifierMapToTest) {
		this.completeMetadata = completeMetadata;
		this.userMap = userMap;
		this.modifierMap = modifierMap;
		this.modifedActions = modifedActions;
		this.modifedModifier = modifedModifier;

		this.modifierMapToTest = modifierMapToTest;
	}
}