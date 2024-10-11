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
		static final String TESTS_FILE = "../etc/dictionary_info.xml";
		static final String INPUT_FILE_TEXT = "<FIX>\n" +
			"<VERSION>FIX</VERSION>\n" +
			"<MESSAGE>FIX Example Message</MESSAGE>\n" +
			"</FIX>";

  /**
   * Test Method for {@link DictionaryInfo#getField(int)}.
   * @throws Exception may arise during testing.
   */
  @Test
  void testGetField() throws Exception {
    DictionaryInfo dictionaryInfo = new DictionaryInfo(INPUT_FILE_TEXT);
    FieldInfo field = dictionaryInfo.getField("FILLED FIELD");
    assertEquals("FIX", field.getTagNumber().toString());
  }}