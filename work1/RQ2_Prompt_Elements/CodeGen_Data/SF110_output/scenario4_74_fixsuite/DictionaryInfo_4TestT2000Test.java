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

    private static final String[] messages = {"FixSuite/message/FIX54/FIX54-00051-0_0.txt","FixSuite/message/FIX54/FIX54-020325-0_0.txt"};
    private static final String[] components = {"comp1", "comp2", "comp3", "comp4"};
	
    private final static int MAX_MESSAGES=4;
    private final static int MAX_COMPONENTS=2;
	
    private static List<MessageInfo> _loadMessages=new ArrayList<MessageInfo>(500);
    private static List<ComponentInfo> _loadComponents=new ArrayList<ComponentInfo>(500);

    public void loadMessages(String[] msgArray){
        // Set the number of messages
        _loadMessages.clear();
        _loadMessages.addAll(Arrays.asList(msgArray));
	
        // Set how many messages we have
        int i = 0;
        for (String message : _loadMessages) {
            
            // Create a message info
            MessageInfo msgInfo = new MessageInfo(message);

            i++;
            
      // Find the message info
            for(FieldInfo fieldInfo:msgInfo.getFields()) {
                if(fieldInfo.isGroup() && fieldInfo.getTagNumber()==FieldInfo.PICTURE_TAG){
                        continue;
                }

               // If we have a tag number
                 if(fieldInfo.getTagNumber()>FieldInfo.PICTURE_TAG){
                   // Find the message info
                           for(ComponentInfo componentInfo:msgInfo.getComponents()) {
                                if (componentInfo.getId()==fieldInfo.getTagNumber()){
                                    return;
                                }
                           }
                }
        }
        
        fail("ERROR!! The number of messages: " + i + " not found!");
    }

    public void loadComponents(String[] compArray){
       // Set the number of components
        _loadComponents.clear();
        _loadComponents.addAll(Arrays.asList(compArray));
	
        // Set how many components we have
        int i = 0;
        for (String comp:_loadComponents) {
            // Find the component info
            for(FieldInfo fieldInfo:comp.split(":")) {
                if(fieldInfo.getTagNumber()==FieldInfo.COMPONENT_TAG){
                    continue;
                }

               // If we have a tag number
                 if(fieldInfo.getTagNumber()>FieldInfo.PICTURE_TAG) {
                   // Find the message info
                       for(MessageInfo messageInfo:_loadMessages) {
                           if (messageInfo.getComponent(compArray[i])!= null) {
                               return;
                           }
                       }
                }
        }
        
        fail("ERROR!! The number of components: " + i + " not found!");
    }	

    public void testLoadMessages(String[] data) {
        // Load messages with number of messages
        loadMessages(data);
        
        // Check we have the expected number of messages
        int max = MSG_SIZE-1;
        for(MessageInfo messageInfo : _loadMessages) {
        	if(MAX_MESSAGES > messageInfo.getMessage().length()) {
        		assertNotNull(messageInfo.getMessage());
        		continue;
        	}
        	for(FieldInfo fieldInfo:messageInfo.getFields()) {
        		if(MAX_COMPONENTS > fieldInfo.getComponents().length()) {
        			assertNotNull(messageInfo.getComponents());
        			continue;
        		}
        		assertEquals(fieldInfo.getTagNumber(), Integer.parseInt(fieldInfo.getTagNumber().getItem()));
            }
        }

        // Load components
        loadComponents(data);
        
        // Check we have the expected number of components
        int max_comp=MAX_COMPONENTS;
        for(ComponentInfo componentInfo : _loadComponents) {
        	for(FieldInfo fieldInfo:componentInfo.getFields()) {
        		if(MAX_MESSAGES > fieldInfo.getMessage