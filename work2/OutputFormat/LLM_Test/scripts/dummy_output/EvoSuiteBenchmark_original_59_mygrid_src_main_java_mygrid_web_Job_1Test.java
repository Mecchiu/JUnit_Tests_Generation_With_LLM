package mygrid.web;
java
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class Job_1Test {

    @Test
    void testGetTypeDescNotNull() {
        assertNotNull(Job.getTypeDesc());
    }

    @Test
    void testGetTypeDescXmlType() {
        assertEquals("http://tempuri.org/", Job.getTypeDesc().getXmlType().getNamespaceURI());
        assertEquals("Job", Job.getTypeDesc().getXmlType().getLocalPart());
    }

    @Test
    void testGetTypeDescFields() {
        assertEquals(8, Job.getTypeDesc().getFieldCount());
    }

    @Test
    void testGetSerializerNotNull() {
        assertNotNull(Job.getSerializer(null, Job.class, null));
    }

    @Test
    void testGetDeserializerNotNull() {
        assertNotNull(Job.getDeserializer(null, Job.class, null));
    }

    @Test
    void testEquals() {
        Job job1 = new Job();
        job1.setId("1");
        Job job2 = new Job();
        job2.setId("1");
        assertEquals(job1, job2);
    }

    @Test
    void testHashCode() {
        Job job1 = new Job();
        job1.setId("1");
        Job job2 = new Job();
        job2.setId("1");
        assertEquals(job1.hashCode(), job2.hashCode());
    }

    @Test
    void testDefaultConstructor() {
        Job job = new Job();
        assertNotNull(job);
    }
}
