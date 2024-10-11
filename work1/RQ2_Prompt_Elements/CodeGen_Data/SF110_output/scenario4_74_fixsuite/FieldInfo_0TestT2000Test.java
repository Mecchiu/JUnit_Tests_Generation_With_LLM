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

	@Test
	void test_isRequiredInComponent_1_0_0(){
		FieldInfo fieldInfo = new FieldInfo();
		assertFalse(fieldInfo.isRequiredInComponent("Component2"));
	}
	@Test
	void test_isRequiredInComponent_1_0_1(){
		List<ComponentInfo> componentInfos = new ArrayList<>();
		componentInfos.add(new ComponentInfo("Component1"));
		assertTrue(fieldInfo.isRequiredInComponent(componentInfos));
	}
	
}
		

// FieldInfo_0Xml.java
