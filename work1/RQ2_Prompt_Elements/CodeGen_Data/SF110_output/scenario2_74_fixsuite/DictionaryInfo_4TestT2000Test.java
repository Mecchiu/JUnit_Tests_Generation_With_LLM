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

    /**
     * Returns a message given an id
     *
     * @param id - an id
     * @return a message given an id
     */
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
		DictionaryInfo msg;
    /**
     * @tests Constructor
     */
	public void testGetMessage_1() throws Exception {
        List<MessageInfo> messages = new ArrayList<MessageInfo>();
		TreeMap<Integer,MessageInfo> messagesById = new TreeMap<Integer,MessageInfo>();
		
    	String msgStr = "";
    	TreeMap<Integer,MessageInfo> msgById = new TreeMap<Integer,MessageInfo>();
		
    	msgStr = "Lorem ids dogeblahasd";
		// add the message
		msg = MessageInfo.getMessage(msgStr);
    	assertTrue("msg should not be null", msg!= null);
        messages.add(msg);
    	msgStr = "Lorem id tau";
		// verify the message id
		int id_msg = -2; // negative test id
		MessageInfo msgId = MessageInfo.getMessage(msgStr);
		assertNotNull("No message should have been created", msgId);
        assertEquals("Msg id should have been created by getMessage", id_msg, msgId.getID());
        // add message for another id
        int count = 0;
        for (int i = 1; i < 10; i++) {
        	id_msg = i;
            msgId = MessageInfo.getMessage(msgStr);
            assertNotNull("No message should have been created", msgId);
        	assertEquals("Msg id should have been created by getMessage", id_msg, msgId.getID());
        
        	count++;
        	messages.add (msgId);
        	messagesById.put(id_msg, msgId);
           }
        assertTrue("There should have been 10 messages", count == 10);
   
        // remove all messages (by id's) from the database
        msgById.clear();
        List<MessageInfo> noMessages = new ArrayList<MessageInfo>();
        noMessages.addAll(messages);
        List<Integer> noIds = new ArrayList<Integer>();
        noIds.addAll(messagesById.keySet());
        msgById = new TreeMap<Integer, MessageInfo>();
        List<MessageInfo> messageList = new ArrayList<MessageInfo>();
        for (MessageInfo msg : noMessages) {
            messageList.add(msg);
        }
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(noIds);
        List<TestData> list2 = new ArrayList<TestData>();
        list2.add(new TestData(list));
        list2.add(new TestData(noIds));
        messageList.add(new TestData(list2));
        noMessages = valueDictionary(messageList);
        for (MessageInfo message : noMessages) {
        	deleteMessage(message);
       }

        // verify that the no messages are in the database
        List<MessageInfo> noMessageList = new ArrayList<MessageInfo>();
        noMessageList.addAll(noMessages);
        assertTrue("Should only have messages", noMessages.size() == 5);
        for (MessageInfo msg : noMessageList) {
        	assertTrue("Should be absent from the database",!msg.isPresent());
    
        	int id_msg = msg.getID();
        	int id = messagesById.get(id_msg).getID();
        	if (id == id_msg) {
                    msgById.put(id, msg);
        	}
    	}
        assertTrue("Should have at least one message", msgById.size() > 0);
  
        // verify that the messages exist
        List<MessageInfo> messageList2 = new ArrayList<MessageInfo>();
        deleteMessage(msg);
        List<MessageInfo> messageList3 = new ArrayList<MessageInfo>();
        List<MessageInfo> messageList4 = new ArrayList<MessageInfo>();
        List<MessageInfo> messages = new ArrayList<MessageInfo>(messagesById);
        for (MessageInfo msg : messages) {
        	messageList2.add(msg);
        }
    	for (int i = 0; i < messageList.size(); i++) {
    		if (i < 10) {
            	messageList3.add(messageList2.get(i));
            } else {
    				messageList4.add(messageList2.get(i));
    			}
        }
        assertTrue("messages should come from one of messages", messageList3.size() == 1);
        assertTrue("messages should come from the other", messageList4.size() > 0);
        assertEquals("messages should be the same", messageList2.size(), messageList4.size());
    	assertEquals("deleted messages", 4, messageList2.size() - messageList3.size());
	}
    /**
     * @tests Cloneable
     */
	// DictionaryInfo_5Test.java
	@Test
	public void testCloneable() throws Exception {
    	try {
        	MessageInfo message = null;
        	boolean isPresent = DictionaryInfo.getMessage(10).isPresent();
        	assertFalse("isPresent should be false", isPresent);
        	msg = DictionaryInfo.getMessage(10);
        	assertTrue("Is present",!msg.isPresent());
        	msg = new MessageInfo(10, true);
        	assertTrue("msg should be present",!msg.isPresent());
        	msg = new MessageInfo(10, true);
        	assertTrue("msg should be present", msg.isPresent());
        	// create one after changing a message
        	message = DictionaryInfo.getMessage(5);
        	assertTrue("message should be present", message!= null);
        	msg = message;

        	// add a bunch of more messages
        	int count = 0;
        	while (count < 10000) {
        		if (isPresent) {
        			throw new Exception("message is present");
        		} else {
            		isPresent = DictionaryInfo.getMessage(count).isPresent(); 			
        		}
        		count++;
        	}
        	assertTrue("is not present after cloning", isPresent);
        	return;
    	} catch (Throwable t) {
        	t.printStackTrace();
        	fail("should not throw any exception");
        }
	}
}
