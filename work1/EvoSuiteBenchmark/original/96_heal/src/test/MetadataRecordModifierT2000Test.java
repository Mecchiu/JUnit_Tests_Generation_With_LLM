```java
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
```
```java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import javax.servlet.ServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MetadataRecordModifier {

    private static final Map<String, Action> nextActionMap;

    private static final Action NEXT_ACTION_DEFAULT = new EditMetadataAction();

    static {
        Map<String, Action> temp = new HashMap<>();
        temp.put("editContextURL", new EditContextURLAction());
        temp.put("editContributor", new EditContributorAction());
        temp.put("editCopyrightHolder", new EditCopyrightHolderAction());
        temp.put("editControlledVocab", new EditControlledVocabularyAction());
        temp.put("editRequirement", new EditRequirementAction());
        // Add more actions to the map
        nextActionMap = Collections.unmodifiableMap(temp);
    }

    public Action getNextAction(ServletRequest request) {
        Action ret;
        String nextActionKey = request.getParameter("nextAction");
        if (nextActionMap.containsKey(nextActionKey)) {
            ret = nextActionMap.get(nextActionKey);
        } else {
            ret = NEXT_ACTION_DEFAULT;
        }
        return ret;
    }
}
```
```java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

public class EditContextURLAction implements Action {
    // Implement the action logic
}

public class EditContributorAction implements Action {
    // Implement the action logic
}

public class EditCopyrightHolderAction implements Action {
    // Implement the action logic
}

public class EditControlledVocabularyAction implements Action {
    // Implement the action logic
}

public class EditRequirementAction implements Action {
    // Implement the action logic
}

// Implement more action classes for other actions
```
```java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

public class EditMetadataAction implements Action {
    // Implement the action logic
}
```
```java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;

public class MockServletRequest implements ServletRequest {
    // Implement the mock ServletRequest for testing
}
```
```java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import javax.servlet.ServletRequest;

public interface Action {
    // Define the Action interface
}
```
```java
package org.heal.servlet.cataloger;

import javax.servlet.ServletRequest;

public interface ServletRequest {
    // Define the ServletRequest interface
}
```