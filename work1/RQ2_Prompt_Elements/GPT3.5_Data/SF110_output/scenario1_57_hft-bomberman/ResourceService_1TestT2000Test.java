Here's an example of how you can write unit tests for the `ResourceService` class:

```
import org.junit.jupiter.api.Test;
import javax.swing.ImageIcon;
import static org.junit.jupiter.api.Assertions.*;

class ResourceService_1Test {

    @Test
    void testGetImageIcon() {
        // Test loading an existing image
        ImageIcon icon = ResourceService.getImageIcon("images/test.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());

        // Test loading a non-existing image
        icon = ResourceService.getImageIcon("images/non-existing.png");
        assertNull(icon);
    }

    @Test
    void testGetImageIconWithInvalidPath() {
        // Test loading an image with an invalid path
        ImageIcon icon = ResourceService.getImageIcon("invalid/path.png");
        assertNull(icon);
    }

    @Test
    void testGetImageIconWithNullPath() {
        // Test loading an image with a null path
        ImageIcon icon = ResourceService.getImageIcon(null);
        assertNull(icon);
    }

    @Test
    void testGetImageIconWithEmptyPath() {
        // Test loading an image with an empty path
        ImageIcon icon = ResourceService.getImageIcon("");
        assertNull(icon);
    }

    @Test
    void testGetImageIconWithAbsolutePath() {
        // Test loading an image with an absolute path
        ImageIcon icon = ResourceService.getImageIcon("/images/test.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }

    @Test
    void testGetImageIconWithRelativePath() {
        // Test loading an image with a relative path
        ImageIcon icon = ResourceService.getImageIcon("test.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }

    @Test
    void testGetImageIconWithDifferentExtensions() {
        // Test loading images with different extensions
        ImageIcon icon = ResourceService.getImageIcon("images/test.jpg");
        assertNotNull(icon);
        assertNotNull(icon.getImage());

        icon = ResourceService.getImageIcon("images/test.gif");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }

    @Test
    void testGetImageIconWithDifferentCases() {
        // Test loading images with different cases
        ImageIcon icon = ResourceService.getImageIcon("images/TEST.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());

        icon = ResourceService.getImageIcon("images/tEsT.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }

    @Test
    void testGetImageIconWithSpaces() {
        // Test loading images with spaces in the path
        ImageIcon icon = ResourceService.getImageIcon("images/test image.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }

    @Test
    void testGetImageIconWithSpecialCharacters() {
        // Test loading images with special characters in the path
        ImageIcon icon = ResourceService.getImageIcon("images/test!@#$%^&*()_+-={}|[]\\:\";'<>?,./`~.png");
        assertNotNull(icon);
        assertNotNull(icon.getImage());
    }
}
```

These tests cover various scenarios such as loading existing and non-existing images, loading images with different extensions, cases, spaces, and special characters in the path. They also test for invalid and null paths.