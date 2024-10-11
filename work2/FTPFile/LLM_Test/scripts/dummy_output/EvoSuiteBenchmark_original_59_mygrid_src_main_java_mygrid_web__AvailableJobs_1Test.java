package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class _AvailableJobs_1Test {

    @Test
    public void testGetTypeDescNotNull() {
        assertNotNull(_AvailableJobs.getTypeDesc());
    }

    @Test
    public void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", _AvailableJobs.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals(">AvailableJobs", _AvailableJobs.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    public void testGetSerializerNotNull() {
        assertNotNull(_AvailableJobs.getSerializer("", _AvailableJobs.class, new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobs")));
    }

    @Test
    public void testGetDeserializerNotNull() {
        assertNotNull(_AvailableJobs.getDeserializer("", _AvailableJobs.class, new javax.xml.namespace.QName("http://tempuri.org/", ">AvailableJobs")));
    }

    @Test
    public void testEqualsWithSameObject() {
        _AvailableJobs jobs = new _AvailableJobs();
        assertTrue(jobs.equals(jobs));
    }

    @Test
    public void testEqualsWithNullObject() {
        _AvailableJobs jobs = new _AvailableJobs();
        assertFalse(jobs.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        _AvailableJobs jobs = new _AvailableJobs();
        assertFalse(jobs.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        _AvailableJobs jobs = new _AvailableJobs();
        assertEquals(1, jobs.hashCode());
    }
}
