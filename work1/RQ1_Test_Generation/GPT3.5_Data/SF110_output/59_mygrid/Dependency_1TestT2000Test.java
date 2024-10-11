```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Dependency_1Test {

    @Test
    void testGetTypeDesc() {
        // Test case 1
        assertNotNull(Dependency.getTypeDesc());

        // Test case 2
        assertEquals("Dependency", Dependency.getTypeDesc().getXmlType().getLocalPart());

        // Test case 3
        assertNotNull(Dependency.getSerializer("", Dependency.class, Dependency.getTypeDesc().getXmlType()));

        // Test case 4
        assertNotNull(Dependency.getDeserializer("", Dependency.class, Dependency.getTypeDesc().getXmlType()));

        // Test case 5
        assertEquals("Id", Dependency.getTypeDesc().getFieldDescByName("id").getXmlName().getLocalPart());

        // Test case 6
        assertEquals("Name", Dependency.getTypeDesc().getFieldDescByName("name").getXmlName().getLocalPart());

        // Test case 7
        assertEquals("string", Dependency.getTypeDesc().getFieldDescByName("id").getFieldType().getLocalPart());

        // Test case 8
        assertEquals("string", Dependency.getTypeDesc().getFieldDescByName("name").getFieldType().getLocalPart());

        // Test case 9
        assertEquals(0, Dependency.getTypeDesc().getFieldDescByName("id").getMinOccurs());

        // Test case 10
        assertEquals(0, Dependency.getTypeDesc().getFieldDescByName("name").getMinOccurs());
    }
}
```
