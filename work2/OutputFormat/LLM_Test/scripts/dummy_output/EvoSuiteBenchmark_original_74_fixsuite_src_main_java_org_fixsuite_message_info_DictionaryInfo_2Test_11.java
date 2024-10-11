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
		// Default messagesList is empty which can only happen if no messages have been added
// 	public static String message = "message";

		/**
		 * Returns a list containing all of the components
		 *
		 * @return a list of all of the components
		 */
		public static List<ComponentInfo> messageInfoList() {
			List<ComponentInfo> components = new ArrayList<>();
			components.add(getComponent(1));
			components.add(getComponent(2));
			components.add(getComponent(3));
			components.add(getComponent(4));
			return components;
		}

		/**
		 * Adds a message
		 *
		 * @param message
		 */
		public static void addMessage(String message) {
			getComponents().add(getComponent(1));
			getComponents().add(getComponent(2));
			getComponents().add(getComponent(3));
			getComponents().add(getComponent(4));
			getComponents().add(getComponent(5));
			getComponents().add(getComponent(6));
			getComponents().add(getComponent(7));
			getComponents().add(getComponent(8));
			getComponents().add(getComponent(9));
			getComponents().add(getComponent(10));
			getComponents().add(getComponent(11));
			getComponents().add(getComponent(12));
			getComponents().add(getComponent(13));
			getComponents().add(getComponent(14));
			getComponents().add(getComponent(15));
			getComponents().add(getComponent(16));
			getComponents().add(getComponent(13)); // MessageList1
			getComponents().add(getComponent(1));
			assertGet(message + "_List", messageInfoList());
			assertGet(message + _List.SIZE, 7);
			assertGet(message + "0", (FieldInfo) getComponents().get(0));
			assertGet(message + "1", (FieldInfo) getComponents().get(1));
			assertGet(message + "2", (FieldInfo) getComponents().get(2));
			assertAddGroup(message + "2", 17);
			assertGet(message + "3", null);
			assertGet(message + "4", null);
			assertGet(message + "5", null);
			assertGet(message + "6", null);
			assertGet(message + "7", null);
			assertGet(message + "8", null);
			assertGet(message + "9", (FieldInfo) getComponents().get(3));
			assertGet(message + "10", null);
			assertGet(message + "11", null);
			assertGet(message + "12", null);
			assertGet(message + "13", null);
			assertGet(message + "14", null);
			assertGet(message + "15", null);
			assertGet(message + "16", null);
			assertGet(message + "1", (FieldInfo) getComponents().get(4));
			assertGet(message + "2", null);
		}

		private static void assertGet(String message, FieldInfo field) {
			assertEquals(message + "_1", getComponents().get(field));
		}

		private static void assertGet(String message, Integer field) {
			assertEquals(message + "_1", getComponents().get(field));
		}

		private static void assertGet(String message, MessageInfo field) {
			assertEquals(message + "_1", getComponents().get(field));
		}

		private static void assertAddGroup(String message, Integer tagNumber) {
			getComponents().addAsGroup(getComponents().get(tagNumber));
		}

		private static TreeMap<String, Integer> getComponents() {
			List<FieldInfo> fieldList = new ArrayList<>();
			fieldList.add(getComponent(1));
			fieldList.add(getComponent(2));
			fieldList.add(getComponent(3));
			fieldList.add(getComponent(4));
			fieldList.add(getComponent(5));
}
}