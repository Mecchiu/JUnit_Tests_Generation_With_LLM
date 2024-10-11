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
    public void testgetTypeDesc() {
        String msg = null;
        
        ArrayOfJob arrayOfJob = new ArrayOfJob();
        String foo = "foo";
        
        msg = java.lang.NullPointerException.class.getName();
        
//        msg =
//        ArrayOfJob.class.getName();
        
        try {
            arrayOfJob.setJob(null);
        } catch (java.lang.NullPointerException e) {
            //expected
        }
        
        msg = typeDesc.getClass().getName();
        
//        msg =
//        ArrayOfJob.class.getName();
        
        try {
            arrayOfJob.getJob();
        } catch (java.lang.NullPointerException e) {
            //expected
        }
        
        try {
            arrayOfJob.getJob(0);
        } catch (java.lang.NullPointerException e) {
            //expected
        }
        
//        msg =
//        HashSet.class.getName();
        
        try {
            arrayOfJob.setJob(new java.util.ArrayList());
        } catch (java.lang.NullPointerException e) {
            //expected
        }
        
        msg = typeDesc.getClass().getName();
        
//        msg =
//        HashSet.class.getName();
        
        try {
            arrayOfJob.setJob(new java.util.ArrayList<java.util.ArrayList>());
        } catch (java.lang.NullPointerException e) {
            //expected
        }
        
        msg = typeDesc.getClass().getName();
    }
}
