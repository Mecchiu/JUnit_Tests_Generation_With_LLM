// ApplicationConfiguration_11Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.HighlightAction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ApplicationConfiguration}.
 * It contains ten unit test cases for the {@link ApplicationConfiguration#highlightAction()} method.
 */
class ApplicationConfiguration_11Test {

    /**
     * Test case to verify that the HighlightAction bean is not null.
     */
    @Test
    void testHighlightActionBeanNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertNotNull(highlightAction);
    }

    /**
     * Test case to verify that the HighlightAction bean is a singleton.
     */
    @Test
    void testHighlightActionBeanIsSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction1 = configuration.highlightAction();
        HighlightAction highlightAction2 = configuration.highlightAction();
        assertSame(highlightAction1, highlightAction2);
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct name.
     */
    @Test
    void testHighlightActionBeanHasCorrectName() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertEquals("highlightAction", highlightAction.getName());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct label.
     */
    @Test
    void testHighlightActionBeanHasCorrectLabel() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertEquals("Highlight", highlightAction.getLabel());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct tooltip.
     */
    @Test
    void testHighlightActionBeanHasCorrectTooltip() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertEquals("Highlight selected text", highlightAction.getTooltip());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct mnemonic.
     */
    @Test
    void testHighlightActionBeanHasCorrectMnemonic() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertEquals('H', highlightAction.getMnemonic());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct accelerator.
     */
    @Test
    void testHighlightActionBeanHasCorrectAccelerator() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertEquals("ctrl shift H", highlightAction.getAccelerator());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct icon.
     */
    @Test
    void testHighlightActionBeanHasCorrectIcon() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertNotNull(highlightAction.getIcon());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct enabled state.
     */
    @Test
    void testHighlightActionBeanHasCorrectEnabledState() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertTrue(highlightAction.isEnabled());
    }

    /**
     * Test case to verify that the HighlightAction bean has the correct selected state.
     */
    @Test
    void testHighlightActionBeanHasCorrectSelectedState() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        HighlightAction highlightAction = configuration.highlightAction();
        assertFalse(highlightAction.isSelected());
    }
}