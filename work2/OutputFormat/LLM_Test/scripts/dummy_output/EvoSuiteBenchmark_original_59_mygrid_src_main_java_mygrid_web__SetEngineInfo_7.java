// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {
		
	/**
	* Check all public fields of {@link _SetEngineInfo} are equals and hashCode are defined.
	*/
	@Test
	public void checkAllFieldsAreEqual() {
	
		_SetEngineInfo _2 = new _SetEngineInfo();
		_2.setName("mockName2");
		_2.setCpu(12);
		_2.setRam(12);
		_2.setOs("mockOs2");
	
		try {
		
		assertEquals(_1, _2);
		assertEquals(_1.hashCode(), _2.hashCode());
		
		} catch (AssertionError e) {
		
		assertTrue(false);
		}
	}

	/**
	* Check all public fields of {@link _SetEngineInfo} are not equals and hashCode are not defined.
	*/
	@Test
	public void noFieldsAreNotEqual() {
	
		_SetEngineInfo _2 = new _SetEngineInfo();
	
		_2 = null;
	
		try {
		
		assertEquals(_2, _2);
		assertFalse(true);
		} catch (AssertionError e) {
		
		assertTrue(false);
		}
	}

}