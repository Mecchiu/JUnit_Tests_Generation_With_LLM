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
private static final String name = "DictionaryInfo";
	@Test
    void createWithName() throws Exception {
        assertNotNull(System.getProperty("fix.language.msg.prefixes"));
        assertNotNull(System.getProperty("fix.language.msg.delimiters"));
        MessageInfo[] message = DictionaryInfo.getMessage("Dictionary").getMessage("Dictionary_5");
        assertNotNull(message);
        assertNotNull(message[0]);
        
        List<String> msgIdList = new ArrayList<>();
        msgIdList.add("Dictionary-1");
        msgIdList.add("Dictionary/Dictionary-2");
        msgIdList.add("Dictionary/Dictionary-1.1");
		assertEquals(msgIdList.get(0), message[0].getMessageId());
		assertEquals(msgIdList.get(1), message[1].getMessageId());
		assertEquals(msgIdList.get(2), message[2].getMessageId());
    }
	
    @Test
    void createListMessageWithListOfDictionary() throws Exception {
        assertNotNull(System.getProperty("fix.language.msg.prefixes"));
        assertNotNull(System.getProperty("fix.language.msg.delimiters"));
        List<String> msgIdList = new ArrayList<>();
        msgIdList.add("Dictionary");
        List<MessageInfo> messages = DictionaryInfo.getMessage("Dictionary").getList();
        assertNotNull(messages);
        assertEquals(messages.size(), 8);

        List<String> list = new ArrayList<>();
        list.add("Dictionary-9");
        list.add("Dictionary-8");
        list.add("Dictionary-7");
	
	// check values in correct order of msgids
	for (MessageInfo m : messages) {
            for (String msgId : m.getMessageIds()) {
	            System.out.println("MID"+msgId);
            }
        }

        // check msgids
        String actualMsgId = "";
        msgIdList.forEach((currentId) -> {
                List<String> newList = new ArrayList<>();
                List<String> subList = new ArrayList<>(newList);
                subList.remove(currentId);

                if (subList.size()!= 1) {
                    System.out.println(currentId);
                }

                for (int i = subList.size(); i < newList.size(); i++) {
                    newList.add(String.valueOf(i + 1));
                }
                actualMsgId = currentId;
                break;
            }
            System.out.printf("ActualMsgId: %s \n", actualMsgId);

        
        if (actualMsgId.equals("Dictionary-5.1.1")) {
            assertEquals(actualMsgId, msgIdList.get(6));
        } else {
            for (int i = 0; i < msgIdList.size(); i++) {
                String msgId = msgIdList.get(i);
                System.out.printf("MESSAGE ID: %s \n", msgId);
                assertEquals(actualMsgId, msgId);
            }
        }
    }

        
		@Test
    void createListMessageWithListOfDictionaryAndListOfString() throws Exception {
        assertNotNull(System.getProperty("fix.language.msg.prefixes"));
        assertNotNull(System.getProperty("fix.language.msg.delimiters"));
        List<String> msgIdList = new ArrayList<>();
        msgIdList.add("Dictionary");
	String msgId = DictionaryInfo.getMessage("Dictionary").getMessageId();
	msgIdList.add(msgId);

        List<MessageInfo> messages = DictionaryInfo.getMessage("Dictionary").getList();
        assertNotNull(messages);
        assertEquals(messages.size(), 1);

        List<String> subList = new ArrayList<>();

        //check values in correct order of msgids
        for (MessageInfo m : messages) {
            List<String> newList = new ArrayList<>();
            List<String> newList2 = new ArrayList<>();
            List<String> subList2 = new ArrayList<>(newList2);

            for (String s : m.getMessageIds()) {
                newList2.add(String.valueOf(i+1));
                subList2.add(s);
            }
            List<String> list = new ArrayList<>(newList2);
            subList2.remove(index);

            if (subList.size()!= 1) {
                System.out.println(m.getMessageId());
                System.out.println(" MESSAGE: " + msgId + " : " + subList);
            }

            for (int i = 0; i < subList.size(); i++) {
                String msgId = subList.get(i);
                if (i == 0) {
                    list.add(msgId);
                } else {
                    list.add(msgId + ".1");
                }
                list.add(s);
            }

            if (list.size()!= 2) {
                System.out.println(m.getMessageId() + ".1." + subList2.get(1));
                System.out.println(m);
            }

            msgIdList.addAll(list);
        }



        if (msgIdList.size() == 8) {
            assertEquals(msgIdList.get(6), "Dictionary-5.1.1");
        } else {
            for (int i = 0; i < msgIdList.size(); i++) {
                String msgId = msgIdList.get(i);
                System.out.printf("MESSAGE ID: %s \n", msgId);
                assertEquals(msgIdList.get(i + 1), msgId);
            }
        }
        List<String> msgIdList2 = new ArrayList<>();
        msgIdList2.add("");
        assertEquals(msgIdList2.size(), msgIdList.size());

        TreeMap<String, Integer> map =
                    new TreeMap<String, Integer>();
        map.put("Dictionary", msgIdList.indexOf("Dictionary-5.1.1"));
        map.put("Dictionary-5.1.1", msgIdList2.indexOf("Dictionary-5.1.2"));
        String newMsg = "Dictionary-5.1.2";
        assertEquals(map.get("Dictionary-5.1.1"), msgIdList2.indexOf(newMsg));
	System.out.printf("ActualMsgId: %s \n", map.keySet().get(0).toString());



    }

}
