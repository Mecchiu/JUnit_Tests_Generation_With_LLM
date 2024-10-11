// FieldInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfo_0Test {
		private String messageId;
		private String componentId;
		private String valueName;
		private String valueDesc;
		private String valueNameXML;
		private String valueDescXML;
		private String valueNameLong;
		private String valueDescLong;
		private String valueNameXlong;
		private String valueDescXlong;


		/**
		 * Test method setComponentId isRequiredInComponent
		 */
		@Test
		public void testSetComponentId_isRequiredInComponent() {
			FieldInfo fieldInfo = new FieldInfo(messageId,componentId,valueName, valueNameXML, valueDescXML,valueNameLong, valueDescXLong);
}
}