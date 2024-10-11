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
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "testIcon");
        assertNotNull(icon);
    }

    @Test
    void testGetIconWithInvalidIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "invalidIcon");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNullClass() {
        ImageIcon icon = FollowApp.getIcon(null, "testIcon");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNullIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, null);
        assertNull(icon);
    }

    @Test
    void testGetIconWithEmptyIconNameKey() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "");
        assertNull(icon);
    }

    @Test
    void testGetIconWithInvalidClass() {
        ImageIcon icon = FollowApp.getIcon(String.class, "testIcon");
        assertNull(icon);
    }

    @Test
    void testGetIconWithAbsolutePath() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "/ghm/follow/testIcon");
        assertNull(icon);
    }

    @Test
    void testGetIconWithRelativePath() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "ghm/follow/testIcon");
        assertNull(icon);
    }

    @Test
    void testGetIconWithNonImageResource() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "testResource");
        assertNull(icon);
    }

    @Test
    void testGetIconWithException() {
        ImageIcon icon = FollowApp.getIcon(FollowAppTest.class, "exceptionIcon");
        assertNull(icon);
    }
}