// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {
		
    @Test
    public void testGetTypeDesc() {
        assertNotNull(mygrid.web.CompleteResponse.getTypeDesc());
    }

	@Test
	public void testCompletionResult(){
		try {
			mygrid.web.CompleteResponse _completeResult = new mygrid.web.CompleteResponse();
			_completeResult.setCompleteResult(false);
			
			assertFalse(mygrid.web.CompleteResponse.equals(_completeResult, false));
			assertNotSame(_completeResult, _completeResult);
		} catch (java.lang.Throwable e){
			System.out.println(java.lang.Throwable.getStackTraceAsString(e));
			e.printStackTrace();
			fail("The exception caught while testing equals and hashCode is not thrown");
		}
	}

	
	@Test
	public void testCompletionResult(){
		try {
			mygrid.web.CompleteResponse _completeResult=null;
			_completeResult.setResult(null);
			_completeResult.setCompleteResult(true);
			
		
			System.out.println(mygrid.web.CompleteResponse.equals(_completeResult, null));
			assertTrue(mygrid.web.CompleteResponse.equals(_completeResult, null));
		} catch (java.lang.Throwable e){
			System.out.println(java.lang.Throwable.getStackTraceAsString(e));
			e.printStackTrace();
			fail("The exception caught while testing equals and hashCode is not thrown");
		}
	}

}