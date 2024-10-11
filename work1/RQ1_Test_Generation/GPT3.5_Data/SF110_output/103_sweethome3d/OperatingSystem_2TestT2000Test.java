```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem_2Test {

    @Test
    void testIsMacOSX() {
        // Test for Mac OS X
        System.setProperty("os.name", "Mac OS X");
        assertTrue(OperatingSystem.isMacOSX());

        // Test for macOS
        System.setProperty("os.name", "macOS");
        assertTrue(OperatingSystem.isMacOSX());

        // Test for Mac OS X 10.5 or superior
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test for Mac OS X 10.4
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
    }
}
```
