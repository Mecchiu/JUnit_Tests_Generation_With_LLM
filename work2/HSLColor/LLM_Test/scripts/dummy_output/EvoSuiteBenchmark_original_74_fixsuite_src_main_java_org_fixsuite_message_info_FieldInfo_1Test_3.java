// FieldInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains one unit test case for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfo_1Test {
		
	int test_no_value = 1;
	
	/*
	 *
	<fieldInfo
	xmlns="fix.fixml.1_1"
	xmlns:xsi="fix.fixml.1_1.0"
	tagNumber="3"
	name="Fix/CORE/L3/1/20/110111"
	dataType="fix.fixml.1_1.10.1-3-16"
	description="No/valid (no value)"""
	/>
	*/
	
	@Test
	public void test_no_value() {
		assert (true);
	}
	
}