// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
		
    final org.junit.jupiter.api.Test<mygrid.web.Fail> testMethod;

    public _FailTest(mygrid.web.Job job) {
        this.testMethod = new org.junit.jupiter.api.Test<mygrid.web.Fail>() {

            @Override
            public void run() {
                assertNotNull(job);
                fail("this one should not be run");
			}
            };
    }
    
    @Test
    public void getTypeDesc() throws Exception {
        final org.junit.jupiter.api.Assertions.assertEquals(1, this.testMethod.getTypeDesc().hashCode());
    }

	@Test
	public void testNull() throws Exception {
        //@SuppressWarnings("unchecked")
        final mygrid.web.Job job = (mygrid.web.Job) null;
        fail("this one should not be run");
	}
    
    //This method is the same as the method from the parent class
    @org.junit.jupiter.api.Test
    public void run() throws Exception {
        _Fail testStub = new _Fail();
        
        try {
            //@SuppressWarnings("unchecked")
            testStub.getJob();
        } catch (java.lang.Exception e) {
            //ok
        }
    }
}