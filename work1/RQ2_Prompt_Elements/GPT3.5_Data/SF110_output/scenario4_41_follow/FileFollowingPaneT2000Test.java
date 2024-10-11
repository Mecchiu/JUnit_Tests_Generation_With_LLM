// FileFollowingPaneTest.java
package ghm.follow.gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FileFollowingPane}.
 * It contains ten unit test cases for the {@link FileFollowingPane#autoPositionCaret()} method.
 */
class FileFollowingPaneTest {

    /**
     * Test case for autoPositionCaret() method when it returns true.
     */
    @Test
    void testAutoPositionCaretTrue() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertTrue(pane.autoPositionCaret());
    }

    /**
     * Test case for autoPositionCaret() method when it returns false.
     */
    @Test
    void testAutoPositionCaretFalse() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, false, null, 0);
        assertFalse(pane.autoPositionCaret());
    }

    /**
     * Test case for setAutoPositionCaret() method when setting to true.
     */
    @Test
    void testSetAutoPositionCaretTrue() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, false, null, 0);
        pane.setAutoPositionCaret(true);
        assertTrue(pane.autoPositionCaret());
    }

    /**
     * Test case for setAutoPositionCaret() method when setting to false.
     */
    @Test
    void testSetAutoPositionCaretFalse() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        pane.setAutoPositionCaret(false);
        assertFalse(pane.autoPositionCaret());
    }

    /**
     * Test case for getTextPane() method.
     */
    @Test
    void testGetTextPane() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertNotNull(pane.getTextPane());
    }

    /**
     * Test case for getFileFollower() method.
     */
    @Test
    void testGetFileFollower() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertNull(pane.getFileFollower());
    }

    /**
     * Test case for getFollowedFile() method.
     */
    @Test
    void testGetFollowedFile() {
        File file = new File("test.txt");
        FileFollowingPane pane = new FileFollowingPane(file, 0, 0, true, null, 0);
        assertEquals(file, pane.getFollowedFile());
    }

    /**
     * Test case for isFollowing() method.
     */
    @Test
    void testIsFollowing() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertFalse(pane.isFollowing());
    }

    /**
     * Test case for isFollowingPaused() method.
     */
    @Test
    void testIsFollowingPaused() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertFalse(pane.isFollowingPaused());
    }

    /**
     * Test case for clear() method.
     */
    @Test
    void testClear() {
        FileFollowingPane pane = new FileFollowingPane(null, 0, 0, true, null, 0);
        assertDoesNotThrow(() -> pane.clear());
    }
}