// StrongestExtensionTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StrongestExtension}.
 * It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
 */
class StrongestExtensionTest {

    @Test
    void testStrongestExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");
        String expected = "MyClass.Extension2";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithEqualStrength() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3", "Extension4");
        String expected = "MyClass.Extension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithEmptyList() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList();
        String expected = "";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithOneExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension1");
        String expected = "MyClass.Extension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithAllUppercaseExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("EXTENSION1", "EXTENSION2", "EXTENSION3");
        String expected = "MyClass.EXTENSION1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithAllLowercaseExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("extension1", "extension2", "extension3");
        String expected = "MyClass.extension3";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithMixedCaseExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("ExTension1", "eXtension2", "EXTENSION3");
        String expected = "MyClass.ExTension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithWhitespaceExtension() {
        String className = "MyClass";
        List<String> extensions = Arrays.asList("Extension 1", "Extension 2", "Extension 3");
        String expected = "MyClass.Extension 1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }

    @Test
    void testStrongestExtensionWithNullClassName() {
        String className = null;
        List<String> extensions = Arrays.asList("Extension1", "Extension2", "Extension3");
        assertThrows(NullPointerException.class, () -> {
            StrongestExtension.strongestExtension(className, extensions);
        });
    }

    @Test
    void testStrongestExtensionWithNullExtensions() {
        String className = "MyClass";
        List<String> extensions = null;
        assertThrows(NullPointerException.class, () -> {
            StrongestExtension.strongestExtension(className, extensions);
        });
    }
}