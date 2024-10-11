// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		/**
		 * Tests if a field is loaded
		 */
		@Test
		void getField_Field_ShouldReturnLoaded() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			List<FieldInfo> fields = new ArrayList<>();
			fields.add(new FieldInfo(Integer.class));

			dictionaryInfo.setFieldsByTagNumber(fields);
			List<FieldInfo> loaded = dictionaryInfo.getFields();
			assertEquals(1, loaded.size());
			assertEquals(fields, loaded);

			dictionaryInfo.setFieldsByTagNumber(fields);
			assertEquals(1, dictionaryInfo.getFields().size());
			assertSame(fields, dictionaryInfo.getFields());
		}

		/**
		 * Tests if an object is loaded
		 */
		@Test
		void getField_Object_ShouldReturnLoaded() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			List<ComponentInfo> components = new ArrayList<>();
			FieldInfo field = new FieldInfo(Integer.class, Integer.class);
			fieldsByTagNumber = new TreeMap<>();
			fieldsByTagNumber.put(field.getTagNumber(), field);
			field = new FieldInfo(String.class, String.class);
			fieldsByTagNumber = new TreeMap<>();
			fieldsByTagNumber.put(field.getTagNumber(), field);
			dictionaryInfo.setComponentsByName(components);

			List<ComponentInfo> loadedComponents = dictionaryInfo.getComponents();
			assertEquals(2, loadedComponents.size());
			assertEquals(components, loadedComponents);

			dictionaryInfo.setComponents(dictionaryInfo.getComponents());
			assertEquals(2, dictionaryInfo.getComponents().size());
		}

		/**
		 * Tests if an object is loaded given an input message
		 */
		@Test
		void getField_Message_ShouldReturnLoaded() {
			DictionaryInfo dictionaryInfo = new DictionaryInfo();
			List<ComponentInfo> loadedComponents = new ArrayList<>();
			MessageInfo message = new MessageInfo();
			field = new FieldInfo(Integer.class, Integer.class);
			fieldsByTagNumber = new TreeMap<>();
			fieldsByTagNumber.put(FieldTag._tagNumber_tagName, field);
			fieldsByTagNumber.put(FieldTag._tagNumber_value, field);
			dictionaryInfo.setComponentsByName(loadedComponents);

			loadedComponents = dictionaryInfo.getComponents();
			assertEquals(loadedComponents.size(), dictionaryInfo.getComponents().size() + 1);
			assertEquals(1, dictionaryInfo.getComponents().size());
			assertEquals(loadedComponents.get(0), dictionaryInfo.getComponents().get(0));
			loadedComponents = dictionaryInfo.getComponents();
			dictionaryInfo.setComponents(dictionaryInfo.getComponents());
			assertEquals(2, dictionaryInfo.getComponents().size());
		}
}