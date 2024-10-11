// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {

		/**
		 * Test case 1 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_1() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertTrue(fieldInfo.isRequiredInComponent(componentInfo));
		}
		
		/**
		 * Test case 2 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_2() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				assertFalse(fieldInfo.isRequiredInComponent(componentInfo));
		}
		
		/**
		 * Test case 3 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_3() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(null));
		}
		
		/**
		 * Test case 4 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_4() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 5 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_5() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 6 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_6() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 7 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_7() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 8 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_8() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 9 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_9() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
		
		/**
		 * Test case 10 for method isRequiredInComponent.
		 * 
		 * @see FieldInfo#isRequiredInComponent(ComponentInfo)
		 */
		@Test
		void testIsRequiredInComponent_10() {
				FieldInfo fieldInfo = new FieldInfo();
				ComponentInfo componentInfo = new ComponentInfo();
				fieldInfo.addRequiringComponent(componentInfo);
				assertFalse(fieldInfo.isRequiredInComponent(new ComponentInfo()));
		}
}

// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {
		
		/**
		 * Test case 1 for method isValidValue.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue_1() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				fieldInfo.addValidValue(valueInfo);
				assertTrue(fieldInfo.isValidValue(valueInfo.getValue()));
		}
		
		/**
		 * Test case 2 for method isValidValue.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue_2() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				fieldInfo.addValidValue(valueInfo);
				assertFalse(fieldInfo.isValidValue(null));
		}
		
		/**
		 * Test case 3 for method isValidValue.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue_3() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				fieldInfo.addValidValue(valueInfo);
				assertFalse(fieldInfo.isValidValue(""));
		}
		
		/**
		 * Test case 4 for method isValidValue.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue_4() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				fieldInfo.addValidValue(valueInfo);
				assertFalse(fieldInfo.isValidValue(""));
		}
		
		/**
		 * Test case 5 for method isValidValue.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
