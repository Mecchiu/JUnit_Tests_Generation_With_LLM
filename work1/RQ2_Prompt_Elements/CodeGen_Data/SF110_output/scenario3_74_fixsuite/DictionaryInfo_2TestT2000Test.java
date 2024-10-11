// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {

	/**
	 * Test method for {@link DictionaryInfo#getComponent(int)}.
	 */
	@Test public void testGetComponent() {
		DictionaryInfo.getComponent(DICTIONARY_INFO.DICTIONARY);
	}

	/**
	 * Test method for {@link DictionaryInfo#getComponents()}.
	 */
	@Test public void testGetComponents() {
		DictionaryInfo.getComponent(DICTIONARY_INFO.DICTIONARY);
	}
	
	/**
	 * Test method for {@link DictionaryInfo#getComponents(int)}.
	 */
	@Test public void testGetComponents_1() {
		// The current dictionary is returned
		DictionaryInfo.getComponent(DICTIONARY_INFO.DICTIONARY);
		
		// The one with an id is returned
		assertNotNull("Expecting null for the one with an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
	}
	
	/**
	 * Test method for {@link DictionaryInfo#getComponents(int)}.
	 */
	@Test public void testGetComponents_2() {
		// The current dictionary is returned
		DictionaryInfo.getComponent(DICTIONARY_INFO.DICTIONARY);
		
		// One without an ID is returned
		assertNotNull("Expecting null for the one without an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));

		// The one with an id is returned
		assertNotNull("Expecting null for the one with an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
		
		// The one with a specific dictionary is returned
		assertNotNull("Expecting null for the one with a specific dictionary",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
		
		// One with an id is returned
		assertNotNull("Expecting null for the one with an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
	}
	
	/**
	 * Test method for {@link DictionaryInfo#getComponents(int)}.
	 */
	@Test public void testGetComponents_3() {
		// One without an ID is returned
		DictionaryInfo.getComponent(DICTIONARY_INFO.DICTIONARY);
		
		// One with an id is returned
		assertNotNull("Expecting null for the one without an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));

		// One with a specific dictionary is returned
		assertNotNull("Expecting null for the one with a specific dictionary",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
		
		// The one with an id is returned
		assertNotNull("Expecting null for the one with an id",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
		
		// The one with a specific dictionary is returned
		assertNotNull("Expecting null for the one with a specific dictionary",DICTIONARY_INFO.getComponent(DICTIONARY.ID));
	}
	
}

// DictionaryInfo_1Test.java
