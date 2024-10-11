// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		
	/**
	* Test case for the {@link _SetEngineInfo#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		_SetEngineInfo _setEngineInfo = new _SetEngineInfo();
		assertNotNull(_setEngineInfo.getTypeDesc());
	}
}