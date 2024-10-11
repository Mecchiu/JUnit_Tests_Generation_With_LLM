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
		 * Test case 1 is a positive test case.
		 * 
		 * Test case 1 tests the normal case.
		 * 
		 * Test case 1 expects the method to return the component with the given id.
		 */
		@Test
		void testGetComponent_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 2 for method getComponent(int).
		 * 
		 * Test case 2 is a negative test case.
		 * 
		 * Test case 2 tests the case where the component with the given id does not exist.
		 * 
		 * Test case 2 expects the method to return null.
		 */
		@Test
		void testGetComponent_2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertNull(dictionaryInfo.getComponent(2));
		}
		
		/**
		 * Test case 3 for method getComponent(int).
		 * 
		 * Test case 3 is a negative test case.
		 * 
		 * Test case 3 tests the case where the components map is null.
		 * 
		 * Test case 3 expects the method to return null.
		 */
		@Test
		void testGetComponent_3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = null;
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 4 for method getComponent(int).
		 * 
		 * Test case 4 is a negative test case.
		 * 
		 * Test case 4 tests the case where the components map is empty.
		 * 
		 * Test case 4 expects the method to return null.
		 */
		@Test
		void testGetComponent_4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 5 for method getComponent(int).
		 * 
		 * Test case 5 is a negative test case.
		 * 
		 * Test case 5 tests the case where the components map is null.
		 * 
		 * Test case 5 expects the method to return null.
		 */
		@Test
		void testGetComponent_5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = null;
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 6 for method getComponent(int).
		 * 
		 * Test case 6 is a negative test case.
		 * 
		 * Test case 6 tests the case where the components map is empty.
		 * 
		 * Test case 6 expects the method to return null.
		 */
		@Test
		void testGetComponent_6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 7 for method getComponent(int).
		 * 
		 * Test case 7 is a negative test case.
		 * 
		 * Test case 7 tests the case where the components map is null.
		 * 
		 * Test case 7 expects the method to return null.
		 */
		@Test
		void testGetComponent_7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = null;
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 8 for method getComponent(int).
		 * 
		 * Test case 8 is a negative test case.
		 * 
		 * Test case 8 tests the case where the components map is empty.
		 * 
		 * Test case 8 expects the method to return null.
		 */
		@Test
		void testGetComponent_8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 9 for method getComponent(int).
		 * 
		 * Test case 9 is a negative test case.
		 * 
		 * Test case 9 tests the case where the components map is null.
		 * 
		 * Test case 9 expects the method to return null.
		 */
		@Test
		void testGetComponent_9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = null;
				assertNull(dictionaryInfo.getComponent(1));
		}
		
		/**
		 * Test case 10 for method getComponent(int).
		 * 
		 * Test case 10 is a negative test case.
		 * 
		 * Test case 10 tests the case where the components map is empty.
		 * 
		 * Test case 10 expects the method to return null.
		 */
		@Test
		void testGetComponent_10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
				assertNull(dictionaryInfo.getComponent(1));
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
		 * Test case 1 is a positive test case.
		 * 
		 * Test case 1 tests the normal case.
		 * 
		 * Test case 1 expects the method to return the component with the given name.
		 */
		@Test
		void testGetComponent_1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				ComponentInfo componentInfo = new ComponentInfo(1, "TestComponent");
				dictionaryInfo.addComponent(componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("TestComponent"));
		}
		
		/**
		 * Test case 2 for method getComponent(String).
		 * 
		 * Test case 2 is a negative test case.
		