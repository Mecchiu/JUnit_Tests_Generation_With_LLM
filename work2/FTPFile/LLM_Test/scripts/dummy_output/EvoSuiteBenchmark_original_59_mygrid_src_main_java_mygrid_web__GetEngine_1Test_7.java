// _GetEngine_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngine}.
* It contains one unit test case for the {@link _GetEngine#getTypeDesc()} method.
*/
class _GetEngine_1Test {
		
	/**
	* Default Constructor
	*/
	_GetEngine_1Test() {
	}

	/**
	* Constructor
	* 
	* @param _TestMethodName0 
	*/
	_GetEngine_1Test(final java.lang.String _TestMethodName0) {
		
	}
  /**
   * Tests Constructor
   */
  @Test
  public void testConstructor1() { 
    System.out.println("testconstructor1");
    
	
	assertEquals("TypeDesc of testConstructor1 is not same as a typeDesc registered in _getTypeDesc",_GetEngine.getTypeDesc(),1);
  }

}