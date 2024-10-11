java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import javax.servlet.ServletRequest;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MetadataRecordModifierTest {

    @Test
    void testGetNextAction_EditContextURLAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("editContextURL");
        Action nextAction = modifier.getNextAction(request);
        assertEquals(EditContextURLAction.class, nextAction.getClass());
    }

    @Test
    void testGetNextAction_EditContributorAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("editContributor");
        Action nextAction = modifier.getNextAction(request);
        assertEquals(EditContributorAction.class, nextAction.getClass());
    }

    @Test
    void testGetNextAction_EditCopyrightHolderAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("editCopyrightHolder");
        Action nextAction = modifier.getNextAction(request);
        assertEquals(EditCopyrightHolderAction.class, nextAction.getClass());
    }

    @Test
    void testGetNextAction_EditControlledVocabularyAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("editControlledVocab");
        Action nextAction = modifier.getNextAction(request);
        assertEquals(EditControlledVocabularyAction.class, nextAction.getClass());
    }

    @Test
    void testGetNextAction_EditRequirementAction() {
        MetadataRecordModifier modifier = new MetadataRecordModifier();
        ServletRequest request = new MockServletRequest("editRequirement");
        Action nextAction = modifier.getNextAction(request);
        assertEquals(EditRequirementAction.class, nextAction.getClass());
    }

    // Add more test cases for other actions

    private static class MockServletRequest implements ServletRequest {
        private final Map<String, String> parameters = new HashMap<>();

        MockServletRequest(String nextAction) {
            parameters.put("nextAction", nextAction);
        }

        @Override
        public String getParameter(String name) {
            return parameters.get(name);
        }

        // Implement other methods of ServletRequest interface
    }
}
