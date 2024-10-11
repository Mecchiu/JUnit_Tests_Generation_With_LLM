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
	public void getTypeDescTest() {
		java.lang.String expectedResult = "";
		try {
			_GetEngineResponse.getTypeDesc();
		} catch (java.lang.NullPointerException ex) {
			java.lang.String _typeName = _GetEngineResponse.class.getName();
			java.lang.String _extends = "";
			try {
				_typeName = _GetEngineResponse.class.getSuperclass().getName();
			} catch (java.lang.NullPointerException exc) {
				_extends = "";
			}
			java.lang.Integer _id = new ilarkesto.core.base.persist.Identity().getId();
			illegalArgumentException(_extends,ex,_id);
		}
		_GetEngineResponse instance = _GetEngineResponse.getTypeDesc();
		
		{
			illegalArgumentException(instance);
		}
		
	}
	
	public void illegalArgumentException(java.lang.Object object, java.lang.reflect.InvocationTargetException invocationException) {
	
		throw invocationException;
	}
}