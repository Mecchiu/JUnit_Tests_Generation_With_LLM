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
		
    @Test
    public void testGetMessage1() {
        DictionaryInfo dictionary = new DictionaryInfo("Foo");
        List<?> components = new ArrayList<>();
        assertFalse(dictionary.getMessage("Foo").getIsError());
        dictionary.setLoadCount(1);
        assertTrue(dictionary.getMessage("Foo").getIsError());
        dictionary.setLoadCount(1);
        assertFalse(dictionary.getMessage("Foo").getIsError());
        dictionary.setLoadCount(1);
        assertTrue(dictionary.getMessage("Foo").getIsError());
        
        int loadCount = dictionary.getLoadCount();
        assertTrue(loadCount < 3);
        dictionary.setLoaded(true);
        loadCount = dictionary.getLoadCount();
        assertTrue(loadCount > 0);
        dictionary.setLoaded(true);
        int loadCount2 = dictionary.getLoadCount();
        assertTrue(loadCount2 > 1);
        dictionary.setLoaded(false);
        loadCount2 = dictionary.getLoadCount();
        assertTrue(loadCount2 < 3);
    }
    
    @Test
    public void testGetMessage2() {
        // The dict does not contain the message
        DictionaryInfo dictionary = new DictionaryInfo("Foo");
        List<?> components = new ArrayList<>();
        dictionary.setLoaded(true);
        dictionary.addMessage("Baz");
        dictionary.setLoaded(false);
        dictionary.addMessage("Baz");
        dictionary.setLoaded(true);
        dictionary.getMessage("Baz");
        dictionary.getLoadCount();
        dictionary.delete();
        dictionary.delete();
        dictionary.setLoaded(true);
        
        dictionary = new DictionaryInfo("Foo");
        List<MessageInfo> messageInfos = new ArrayList<>();
        MessageInfo messageInfo = new MessageInfo("Catch");
        listPut(messageInfos, messageInfo);
        listPut(messageInfos, "Foo");
        
        dictionary.setLoaded(true);
        assertFalse(dictionary.getMessage("Catch").getIsError());
        
        dictionary.setLoaded(true);
        try {
            dictionary.getMessage("Foo");
            assertTrue(false);
        } catch(MessageError e) {
            assertTrue(e.getMessage().equals("Message doesn't exist"), e.getMessage());
        }
        dictionary.setLoaded(false);
        listClear();
        dictionary.getMessage("Foo");
        assertTrue(dictionary.getMessage("Foo").getIsError());
    }
    
    //FIXME: The DictionaryInfo is not thread-safe as it is called
    // in a synchronized fashion, the following test needs to be executed
    // the first time and not the latter one because of some issues
    // with threads on FPL parsers to detect and reproduce deadlock.
    @Test
    public void testThreadClean() throws InterruptedException {
        DictionaryInfo dictionary = new DictionaryInfo("Foo");
        synchronized (dictionary) {
            dictionary.setLoaded(true);
            dictionary.getLoadCount();
            dictionary.delete();
            dictionary.delete();
        }
        dictionary.setLoaded(true);
    }
    
    @Test
    public void testMessageCount() {
        DictionaryInfo dictionary = new DictionaryInfo("Foo");
        List<?> components = new ArrayList<>();
        try {
            dictionary.getMessage("Foo");
            fail("message count for non existing message ID must be null");
        } catch(MessageError e) {
            // expected
        }
        //add a message that would be found when not loaded but loaded from the original message
        dictionary.addMessage("Tiger");
        assertEquals(MessageInfo.MAX_VALID_DICTIONARY_LOAD_COUNT, dictionary.getLoadCount());
        dictionary.setLoaded(true);
        MessageInfo message = new MessageInfo("Baz");
}
}