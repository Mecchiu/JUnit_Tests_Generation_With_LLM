// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains one unit test case for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {
		
    @Test
    public void testGetTypeDesc() {
        boolean jbool;
        ArrayOfJob arrayOfJob = new ArrayOfJob(false);
        jbool = arrayOfJob.getTypeDesc();
        assertEquals("null", Boolean.javaClassName(jbool));
        arrayOfJob = new ArrayOfJob(true);
        jbool = arrayOfJob.getTypeDesc();
        assertEquals("java.lang.Boolean", Boolean.javaClassName(jbool));

    }

    @Test
    public void test() {
        // TODO add your test code below by replacing the default call to fail.
        System.out.println("test()");
    }
}