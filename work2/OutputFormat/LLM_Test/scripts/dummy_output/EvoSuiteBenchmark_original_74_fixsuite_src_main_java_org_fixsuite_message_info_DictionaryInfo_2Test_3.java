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
		 * Returns a message given an id
		 *
		 * @param id - an id
		 * @return a message given an id
		 */
		@Test
		boolean getComponent(int id) {
			return
					(id == 0 || id == 1) && //FIX-1626
					getLoadCount() + 1 == getFields().size() + 1 ||
					getComponent(1) == null; //FIX-1404
		}
}