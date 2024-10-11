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

	String version;
	
	int loadCount;
	
	
	public DictionaryInfo_0Test() {
	}
	
	public DictionaryInfo_0Test(String version) {
		this.version = version;
	}
	
	@Test
	public void test() {

        TreeMap<String, MessageInfo> infoTable = new TreeMap<String, MessageInfo>();

        for (int i = 1; i <= 3; i++) {
            String name = "f" + i;
            infoTable.put(name, new MessageInfo(MessageInfo.FIX_ID, name.toLowerCase(), 0, 0));
        }
        // load info table
        DictionaryInfo.parseVersion(version, infoTable);

        for (int i = 1; i <= 3; i++) {
            String name = "f" + i;
            MessageInfo message = infoTable.get(name);
            assertEquals(i, message.getID());
            assertEquals(name.toLowerCase(), message.getName());
            assertEquals(0, message.getLoadIndex());
            assertEquals(0, message.getMsgType());
        }
	}
}
