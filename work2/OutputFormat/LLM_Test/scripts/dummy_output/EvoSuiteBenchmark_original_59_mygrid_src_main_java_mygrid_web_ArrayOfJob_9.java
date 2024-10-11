// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains one unit test case for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {
		
    /**
     * Test of getTypeDesc method, of class ArrayOfJob.
     */
    @Test
    public void testGetTypeDesc() {
        System.out.println("getTypeDesc");
        // TODO review the test code here
        ArrayOfJob test;
        ArrayOfJob classArray;
        
        test = new ArrayOfJob();
        classArray = test.getTypeDesc();
        if(classArray!= null) {
            String classArrayString = "ClassArrayOfJobTest.ArrayOfJob";
            assertEquals(classArrayString, classArray.getClass().getName());
        }
    }

    /**
     * Test of toString method, of class ArrayOfJob.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        // TODO review the test code here
        ArrayOfJob test;
        
        test = new ArrayOfJob();
        String testString = test.toString();
        String classArrayString = "ClassArrayOfJobTest.ArrayOfJob";
        assertEquals(classArrayString, testString);
    }

    /**
     * Test of add method, of class ArrayOfJob.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        // TODO review the test code here
        ArrayOfJob test;
        
        test = new ArrayOfJob();
        test.add(new mygrid.grid.Job("name1", "name1",
                  new mygrid.grid.Job("name2", "name2",
                  ""), "name3"));
        if(test.getJob()!= null) {
            String str = "";
            java.util.Iterator pos = test.getJob().iterator();

            while (pos.hasNext()) {
                mygrid.grid.Job mygj = (mygrid.grid.Job)(pos.next());
                str += mygj.getName() + "|";
            }
            assertEquals(str, "name4|name3");
        }
    }
}