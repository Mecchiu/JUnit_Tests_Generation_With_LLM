```java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.HighlightAction;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_11Test {

    @Test
    void testHighlightActionNotNull() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertNotNull(highlightAction);
    }

    @Test
    void testHighlightActionInstance() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertTrue(highlightAction instanceof HighlightAction);
    }

    @Test
    void testHighlightActionModelNotNull() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertNotNull(highlightAction.getJTailMainModel());
    }

    @Test
    void testHighlightActionModelInstance() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertTrue(highlightAction.getJTailMainModel() instanceof JTailMainModel);
    }

    @Test
    void testHighlightActionHighlightNotNull() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertNotNull(highlightAction.getHighlight());
    }

    @Test
    void testHighlightActionHighlightEmpty() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        assertTrue(highlightAction.getHighlight().isEmpty());
    }

    @Test
    void testHighlightActionAddHighlight() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        highlightAction.addHighlight("ERROR");
        assertFalse(highlightAction.getHighlight().isEmpty());
    }

    @Test
    void testHighlightActionRemoveHighlight() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        highlightAction.addHighlight("ERROR");
        highlightAction.removeHighlight("ERROR");
        assertTrue(highlightAction.getHighlight().isEmpty());
    }

    @Test
    void testHighlightActionToggleHighlight() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        highlightAction.toggleHighlight("ERROR");
        assertFalse(highlightAction.getHighlight().isEmpty());
        highlightAction.toggleHighlight("ERROR");
        assertTrue(highlightAction.getHighlight().isEmpty());
    }

    @Test
    void testHighlightActionClearHighlights() {
        HighlightAction highlightAction = new ApplicationConfiguration().highlightAction();
        highlightAction.addHighlight("ERROR");
        highlightAction.addHighlight("WARNING");
        highlightAction.clearHighlights();
        assertTrue(highlightAction.getHighlight().isEmpty());
    }
}
```
```