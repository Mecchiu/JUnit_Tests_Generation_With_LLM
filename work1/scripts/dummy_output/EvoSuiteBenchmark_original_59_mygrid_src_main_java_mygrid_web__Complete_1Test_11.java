// _Complete_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _Complete_1Test {
		
    private final int[] fields = { 0 };
    
    private final double[] values = { 0.0 };
    
    public _Complete_1Test() {
    }

    @Test
    public void getTypeDesc() throws Exception {
        org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(mygrid.web._Complete.class);
    }

    @Test
    public void getTypeDesc1() throws Exception {
        org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(mygrid.web.Job.class);
    }

    /**
     * Run the int[] getFields() method test.
     */
    @Test
    public void getFields1() throws Exception {
        int[] result = mygrid.web._Complete.getFields();
        assertEquals(fields, result);
    }

    /**
     * Run the double[] getValues() method test.
     */
    @Test
    public void getValues1() throws Exception {
        double[] result = mygrid.web._Complete.getValues();
        assertEquals(values, result);
    }
}