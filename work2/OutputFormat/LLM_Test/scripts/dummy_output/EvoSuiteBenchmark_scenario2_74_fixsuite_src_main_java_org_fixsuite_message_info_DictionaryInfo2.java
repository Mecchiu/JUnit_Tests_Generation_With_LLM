// DictionaryInfoTest.java
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
class DictionaryInfoTest {
		
	/**
	 * Test case 1 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent1() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = null;
		assertNull(dictionaryInfo.getComponent(1));
	}
	
	/**
	 * Test case 2 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent2() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(dictionaryInfo.getComponent(1));
	}
	
	/**
	 * Test case 3 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent3() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		dictionaryInfo.componentsById.put(2, new ComponentInfo());
		assertNull(dictionaryInfo.getComponent(1));
	}
	
	/**
	 * Test case 4 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent4() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		dictionaryInfo.componentsById.put(1, componentInfo);
		assertEquals(componentInfo, dictionaryInfo.getComponent(1));
	}
	
	/**
	 * Test case 5 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent5() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = null;
		assertNull(dictionaryInfo.getComponent(2));
	}
	
	/**
	 * Test case 6 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent6() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(dictionaryInfo.getComponent(2));
	}
	
	/**
	 * Test case 7 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent7() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		dictionaryInfo.componentsById.put(1, new ComponentInfo());
		assertNull(dictionaryInfo.getComponent(2));
	}
	
	/**
	 * Test case 8 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent8() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		dictionaryInfo.componentsById.put(2, componentInfo);
		assertEquals(componentInfo, dictionaryInfo.getComponent(2));
	}
	
	/**
	 * Test case 9 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent9() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = null;
		assertNull(dictionaryInfo.getComponent(3));
	}
	
	/**
	 * Test case 10 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent10() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(dictionaryInfo.getComponent(3));
	}
	
	/**
	 * Test case 11 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent11() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		dictionaryInfo.componentsById.put(1, new ComponentInfo());
		assertNull(dictionaryInfo.getComponent(3));
	}
	
	/**
	 * Test case 12 for the {@link DictionaryInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent12() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		dictionaryInfo.componentsById.put(3, componentInfo);
		assertEquals(componentInfo, dictionaryInfo.getComponent(3));
	}
}