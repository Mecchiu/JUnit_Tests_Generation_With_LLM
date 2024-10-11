// _FailResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponse_1Test {
		// _FailResponse's test cases
	private static final String TARGET = "http://tempuri.org/";
	static final String TESTCASE = "http://tempuri.org/";
	
	static final String FAILMESSAGE = 

	"Failure message of _FailResponse_1Test";
	static final int SUCCESS = 1;
	static final String DEFAULT_TARGET = TARGET;
	static final String DEFAULT_TESTCASE = TESTCASE;
	static final boolean DEFAULT_IS_ERROR = false;
	

	// Constructors

	/**
	  * Returns a new test case's instance 
	  * @return the test case's instance
	  */
	static _FailResponse _newInstance() {
		_FailResponse _result = new _FailResponse();
		_result.setIsError(_isError);
		return _result;
	}

	
	// Actual test methods
	@Test(name="Get failure message",
	    		result="Expected:<" + TESTCASE + ">")
	void getTypeDesc_FailMessage_ShouldHaveGivenExpectedMessage() {

		// arrange
		String _failMessage = null;
        
		// act
		_failMessage = _failureMessage();
		
		// assert
		assertEquals(_isError,
					  _failMessage.equals(FAILMESSAGE));

	}

	
	@Test(name="Get type desc",
			result="Expected:<" + DEFAULT_TARGET + ">")
	void getTypeDesc_ShouldHaveGivenExpectedTarget() {

		// arrange
		String _failTarget = null;
		
		// act
		_failTarget = _failureTarget();
		
		// assert
		assertEquals(_target,
					  _failTarget.equals(DEFAULT_TARGET));
	}

	
	@Test(expected = IllegalArgumentException.class)
	@Test(expected = IllegalArgumentException.class)
	public void getTypeDesc_FailTargetNull_ShouldThrowException() {

		// act
        _failureMessage = null;
		
		_failureTarget(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Test(expected = IllegalArgumentException.class)
	public void getTypeDesc_FailTargetWithEmptyString_ShouldThrowException() {

		// act
		_failureTarget(new String(new byte[0]));
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Test(expected = IllegalArgumentException.class)
	public void getTypeDesc_FailTargetWithNullString_ShouldThrowException() {

		// act
		_failureTarget(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Test(expected = IllegalArgumentException.class)
	public void getTypeDesc_FailTargetWithoutType_ShouldThrowException() {

		// act
		_failureTarget(TESTCASE);
	}
	
	
}