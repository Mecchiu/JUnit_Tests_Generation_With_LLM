// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		/**
		 * Returns the version
		 *
		 * @return the version
		 */
		@Test
		void whenGetField_thenVersion_is() {
			Integer loaded = DictionaryInfo.getField(FieldInfo.LOADED);
			assertEquals(MessageInfoInfo.loadedField, loaded);
			
			Integer unloaded = DictionaryInfo.getField(FieldInfo.UNLOADED);
			assertEquals(MessageInfoInfo.unloadedField, unloaded);
		}

		/**
		 * Sets the field to a new value
		 *
		 * @param newLoadCount
		 * @return
		 */
		@Test
		void setLoadCount_to(int newLoadCount) {
			DictionaryInfo.setLoadCount(newLoadCount);
			assertEquals(DictionaryInfo.loadCount, DictionaryInfo.loadCount);
		}

		/**
		 * Increments the loadCount
		 */
		@Test
		void incrementLoadCount_noop() {
			assertEquals(DictionaryInfo.loadCount, DictionaryInfo.incrementLoadCount());
		}
}