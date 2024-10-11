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
		/*
		* This class represents one unit test case for the {@link DictionaryInfo#getField1(String) } method.
		*/
		@javax.jdo.annotations.Column(name = "NAME", nullable = false)
		private String messageName;

		/*
		 * This method simply returns a new copy of the messageName field from the messageInfo object.
		 */
		@Override
		public String getMessageName() {
			return messageName;
		}

		@Override
		public void setMessageName(String value) {
			messageName = value;
		}
}