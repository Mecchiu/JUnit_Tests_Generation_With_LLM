// StrongestExtensionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrongestExtension}.
* It contains ten unit test cases for the {@link StrongestExtension#strongestExtension(String, List)} method.
*/
class StrongestExtensionTest {
			// Test case 1
    @Test
    void testStrongestExtension1() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 2
    @Test
    void testStrongestExtension2() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 3
    @Test
    void testStrongestExtension3() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 4
    @Test
    void testStrongestExtension4() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testStrongestExtension5() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testStrongestExtension6() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7", "MyExtension8");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testStrongestExtension7() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7", "MyExtension8", "MyExtension9");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testStrongestExtension8() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7", "MyExtension8", "MyExtension9", "MyExtension10");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testStrongestExtension9() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7", "MyExtension8", "MyExtension9", "MyExtension10", "MyExtension11");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testStrongestExtension10() {
        String className = "MyClass";
        List<String> extensions = List.of("MyExtension1", "MyExtension2", "MyExtension3", "MyExtension4", "MyExtension5", "MyExtension6", "MyExtension7", "MyExtension8", "MyExtension9", "MyExtension10", "MyExtension11", "MyExtension12");
        String expected = "MyClass.MyExtension1";
        String actual = StrongestExtension.strongestExtension(className, extensions);
        assertEquals(expected, actual);
    }
}