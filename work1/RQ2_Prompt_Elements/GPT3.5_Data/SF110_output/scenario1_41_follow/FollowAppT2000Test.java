// FollowAppTest.java
package ghm.follow;

import org.junit.jupiter.api.Test;
import javax.swing.ImageIcon;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FollowApp}.
 * It contains ten unit test cases for the {@link FollowApp#getIcon(Class, String)} method.
 */
class FollowAppTest {

    @Test
    void testGetIconWithValidIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.open");
        assertNotNull(icon);
    }

    @Test
    void testGetIconWithInvalidIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.invalid");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNullClass() {
        ImageIcon icon = FollowApp.getIcon(null, "icon.open");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNullIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(getClass(), null);
        assertNull(icon);
    }

    @Test
    void testGetIconWithEmptyIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "");
        assertNull(icon);
    }

    @Test
    void testGetIconWithWhitespaceIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "   ");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNonexistentIconFile() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.nonexistent");
        assertNull(icon);
    }

    @Test
    void testGetIconWithValidIconNameKeyAndInvalidImage() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.invalidImage");
        assertNull(icon);
    }

    @Test
    void testGetIconWithValidIconNameKeyAndValidImage() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.validImage");
        assertNotNull(icon);
    }

    @Test
    void testGetIconWithValidIconNameKeyAndValidImageInSubdirectory() {
        ImageIcon icon = FollowApp.getIcon(getClass(), "icon.subdirectory.validImage");
        assertNotNull(icon);
    }
}