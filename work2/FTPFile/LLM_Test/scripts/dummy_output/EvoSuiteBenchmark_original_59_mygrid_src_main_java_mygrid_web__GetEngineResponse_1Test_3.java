// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		@Test
	        public void testTypeDesc() {
	        	try {
	        		{
	        			mygrid.web.GetEngineResponse _GetEngineResponse = new mygrid.web.GetEngineResponse();
	        			byte[] _getEngineResult = _GetEngineResponse.getGetEngineResult().toByteArray();
	        			byte[] _ret = org.apache.axis2.databinding.utils.ConverterUtil.convertToByteArray(_getEngineResult);
	        			assertTrue(_GetEngineResponse.getGetEngineResult() instanceof byte[]);
	        			java.lang.String _typeDesc = _ret[0];
	        			System.out.println("Input typeDesc === "+ _typeDesc);
	        		}
	        	/*
	        	 * @Test
	        		 */
				} catch(java.lang.Exception e) {
					if ((e.getErrorCode()!= -2146849792) || (e.getExceptionCode()!= 1606)) {
						throw new org.apache.axis2.databinding.ADBException("Error getting typeDesc", e);
					}
				}
	        }
		    }