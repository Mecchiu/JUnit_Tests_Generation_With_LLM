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
		// This test class is part of UNIT tests. It contains unit tests for {@link DictionaryInfo}

		// All tests can run with '-server' flag
		static final boolean runTests = Boolean.parseBoolean("-server");
		
		/**
		* This test generates 4 dictionaries
		* 
		*/
		@Test
		public void generate4dictionaries() {
			if(runTests && DictionaryInfo.isLoaded()) // If we are running with the unittests
				return;

			// Creating 4 dictionaries and testing their contents
			List<Dictionary> dictionary = new ArrayList<Dictionary>();

			dictionary.add(new Dictionary("D1"));
			dictionary.add(new Dictionary("test2"));

			List<FieldInfo> fields = new ArrayList<FieldInfo>();
			fields.add(new FieldInfo("TEXT"));
			fields.add(new FieldInfo("TEXT-2"));

			List<ComponentInfo> components = new ArrayList<ComponentInfo>();
			components.add(new ComponentInfo("TEXT", "TEXT"));

			List<MessageInfo> messages = new ArrayList<MessageInfo>();
			messages.add(new MessageInfo("Message1"));
			messages.add(new MessageInfo("Message2"));

			DictionaryInfo dictionaryInfo = new DictionaryInfo(dictionary.get(0).getName());
			for(int i = 0; i < dictionary.size(); ++i) {
				dictionaryInfo.addField(dictionary.get(i));
			}
			
			MessageInfo text2 = mock(MessageInfo.class);  // This is not used when running from command line as well

			// Tests
			{ // test 1
				DictionaryInfo dictionaryInfo2 = new DictionaryInfo(dictionary.get(0).getName());
				dictionaryInfo2.addMessage(messages.get(0));
				dictionaryInfo2.setVersion(version());
				// We compare loaded and not loaded version
				if(!dictionaryInfo.getVersion().equals(version())) {
					fail("Fail to run the test as expected. " + version());
				}
				assertEquals(dictionaryInfo, dictionaryInfo2);
				
				dictionaryInfo2 = new DictionaryInfo(dictionary.get(0).getName());
				dictionaryInfo2.addMessage(messages.get(1));
				dictionaryInfo2.setVersion(version());
				if(!dictionaryInfo.getVersion().equals(version())) {
					fail("Fail to run the test as expected. " + version());
				}
				assertEquals(dictionaryInfo, dictionaryInfo2);

				List<FieldInfo> fields2 = new ArrayList<FieldInfo>();
				fields2.add(fields.get(1));
				dictionaryInfo2 = new DictionaryInfo(dictionary.get(0).getName());
				dictionaryInfo2.addField(fields2);
				dictionaryInfo2.setVersion(version());
				if(!dictionaryInfo.getVersion().equals(version())) {
					fail("Fail to run the test as expected. " + version());
				}
				assertArrayEquals(fields.toArray(), dictionaryInfo2.getFieldsToUse());

				// This checks in case where we want to see that we do not have the messages 
				// but if we want to display it, we can check that it is loaded correctly
				dictionaryInfo2 = new DictionaryInfo(dictionary.get(0).getName());
				dictionaryInfo2.getMessages().clear();
				dictionaryInfo2.addMessage(text2);
				dictionaryInfo2.setVersion(version());
				if(!dictionaryInfo.getVersion().equals(version())) {
					fail("Fail to run the test as expected. " + version());
				}
				assertEquals(dictionaryInfo, dictionaryInfo2);
			}

			// Testing with other dictionary tests
}
}