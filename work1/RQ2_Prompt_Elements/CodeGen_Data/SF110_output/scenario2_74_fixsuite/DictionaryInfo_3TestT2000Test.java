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

    /**
     * Returns a component given a name
     *
     * @param name - a name
     * @return a component given a name
     */
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
		
	@Test
	public void testGetComponent_withName() {
		
		// given
		DictionaryInfo info = new DictionaryInfo();
		
		// when
		ComponentInfo component = info.getComponent("FIX_MESSAGE_DATA_ID");
		
		// then
		assertNotNull(component);
		assertEquals(component.getComponentType(), "FIX_MSG_ID");
		assertEquals(component.getDictionary(), "DICTIONARY");
		assertEquals(component.getVersion(), "3.2.5");
		assertEquals(component.getSourceID(), "FIX_MESSAGE_DATA");
		assertEquals(component.getCompatibility(), "FIX_VERSION_REQUIRED");
	}
	
	@Test
	public void testGetComponent_withVersion() {
		
		// given
		DictionaryInfo info = new DictionaryInfo();
		
		// when
		component = info.getComponent("FIX_MESSAGE_DATA_ID", "3.2.5");
		
		// then
		assertNotNull(component);
		assertEquals(component.getComponentType(), "FIX_MSG_ID");
		assertEquals(component.getDictionary(), "DICTIONARY");
		assertEquals(component.getVersion(), "3.2.5");
		assertEquals(component.getSourceID(), "FIX_MESSAGE_DATA");
		assertEquals(component.getCompatibility(), "FIX_VERSION_REQUIRED");
	}
	
	@Test
	public void testGetComponent_withSource() {
		
		// given
		DictionaryInfo info = new DictionaryInfo();
		
		// when
		component = info.getComponent("FIX_MESSAGE_DATA_ID", "FIX_MESSAGE_TYPE_ID");
		
		// then
		assertNotNull(component);
		assertEquals(component.getComponentType(), "FIX_MSG_ID");
		assertEquals(component.getDictionary(), "DICTIONARY");
		assertEquals(component.getVersion(), "3.2.5");
		assertEquals(component.getSourceID(), "FIX_MESSAGE_TYPE_ID");
		assertEquals(component.getCompatibility(), "FIX_VERSION_REQUIRED");
	}
	
	@Test
	public void testGetText() {
		
		// given
		DictionaryInfo info = new DictionaryInfo();
		
		// when
		String text = info.getText("FIX_MESSAGE_DATA_ID");
		
		// then
		assertNotNull(text);
		assertFalse(text.isEmpty());
		assertEquals(text, "FIX_MESSAGE_TYPE");
	}
	
	@Test
	public void testParse() {
		
		// given
		DictionaryInfo info = new DictionaryInfo();
		
		// if
		List<ComponentInfo> components = info.parse(new StringReader("FIX_MESSAGE_TYPE_ID"));
		
		// then
		assertNotNull(components);
		assertTrue(components.size() <= 1);
	}
	
	@SuppressWarnings("unused")
	private final static class ComponentInfo
    implements Comparable<ComponentInfo> {

		private final String m_name; // FIX_MESSAGE_TYPE
		private final String m_dictionary; // "DICTIONARY"
		private final String m_version; // "3.2.5"
		private final String m_sourceID; // FIX_MESSAGE_DATA
		private final String m_compatibility; // FIX_VERSION_REQUIRED

		public ComponentInfo(String name, String dictionary, String version, String sourceID, String compatibility) {
			if (name.equals("FIX_MESSAGE_DATA")) {
				m_name = "FIX_MESSAGE_DATA";
				m_dictionary = dictionary;
				m_version = version;
				m_sourceID = sourceID;
				m_compatibility = compatibility;
			} else if (name.equals("FIX_MESSAGE_TYPE")) {
				m_name = "FIX_MESSAGE_TYPE";
				m_version = version;
				m_sourceID = sourceID;
				m_compatibility = compatibility;
			} else {
				assertIgnored(name, "FIX_MESSAGE_DATA");
				assertIgnored(dictionary, "FIX_MESSAGE_TYPE");
				assertIgnored(version, "FIX_MESSAGE_DATA");
				assertIgnored(sourceID, "FIX_MESSAGE_DATA");
				assertIgnored(compatibility, "FIX_MESSAGE_TYPE");
				assertIgnored("FIX_MESSAGE_TYPE", name);
			}
		}

		/**
		 * Returns the name.
		 *
		 * @return the name
		 */
		@Override
		public String getName() {
			return m_name;
		}

		/**
		 * Returns the dictionary.
		 *
		 * @return the dictionary
		 */
		@Override
		public String getDictionary() {
			return m_dictionary;
		}

		/**
		 * Returns the version.
		 *
		 * @return the version
		 */
		@Override
		public String getVersion() {
			return m_version;
		}

		/**
		 * Returns the sourceID.
		 *
		 * @return the sourceID
		 */
		@Override
		public String getSourceID() {
			return m_sourceID;
		}

		/**
		 * Returns the compatibility.
		 *
		 * @return the compatibility
		 */
		@Override
		public String getCompatibility() {
			return m_compatibility;
		}

		/**
		 * To string.
		 *
		 * @return to string
		 */
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(m_compatibility);
			builder.append("[");
			builder.append(Util.encode(m_name));
			builder.append(".");
			builder.append(Util.encode(m_dictionary));
			builder.append(".");
			builder.append(Util.encode(m_version));
			builder.append(" : ");
			builder.append(Util.encode(Util.to_String(m_sourceID)));
			builder.append("[");
			StringBuilder sb = new StringBuilder();
			sb.append(" ").append(Util.encode(Util.to_String(m_compatibility)));
			m_name = builder.toString();
			builder.setLength(0);
			sb.clear();
			builder.append("\"]");
			builder.append(Util.encode(sb));
			assertTrue(Util.isValid(builder.toString()));
			return builder.toString();
		}

		/**
		 * Tests
		 * - comparing two Components
		 * - comparing a Component with a dictionary name
		 * - comparing the dictionaries
		 *   - when version equals version
		 *   - when source id equals source ID
		 */
		public int compareTo(ComponentInfo another