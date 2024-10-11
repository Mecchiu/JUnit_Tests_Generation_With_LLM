// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
private static final String TYPE = "job";
		private Job job;

    /** Creating the object [0]..
     */
    public JobTest() {
    }

    /**
     * @see Job.getTypeDesc() method.
     */
    @Test
    void testGetTypeDesc() {
        assertEquals(TYPE,job.getTypeDesc().getJavaName());
    }
	/** Adding test code. */
	public void testMethod() {
		job = new Job();
		assertTrue(job.getTypeDesc().getJavaName().equals(TYPE));
	}

}
