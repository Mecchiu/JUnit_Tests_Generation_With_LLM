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
		private MessageInfo message;

		private GroupInfo group;

		private int order = 1;

		private int line = 1;

		private List<ComponentInfo> componentsByName = new ArrayList<ComponentInfo>();

		private List<ComponentInfo> componentsById = new ArrayList<ComponentInfo>();

		private List<FieldInfo> fieldsByTagNumber = new ArrayList<FieldInfo>();

		private List<FieldInfo> fieldsByName = new ArrayList<FieldInfo>();

		@Test
		public void testLoadComponents() {
			message = new MessageInfo();
			group = new GroupInfo(message, "");
			group.addToComponentsByTagNumber(new TreeMap<Integer, FieldInfo>());
			group.addToComponentsById(new TreeMap<Integer, ComponentInfo>());
			order = 2;
			line = 1;
			componentsByName.add(group);
			componentsByName.add(new ComponentInfo("d1"));
			componentsByName.add(new ComponentInfo("d2"));
			componentsByName.add(new ComponentInfo("d4"));
			fieldsByTagNumber.add(group.getComponent(3).getField(1));
			fieldsByTagNumber.add(group.getComponent(3).getField(2));
			fieldsByTagNumber.add(group.getComponent(3).getField(4));
			fieldsByTagNumber.add(group.getComponent(3).getField("d5"));

			assertEquals(componentsByName, getComponentsByTags(componentsByName));
			assertEquals(componentsById, getComponentsById(componentsByName));
			validate();
		}

		@Test
		public void testLoadComponents2() {
			message = new MessageInfo();
			group = new GroupInfo(message, "");
			group.addToComponentsByTagNumber(new TreeMap<Integer, FieldInfo>());
			group.addToComponentsById(new TreeMap<Integer, ComponentInfo>());
			order = 2;
			line = 1;
			componentsByName.add(group);
			componentsByName.add(new ComponentInfo("d1"));
			componentsByName.add(new ComponentInfo("d2"));
			componentsByName.add(new ComponentInfo("d4"));
			fieldsByTagNumber.add(group.getComponent(3).getField(1));
			fieldsByTagNumber.add(group.getComponent(3).getField(2));
			fieldsByTagNumber.add(group.getComponent(3).getField(4));
			fieldsByTagNumber.add(group.getComponent(3).getField("d5"));

			assertEquals(componentsByName, getComponentsByTags(componentsByName));
			assertEquals(componentsById, getComponentsById(componentsByName));
			validate();
		}

		@Test
		public void testLoadComponents3() {
			message = new MessageInfo();
			group = new GroupInfo(message, "");
			group.addToComponentsByTagNumber(new TreeMap<Integer, FieldInfo>());
			group.addToComponentsById(new TreeMap<Integer, ComponentInfo>());
			order = 2;
			line = 1;
			componentsByName.add(group);
			componentsByName.add(new ComponentInfo("d1"));
			componentsByName.add(new ComponentInfo("d2"));
			componentsByName.add(new ComponentInfo("d4"));
			fieldsByTagNumber.add(group.getComponent(3).getField(1));
			fieldsByTagNumber.add(group.getComponent(3).getField(2));
			fieldsByTagNumber.add(group.getComponent(3).getField(4));
			fieldsByTagNumber.add(group.getComponent(3).getField("d5"));

			assertEquals(componentsByName, getComponentsByTags(componentsByName));
			assertEquals(componentsById, getComponentsById(componentsByName));
			validate();
		}

		@Test
		public void testOrderField() {
			message = new MessageInfo();
}
}