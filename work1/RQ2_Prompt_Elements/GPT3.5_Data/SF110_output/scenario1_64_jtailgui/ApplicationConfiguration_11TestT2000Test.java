// ApplicationConfiguration_11Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.HighlightAction;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
*/
class ApplicationConfiguration_11Test {

    @Test
    void testHighlightActionNotNull() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertNotNull(highlightAction);
    }

    @Test
    void testHighlightActionUsesJTailMainModel() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        JTailMainModel jTailMainModel = highlightAction.getJTailMainModel();
        assertNotNull(jTailMainModel);
    }

    @Test
    void testHighlightActionUsesDefaultHighlightColor() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_COLOR, highlightAction.getHighlightColor());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightName() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_NAME, highlightAction.getHighlightName());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightPattern() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_PATTERN, highlightAction.getHighlightPattern());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightEnabled() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_ENABLED, highlightAction.isHighlightEnabled());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightCaseSensitive() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_CASE_SENSITIVE, highlightAction.isHighlightCaseSensitive());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightWholeWord() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_WHOLE_WORD, highlightAction.isHighlightWholeWord());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightBackgroundColor() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_BACKGROUND_COLOR, highlightAction.getHighlightBackgroundColor());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightForegroundColor() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_FOREGROUND_COLOR, highlightAction.getHighlightForegroundColor());
    }

    @Test
    void testHighlightActionUsesDefaultHighlightStyle() {
        ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
        HighlightAction highlightAction = applicationConfiguration.highlightAction();
        assertEquals(HighlightAction.DEFAULT_HIGHLIGHT_STYLE, highlightAction.getHighlightStyle());
    }
}