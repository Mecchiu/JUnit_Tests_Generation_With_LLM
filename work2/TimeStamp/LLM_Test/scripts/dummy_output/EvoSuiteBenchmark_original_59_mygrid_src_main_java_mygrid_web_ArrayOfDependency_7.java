// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
	private ArrayOfDependency self;
	
	private static final boolean testcase5_9_1 = false;
    private static final boolean testcase7_3_x = false;
    private static final boolean testcase7_4_1 = false;
    private static final boolean testcase7_5_1 = false;
    private static final boolean testcase8_4_1 = false;	
    private static final boolean testcase14_11_1 = false;
    private static final boolean testcase14_21_1 = true;
    private static final boolean testcase14_22_1 = false;
    private static final boolean testcase17_2_1 = false;	
   
    
    
    /**
     * Set the test case for the ArrayOfDependency class.
     * @param testCaseUId parameters for this test case
     * @return test result object
     */
    public boolean setTestCase(int testCaseUId) throws java.lang.Exception {
    final no.ideasit.dataframework.rmi.test.utility.remote.Remoter.Result result = remoteServiceRemoteImplTestCase(
        testCaseUId);
    
    // We can skip the following line, even if the test is failing.
/*
    if (!(result.isSuccess() and result.isSuccessMessage())) {
      error = result;
    }
*/
    
    return result.isSuccess();
  }

    }