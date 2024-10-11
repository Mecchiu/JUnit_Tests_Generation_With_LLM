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
		int tagNumber=0;
		String name=new String();
		String dataType=new String();
		String description=new String();
		String abbreviation=new String();
		String overrideXmlName=new String();
		String baseCategory=new String();
		String baseCategoryXmlName=new String();
		int length=1;
		boolean isRequiredInComponent = false;
		String deprecatingVersion;
		String comments=new String();
		TreeMap<String, ValueInfo> validValues=new TreeMap<>();
	
		/**
	     * Test constructor.
	     */
		public FieldInfo_0Test(){
    }


		/**
	     * Test constructor with tagNumber and name.
	     */
}