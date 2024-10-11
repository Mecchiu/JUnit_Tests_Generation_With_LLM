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
		public static void main(String[] args) throws Exception {

        DictionaryInfo info = new DictionaryInfo("4");

		}

		/**
		 * Returns the fields
		 *
		 * @return the fields
		 */

		public List<FieldInfo> getFields() {
			List<FieldInfo> fieldInfoList = new ArrayList();
			return fieldInfoList;
		}

		/**
		 * Returns a field by tag number
		 *
		 * @param tagNumber - a tagNumber
		 * @return a field by tag number
		 */
		public FieldInfo getField(int tagNumber) {
			List<Integer> tagNumberList = new ArrayList();
			List<FieldInfo> fieldInfoList = getFields();
			return fieldInfoList.get(tagNumber);

		}
		
		/**
		 * Returns a field by name
		 *
		 * @param name - a name
		 * @return a field by name
		 */
        public FieldInfo getField(String name) {
        List<Integer> fieldNumberList = new ArrayList();
            List<FieldInfo> fieldInfoList = getFields();
            return fieldInfoList.get(fieldNumberList.indexOf(name));
        }

        /**
		 * Adds a field
		 *
		 * @param field
		 */
		public void addField(FieldInfo field) {

            List<Integer> fieldNumberList = new ArrayList();
			List<FieldInfo> fieldInfoList = getFields();
			fieldNumberList.add(fieldInfoList.size());
			fieldNumberList.add(field.getId());

			fieldInfoList.add(field);

			return;

		}

		/**
		 * Returns the components
		 *
		 * @return the components
		 */
		public List<ComponentInfo> getComponents() {
			List<ComponentInfo> componentInfoList = new ArrayList();
			return componentInfoList;
		}

		/**
		 * Returns a component given an id
		 *
		 * @param id - an id
		 * @return a component given an id
		 */
		public ComponentInfo getComponent(int id) {

			List<Integer> componentNumberList = new ArrayList();
			List<ComponentInfo> componentInfoList = getComponents();
			return componentInfoList.get(componentNumberList.indexOf(id));

		}

		/**
		 * Adds a component
		 *
		 * @param component
		 */
		public void addComponent(ComponentInfo component) {

			List<Integer> componentNumberList = new ArrayList();
			List<ComponentInfo> componentInfoList = getComponents();
			componentNumberList.add(componentInfoList.size());
			componentNumberList.add(component.getId());
			componentInfoList.add(component);
			return;

		}
	}