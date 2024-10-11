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

    /**
     * Test case for getting an icon with a valid class and resource key.
     */
    @Test
    void testGetIconValid() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, "icon");
        assertNotNull(icon);
    }

    /**
     * Test case for getting an icon with a null class.
     */
    @Test
    void testGetIconNullClass() {
        ImageIcon icon = FollowApp.getIcon(null, "icon");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a null resource key.
     */
    @Test
    void testGetIconNullKey() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, null);
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with an invalid resource key.
     */
    @Test
    void testGetIconInvalidKey() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, "invalid");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with an invalid class.
     */
    @Test
    void testGetIconInvalidClass() {
        ImageIcon icon = FollowApp.getIcon(String.class, "icon");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a class in a different package.
     */
    @Test
    void testGetIconDifferentPackage() {
        ImageIcon icon = FollowApp.getIcon(Component.class, "icon");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a class in the default package.
     */
    @Test
    void testGetIconDefaultPackage() {
        ImageIcon icon = FollowApp.getIcon(DefaultPackageClass.class, "icon");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a resource key that is not an image.
     */
    @Test
    void testGetIconNotImage() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, "about");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a resource key that is an invalid image.
     */
    @Test
    void testGetIconInvalidImage() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, "invalidImage");
        assertNull(icon);
    }

    /**
     * Test case for getting an icon with a resource key that is an empty string.
     */
    @Test
    void testGetIconEmptyKey() {
        ImageIcon icon = FollowApp.getIcon(FollowApp.class, "");
        assertNull(icon);
    }

    /**
     * A class in the default package used for testing.
     */
    private static class DefaultPackageClass {
    }
}