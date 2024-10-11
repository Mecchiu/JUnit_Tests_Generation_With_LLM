// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		/**
		 * Asserts whether the
		 * DictionaryInfo(String version) can
		 * be initialized with a specific version.
		*/
		@Test
    	public void test1Field(String version) {
    		DictionaryInfo dictionary1 = new Diction.KeyWord("keyword1");
    		assertTrue("DictionaryInfo(" + version + ") - Diction Keyword failed to initialize with the Diction KeyWord", dictionary1.getVersion().equals(version)  );
    	}

        /**
        * Test case for the {@link DictionaryInfo#getVersions(int)} method.
        *
        */
        @Test
        public void test2Versions() {
            DictionaryInfo dictionary = new Diction.KeyWord("keyword1");
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(0) == messageHeader);
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(100) == messageHeader);
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(200) == messageHeader);
            assertTrue("DictionaryInfo("+ DictionHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(2000) == DictionHeader);
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(20000) == messageHeader);
            assertTrue("DictionaryInfo("+ DictionHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersions(15000) == DictionHeader);
        }

        /**
    	* Test case for the {@link DictionaryInfo#createVersion} method.
    	*
    	*/
        @Test
        public void test3VersionCreate() {
    	    DictionaryInfo dictionary = new Diction.KeyWord("keyword1");
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersion() == null);
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.getVersion() == messageHeader);
            long id = 10000;
            assertTrue("DictionaryInfo(" + messageHeader + ") - No Diction keyword failed to initialize with the Diction KeyWord", dictionary.createVersion(id) == null);
        }

	@Test
        public void getVersions(int expected) {
            DictionaryInfo dictionary = new Diction.KeyWord("keyword1");
            dictionary.addMessage(new DictionaryInfo.FieldInfo("stringKey", new Diction.StringKind("String"), "Hello World", new String[][]{"test", "message"}, expected, null));
            assertTrue("DictionaryInfo(" + messageHeader + ") - Failed to get versions", dictionary.getVersions() == expected);
        }

	@Test
        public void get(String key) {
    	DictionaryInfo dictionary = new Diction.KeyWord("keyword1");
    	dictionary.addMessage(new DictionaryInfo.FieldInfo("key", new Diction.StringKind("String"), "Hola Mundo", new String[][]{"test"}, 1000, null));
    	assertEquals("DictionaryInfo(" + messageHeader + ") - Get did not return the expected value", new String[]{"test"}, dictionary.get(key));
        }

	@Test
        public void deleteKey(String key) {
    	DictionaryInfo dictionary = new Diction.KeyWord("keyword1");
    	dictionary.addMessage(new DictionaryInfo.FieldInfo("key", new Diction.StringKind("String"), "Hello World", new String[][]{"test", "message"}, 500, null));
    	dictionary.deleteMessage(5);
    	assertNull("DictionaryInfo(" + messageHeader + ") - Failed to Delete", dictionary.get(key));
        }

        @Test
        public void deleteMessages(int expected) {
}
}