```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperatingSystem_3Test {

    @Test
    void testIsMacOSXLeopardOrSuperior() {
        // Test for Mac OS X 10.5 or superior
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5");
        assertTrue(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test for Mac OS X 10.4
        System.setProperty("os.version", "10.4");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test for Windows
        System.setProperty("os.name", "Windows");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());

        // Test for Linux
        System.setProperty("os.name", "Linux");
        assertFalse(OperatingSystem.isMacOSXLeopardOrSuperior());
    }
}
```
```