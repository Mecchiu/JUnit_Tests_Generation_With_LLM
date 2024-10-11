```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MapReaderTest {

    @Test
    void testGetXMLValue_Node_NullNode_ReturnsEmptyString() {
        // Test case for when node is null
        // Setup
        Node node = null;
        String XMLPath = "/path/to/value";
        
        // Execution
        MapReader mapReader = new MapReader("test.xml");
        String result = mapReader.getXMLValue(node, XMLPath);
        
        // Assertion
        assertEquals("", result);
    }

    // Add more test cases for different scenarios

}
```
```