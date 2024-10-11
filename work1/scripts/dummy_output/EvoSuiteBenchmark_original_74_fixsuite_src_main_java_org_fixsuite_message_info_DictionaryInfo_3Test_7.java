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
		 * The expected id of the component.
		 *
		 * @return the expected id
		 */
		private final String expectedId;

		/**
		 * Tests all the components.
		 *
		 * @throws Exception if any error occurs
		 */
		@Test
		void test() throws Exception {
			List<ComponentInfo> expected = new ArrayList<>();
			expected.add(getField("Dictionary.FAMID").getValue(Integer.class));
			expected.add(getField("Dictionary.TIMESTAMP").getValue(String.class));
			expected.add(getField("Dictionary.BINDER_ID").getValue(Integer.class));
			expected.add(getComponent("ComponentInfo.DOMAIN.MAJOR").setDisplayText("1").getValue(String.class));
			expected.add(getComponent("ComponentInfo.DOMAIN.MINOR").setDisplayText("2").getValue(String.class));
			expected.add(getComponent("DocumentInfo.SOURCE").setValue("X").getValue(String.class));
			expected.add(getField("Dictionary.SUBDIVISION_ID").getValue(Integer.class));

			List<ComponentInfo> actual = new ArrayList<>();
			for (ComponentInfo info : getComponent("ComponentInfoList_3Test.composite")) {
				actual.add(info);
			}

			assertEquals(expected, actual);
		}

		/**
		 * Tests a group to itself in the dictionary.
		 */
		private final class ComponentInfoList_3Test_1 extends GroupInfo {
			public ComponentInfoList_3Test_1(final String composite) {
				super(composite);
			}

			@SuppressWarnings("unused")
			@Test
			public void setValue(String... values) {
				for (final String value : values) {
					setProperty(value);
				}
				List<ComponentInfo> expected = getComponents();
				List<ComponentInfo> actual = getComponents();
				assertEquals(expected, actual);
			}
		}

		/**
		 * Tests a group with two components.
		 */
		private final class CompoundGroupInfoList_3Test extends GroupInfo {
			final String composite[];

			CompoundGroupInfoList_3Test(final int i, final String composite) {
				this.composite = composite;
			}
		}
}
// DictionaryInfo_3Test.java