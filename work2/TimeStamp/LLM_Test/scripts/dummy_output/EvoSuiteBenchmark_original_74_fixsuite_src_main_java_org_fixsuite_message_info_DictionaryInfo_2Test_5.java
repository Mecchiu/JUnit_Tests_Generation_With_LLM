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
		* Gets the loaded dictionay.
		*
		* @return The loaded dictionay (a dictionary)
		*/
		public TreeMap<String, MessageInfo> getDictionary() {
			return new TreeMap<>();
		}

		/**
		* Tests if the loaded dictionary is set.
		*/
	@Test
		public void testIsLoaded() {
		}

		/**
		* Tests if the loaded dictionay contains message with a field using
		* number of messages in the message
		*/
	@Test
		public void testGetMessageForFieldInMessages() {
		}

		/**
		* Tests if the loaded dictionary contains message with a field for the
		* field with specified number of messages.
		*
		* @param loadCount - A field number for a field
		*/
		public void testGetMessageForFieldByNumber(int loadCount) {
		}

		/**
		* Tests if the loaded dictionary contains message with a field using
		* numbers of message with the same number as a field specified.
		* This number used for group identification
		*/
	@Test
		public void testGetMessageForFieldByNumber2() {
		}

		/**
		* Gets the component.
		*
		* @param index - the component number
		* @return the component
		*/
		public ComponentInfo getComponent(int index) {
			return new ComponentInfo();
		}

		/**
		* Gets a message by its tagNumber.
		*
		* @param tagNumber - the tagNumber for a message
		* @return a message according to its tagNumber
		*/
		public MessageInfo getMessageByTagNumber(int tagNumber) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its tagNumber and field.
		*
		* @param tagNumber - the tagNumber for a message
		* @param field - the field
		* @return a message according to its tagNumber and field
		*/
		public MessageInfo getMessageByTagNumberAndField(
		                                            int tagNumber,
		                                            FieldInfo field) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its name.
		*
		* @param name - the name of the message
		* @return a message according to its name
		*/
		public MessageInfo getMessageByName(String name) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its name.
		*
		* @param name - the name of a message
		* @return a message according to its name
		*/
		public MessageInfo getMessageByName2(String name) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its name.
		*
		* @param name - the name of a message
		* @param field - the field
		* @return a message according to its name and field
		*/
		public MessageInfo getMessageByNameAndField(String name, FieldInfo field) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its name.
		*
		* @param name - the name of a message
		* @param index - the number of the message
		* @return a message regarding one of the messages
		*/
		public MessageInfo getMessageByNameAndIndex(String name, int index) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its name.
		*
		* @param name - the name of a message
		* @param index - the number of the message
		* @return a message according to its name and index
		*/
		public MessageInfo getMessageByNameAndIndex2(String name, int index) {
			return new MessageInfo();
		}

		/**
		* Gets a message by its tagNumber.
		*
		* @param index - the index of the message
		* @return a message according to its tagNumber
		*/
		public MessageInfo getMessageByTagNumberAndIndex(int index) {
			return new MessageInfo();
		}

}