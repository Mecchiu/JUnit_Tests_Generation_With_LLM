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
		private TreeMap<Integer, Integer> messagesByID = new java.util.TreeMap<>();
		private TreeMap<String, Integer> messagesInGroupByID = new java.util.TreeMap<>();
		private TreeMap<Integer, Integer> fieldAndComponentIDs = new java.util.TreeMap<>();
		private TreeMap<String, Integer> componentsByName = new java.util.TreeMap<>();
		private TreeMap<String, Integer> componentsAndFieldsByName = new java.util.TreeMap<>();

		
		@Test
		public void constructor() {
			
		}
		
		@Test
		public void testGetAllFields() {
			
			List<MessageInfo> messageIDs = new ArrayList<>();
			fieldAndComponentIDs.clear();
			componentsByName.clear();
			componentsAndFieldsByName.clear();
			for (int tagNumber = 0; tagNumber < 4; tagNumber++) {
				fieldAndComponentIDs.put(FieldInfo.FIELDINFO_BY_TAGBINSEQ.get(tagNumber),
						componentsAndFieldsByName.size());
				componentsByName.put(MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber),
						MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber));
				componentsAndFieldsByName.put(MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber), MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber));
				componentsAndFieldsByName.put(MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber), MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber));
			}
			fieldAndComponentIDs.put(FieldInfo.MESSAGEINFO_BY_FIELD.get(0), fieldsAndFieldsByName.size());
			componentsByName.put(MessageInfo.MESSAGEINFO.get(0), messagesAndFieldsByName.size());
			componentsByName.put(MessageInfo.MESSAGEINFO_BY_FIELD.get(0), fieldsAndFieldsByName.size());
			componentsByName.put(MessageInfo.MESSAGEINFO_BY_FIELD.get(0), messagesAndFieldsByName.size());
			componentsAndFieldsByName.put(MessageInfo.MESSAGEINFO_BY_FIELD.get(0), fieldsAndFieldsByName.size());
			assertEquals(1, fieldAndComponentIDs.size());
			assertEquals(3, messagesAndFieldsByName.size());
			assertEquals(1, componentsAndFieldsByName.size());
			assertEquals(1, fieldAndComponentIDs.get(1), 0);
			assertEquals(1, fieldAndComponentIDs.get(2), 0);
		}
		
		@Test
		public void testGetMessages() {
			List<MessageInfo> messageIDs = new ArrayList<>();
			for (int tagNumber = 0; tagNumber < 3; tagNumber++) {
				messageIDs.add(MessageInfo.MESSAGEINFO_BY_MESSAGESTAGBINSEQ.get(tagNumber));
			}
			for (int tagNumber = 1; tagNumber < 4; tagNumber++) {
				messageIDs.add(MessageInfo.MESSAGEINFO_BY_MESSAGESTAGBINSEQ.get(0) + "." + tagNumber);
			}
			for (int tagNumber = 4; tagNumber < 8; tagNumber++) {
				messageIDs.add(MessageInfo.MESSAGEINFO_BY_MESSAGESTAGBINSEQ.get(tagNumber));
			}
			for (int tagNumber = 0; tagNumber < 3; tagNumber++) {
				messageIDs.add(MessageInfo.MESSAGEINFO_BY_TAGBINSEQ.get(tagNumber));
			}
}
}