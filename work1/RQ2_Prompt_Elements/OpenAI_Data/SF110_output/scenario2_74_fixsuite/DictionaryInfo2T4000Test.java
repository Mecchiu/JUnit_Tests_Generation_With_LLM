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

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. FieldInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class FieldInfo {

    /**
     * Returns a component given an id
     *
     * @param id - an id
     * @return a component given an id
     */
    public ComponentInfo getComponent(int id) {
        if (componentsById != null) {
            return componentsById.get(id);
        }
        return null;
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#getComponent(int)} method.
*/
class FieldInfoTest {
		
	/**
	 * Test case 1 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent1() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = null;
		assertNull(fieldInfo.getComponent(1));
	}
	
	/**
	 * Test case 2 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent2() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(fieldInfo.getComponent(1));
	}
	
	/**
	 * Test case 3 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent3() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		fieldInfo.componentsById.put(2, new ComponentInfo());
		assertNull(fieldInfo.getComponent(1));
	}
	
	/**
	 * Test case 4 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent4() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		fieldInfo.componentsById.put(1, componentInfo);
		assertEquals(componentInfo, fieldInfo.getComponent(1));
	}
	
	/**
	 * Test case 5 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent5() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = null;
		assertNull(fieldInfo.getComponent(2));
	}
	
	/**
	 * Test case 6 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent6() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(fieldInfo.getComponent(2));
	}
	
	/**
	 * Test case 7 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent7() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		fieldInfo.componentsById.put(1, new ComponentInfo());
		assertNull(fieldInfo.getComponent(2));
	}
	
	/**
	 * Test case 8 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent8() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		fieldInfo.componentsById.put(2, componentInfo);
		assertEquals(componentInfo, fieldInfo.getComponent(2));
	}
	
	/**
	 * Test case 9 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent9() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = null;
		assertNull(fieldInfo.getComponent(3));
	}
	
	/**
	 * Test case 10 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent10() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(fieldInfo.getComponent(3));
	}
	
	/**
	 * Test case 11 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent11() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		fieldInfo.componentsById.put(1, new ComponentInfo());
		assertNull(fieldInfo.getComponent(3));
	}
	
	/**
	 * Test case 12 for the {@link FieldInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the given id.
	 */
	@Test
	void testGetComponent12() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		ComponentInfo componentInfo = new ComponentInfo();
		fieldInfo.componentsById.put(3, componentInfo);
		assertEquals(componentInfo, fieldInfo.getComponent(3));
	}
}

// GroupInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. GroupInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class GroupInfo {

    /**
     * Returns a component given an id
     *
     * @param id - an id
     * @return a component given an id
     */
    public ComponentInfo getComponent(int id) {
        if (componentsById != null) {
            return componentsById.get(id);
        }
        return null;
    }
}

// GroupInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupInfo}.
* It contains ten unit test cases for the {@link GroupInfo#getComponent(int)} method.
*/
class GroupInfoTest {
		
	/**
	 * Test case 1 for the {@link GroupInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is null.
	 */
	@Test
	void testGetComponent1() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.componentsById = null;
		assertNull(groupInfo.getComponent(1));
	}
	
	/**
	 * Test case 2 for the {@link GroupInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map is empty.
	 */
	@Test
	void testGetComponent2() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		assertNull(groupInfo.getComponent(1));
	}
	
	/**
	 * Test case 3 for the {@link GroupInfo#getComponent(int)} method.
	 * This test case checks that the method returns null when the componentsById map does not contain the given id.
	 */
	@Test
	void testGetComponent3() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.componentsById = new TreeMap<Integer, ComponentInfo>();
		groupInfo.componentsById.put(2, new ComponentInfo());
		assertNull(groupInfo.getComponent(1));
	}
	
	/**
	 * Test case 4 for the {@link GroupInfo#getComponent(int)} method.
	 * This test case checks that the method returns the component when the componentsById map contains the