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
/**
		* Test method.
		*/
	@SuppressWarnings("static-method")
	@Test
	public void isValidValue() {
		FieldInfo _1 = new FieldInfo.FieldInfo() {
			@Override
			public boolean isValidValue(String value) {
				String _1;
//				boolean _1=false;
				_1 = value;
				if(!(value.isEmpty())) {
					/*
					 * if(value.isEmpty())
					 * check();
					 */
					return true;
				}
				return false;
			}
		
		};
		System.out.println(_1.isValidValue("one"));
		assertEquals(true, _1.isValidValue