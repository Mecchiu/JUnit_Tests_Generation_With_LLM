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
    public void getMessage_1Test() {
        //Test case 1
        TreeMap<String, MessageInfo> mapping = new TreeMap<String, MessageInfo>(),
                expected = new TreeMap<String, MessageInfo>();
		expected.put("Mapping", mapping);
		MessageInfo m0 = new MessageInfo(), m1 = new MessageInfo(), mC1 = new MessageInfo(), mC2 = new MessageInfo();
		mapping.put("message", m0);
		mapping.put("m2", m1);
		mapping.put("m3", m1);
		mapping.put("message_1", mC1);
        DictionaryInfo d = new DictionaryInfo();
        assertTrue(mapping.containsKey("mapping"));
        assertTrue(mapping.equals(expected));
        assertTrue(d.getMessage(m0.getName())!= null);
        assertEquals(mv1.getMessage(m0.getName()), mv0.getMessage(m0.getName()));
        assertEquals(mv1.getMessage(m1.getName()), mv1.getMessage(m1.getName()));
        assertEquals(mv1.getMessage(m2.getName()), mv2.getMessage(m2.getName()));
        assertEquals(mv1.getMessage(m3.getName()), mv3.getMessage(m3.getName()));

        //Test case 2
        TreeMap<String, MessageInfo> mapping1 = new TreeMap<String, MessageInfo>(),
                expected1 = new TreeMap<String, MessageInfo>();
        mapping1.put("mapping", mapping);
        mapping1.put("m3", m1);
        mapping1.put("message_1", mC1);
        mapping1.put("m4", m1);
        mapping1.put("m5", m1);
        d = new DictionaryInfo(mapping);
        assertTrue(mapping.containsKey("mapping"));
        assertTrue(mapping.equals(expected1));
        assertTrue(d.getMessage(m0.getName()).equals(mv1.getMessage(m0.getName())));
        assertTrue(d.getMessage(m1.getName()).equals(mv1.getMessage(m1.getName())));
        assertTrue(d.getMessage(m2.getName()).equals(mv1.getMessage(m2.getName())));
        assertTrue(d.getMessage(m3.getName()).equals(mv1.getMessage(m3.getName())));
        assertTrue(d.getMessage("Mapping").equals(mv1.getMessage("Mapping")));
        assertFalse(d.getM2().equals(mv1.getM2()));
        assertTrue(d.getM2().equals(mv1.getM2()));
        assertFalse(d.getM2().equals(mv1.getM2()));

		//Test case 3
		expected1.put("Mapping", mapping1);
		expected1.put("M2", m1);
		TreeMap<String, MessageInfo> mapping2 = new TreeMap<String, MessageInfo>(),
                expected2 = new TreeMap<String, MessageInfo>();
        mapping2.put("mapping", mapping);
        mapping2.put("m3", m1);
        mapping2.put("message_1", mC1);
        d = new DictionaryInfo(mapping2);
        assertTrue(mapping.equals(expected2));
        assertTrue(d.getMessage(m0.getName()).equals(mv1.getMessage(m0.getName())));
        assertTrue(d.getMessage(m1.getName()).equals(mv1.getMessage(m1.getName())));
        assertTrue(d.getMessage(m2.getName()).equals(mv1.getMessage(m2.getName())));
        assertTrue(d.getMessage("Mapping").equals(mv1.getMessage("Mapping")));
        assertFalse(d.getM2().equals(mv1.getM2()));
        assertTrue(d.getM2().equals(mv1.getM2()));


        //Test case 4
        assertFalse(d.getMapping().containsKey("Mapping_Mapping_Mapping_Mapping_Mapping"));
        MessageInfo mDummy = new MessageInfo();
        assertFalse(mV.getMapping().containsKey("Mapping_Mapping_Mapping_Mapping"));
        dDummy = new DictionaryInfo(mV);
        assertTrue(dV.containsKey("Mapping"));
        assertTrue(dV.containsKey("Mapping_Mapping_Mapping_Mapping"));
        assertEquals(dV.getMessage(mDummy.getName()), dDummy.getMessage(mDummy.getName()));


    }

    private static final MessageInfo mv1 = new MessageInfo();
    private static final MessageInfo mv2 = new MessageInfo();
    private static final MessageInfo mv3 = new MessageInfo();

    static final List<MessageInfo> mV = new ArrayList<MessageInfo>();
    static final List<MessageInfo> mC1 = new ArrayList<MessageInfo>();
    static final List<MessageInfo> mA = new ArrayList<MessageInfo>();
    static final List<MessageInfo> mB = new ArrayList<MessageInfo>();
}
