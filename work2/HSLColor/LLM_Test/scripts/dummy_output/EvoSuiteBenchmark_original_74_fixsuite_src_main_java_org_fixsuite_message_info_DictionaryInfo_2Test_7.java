// DictionaryInfo_2Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getComponent(int)} method.
*/
class DictionaryInfo_2Test {
		/**
		 * Unit test case for {@link DictionaryInfo#getMessageById(String)}
		 */
		@Test
		void testGetMessageById() {
		List<MessageInfo> list = new ArrayList<MessageInfo>();
		MessageInfo message = new MessageInfo();
		List<Integer> idList = new ArrayList<Integer>();
		/**
		 * Unit test case for {@link DictionaryInfo#getMessageById(String)}
		 *
		 * @throws Exception
		 * 	IncompatibleMessageInfo
		 */
		{
			message.setComponent(null);
			List<Integer> copy = message.getIdList();
			idList.addAll(copy);
		}
		while(!list.isEmpty()) {
			if (list.get(0).getComponent()!= null) {
				list.remove(0);
			}
		}
//		assertEquals(12, list.size());

		/**
		 * Unit test case for {@link DictionaryInfo#getMessageById(String)}
		 *
		 * @throws Exception
		 * 	IncompatibleDictionaryInfo
		 */
		{
			MessageInfo info = new MessageInfo();
			list.addAll(new ArrayList<MessageInfo>());
			list.get(0).setMessageByTagNumber(list);
			Integer i = new Integer();
			list.get(0).getIdList().addAll(idList);
		}
		while(!list.isEmpty()) {
			MessageInfo info = list.get(0);
			if(info.isMessageByTagNumber()) {
				List<Integer> listTemp = info.getIdList();
				assertEquals("idlist1", 12, listTemp.size());
				Integer i = listTemp.get(0);
				assertNotNull("id3", i);
				assertEquals("id", idList.get(0), i);
			}
			list = list.get(0).getMessages();
			/**
			 * Unit test case for {@link DictionaryInfo#getMessageById(String)}
			 *
			 * @throws Exception
			 * 	IncompatibleMessageInfo
			 */
			{
				list.addAll(new ArrayList<MessageInfo>());
			}
			while(!list.isEmpty()) {
				boolean isMessageByTagNumber = list.get(0).isMessageByTagNumber();
				List<Integer> listTemp = list.get(0).getIdList();
				assertEquals("idlist1", 9, listTemp.size());
				Integer i = listTemp.get(0);
				assertNotNull("id4", i);
				assertEquals("id", idList.get(0), i);
				/**
				 * Unit test case for {@link DictionaryInfo#getMessageById(String)}
				 *
				 * @throws Exception
				 * 	IncompatibleMessageInfo
				 */
				{
					try {
						list = info.getMessages();
						list.addAll(new ArrayList<MessageInfo>());
						assertNull("list", list.get(0));
					} catch (IncompatibleMessageInfo ex) {
						fail("IncompatibleMessageInfo exception is thrown when adding messages");
					}
					listTemp = list.get(0).getIdList();
					assertEquals("idlist1", 7, listTemp.size());
					i = listTemp.get(0);
					assertNotNull("id5", i);
					assertEquals("id", idList.get(0), i);
				}
			}
			while(list.isEmpty()) {
				list = new ArrayList<MessageInfo>();
			}
		}
		/**
		 * Unit test case for {@link DictionaryInfo#getMessages()}
		 *
		 * @throws Exception
		 * 	IncompatibleDictionaryInfo
		 */
}
}