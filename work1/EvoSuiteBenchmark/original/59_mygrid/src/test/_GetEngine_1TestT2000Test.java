```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class _GetEngine_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_GetEngine.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _GetEngine.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">GetEngine", _GetEngine.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(_GetEngine.getSerializer("", _GetEngine.class, new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngine")));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(_GetEngine.getDeserializer("", _GetEngine.class, new javax.xml.namespace.QName("http://tempuri.org/", ">GetEngine")));
    }

    @Test
    void testEquals() {
        _GetEngine engine1 = new _GetEngine();
        _GetEngine engine2 = new _GetEngine();
        assertTrue(engine1.equals(engine2));
    }

    @Test
    void testHashCode() {
        _GetEngine engine = new _GetEngine();
        assertEquals(1, engine.hashCode());
    }
}
```
```