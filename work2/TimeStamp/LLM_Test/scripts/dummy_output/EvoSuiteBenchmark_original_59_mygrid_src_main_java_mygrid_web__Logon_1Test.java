package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class _Logon_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(_Logon.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _Logon.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">Logon", _Logon.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFields() {
        assertEquals(3, _Logon.getTypeDesc().getFieldCount());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(_Logon.getSerializer(null, _Logon.class, null));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(_Logon.getDeserializer(null, _Logon.class, null));
    }

    @Test
    void testEqualsWithNullObject() {
        assertFalse(new _Logon().equals(null));
    }

    @Test
    void testEqualsWithSameObject() {
        _Logon logon = new _Logon();
        assertTrue(logon.equals(logon));
    }

    @Test
    void testEqualsWithDifferentObject() {
        assertFalse(new _Logon().equals(new Object()));
    }

    @Test
    void testHashCode() {
        _Logon logon1 = new _Logon();
        _Logon logon2 = new _Logon();
        assertEquals(logon1.hashCode(), logon2.hashCode());
    }
}
