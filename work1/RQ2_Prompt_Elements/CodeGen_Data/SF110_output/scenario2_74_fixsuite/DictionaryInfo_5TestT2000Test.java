// DictionaryInfo_5Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfo_5Test {
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
     * Returns a message given a name
     *
     * @param name - a name
     * @return a message given a name
     */
    public MessageInfo getMessage(String name) {
        if (messagesByName!= null) {
            return messagesByName.get(name);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_5Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfo_5Test {
		@Test
		void testGetMessage() {
            DictionaryInfo dictionaryInfo = new DictionaryInfo();
			List<String> messageKeys = new ArrayList<>();
			messageKeys.add("Branch1");
			messageKeys.add("Branch2");
			messageKeys.add("Branch3");
			dictionaryInfo.setMap(messageKeys);
			assertNotNull(dictionaryInfo.getMessage("Branch1"));
			assertNotNull(dictionaryInfo.getMessage("Branch2"));
			assertNotNull(dictionaryInfo.getMessage("Branch3"));
		}
}
    // DictionaryInfo.java
