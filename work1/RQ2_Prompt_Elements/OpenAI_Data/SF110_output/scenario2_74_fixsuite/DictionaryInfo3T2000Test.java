// DictionaryInfoTest.java
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
class DictionaryInfoTest {

		/**
		* Test case 1 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns null when the name is null.
		*/
		@Test
		public void testGetComponent1() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				assertNull(dictionaryInfo.getComponent(null));
		}
		
		/**
		* Test case 2 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns null when the name is empty.
		*/
		@Test
		public void testGetComponent2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				assertNull(dictionaryInfo.getComponent(""));
		}
		
		/**
		* Test case 3 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns null when the name is not null and not empty but the componentsByName is null.
		*/
		@Test
		public void testGetComponent3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = null;
				assertNull(dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 4 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns null when the name is not null and not empty but the componentsByName is empty.
		*/
		@Test
		public void testGetComponent4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				assertNull(dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 5 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns null when the name is not null and not empty but the componentsByName does not contain the name.
		*/
		@Test
		public void testGetComponent5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				dictionaryInfo.componentsByName.put("name1", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name2", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name3", new ComponentInfo());
				assertNull(dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 6 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns the component when the name is not null and not empty and the componentsByName contains the name.
		*/
		@Test
		public void testGetComponent6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				ComponentInfo componentInfo = new ComponentInfo();
				dictionaryInfo.componentsByName.put("name", componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 7 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns the component when the name is not null and not empty and the componentsByName contains the name.
		*/
		@Test
		public void testGetComponent7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				ComponentInfo componentInfo = new ComponentInfo();
				dictionaryInfo.componentsByName.put("name1", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name2", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name3", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name", componentInfo);
				assertEquals(componentInfo, dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 8 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns the component when the name is not null and not empty and the componentsByName contains the name.
		*/
		@Test
		public void testGetComponent8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				ComponentInfo componentInfo = new ComponentInfo();
				dictionaryInfo.componentsByName.put("name", componentInfo);
				dictionaryInfo.componentsByName.put("name1", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name2", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name3", new ComponentInfo());
				assertEquals(componentInfo, dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 9 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns the component when the name is not null and not empty and the componentsByName contains the name.
		*/
		@Test
		public void testGetComponent9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				ComponentInfo componentInfo = new ComponentInfo();
				dictionaryInfo.componentsByName.put("name1", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name2", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name", componentInfo);
				dictionaryInfo.componentsByName.put("name3", new ComponentInfo());
				assertEquals(componentInfo, dictionaryInfo.getComponent("name"));
		}
		
		/**
		* Test case 10 for the {@link DictionaryInfo#getComponent(String)} method.
		* This test case checks if the method returns the component when the name is not null and not empty and the componentsByName contains the name.
		*/
		@Test
		public void testGetComponent10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo();
				dictionaryInfo.componentsByName = new TreeMap<String, ComponentInfo>();
				ComponentInfo componentInfo = new ComponentInfo();
				dictionaryInfo.componentsByName.put("name1", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name", componentInfo);
				dictionaryInfo.componentsByName.put("name2", new ComponentInfo());
				dictionaryInfo.componentsByName.put("name3", new ComponentInfo());
				assertEquals(componentInfo, dictionaryInfo.getComponent("name"));
		}
}