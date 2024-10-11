// _SetEngineInfo_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfo_1Test {
		
	private final _SetEngineInfo testInstance = new _SetEngineInfo();
	{
		testInstance._name = "Test-1";
		testInstance._cpu = 3.4;
		testInstance._ram = 7.5;
		testInstance._os = "win-amd64 -m32 -m64";
	}
	
	/**
	  * Test of getTypeDesc method, of class _SetEngineInfo.
	  */
	@Test
	public void testGetTypeDesc() {
		System.out.println("GetTypeDesc");

		assertEquals(this._name, testInstance.getTypeDesc(),"Test-1");
		assertNotNull(testInstance.getCpu(),"Test-1 Cpu value can not be null");
        assertEquals("test-1",testInstance.getName(),"test-1");
        assertEquals("test-1",testInstance.getRam(),"test-1 Ram value can not be null");

	}	 
	
	/**
	 * Main().
	 */
	public static void main(java.lang.String[] args) {
		

	}
}