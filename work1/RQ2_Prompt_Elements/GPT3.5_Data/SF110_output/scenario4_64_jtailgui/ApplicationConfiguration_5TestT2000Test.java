// ApplicationConfiguration_5Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains ten unit test cases for the {@link ApplicationConfiguration#selectIndexTypeListener()} method.
*/
class ApplicationConfiguration_5Test {

    /**
     * Test case for creating a new instance of SelectIndexTypeListener.
     */
    @Test
    void testSelectIndexTypeListener() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        assertNotNull(listener);
    }

    /**
     * Test case for setting the index type to "word".
     */
    @Test
    void testSetIndexTypeToWord() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("word");
        assertEquals("word", listener.getIndexType());
    }

    /**
     * Test case for setting the index type to "line".
     */
    @Test
    void testSetIndexTypeToLine() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("line");
        assertEquals("line", listener.getIndexType());
    }

    /**
     * Test case for setting the index type to "paragraph".
     */
    @Test
    void testSetIndexTypeToParagraph() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("paragraph");
        assertEquals("paragraph", listener.getIndexType());
    }

    /**
     * Test case for setting the index type to an invalid value.
     */
    @Test
    void testSetIndexTypeToInvalidValue() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        assertThrows(IllegalArgumentException.class, () -> listener.setIndexType("invalid"));
    }

    /**
     * Test case for getting the index type when it has not been set.
     */
    @Test
    void testGetIndexTypeWhenNotSet() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        assertNull(listener.getIndexType());
    }

    /**
     * Test case for getting the index type after it has been set to "word".
     */
    @Test
    void testGetIndexTypeAfterSetToWord() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("word");
        assertEquals("word", listener.getIndexType());
    }

    /**
     * Test case for getting the index type after it has been set to "line".
     */
    @Test
    void testGetIndexTypeAfterSetToLine() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("line");
        assertEquals("line", listener.getIndexType());
    }

    /**
     * Test case for getting the index type after it has been set to "paragraph".
     */
    @Test
    void testGetIndexTypeAfterSetToParagraph() {
        SelectIndexTypeListener listener = new ApplicationConfiguration().selectIndexTypeListener();
        listener.setIndexType("paragraph");
        assertEquals("paragraph", listener.getIndexType());
    }
}