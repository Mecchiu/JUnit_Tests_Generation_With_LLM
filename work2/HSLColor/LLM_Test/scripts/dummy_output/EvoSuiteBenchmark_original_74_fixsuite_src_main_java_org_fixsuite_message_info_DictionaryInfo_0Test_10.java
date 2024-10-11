// DictionaryInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfo_0Test {
		public void test(DictionaryInfo dictionaryInfo)
		{

			FieldInfo fieldInfo1_1 = dictionaryInfo.getField("TEST1");

			assertTrue(fieldInfo1_1!= null);

		}
}