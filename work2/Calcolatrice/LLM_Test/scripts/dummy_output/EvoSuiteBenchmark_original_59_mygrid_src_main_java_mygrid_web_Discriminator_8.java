// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {
		
    int testMethod(int x, java.lang.String y) {
        mygrid.web.ArrayOfString my = new mygrid.web.ArrayOfString();
        my.setAllowedEngines(null);
        return test(new java.lang.Integer(x!= this.getAllowedEngines().size()? x : 0), new java.lang.String(y), null, null, null, null, null);
    }
    
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testMethod1(int ignored1) throws java.lang.IllegalArgumentException {
        Discriminator.testMethod(this.getTypeDesc().newInstance(), false, null);
    }

    int testMethod2(int ignored2) throws java.lang.IllegalArgumentException {
        return Discriminator.testMethod(this.getTypeDesc().newInstance(), this.getAllowedEngines(), null);
    }
    
    private long test(int x, java.lang.String y, java.lang.Integer ignored3, java.lang.String ignored4, java.lang.Integer ignored5, java.lang.String ignored6, org.junit.jupiter.api.condition.RootCondition<?> ignored7) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException, java.lang.InvocationTargetException {
            String result = Discriminator.testMethod(this.getTypeDesc().newInstance(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (org.junit.jupiter.api.condition.RootCondition<?>) null);
            int[] a = new int[0];
            if (a.length == 0) {
                throw new java.lang.IllegalStateException("No exceptions occurred.");
            } else {
                throw new java.lang.IllegalArgumentException("No exceptions occurred.");
            }
        }
}