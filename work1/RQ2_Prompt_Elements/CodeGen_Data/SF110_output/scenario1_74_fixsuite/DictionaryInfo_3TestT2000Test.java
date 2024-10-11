// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
// DictionaryInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX version specification. DictionaryInfo acts as a central
 * storage for all items defined in a version.
 *
 * @author jramoyo
 */
public class DictionaryInfo {

    public ComponentInfo getComponent(String name) {
        if (componentsByName!= null) {
            return componentsByName.get(name);
        }
        return null;
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
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		// List of components
		public static final List<ComponentInfo> components = new ArrayList<>();

		// Root component name
		public static final String rootComponent = "FIX.7.0.18";

		// Dictionaries
		private final TreeMap<String, TreeMap<Integer, ComponentInfo>> dictionaries = new TreeMap<>();

		// Find the first dictionary where the component
		// has the name "FIX.7.0.18"
		static {
			dictionaries.put(rootComponent, new TreeMap<Integer, ComponentInfo>());
			dictionaries.get(rootComponent).put(16, new DictionaryInfo.ComponentInfo(16, false));
			dictionaries.get(rootComponent).put(17, new DictionaryInfo.ComponentInfo(17, true));
		}

		public DictionaryInfo_3Test() {
			super();
		}

		// Test for getComponents
		@Test
		public void testGetComponents() throws Exception {
			testRoot(new ArrayList<String>(), 0);
		}

		@Test
		public void testGetComponents_WithDuplicateComponent_Error() throws Exception {
			testRoot(new ArrayList<String>(), 1);
			testRoot(new ArrayList<String>(), 2);
		}

		@Test
		public void testGetComponents_TwoComponents() throws Exception {
			testRoot(new ArrayList<String>(), 0);
			testRoot(new ArrayList<String>(), 1);
		}

		@Test
		public void testGetComponents_OneComponent_Error() throws Exception {
			// This test contains 2 tests cases
			// 1) "FIX.7.0.18" and "FIX.7.0.19"
			//	are defined in multiple dictionaries.
			//	If dictionaries is empty then tests can be aborted.
			// 2) "FIX.7.0.18" and "FIX.7.0.19"
			//	are defined in dictionary "FIX.7.0.18", but in a different
			//	component. If dictionary contains a component, tests fail.
			// It means that the component which should be defined is not
			// in dictionary.
			testRoot(new ArrayList<String>(), 0);
			testRoot(new ArrayList<String>(), 1);
			testRoot(new ArrayList<String>(), 2);

			// Invalid: dictionary has two components
			testRoot(new ArrayList<String>(), 1);
		}

		@Test
		public void testGetComponents_NoDictionaryAvailable() throws Exception {
			testRoot(new ArrayList<>(), 2);
		}

		@Test
		public void testGetComponents_OneComponent() throws Exception {
			testRoot(new ArrayList<>(), 0);
			testRoot(new ArrayList<>(), 1);
		}

		private void testRoot(List<String> components, int expectedError) throws Exception {
			System.out.println("\nTest: " + components.toString());

			// Test if components are defined
			if (components!= null) {
				boolean allEqual = true;
				for (ComponentInfo c : components) {
					List<String> children = c.getComponents();
					allEqual = allEqual && children.contains(rootComponent + ":");

					// If the children is equal to the dictionary then fail
					if (allEqual) {
						System.out.println("     Component: " + c.getName());
						assertTrue(rootComponent + " with name " + c.getName() + " is defined in the dictionary.", dictionaries.containsKey(rootComponent) && dictionaries.get(rootComponent).containsKey(16, c));
						assertTrue("FIX.7.0.18, but not FIX.7.0.19", dictionaries.get(rootComponent).get(16, c).getName().equals(rootComponent + ":FIX.7.0.18"));
						assertTrue("FIX.7.0.19, but not FIX.7.0.18", dictionaries.get(rootComponent).get(17, c).getName().equals(rootComponent + ":FIX.7.0.19"));
					} else {
						// Assert if the components are different
						assertTrue("FIX.7.0.16 not being defined in dictionary", dictionaries.containsKey(rootComponent) && dictionaries.get(rootComponent).containsKey(16, c));
						// Assert if the components are different
						assertTrue("FIX.7.0.17 not being defined in dictionary", dictionaries.get(rootComponent).get(16, c).getName().equals(rootComponent + ":FIX.7.0.17"));
					}
				}
				assertTrue("FIX.7.0.18 not being defined in dictionary", dictionaries.containsKey(rootComponent) && dictionaries.get(rootComponent).containsKey(16, c));
				assertTrue("FIX.7.0.19 not being defined in dictionary", dictionaries.get(rootComponent).get(17, c).getName().equals(rootComponent + ":FIX.7.0.19"));
			}
		}

}
