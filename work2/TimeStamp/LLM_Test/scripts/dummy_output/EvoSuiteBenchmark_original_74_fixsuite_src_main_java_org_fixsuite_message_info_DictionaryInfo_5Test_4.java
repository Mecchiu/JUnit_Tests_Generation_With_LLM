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
		List<TreeMap<Integer, FieldInfo>> messagesByName;
		List<TreeMap<Integer, FieldInfo>> messagesById;
		List<TreeMap<Integer, FieldInfo>> fieldsByTagNumber;
		List<TreeMap<String, FieldInfo>> fieldsByName;
		List<TreeMap<String, ComponentInfo>> componentsByName;
		List<TreeMap<Integer,ComponentInfo>> componentsById;
		List<FieldInfo> fieldsByString;
		List<ComponentInfo> componentsById;
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		List<FieldInfo> messageFields;
		List<ComponentInfo> messageComponents;
		List <MessageInfo> messageMessages = new ArrayList<MessageInfo>();

		public DictionaryInfo_5Test() throws Exception {
				this.init();
		}

		private void init() throws Exception {
			TreeMap<Integer, FieldInfo> fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			TreeMap<Integer, FieldInfo> fieldsByName = new TreeMap<Integer, FieldInfo>();
			TreeMap<Integer, FieldInfo> fields = new TreeMap<Integer, FieldInfo>();
			List<TreeMap<Integer, FieldInfo>> fieldsByTagNumber2 = new ArrayList<TreeMap<Integer, FieldInfo>>();
			List<TreeMap<String, FieldInfo>> fieldsByName2 = new ArrayList<TreeMap<String, FieldInfo>>();
			List<TreeMap<String, ComponentInfo>> componentsByName2 = new ArrayList<TreeMap<String,ComponentInfo>>();
			List<MessageInfo> fieldsByMessage = new ArrayList<MessageInfo>();
			List<ComponentInfo> componentsByComponentId = new ArrayList<ComponentInfo>();
			TreeMap<String, FieldInfo> fieldsByName2Field = new TreeMap<String, FieldInfo>();
			List<FieldInfo> messageFields2 = new ArrayList<FieldInfo>();
			addMessageFields();
			addMessageComponents();
			addMessage();
			addMessageToDictionaryInfo();
		}
		
	private void addMessageFields(){
	
	  	MessageInfo messageField = new MessageInfo();
	  	messageField.setFieldId(messageField.getField().getId());
	  	messageField.setFieldName(messageField.getField().getName());
	  	messageField.setFieldTag(messageField.getField().getTagNumber());
	  	messageField.setFieldType(messageField.getField().getDataType().toString());
	  	messageField.setFieldType(messageField.getField().getDataType());
	    messageField.setFieldType(messageField.getField().getDataType());
	    messageField.setFieldValue(messageField.getField().getDataValue());
	  	MessageFieldInfo messageFieldInfo = new MessageFieldInfo(messageField);
	    dictionaryInfo.addMessageField(messageFieldInfo);
	  
	}
	
	private void addMessageComponents(){
	messageComponents = new ArrayList<ComponentInfo>();
	  	component = new ComponentInfo();
	  	component.setId(component.getId());
		component.setName("Name");
				component.setType(component.getType().toString());

		componentInfo = new ComponentInfo(component);
		componentInfo.setId(componentInfo.getId());
		componentInfo.setName(componentInfo.getName());
		componentInfo.setType(componentInfo.getType());
		componentInfo.setTags(componentInfo.getTags());
		componentInfo.setTags(componentInfo.getTags());
	  
		treeMapField = new TreeMap<TagNumberField, TagNumberField>();
		treeMapField.put(new TagNumberField(dictionaryInfo.getVersion(),"1.1.1",0,true),component);

		tagNumber = dictionaryInfo.getVersion();
		messageComponents.add(component);
	  
	}
	
	private void addMessage(){
	  	message = new MessageInfo();
		  	message.setFields(messageFields);
		  	message.setMessageComponents(messageComponents);
		  	message.setComponent(component);
}
}