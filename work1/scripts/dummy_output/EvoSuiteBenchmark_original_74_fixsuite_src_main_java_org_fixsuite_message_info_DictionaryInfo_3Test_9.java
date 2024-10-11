// DictionaryInfo_3Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(String)} method.
*/
class DictionaryInfo_3Test {
		/**
		* Test method for
		* {@link DictionaryInfo#DictionaryInfo(java.lang.String)}
		* @throws Exception
		*/
		@Test
		public void test() throws Exception
		{
			List<ElementInfo> allMessages = new ArrayList<ElementInfo>();
				
			List<ElementInfo> allFields = new ArrayList<ElementInfo>();
				
			List<ElementInfo> allComponents = new ArrayList<ElementInfo>();
				
			List<ElementInfo> allMessagesByName = new ArrayList<ElementInfo>();
				
			List<ElementInfo> allMessagesById = new ArrayList<ElementInfo>();
				
			int loadCount = 0;
				
			// Add message info
			addMessages(allMessages, allFields, allComponents, allMessagesByName, allMessagesById, loadCount);
				
			Map<String, ElementInfo> messages = new HashMap<String, ElementInfo>();
				
			getComponent(0).addField(messages);
				
			assertEquals(messages.size(), 1);
				
			List<Integer> tags = new ArrayList<Integer>();
					
			tags.add(0);
					
			messages.put(messages.get(1).getTag(), messages.get(1));
					
			List<Integer> messagesById = new ArrayList<Integer>();
					
			addMessages(allMessagesById, allFields, allComponents, allMessagesByName, messagesById, loadCount);
				
			Map<String, List<ElementInfo>> messagesByTag = new HashMap<String, List<ElementInfo>>();
					
			for (ElementInfo eachMessage : messagesByTag.values()) {
				String tag = eachMessage.getTag();
				List<ElementInfo> messagesByTag = messagesByTag.get(tag);
				assertFalse(tags.contains(tag));
				assertFalse(messagesByTag.contains(eachMessage));
				tag = listToStringUnique(tags);
					
				eachMessage.addField(messagesByTag);
					
				eachMessage.addField(new FieldsContainer());
					
				eachMessage.setComponentTag(eachMessage.getComponentTag()+","+tag);
					
				eachMessage.setLoadCount(eachMessage.getLoadCount()+1);
					
				assertTrue(messagesByTag.containsValue(eachMessage));
			}
				
			int fieldCount = 0;
					
			List<FieldInfo> fields = new ArrayList<FieldInfo>();
					
			while (fieldCount < allFields.size()) {
				assertTrue("fieldCount", fields.size()<=allFields.size());
				fields.add(new FieldInfo(listToStringUnique(allFields.subList(fields.size()-allFields.size()+1,fields.size()))));
				fieldCount++;
			}
				
			List<FieldInfo> fieldsById = new ArrayList<FieldInfo>();
					
			for (FieldInfo eachField : fields) {
				eachField.setComponentTag(eachField.getComponentTag()+","+fieldCount);
				eachField.addField(new FieldsContainer());
					
				fieldsById.add(eachField);
				fieldsById.add(new FieldInfo(listToStringUnique(allFields.subList(fields.size()+1,fields.size()))));
				fieldCount++;
			}
					
			List<ComponentInfo> components = new ArrayList<ComponentInfo>();
					
			for (ComponentInfo eachcomponent : allComponents) {
				eachcomponent.setComponentTag(eachcomponent.getComponentTag()+","+loadedCount);
				components.add(eachcomponent);
			}
					
			allComponents.addAll(comps);
			allComponents.addAll(messages.values().toArray(new ComponentsToElement()[0]));
					
			allComponents.add(new ComponentsToElement());
					
			allComponents.add(new ComponentsToElement());
				
			allComponents.add(new ComponentsToElement());
						
}
}