// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {

	/**
	 * Test case 1 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_1() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(0);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 2 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_2() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(1);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 3 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_3() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(2);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 4 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_4() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(3);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 5 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_5() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(4);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 6 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_6() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(5);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 7 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_7() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(6);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 8 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_8() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(7);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 9 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_9() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(8);
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 10 for method getComponent(int).
	 * 
	 * @see DictionaryInfo#getComponent(int)
	 */
	@Test
	void testGetComponent_10() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(9);
		
		// Verify result
		assertNull(result);
	}
}

// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		
	/**
	 * Test case 1 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_1() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 2 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_2() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent(" ");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 3 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_3() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("a");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 4 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_4() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("b");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 5 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_5() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("c");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 6 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_6() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("d");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 7 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_7() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("e");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 8 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_8() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4.2").getComponent("f");
		
		// Verify result
		assertNull(result);
	}
	
	/**
	 * Test case 9 for method getComponent(String).
	 * 
	 * @see DictionaryInfo#getComponent(String)
	 */
	@Test
	void testGetComponent_9() {
		// Test method
		ComponentInfo result = new DictionaryInfo("FIX.4