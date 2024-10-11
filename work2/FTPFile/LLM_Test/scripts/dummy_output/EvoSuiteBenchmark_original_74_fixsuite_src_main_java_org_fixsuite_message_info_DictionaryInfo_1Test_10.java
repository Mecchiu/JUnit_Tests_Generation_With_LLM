// DictionaryInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains one unit test case for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfo_1Test {
		
    @Test
    void getField() {
        for (int tagNumber = 1; tagNumber < 18; tagNumber++) {
			DictionaryInfo dictionaryInfo;

			dictionaryInfo = new DictionaryInfo();

			dictionaryInfo.addField(new FieldInfo("textBody", tagNumber));
            dictionaryInfo.addField(new FieldInfo("foo", tagNumber));
			dictionaryInfo.addField(new FieldInfo("bar", tagNumber));

			// test cases using the fix-suite-db-api.
            dictionaryInfo.getField("bar");
            dictionaryInfo.getField("baz");
            dictionaryInfo.getField("qux");
			dictionaryInfo.getField("foo");
			dictionaryInfo.getField("bar");
            dictionaryInfo.getField("baz");
            dictionaryInfo.getField("qux");
		}
	}
}