// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {
		/**
		* create object of {@link _Progress}
		*/
	static _Progress _TestObj;

				/**
		* get a default instance of {@link _Progress}
		*/
	static _Progress getDefaultInstance() {
		return _TestObj;
	}

				/**
		* set custom instance of {@link _Progress}
		*/
	static void setDefaultInstance(_Progress _TestObj) {
		_TestObj = _TestObj;
	}

				/**
		* use this object to create a test suite
		* It contains one unit test case for the {@link _Progress#setTypeDesc(java.lang.String)} method.
		*/
	public static junit.framework.Test suite() {
		return new junit.framework.NUnitTestCase(
				"create new test object with default _Progress instance");
	}

				/**
		* check the type of {@link _Progress}
		*/
	static junit.framework.TestCase testSuite = new junit.framework.NUnitTestCase(
				"check the type of _Progress instance");

				/**
		* test add new property with default {@link _Progress#MESSAGE}
		*/
	public void testAddMMessage() {
		_TestObj.addProperty("MESSAGE", "");
	}

				/**
		* test getProperty
		*/
	public void testGetMessage() {
		assertEquals("", _TestObj.getProperty("MESSAGE"));
	}

				/**
		* test setProperty value as String
		*/
	public void testSetMessage() {
		String testContent = "test";
		_TestObj.setProperty("MESSAGE", testContent);
		assertEquals(testContent, _TestObj.getProperty("MESSAGE"));
	}

				/**
		* test setProperty value as Integer
		*/
	public void testSetMessageInteger() {
		Integer testInteger = 10;
		_TestObj.setProperty("MESSAGE", testInteger);
		assertEquals(Integer.valueOf(testInteger), _TestObj.getProperty("MESSAGE"));
	}

				/**
		* test setProperty value as Double
		*/
	public void testSetMessageDouble() {
		Double testDouble = 10.0;
		_TestObj.setProperty("MESSAGE", testDouble);
		assertEquals(Double.valueOf(testDouble), _TestObj.getProperty("MESSAGE"));
	}

				/**
		* test setProperty value as Boolean
		*/
	public void testSetMessageBoolean() {
		Boolean testBoolean = false;
		_TestObj.setProperty("MESSAGE", testBoolean);
		assertEquals(Boolean.valueOf(testBoolean), _TestObj.getProperty("MESSAGE"));
	}
}