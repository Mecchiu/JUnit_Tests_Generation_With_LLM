// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
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

    public MessageInfo getMessage(int id) {
        if (messagesById!= null) {
            return messagesById.get(id);
        } else {
            return null;
        }
    }
}

// DictionaryInfo_4Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfo_4Test {
		/**
		 * unit test case for {@link DictionaryInfo#getMessage(int)}
		  @Test
		  */
		@Test
    public void getMessageWithID0() {
        //
        String message0 = "This is its text";
        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        message0 = listDictionaryInfo(dictionaryInfo, 0, message0);
        //getMessage(0) == null? MessageInfo.INVENTORY : getMessage(message0);
        assertEquals(message0, getMessage(0));
    }
	
		/**
		* unit test case for {@link DictionaryInfo#listDictionaryInfo(List, int)}
		 */
		@Test
    public void listDictionaryInfoWithIDs0ByID0() {
        // list the results
        List list = new ArrayList();
        List result = listDictionaryInfo(list, 0, "This is its text");
        // assert the list values are as expected
        assertEquals(0, result.size());

        DictionaryInfo dictionaryInfo = new DictionaryInfo();
        List resultDictionary = listDictionaryInfo(list, 0, "This is its text");

        // list the information dictionaries
        resultDictionary = listDictionaryInfo(resultDictionary, 0, "This is its text");
        //
        assertEquals(1, resultDictionary.size());
        for (int i = 0; i < resultDictionary.size(); i++) {
            //
            DictionaryInfo item = (DictionaryInfo) resultDictionary.get(i);
            //
            assertNotNull(item.getMessage(0));
            assertNotNull(item.getString());
        }

        //
        DictionaryInfo newItem = new DictionaryInfo();
        dictionaryInfo.addDictionary(newItem);
        assertEquals(newItem, dictionaryInfo);

        // create an empty dictionary (so the key is not a dictionary)
        List keyList = new ArrayList();
        keyList.add("This is its text");
        dictionaryInfo.addDictionary(keyList);
        assertEquals(1, dictionaryInfo.size());
    }
	
	
		/**
		* unit test case for {@link DictionaryInfo#listDictionaryInfo(List, int)}
		 */
		@Test
    public void listDictionaryInfoWithIds0ByID0ByID1() {
        // create the list
        List list = new ArrayList();
        list.add("This is its text");
        List result = listDictionaryInfo(list, 0, "This", 2, "is");

        // list the information dictionaries
        result = listDictionaryInfo(result, 0, "This", 2, "is");
        assertEquals(2, result.size());
	}
	
	
    /**
    * unit test case for {@link DictionaryInfo#getMessage(int)}
    * list the messages in a list of dictionaries.
    */
    @Test
    public void listOfMessages() {
		MessageInfo message0 = new MessageInfo();
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
        //create the list
        List list = new ArrayList();
        list.add(message0);
        list.add(dictionaryInfo); // list the dictionaries
        // the list values
        assertEquals(2, list.size());
        //
        assertEquals(0, list.indexOf(message0));
        /*if (list.size() > 2) {
            String listMessage = list.get(0).getDescription();
            String listDictionary = list.get(1).getName();
            assertNotNull(listMessage);
            assertNotNull(listDictionary);
        }*/

    }

    private TreeMap<Integer, String> listDictionaryInfo(List list, int id, String key, int from, String to) {
        //
        assertEquals((size() + 1) * 1024, key.length());
        // 
        DictionaryInfo item = new DictionaryInfo();
        item.setMessage(from, to);
        item = listDictionaryInfo(list, id, key, from, to);

        //
        item.setString(from, to);
        //
        return item.getMessage(from, to);
    }
}
	





